package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import main.java.com.mps.wiley.ebb.dao.ProjectFieldDao;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ProjectFieldService")
@Transactional
public class ProjectFieldServiceImpl implements ProjectFieldService
{
	ProjectFieldServiceImpl()
	{
		
	}
	@Autowired
	ProjectFieldDao projectFieldDao;
	
	@Override
	public int insertProjectFieldService(List<ProjectField> projectField) throws DataAccessException
	{
		return projectFieldDao.insertProjectField(projectField);
	}
	
	
	@Override
	public List<ProjectField> getProjectFieldByTemplateAndProjectId(Integer templateId, Integer projectId) throws DataAccessException
	{
		return projectFieldDao.getProjectFieldByTemplateAndProjectId(templateId, projectId);
	}
	
	
	@Override
	@Transactional
	public void deleteProjectFieldService(Integer templateId, Integer projectId) throws DataAccessException 
	{
		projectFieldDao.removeProjectDyanamicFields(templateId, projectId);
		
	}

	
}
