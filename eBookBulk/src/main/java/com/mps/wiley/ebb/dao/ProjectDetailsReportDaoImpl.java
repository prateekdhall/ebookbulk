package main.java.com.mps.wiley.ebb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.common.util.AppUtil;
import main.java.com.mps.common.util.DateUtil;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectDetailsReport;
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

@Repository("ProjectDetailsReportDao")
@Transactional
public class ProjectDetailsReportDaoImpl extends AbstractBaseDao<ProjectDetailsReport> implements ProjectDetailsReportDao
{
	
	public ProjectDetailsReportDaoImpl()
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
	public ProjectDetailsReport mapRow(ResultSet rs, int arg1) throws SQLException
	{
		ProjectDetailsReport projectDetailsReport = new ProjectDetailsReport();
		
		projectDetailsReport.setProjectId(rs.getInt("projectId"));
		projectDetailsReport.setProjectName(rs.getString("projectName"));
		projectDetailsReport.setCreatedDate(DateUtil.getDateStringFormatFromString(rs.getString("createdDate")));
		projectDetailsReport.getCustomer().setValue(rs.getString("customer"));		
		projectDetailsReport.setContactName(rs.getString("contactName"));
		projectDetailsReport.setContactEmail(rs.getString("ContactEmail"));
		projectDetailsReport.setContactPhone(rs.getString("contactPhone"));
		projectDetailsReport.getRequester().setValue(rs.getString("requester"));
		projectDetailsReport.getPrjAdmin().setValue(rs.getString("prjAdmin"));
		projectDetailsReport.getProjectType().setId(rs.getInt("projectType"));
		projectDetailsReport.getProjectType().setValue(rs.getString("projectTypeValue"));
		projectDetailsReport.getEcomp().setId(rs.getInt("ecomp"));
		projectDetailsReport.getEcomp().setValue(rs.getString("ecompValue"));
		projectDetailsReport.setAvailableDate(DateUtil.getDateStringFormatFromString(rs.getString("availableDate")));
		projectDetailsReport.setExpiryDate(DateUtil.getDateStringFormatFromString(rs.getString("expiryDate")));
		projectDetailsReport.setThresoldDate(DateUtil.getDateStringFormatFromString(rs.getString("thresoldDate")));
		projectDetailsReport.setBackupQty(rs.getInt("soldQty"));
		projectDetailsReport.setSoldQty(rs.getInt("backupQty"));
		projectDetailsReport.setThresoldQty(rs.getInt("thresoldQty"));
		projectDetailsReport.setTitle(rs.getString("title"));
		projectDetailsReport.getDrm().setId(rs.getInt("drm"));
		projectDetailsReport.getDrm().setValue(rs.getString("drmValue"));
		projectDetailsReport.setTemplate(rs.getString("template"));
		projectDetailsReport.getRegistration().setId(rs.getInt("registration"));
		projectDetailsReport.getRegistration().setValue(rs.getString("registrationValue"));
		projectDetailsReport.getPromoCode().setId(rs.getInt("promoCode"));
		projectDetailsReport.getPromoCode().setValue(rs.getString("promoCodeValue"));
		projectDetailsReport.setStUrl(rs.getString("stUrl"));
		projectDetailsReport.setNotes(rs.getString("notes"));
		projectDetailsReport.getProjectStatus().setId(rs.getInt("projectStatus"));
		projectDetailsReport.getProjectStatus().setValue(rs.getString("projectStatusValue"));
		projectDetailsReport.setUpdatedDate(DateUtil.getDateStringFormatFromString(rs.getString("updatedDate")));
		projectDetailsReport.setMpsComments("MPS Comments");
		
		return projectDetailsReport;
	}

	@Override
	public List<ProjectDetailsReport> getProjectDetailsList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{
			final String sql = "{ call sp_ebulkbook_reports_project_details( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
			
			List<ProjectDetailsReport> projectDetailsReportList= simpleJdbcTemplate.query(sql, this, new Object[] {reportCriteriaBean.getProjectId(), reportCriteriaBean.getProjectName(), reportCriteriaBean.getRequester().getValue(), reportCriteriaBean.getPrjAdmin().getValue(), reportCriteriaBean.getCustomer().getValue(), reportCriteriaBean.getProjectType(), reportCriteriaBean.getEcomp(), AppUtil.convertArrayToQueryIn(reportCriteriaBean.getStatusArray()), reportCriteriaBean.getCreatedBy()});

			return projectDetailsReportList;
	}
}
