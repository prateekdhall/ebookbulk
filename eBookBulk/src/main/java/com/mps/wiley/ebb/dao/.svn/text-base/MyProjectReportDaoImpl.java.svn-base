package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.reportsBean.MyProjectReportDto;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("ProjectReportDao")
@Transactional
public class MyProjectReportDaoImpl extends AbstractBaseDao<MyProjectReportDto> implements MyProjectReportDao
{
	public MyProjectReportDaoImpl()
	{
		super();
	}
	
	@Override
	public String getFields()
	{
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String getTableName()
	{
		// TODO Auto-generated method stub
		return "";
	}
	
	
	@Override
	public MyProjectReportDto mapRow(ResultSet rs, int arg1) throws SQLException
	{
		MyProjectReportDto projectReportDto = new MyProjectReportDto();
		
		projectReportDto.setProjectId(rs.getInt("projectId"));
		projectReportDto.setProjectName(rs.getString("projectName"));
		projectReportDto.setCustomer(rs.getString("customer"));
		projectReportDto.setTitle(rs.getString("title"));
		projectReportDto.setDrm(rs.getString("drmValue"));
		projectReportDto.setProjectType(rs.getString("projectType"));
		projectReportDto.seteComp(rs.getString("ecompValue"));
		projectReportDto.setAvailable(rs.getString("availableDate"));
		projectReportDto.setExpiration(rs.getString("expiryDate"));
		projectReportDto.setSoldQty(rs.getInt("soldQty"));
		projectReportDto.setBackupQty(rs.getInt("backupQty"));
		projectReportDto.setTemplate(rs.getString("template"));
		projectReportDto.setNotes(rs.getString("notes"));
		projectReportDto.setMpsComments("");
		
		
		return projectReportDto;
	}
	
	@Override
	public List<MyProjectReportDto> getProjectListByStatus(int status) throws DataAccessException
	{
		final String sql = "{ call sp_ebulkbook_reports_my_project(?) }";
		
		List<MyProjectReportDto> projectReportDtoList = simpleJdbcTemplate.query(sql, this, status);
		
		return projectReportDtoList;
		
	}
}
