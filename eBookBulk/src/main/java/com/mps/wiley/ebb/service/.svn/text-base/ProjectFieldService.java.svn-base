package main.java.com.mps.wiley.ebb.service;


import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectField;
import main.java.com.mps.wiley.ebb.domain.PromoCodeConfigValue;

import org.springframework.dao.DataAccessException;

public interface ProjectFieldService
{
	public int insertProjectFieldService(List<ProjectField> projectField) throws DataAccessException;
	
	public List<ProjectField> getProjectFieldByTemplateAndProjectId(Integer templateId, Integer projectId) throws DataAccessException;
			
	public void deleteProjectFieldService(Integer templateId, Integer projectId) throws DataAccessException ;
	
	
	
}
