package main.java.com.mps.wiley.ebb.service;


import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.MyProjectReportDto;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectDetailsReport;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;

import org.springframework.dao.DataAccessException;

/**
 * 
 * @author : Krishna Gaur
 * @category Reports
 * 
 */

public interface ReportService
{
	
	/**
	 * 
	 * @author : Krishna Gaur
	 * 
	 */
	public List<ProjectDetailsReport> getProjectDetailsList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException;
	
	/**
	 * 
	 * @author : Krishna Gaur
	 * 
	 */
	
	public List<ProjectOverviewReport> getProjectOverviewList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException;
	
	 /**
	  * 
	  * @author : Krishna Gaur
	  * 
	  */
	
	public List<ProjectActivityReport> getProjectActivityList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException;
	
	 /**
	  * 
	  * @author Mithlesh Kumar
	  * @return
	  * @throws DataAccessException
	  */
	public List<MyProjectReportDto> getProjectListByStatus(int iStatus) throws DataAccessException;
	 /**
	  * 
	  * @author Mithlesh Kumar
	  * @return
	  * @throws DataAccessException
	  */
	public List<CustomerProjectOverviewReport> getCustomerProjectOverviewList(ReportCriteriaBean customerProjectOverviewReportDto) throws DataAccessException;
	 /**
	  * 
	  * @author Mithlesh Kumar
	  * @return
	  * @throws DataAccessException
	  */
	public List<CustomerProjectActivityReport> getCustomerProjectActiveList(ReportCriteriaBean customerProjectActivityReportDto) throws DataAccessException;
	
	public List<Map<String, Object>> getProjectHistoryList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException;
	
}
