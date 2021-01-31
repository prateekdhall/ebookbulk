package main.java.com.mps.wiley.ebb.service;


import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectUrl;

import org.springframework.dao.DataAccessException;


public interface ProjectUrlService
{


	public void saveProjectUrl(ProjectUrl projecturl,Project project,List<ProjectUrl> list) throws DataAccessException;
	
	public void deleteProjectUrl(ProjectUrl projecturl) throws DataAccessException;
	
	public Map<String, Object> getGenerateUrlReport(Project project) throws DataAccessException;
	
	public Map<String, Object> getGeneratePromocodeReport(Project project) throws DataAccessException;
	
	public List<ProjectUrl> getProjectUrlList(Project project)  throws DataAccessException;
	
	public static String REPORTS_HEADER = "REPORTS_HEADER";

	public static String REPORTS_DATA = "REPORTS_DATA";

	public static String REPORTS_FOOTER = "REPORTS_FOOTER";
	
	public static String REPORTS_HEADER1 = "REPORTS_HEADER1";

	public static String REPORTS_DATA1 = "REPORTS_DATA1";

	public static String REPORTS_FOOTER1 = "REPORTS_FOOTER1";
	
	public Project getProjectUrlAndPromoCodeFlag(Project project, boolean checkPromCodeValue, List<ProjectUrl> list)  throws DataAccessException;
	
}