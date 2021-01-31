package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
 
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;
 


/**
 * 
 * @author Mithlesh Kumar
 * 
 */

@Repository("CustomerProjectOverviewDao")
@Transactional
public class CustomerProjectOverviewDaoImpl extends AbstractBaseDao<CustomerProjectOverviewReport> implements CustomerProjectOverviewDao
{
	
	 
	
	@Override
	public CustomerProjectOverviewReport mapRow(ResultSet rs, int in) throws SQLException
	{
		CustomerProjectOverviewReport cpoReport = new CustomerProjectOverviewReport();
		cpoReport.setProjectId(rs.getInt("projectId"));
		cpoReport.setProjectName(rs.getString("projectName"));
		cpoReport.setAvailable(rs.getString("available"));
		cpoReport.setExpiration(rs.getString("expiration"));
		cpoReport.setSoldQty(rs.getInt("soldQty"));
		cpoReport.setBackupQty(rs.getInt("backupQty"));
		cpoReport.setActivationStart(rs.getString("activationStart"));
		cpoReport.setAcivationEnd(rs.getString("acivationEnd"));
		cpoReport.setTitle(rs.getString("title"));
		cpoReport.setDownloads(rs.getInt("download"));
		return cpoReport;
	}
	
	@Override
	public List<CustomerProjectOverviewReport> getCustomerProjectOverviewList(ReportCriteriaBean cpoReport) throws DataAccessException
	{
		final String sql = "{ call sp_ebulkbook_reports_customer_Project_overview( ?, ?, ?) }";
		List<CustomerProjectOverviewReport> cpoReportList= simpleJdbcTemplate.query(sql, this,cpoReport.getProjectId(), cpoReport.getProjectName(), cpoReport.getCustomer().getValue());

		return cpoReportList;
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

 
 

 
 
 
	
}
