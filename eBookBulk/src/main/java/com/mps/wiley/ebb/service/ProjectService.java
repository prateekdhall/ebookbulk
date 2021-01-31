package main.java.com.mps.wiley.ebb.service;


import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.domain.ExceptionMessage;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectHistory;

import org.springframework.dao.DataAccessException;


public interface ProjectService
{
	public int getNewProjectId();
	
	public int addProject(Project project, Map<String, Object> session);
	
	public int updateProject(Project project, Map<String, Object> session);
	
	public Project getProjectById(Integer iPrjId);
	
	public List<Project> getProjectByColumn(String strQry, Object... objParam);
	
	public List<Project> getProjects(Project project, String strStatus) throws DataAccessException;
	
	public List<Project> getAllProjects(Project project) throws DataAccessException;
	
	public List<Project> loadMyProject(int iStatus, int iPrjAdmin) throws DataAccessException;
	 	
	public List<ProjectHistory> getProjectHistory(int iPrjId) throws DataAccessException;
	
	public String getProjectAdmin(int iPrjId) throws DataAccessException;
	
	public List<ExceptionMessage> getExceptionMessagesByProject(Integer projectId, String isNewProject) throws DataAccessException;

}
