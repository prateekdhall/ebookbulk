package main.java.com.mps.wiley.ebb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectHistoryReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("ProjectHistoryReportDao")
@Transactional
public class ProjectHistoryReportDaoImpl extends AbstractBaseDao<ProjectHistoryReport> implements ProjectHistoryReportDao
{
	
	public ProjectHistoryReportDaoImpl()
	{
		super();
	}
	
	@Override
	public String getFields()
	{
		return "";
	}

	@Override
	public String getTableName()
	{
		return "";
	}
	
	@Override
	public ProjectHistoryReport mapRow(ResultSet rs, int arg1) throws SQLException
	{			
		return null;
	}

	@Override
	public List<Map<String, Object>> getProjectHistoryList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{	
		final String sql = "{ call sp_ebulkbook_reports_project_history( ?, ?, ?, ?, ?, ?, ?) }";
		return getObjectMapList(sql, reportCriteriaBean.getProjectId(),reportCriteriaBean.getProjectName(),reportCriteriaBean.getProjectType(),reportCriteriaBean.getEcomp(),reportCriteriaBean.getCustomer().getValue(),reportCriteriaBean.getRequester().getValue(),reportCriteriaBean.getPrjAdmin().getValue());
	}
}
