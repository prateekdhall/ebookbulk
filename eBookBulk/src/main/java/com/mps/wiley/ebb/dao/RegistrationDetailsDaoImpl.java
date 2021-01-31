package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.RegistrationDetails;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("RegistrationDetailsDao")
@Transactional
public class RegistrationDetailsDaoImpl extends AbstractBaseDao<RegistrationDetails> implements RegistrationDetailsDao
{
	public RegistrationDetailsDaoImpl()
	{
		super();
	}
	
	@Override
	public String getTableName()
	{
		return "REGISTRATION_DETAILS";
	}
	
	@Override
	public String getFields()
	{
		return "RECORD_ID, PRJ_MOMENTUM_ID, " + INSERT_FIELD;
	}
	
	private final String INSERT_FIELD = "PROJECT_ID, IP_ADDRESS, URL_USED, REGISTRATION_OBJECT";
	
	@Override
	@Transactional
	public void insertRegistrationDetails(RegistrationDetails registerObj) throws DataAccessException
	{
		// final String strQuery = "INSERT INTO " + getTableName() + " ( " + INSERT_FIELD + " ) VALUES ( ? ,? ,? ,?)";
		// simpleJdbcTemplate.update(strQuery, registerObj.getRecordId(), registerObj.getProjectId(), registerObj.getIpAddress(), registerObj.getRegistrationObject());
		insert(registerObj);
		System.out.println("AutoId: " + simpleJdbcTemplate.queryForInt("select last_insert_id()"));
	}
	
	public RegistrationDetails mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		RegistrationDetails registrationDetails = new RegistrationDetails();
		registrationDetails.setRecordId(rs.getInt("RECORD_ID"));
		registrationDetails.setProjectId(rs.getInt("PROJECT_ID"));
		registrationDetails.setMomentumId(rs.getInt("PRJ_MOMENTUM_ID"));
		registrationDetails.setIpAddress(rs.getString("IP_ADDRESS"));
		registrationDetails.setUsedUrl(rs.getString("URL_USED"));
		// registrationDetails.setRegistrationObject(rs.getBytes("REGISTRATION_OBJECT"));
		
		return registrationDetails;
	}
}
