package main.java.com.mps.wiley.ebb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.common.util.DateUtil;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("ProjectOverviewReportDao")
@Transactional
public class ProjectOverviewReportDaoImpl extends AbstractBaseDao<ProjectOverviewReport> implements ProjectOverviewReportDao
{
	
	
	public ProjectOverviewReportDaoImpl()
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
	public ProjectOverviewReport mapRow(ResultSet rs, int arg1) throws SQLException
	{
		ProjectOverviewReport projectOverviewReport = new ProjectOverviewReport();
		
		projectOverviewReport.setProjectId(rs.getInt("projectId"));
		projectOverviewReport.setProjectName(rs.getString("projectName"));
		projectOverviewReport.getProjectType().setId(rs.getInt("projectType"));
		projectOverviewReport.getProjectType().setValue(rs.getString("projectTypeValue"));
		projectOverviewReport.getEcomp().setId(rs.getInt("ecomp"));
		projectOverviewReport.getEcomp().setValue(rs.getString("ecompValue"));
		projectOverviewReport.setAvailableDate(DateUtil.getDateStringFormatFromString(rs.getString("availableDate")));
		projectOverviewReport.setExpiryDate(DateUtil.getDateStringFormatFromString(rs.getString("expiryDate")));
		projectOverviewReport.setBackupQty(rs.getInt("soldQty"));
		projectOverviewReport.setSoldQty(rs.getInt("backupQty"));
		projectOverviewReport.setActivationStart(rs.getString("activationStart"));
		projectOverviewReport.setAcivationEnd(rs.getString("activationEnd"));
		projectOverviewReport.setTitle(rs.getString("title"));
		projectOverviewReport.setDownloads(rs.getInt("projectId"));
		projectOverviewReport.setRegistrations(rs.getInt("registrations"));
		projectOverviewReport.setRegistrationApplicable(rs.getInt("registrationApplicable"));
		projectOverviewReport.setPromoCodes(rs.getInt("promocodes"));
		projectOverviewReport.setPromoCodesApplicable(rs.getInt("promocodesApplicable"));
		
		return projectOverviewReport;
	}

	@Override
	public List<ProjectOverviewReport> getProjectOverviewList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{

//			final String sql = "{ call sp_ebulkbook_reports_project_overview( ?, ?, ?, ?, ?, ?, ?) }";
//			List<ProjectOverviewReport> projectOverviewReportList= simpleJdbcTemplate.query(sql,this, new Object[] {reportCriteriaBean.getProjectId(), reportCriteriaBean.getProjectName(), reportCriteriaBean.getRequester().getValue(), reportCriteriaBean.getPrjAdmin().getValue(), reportCriteriaBean.getCustomer().getValue(), reportCriteriaBean.getProjectType(), reportCriteriaBean.getEcomp()});
		
		List<ProjectOverviewReport> projectOverviewReportList = new ArrayList<ProjectOverviewReport>();
		return projectOverviewReportList;
	}

	
}
