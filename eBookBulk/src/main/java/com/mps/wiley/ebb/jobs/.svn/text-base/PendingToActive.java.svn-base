package main.java.com.mps.wiley.ebb.jobs;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.mps.wiley.ebb.dao.ProjectDao;

public class PendingToActive
{
	public Logger log = Logger.getLogger(this.getClass());
	
	private ProjectDao projecDao;
	public PendingToActive(ProjectDao projectDao)
	{
		this.projecDao = projectDao;
	}
	
	@Transactional
	public void pToACronRun()
	{
		try
		{
			System.out.println("*** PendingToActive CRON Started. ***");
			log.debug("*** PendingToActive CRON Started. ***");
			
			projecDao.pendingToActiveCron();
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
			System.out.println("*** PendingToActive CRON End. ***");
			log.debug("*** PendingToActive CRON Started. ***");
		}
	}
}
