package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectUrl;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("ProjectUrlDao")
@Transactional
public class ProjectUrlDaoImpl extends AbstractBaseDao<ProjectUrl> implements ProjectUrlDao
{
	public ProjectUrlDaoImpl()
	{
		super();
	}
	
	@Override
	public String getTableName()
	{
		return "PROJECT_URL";
	}
	
	@Override
	public String getFields()
	{
		return "PROJECT_ID,URL,URL_TYPE,CODE_STATUS,GENERATED_BY,GENERATED_DATE,URL_COUNT ";
	}
	
	@Override
	@Transactional
	public int insertProjectUrl(ProjectUrl prjurl) throws DataAccessException
	{
		System.out.println("====="+prjurl.toString()+"  ="+prjurl.getUrlType());
		if (prjurl.getUrlType().equals(""))
		{
			prjurl.setUrlType(null);
		}
		
		final String strQuery = "INSERT INTO " + getTableName() + " ( " + getFields() + ") VALUES ( ?, ?, ?, ?, ?, ?, ?)";
		simpleJdbcTemplate.update(strQuery, prjurl.getProjectId(), prjurl.getUrl(), prjurl.getUrlType(), prjurl.getCodeStatus(), prjurl.getGeneratedBy(), prjurl.getGeneratedDate(), "0");
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	
	@Override
	@Transactional
	public void removeProjectUrl(ProjectUrl projecturl) throws DataAccessException
	{
		final String strQuery = "DELETE FROM " + getTableName() + " WHERE PROJECT_ID = ? and CODE_STATUS=0";
		simpleJdbcTemplate.update(strQuery, projecturl.getProjectId());
		
	}
	
	
	@Override
	@Transactional
	public List<ProjectUrl> getProjectUrlListByTodayDate(Project project) throws DataAccessException
	{
		
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateNow = formatter.format(currentDate.getTime());
		System.out.println("Now the date is :=>  " + dateNow);
		
		/*
		 * final StringBuilder strQry = new StringBuilder();
		 * strQry.append("SELECT pu.PROJECT_ID, pu.URL, pu.URL_TYPE, pu.CODE_STATUS, pu.GENERATED_BY, pu.GENERATED_DATE, pu.URL_COUNT ");
		 * strQry.append(" FROM PROJECT pu ");
		 * strQry.append(" WHERE pu.GENERATED_DATE = ?");
		 * 
		 * List<ProjectUrl> resultList = simpleJdbcTemplate.query(strQry.toString(), this, date);
		 */
		List<ProjectUrl> resultList = getObjectList("PROJECT_ID=? ", project.getProjectId());
		return resultList;
	}
	
	
	@Override
	@Transactional
	public List<ProjectUrl> getProjectUsedUrlList(Project project) throws DataAccessException
	{
		List<ProjectUrl> resultList = getObjectList("PROJECT_ID=?", project.getProjectId());
		return resultList;
	}
	
	public ProjectUrl mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ProjectUrl projecturl = new ProjectUrl();
		
		projecturl.setProjectId(rs.getInt("PROJECT_ID"));
		projecturl.setUrl(rs.getString("URL"));
		projecturl.setUrlType(rs.getString("URL_TYPE"));
		projecturl.setCodeStatus(rs.getInt("CODE_STATUS"));
		projecturl.setGeneratedBy(rs.getString("GENERATED_BY"));
		projecturl.setGeneratedDate(rs.getDate("GENERATED_DATE"));
		projecturl.setUrlcount(rs.getString("URL_COUNT"));
		
		return projecturl;
	}
}
