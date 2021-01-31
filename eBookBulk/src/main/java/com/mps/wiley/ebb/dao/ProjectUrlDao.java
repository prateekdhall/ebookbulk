package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectUrl;

import org.springframework.dao.DataAccessException;


public interface ProjectUrlDao extends BaseDao<ProjectUrl>
{
	
	public int insertProjectUrl(ProjectUrl purl) throws DataAccessException;
	
	public void removeProjectUrl(ProjectUrl projecturl) throws DataAccessException;
	
	public List<ProjectUrl> getProjectUrlListByTodayDate(Project project) throws DataAccessException;
	
	public List<ProjectUrl> getProjectUsedUrlList(Project project) throws DataAccessException;
	
}
