package main.java.com.mps.wiley.ebb.jobs;

import main.java.com.mps.wiley.ebb.dao.ProjectDao;
import main.java.com.mps.wiley.ebb.dao.UserDao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("projectWorkFlow")
public class ProjectCronService
{
	public Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	ProjectDao projectDao;
	
	@Autowired
	UserDao userDao;
	
	public ProjectCronService()
	{
	}
	
	public void cronRun()
	{
		
		try
		{
			System.out.println("******** CRON Started. ******");
			log.debug("******** CRON Started. ******");
			
			PendingToActive pToA = new PendingToActive(projectDao);
			pToA.pToACronRun();
			
			ActiveToInactive aToI = new ActiveToInactive(projectDao);
			aToI.activeToInactiveCron();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
		}
		finally
		{
			System.out.println("******** CRON End. *************");
			log.debug("******** CRON End. *************");
		}
	}	
	
}
