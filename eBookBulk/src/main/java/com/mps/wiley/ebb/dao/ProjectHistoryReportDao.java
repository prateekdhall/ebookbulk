package main.java.com.mps.wiley.ebb.dao;

import java.util.List;
import java.util.Map;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectHistoryReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;

import org.springframework.dao.DataAccessException;


public interface ProjectHistoryReportDao extends BaseDao<ProjectHistoryReport>
{
	 
	public List<Map<String, Object>> getProjectHistoryList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException;

	
}
