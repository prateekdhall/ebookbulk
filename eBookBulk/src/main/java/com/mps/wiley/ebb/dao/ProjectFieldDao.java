package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.wiley.ebb.domain.ProjectField;

import org.springframework.dao.DataAccessException;


public interface ProjectFieldDao
{
	public int insertProjectField(List<ProjectField> projectField) throws DataAccessException;
	
	public List<ProjectField> getProjectFieldByTemplateAndProjectId(Integer templateId, Integer projectId) throws DataAccessException;
	
	public void removeProjectDyanamicFields(Integer templateId, Integer projectId) throws DataAccessException;
	
	
}
