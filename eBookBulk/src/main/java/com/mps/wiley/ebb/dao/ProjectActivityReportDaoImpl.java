package main.java.com.mps.wiley.ebb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author : Krishna Gaur
 * @category : Reports
 * 
 */

@Repository("ProjectActivityReportDao")
@Transactional
public class ProjectActivityReportDaoImpl extends AbstractBaseDao<ProjectActivityReport> implements ProjectActivityReportDao
{
	
	public ProjectActivityReportDaoImpl()
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
	public ProjectActivityReport mapRow(ResultSet rs, int arg1) throws SQLException
	{
		ProjectActivityReport projectActivityReport = new ProjectActivityReport();
		
		projectActivityReport.setProjectId(rs.getInt("projectId"));
		projectActivityReport.setProjectName(rs.getString("projectName"));
		projectActivityReport.getProjectType().setId(rs.getInt("projectType"));
		projectActivityReport.getProjectType().setValue(rs.getString("projectTypeValue"));
		projectActivityReport.getEcomp().setId(rs.getInt("ecomp"));
		projectActivityReport.getEcomp().setValue(rs.getString("ecompValue"));
		projectActivityReport.setUrl(rs.getString("url"));
		projectActivityReport.setDate(rs.getString("date"));
		projectActivityReport.setRegistrations(rs.getString("registrations"));
		projectActivityReport.setPromocodes(rs.getString("promocodes"));
		projectActivityReport.setSuccess(rs.getString("success"));
		projectActivityReport.setFailure(rs.getString("failure"));
		projectActivityReport.setAbort(rs.getString("abort"));
		
		return projectActivityReport;
	}
	
	@Override
	public List<ProjectActivityReport> getProjectActivityList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{
			final String sql = "{ call sp_ebulkbook_reports_project_activity( ?, ?, ?, ?, ?, ?, ?) }";
			
			List<ProjectActivityReport> projectActivityReportList= simpleJdbcTemplate.query(sql,this, new Object[] {reportCriteriaBean.getProjectId(), reportCriteriaBean.getProjectName(), reportCriteriaBean.getRequester().getValue(), reportCriteriaBean.getPrjAdmin().getValue(), reportCriteriaBean.getCustomer().getValue(), reportCriteriaBean.getProjectType(), reportCriteriaBean.getEcomp()});

			return projectActivityReportList;
	}

}
