package main.java.com.mps.wiley.ebb.service;


import java.util.Date;
import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.dao.ContentFileDao;
import main.java.com.mps.wiley.ebb.dao.ExceptionMessageDao;
import main.java.com.mps.wiley.ebb.dao.ProjectDao;
import main.java.com.mps.wiley.ebb.dao.ProjectHistoryDao;
import main.java.com.mps.wiley.ebb.domain.ContentFile;
import main.java.com.mps.wiley.ebb.domain.ExceptionMessage;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectHistory;
import main.java.com.mps.wiley.ebb.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("ProjectService")
@Transactional
public class ProjectServiceImpl implements ProjectService
{
	public ProjectServiceImpl()
	{
	}
	
	@Autowired
	private ProjectDao prjDao;
	
	@Autowired
	private ProjectHistoryDao prjHstDao;
	
	@Autowired
	private ContentFileDao cfDao;
	
	@Autowired
	private ExceptionMessageDao exceptionMessageDao;
	
	@Override
	@Transactional
	public int getNewProjectId()
	{
		return prjDao.getNewProjectId();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public int addProject(Project project, Map<String, Object> session)
	{
		int prjId = prjDao.insertProject(project);
		
		User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
		List<ContentFile> cfList = (List<ContentFile>)session.get(AppConstants.CF_GRID_LIST);
		
		if (null != cfList && !cfList.isEmpty())
		{
			for (ContentFile contentFile : cfList)
			{
				contentFile.setProjectId(prjId);
				
				// contentFile.setPublicationDate(new Date());
				contentFile.setCreatedBy(sessionUser.getUserName());
				contentFile.setUpdatedBy(sessionUser.getUserName());
				
				cfDao.insertContentFile(contentFile);
			}
		}
		
		List<ExceptionMessage> emList = (List<ExceptionMessage>)session.get(AppConstants.EM_GRID_LIST);
		
		if (null != emList && !emList.isEmpty())
		{
			for (ExceptionMessage exceptionMessage : emList)
			{
				exceptionMessage.setProjectId(prjId);
				
				exceptionMessageDao.insertExceptionMessage(exceptionMessage);
			}
		}
		
		return prjId;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public int updateProject(Project project, Map<String, Object> session)
	{
		int iStatus = prjDao.updateProject(project);
		
		iStatus = project.getProjectId();
		
		User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
		
		List<ContentFile> cfList = (List<ContentFile>)session.get(AppConstants.CF_GRID_LIST);
		List<ContentFile> cfDeletedList = (List<ContentFile>)session.get(AppConstants.CF_DELETE_LIST);
		
		if (null != cfDeletedList && !cfDeletedList.isEmpty())
		{
			for (ContentFile cfDeletedTemp : cfDeletedList)
			{
				cfDao.removeContentFile(cfDeletedTemp);
			}
		}
		
		if (null != cfList && !cfList.isEmpty())
		{
			for (ContentFile contentFile : cfList)
			{
				if (contentFile.getCfId() < 0)
				{
					contentFile.setProjectId(project.getProjectId());
					
					// contentFile.setPublicationDate(new Date());
					contentFile.setCreatedBy(sessionUser.getUserName());
					contentFile.setUpdatedBy(sessionUser.getUserName());
					
					cfDao.insertContentFile(contentFile);
				}
				else
				{
					contentFile.setProjectId(project.getProjectId());
					
					contentFile.setUpdatedDate(new Date());
					contentFile.setUpdatedBy(sessionUser.getUserName());
					cfDao.updateContentFile(contentFile);
				}
			}
		}
		
		List<ExceptionMessage> emList = (List<ExceptionMessage>)session.get(AppConstants.EM_GRID_LIST);
		
		if (null != emList && !emList.isEmpty())
		{
			for (ExceptionMessage exceptionMessage : emList)
			{
				exceptionMessage.setProjectId(project.getProjectId());
				
				exceptionMessageDao.updateExceptionMessage(exceptionMessage);
			}
		}
		
		return iStatus;
	}
	
	@Override
	@Transactional
	public Project getProjectById(Integer iPrjId)
	{
		return prjDao.getProjectById(iPrjId);
	}
	
	@Override
	@Transactional
	public List<Project> getProjectByColumn(String strQry, Object... objParam)
	{
		return prjDao.getObjectList(strQry, objParam);
	}
	
	@Override
	@Transactional
	public List<Project> getProjects(Project project, String strStatus) throws DataAccessException
	{
		return prjDao.getProjectList(project, strStatus);
	}
	
	@Override
	@Transactional
	public List<Project> getAllProjects(Project project) throws DataAccessException
	{
		System.out.println("In service");
		return prjDao.getAllProjectList(project);
	}
	
	@Override
	@Transactional
	public List<Project> loadMyProject(int iStatus, int iPrjAdmin) throws DataAccessException
	{
		return prjDao.getProjectListByStatus(iStatus, iPrjAdmin);
	}
	
	@Override
	@Transactional
	public List<ProjectHistory> getProjectHistory(int iPrjId) throws DataAccessException
	{
		return prjHstDao.getProjectHistory(iPrjId);
	}
	
	@Override
	public String getProjectAdmin(int iPrjId) throws DataAccessException
	{
		final String strQry = "SELECT u.USER_NAME from USER u join PROJECT p on(u.USR_ID = p.PRJ_ADMIN) WHERE PROJECT_ID = ?";
		final Map<String, Object> objMap = prjDao.getObjectMap(strQry, iPrjId);
		return objMap != null ? objMap.get("USER_NAME").toString() : "";
	}
	
	@Override
	@Transactional
	public List<ExceptionMessage> getExceptionMessagesByProject(Integer projectId, String isNewProject) throws DataAccessException
	{
		if (isNewProject.equalsIgnoreCase("add"))
		{
			return exceptionMessageDao.getInitialExceptionMessage(projectId);
		}
		else
		{
			List<ExceptionMessage> objList = exceptionMessageDao.getObjectList("PROJECT_ID = ? AND PRJ_MOMENTUM_ID is null", projectId);
			if (null == objList || objList.isEmpty())
			{
				objList = exceptionMessageDao.getInitialExceptionMessage(projectId);
			}
			return objList;
		}
		
	}
	
}
