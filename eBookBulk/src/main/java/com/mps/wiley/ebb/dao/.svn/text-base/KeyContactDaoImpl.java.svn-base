package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.KeyContact;
import main.java.com.mps.wiley.ebb.domain.Project;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("KeyContactDao")
public class KeyContactDaoImpl extends AbstractBaseDao<KeyContact> implements KeyContactDao
{
	
	public KeyContactDaoImpl()
	{
		super();
	}
	
	@Override
	public String getTableName()
	{
		return "KEY_CONTACT";
	}
	
	@Override
	public String getFields()
	{
		return "KC_ID,CUST_ID,EMAIL,NAME,PHONE_NO,MOBILE_NO,ADDRESS,ADD_CITY,ADD_STATE,ADD_ZIPCODE,COUNTRY_ID,IS_ACTIVE,CREATED_BY,CREATED_DATE,UPDATED_BY,UPDATED_DATE";
	}
	
	@Override
	@Transactional
	public List<KeyContact> getKeyContactGridDetails(int customerId) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE CUST_ID = ? AND IS_ACTIVE = ?";
		return simpleJdbcTemplate.query(strQuery.toString(), this, customerId, AppConstants.YES);
		
	}
	
	@Override
	@Transactional
	public void insertKeyContact(KeyContact keyContact) throws DataAccessException
	{
		final String strQuery = "INSERT INTO " + getTableName() + " ( NAME, PHONE_NO, MOBILE_NO, EMAIL, ADDRESS, ADD_CITY, ADD_STATE, ADD_ZIPCODE, CUST_ID, COUNTRY_ID, CREATED_BY, CREATED_DATE, UPDATED_BY, UPDATED_DATE) VALUES ( ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ?, ?)";
		simpleJdbcTemplate.update(strQuery, keyContact.getName(), keyContact.getPhoneNo(), keyContact.getMobileNo(), keyContact.getEmail(), keyContact.getAddress(), keyContact.getCity(), keyContact.getState(), keyContact.getZipCode(), keyContact.getCustomer(), keyContact.getCountry(), keyContact.getCreatedBy(), keyContact.getCreatedDate(), keyContact.getUpdatedBy(), keyContact.getCreatedDate());
		System.out.println("AutoId: " + simpleJdbcTemplate.queryForInt("select last_insert_id()"));
	}
	
	
	@Override
	@Transactional
	public void updateKeyContact(KeyContact keyContact) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET KC_ID = ? , NAME = ?, PHONE_NO = ?, MOBILE_NO = ?,EMAIL = ? ,ADDRESS = ?, ADD_CITY = ?, ADD_STATE = ?, COUNTRY_ID=?, ADD_ZIPCODE = ?,UPDATED_BY = ?,UPDATED_DATE = ?,CUST_ID = ? WHERE KC_ID = ?";
		simpleJdbcTemplate.update(strQuery, keyContact.getKcId(), keyContact.getName(), keyContact.getPhoneNo(), keyContact.getMobileNo(), keyContact.getEmail(), keyContact.getAddress(), keyContact.getCity(), keyContact.getState(), keyContact.getCountry(), keyContact.getZipCode(), keyContact.getUpdatedBy(), keyContact.getUpdatedDate(), keyContact.getCustomer(), keyContact.getKcId());
		
	}
	
	@Override
	@Transactional
	public void updateKeyIsActiveContact(KeyContact keyContact) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET KC_ID = ?, IS_ACTIVE = ? ,UPDATED_BY = ?,UPDATED_DATE = ?,CUST_ID = ?,CUST_ID = ?  WHERE KC_ID = ?";
		simpleJdbcTemplate.update(strQuery, keyContact.getKcId(), keyContact.getActive(), keyContact.getUpdatedBy(), keyContact.getUpdatedDate(), keyContact.getCustomer(),keyContact.getCustomer(), keyContact.getKcId());
		
	}
	
	@Override
	@Transactional
	public void removeKeyContact(KeyContact keyContact) throws DataAccessException
	{
		final String strQuery = "DELETE FROM " + getTableName() + " WHERE KC_ID = ? ";
		simpleJdbcTemplate.update(strQuery, keyContact.getKcId());
		
	}
	
	
	public KeyContact mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		KeyContact keyContact = new KeyContact();
		keyContact.setKcId(rs.getInt("KC_ID"));
		keyContact.setCustomer(rs.getInt("CUST_ID"));
		keyContact.setEmail(rs.getString("EMAIL"));
		keyContact.setName(rs.getString("NAME"));
		keyContact.setPhoneNo(rs.getString("PHONE_NO"));
		keyContact.setMobileNo(rs.getString("MOBILE_NO"));
		keyContact.setAddress(rs.getString("ADDRESS"));
		keyContact.setCity(rs.getString("ADD_CITY"));
		keyContact.setState(rs.getString("ADD_STATE"));
		keyContact.setCountry(rs.getInt("COUNTRY_ID"));
		keyContact.setZipCode(rs.getString("ADD_ZIPCODE"));
		keyContact.setActive(rs.getInt("IS_ACTIVE"));
		keyContact.setCreatedBy(rs.getString("CREATED_BY"));
		keyContact.setCreatedDate(rs.getDate("CREATED_DATE"));
		keyContact.setUpdatedBy(rs.getString("UPDATED_BY"));
		keyContact.setUpdatedDate(rs.getDate("UPDATED_DATE"));
		
		return keyContact;
	}
	
	@Override
	@Transactional
	public List<KeyContact> findAllProjectKeyContact(Project project) throws DataAccessException
	{
		final StringBuilder strQuery = new StringBuilder();
		strQuery.append("SELECT kc.EMAIL, kc.NAME  FROM " + getTableName() + " kc join PROJECT p on (kc.CUST_ID = p.CUSTOMER)");
		strQuery.append(" where p.PROJECT_ID = ? and kc.IS_ACTIVE=1");
		List<KeyContact> resultList = simpleJdbcTemplate.query(strQuery.toString(), new RowMapper<KeyContact>()
			{
				@Override
				public KeyContact mapRow(ResultSet rs, int arg1) throws SQLException
				{
					KeyContact keycontact = new KeyContact();
					
					keycontact.setEmail(rs.getString(1));
					keycontact.setName(rs.getString(2));
					
					
					return keycontact;
				}
			}, project.getProjectId());
		return resultList;
	}
}
