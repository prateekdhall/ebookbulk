package main.java.com.mps.wiley.ebb.jobs;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import main.java.com.mps.wiley.ebb.dao.ProjectDao;

public class ActiveToInactive
{
	public Logger log = Logger.getLogger(this.getClass());
	
	private ProjectDao projectDao;
	
	public ActiveToInactive(ProjectDao projectDao)
	{
		this.projectDao=projectDao;
	}
	
	public void activeToInactiveCron()
	{
		try
		{
			System.out.println("*** ActiveToInactive CRON Started. ***");
			log.debug("*** ActiveToInactive CRON Started. ***");
			
			projectDao.activeToInactiveCaseOneCron();
			projectDao.activeToInactiveCaseTwoCron();

		}
		catch(DataAccessException e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
		}
		finally
		{
			System.out.println("*** ActiveToInactive CRON End. ***");
			log.debug("*** ActiveToInactive CRON End. ***");
		}
	}
	
}
