package main.java.com.mps.common;


import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class InitiateApplication implements ApplicationContextAware
{
	Logger log = Logger.getLogger(this.getClass());
	
	public void setApplicationContext(final ApplicationContext context) throws BeansException
	{
		log.info(" ================ System Intialized ================");
		
		AppSystem.getInstance().initiateSystem(context);
	}
	
	public void shutDown()
	{
		AppSystem.getInstance().shutDown();
	}
}
