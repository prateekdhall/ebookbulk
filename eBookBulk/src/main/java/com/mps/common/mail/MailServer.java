package main.java.com.mps.common.mail;

import java.util.List;
import java.util.Vector;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;

public final class MailServer implements Runnable
{
   private final static int NO_STATUS = 0;

   private final static int MAIL_SENT = 1;

   private final static int MAX_MAIL_REACHED = 2;

   private static volatile boolean SUSPEND = false;

   private static volatile boolean RUN = true;

   private static volatile int COUNTER = 0;

   private Vector<MailObject> QUEUE;

   private Thread THREAD;

   private static VelocityEngine VELOCITY;
   
   private static JavaMailSender JMS;

   public MailServer(ApplicationContext ctx)
   {
   	VELOCITY = (VelocityEngine)ctx.getBean("velocityEngine");
   	JMS = (JavaMailSender)ctx.getBean("mailPropertiesLoader");
      QUEUE = new Vector<MailObject>();
      THREAD = new Thread(this);
      THREAD.start();
   }

   /**
    * This method checks the vector size.
    * Removes object from vector, if size greater than zero and sends it mail modulator.
    */
   private void relay()
   {
      while (true)
      {
         try
         {
            if (QUEUE.size() != 0)
            {
               // Trigger Email
            	MailSender.getInstance(VELOCITY, JMS).sendMail((MailObject) QUEUE.remove(0));
               COUNTER--;
            }
            else
            {
               break;
            }
         }
         catch (Exception e)
         {
            break;
         }
      }
   }

   /**
    * Thread Run implementation
    */
   public final void run()
   {
      try
      {
         while (RUN)
         {
            relay();

            synchronized (this)
            {
               SUSPEND = true;

               wait();
            }
         }
      }
      catch (InterruptedException ie)
      {
         ie.printStackTrace();
      }
   }

   /**
    * This method adds the Mail objects to the Vector from an arraylist
    *
    * @param objMail ArrayList
    */
   final public int sendEmail(final List<MailObject> objMail)
   {
      int iReturn = MailServer.NO_STATUS;
      for (MailObject mailObject : objMail)
		{
         iReturn = sendEmail(mailObject);

         if (iReturn == MailServer.MAX_MAIL_REACHED)
         {
            break;
         }
      }

      return iReturn;
   }

   /**
    * This method adds the Mail objects to the Vector and notifies its thread
    * @param Mail the Mail object which is added to the Vector
    */
   final public int sendEmail(final MailObject objMail)
   {
      int iReturn = MailServer.NO_STATUS;

      try
      {
         if (COUNTER < MailObject.MAX_NUMBER)
         {
            /** This will accumalate aprox. 5,000 mails. **/
            QUEUE.add(objMail);

            COUNTER++;

            iReturn = MailServer.MAIL_SENT;
         }
         else
         {
            iReturn = MailServer.MAX_MAIL_REACHED;
         }

         synchronized (this)
         {
            if (SUSPEND)
            {
               notify();

               SUSPEND = false;
            }
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }

      return iReturn;
   }

   /**
    * Stopping the email server
    */
   public final void stop()
   {
      RUN = false;

      synchronized (this)
      {
         if (SUSPEND)
         {
            notify();

            SUSPEND = false;
         }
      }
   }
}
