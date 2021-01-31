package main.java.com.mps.common.mail;


import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.ui.velocity.VelocityEngineUtils;


public class MailSender
{
	private static MailSender mailer = null;
	
	private VelocityEngine velocityEngine;
	
	private JavaMailSender mailSender;
	
	private static Logger logger;
	
	private MailSender(VelocityEngine velEngine, JavaMailSender mailSender)
	{
		this.velocityEngine = velEngine;
		this.mailSender = mailSender;
		logger = Logger.getLogger(getClass());
	}
	
	public static MailSender getInstance(VelocityEngine velEngine, JavaMailSender jms)
	{
		if (mailer == null)
		{
			mailer = new MailSender(velEngine, jms);
		}
		
		return mailer;
	}
	
	public void sendMail(final MailObject mailTemplateBean)
	{
		logger.info("method starts.....................");
		
		MimeMessagePreparator preparator = new MimeMessagePreparator()
			{
				public void prepare(MimeMessage mimeMessage) throws Exception
				{
					try
					{
						MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true);
						if(mailTemplateBean.getTo()!=null)
						message.setTo(mailTemplateBean.getTo());
						if(mailTemplateBean.getToArr()!=null)
						message.setTo(mailTemplateBean.getToArr());
						if(mailTemplateBean.getCc()!=null)
						message.setCc(mailTemplateBean.getCc());
						if(mailTemplateBean.getCcArr()!=null)
						message.setCc(mailTemplateBean.getCcArr());
						if(mailTemplateBean.getBcc()!=null)
						message.setBcc(mailTemplateBean.getBcc());
						if(mailTemplateBean.getBccArr()!=null)
						message.setBcc(mailTemplateBean.getBccArr());
						message.setFrom(mailTemplateBean.getFrom());
						message.setSubject(mailTemplateBean.getSubject());
						System.out.println("template : " + mailTemplateBean.getTemplate());
						String body = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, mailTemplateBean.getTemplate(), mailTemplateBean.getRoot());
						System.out.println("message: " + body);
						if(mailTemplateBean.getAttachmentName()!=null)
						{
							FileSystemResource file = new FileSystemResource(mailTemplateBean.getAttachmentName());
							message.addAttachment(file.getFilename(), file);
							System.out.println(" file : " + mailTemplateBean.getAttachmentName());
						}
						message.setText(body, true);
						
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			};
		mailSender.send(preparator);
		System.out.println("method ends......................");
		// logger.info("method ends......................");
	}
	
	public void nullifyAll()
	{
		mailer = null;
	}
}
