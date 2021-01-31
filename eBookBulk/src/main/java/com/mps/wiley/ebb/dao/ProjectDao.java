package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.Project;

import org.springframework.dao.DataAccessException;


public interface ProjectDao extends BaseDao<Project>
{
	public int getNewProjectId() throws DataAccessException;
	
	public int insertProject(Project project) throws DataAccessException;
	
	public int updateProject(Project project) throws DataAccessException;
	
	public Project getProjectById(Integer iPrjId) throws DataAccessException;
	
	public List<Project> getProjectList(Project project, String strStatus) throws DataAccessException;
	
	public List<Project> getAllProjectList(Project project) throws DataAccessException;
	
	public List<Project> getProjectListByStatus(Integer iStatus, Integer iPrjAdmin) throws DataAccessException;
	
	public void pendingToActiveCron() throws DataAccessException;
	
	public void activeToInactiveCaseOneCron() throws DataAccessException;
	
	public void activeToInactiveCaseTwoCron() throws DataAccessException;

	public int updateProjectTemplateFlag(Integer iPrjId) throws DataAccessException;
	
	public int updateProjectPromoCodeAndRegistrationFlagDao(Integer iPrjId, Integer promoFlag, Integer registrationFlag) throws DataAccessException;
}
