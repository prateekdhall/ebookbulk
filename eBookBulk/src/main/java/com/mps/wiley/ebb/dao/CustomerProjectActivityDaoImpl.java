package main.java.com.mps.wiley.ebb.dao;


import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sun.security.action.GetBooleanAction;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.dto.RegistrationObject;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;


/**
 * 
 * @author Mithlesh Kumar
 * 
 */

@Repository("CustomerProjectActivityDao")
@Transactional
public class CustomerProjectActivityDaoImpl extends AbstractBaseDao<CustomerProjectActivityReport> implements CustomerProjectActivityDao
{
	
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
	public CustomerProjectActivityReport mapRow(ResultSet rs, int in) throws SQLException
	{
		CustomerProjectActivityReport cpareport = new CustomerProjectActivityReport();
		cpareport.setProjectId(rs.getInt("projectId"));
		cpareport.setProjectName(rs.getString("projectName"));
		cpareport.setUrl(rs.getString("url"));
		cpareport.setDates(rs.getString("dateas"));
		cpareport.setDownload(rs.getString("download"));
		RegistrationObject ro = null;
		ByteArrayInputStream bais = new ByteArrayInputStream(rs.getBytes("registrationObject"));
		
		ObjectInputStream ins = null;
		try
		{
			ins = new ObjectInputStream(bais);
			ro = (RegistrationObject)ins.readObject();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		/*
		 * final Blob objBlob = rs.getBlob("registrationObject");
		 * Object o = objBlob.getBytes(1, (int)objBlob.length());
		 */
		
		cpareport.setNames(ro.getField1());
		cpareport.setCompany(ro.getField13());
		cpareport.setPhone(ro.getField14());
		cpareport.setMobile(ro.getField3());
		cpareport.setEmail(ro.getField2());
		cpareport.setCountry(ro.getField8());
		cpareport.setPromoCodes(ro.getField9());
		return cpareport;
	}
	
	@Override
	public List<CustomerProjectActivityReport> getCustomerProjectActiveList(ReportCriteriaBean cpaReports)
	{
		final String sql = "{ call sp_ebulkbook_reports_customer_Project_Activity( ?, ?, ?) }";
		try
		{
			List<CustomerProjectActivityReport> cpaReportList = simpleJdbcTemplate.query(sql, this, cpaReports.getProjectId(), cpaReports.getProjectName(), cpaReports.getCustomer().getValue());
			return cpaReportList;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
}
