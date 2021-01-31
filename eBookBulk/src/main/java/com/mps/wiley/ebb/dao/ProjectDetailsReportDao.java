package main.java.com.mps.wiley.ebb.dao;

import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectDetailsReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;

import org.springframework.dao.DataAccessException;

/**
 * 
 * @author : Krishna Gaur
 * @category : Reports
 * 
 */

public interface ProjectDetailsReportDao extends BaseDao<ProjectDetailsReport>
{
	 
	public List<ProjectDetailsReport> getProjectDetailsList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException;
	
}
