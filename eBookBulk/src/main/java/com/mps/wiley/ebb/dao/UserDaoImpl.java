package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.common.util.IntegerUtil;
import main.java.com.mps.common.util.StringUtil;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.User;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("UserDao")
@Transactional
public class UserDaoImpl extends AbstractBaseDao<User> implements UserDao
{
	public UserDaoImpl()
	{
		super();
	}
	
	@Override
	public String getTableName()
	{
		return "USER";
	}
	
	@Override
	public String getFields()
	{
		return "USR_ID,USER_NAME,PASSWORD,NAME,PHONE_NO,MOBILE_NO,IS_ACTIVE,IS_KEY_CONTACT,CREATED_BY,CREATED_DATE,UPDATED_BY,UPDATED_DATE,ROLE_ID,COUNTRY_ID";
	}
	
	@Override
	@Transactional
	public int insertUser(User user) throws DataAccessException
	{
		final String strQuery = "INSERT INTO " + getTableName() + " ( USER_NAME, PASSWORD, NAME, PHONE_NO, MOBILE_NO, IS_ACTIVE, IS_KEY_CONTACT, CREATED_BY, CREATED_DATE, UPDATED_BY, UPDATED_DATE, ROLE_ID, COUNTRY_ID ) VALUES ( ?, md5(?), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		simpleJdbcTemplate.update(strQuery, user.getUserName(), user.getPassword(), user.getName(), user.getPhoneNo(), user.getMobileNo(), user.getActive(), user.getKeyContact(), user.getCreatedBy(), user.getCreatedDate(), user.getUpdatedBy(), user.getUpdatedDate(), user.getRoleId(), user.getCountry().getId());
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	@Override
	@Transactional
	public int updateUser(User user) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET USR_ID = ?, USER_NAME = ?, NAME = ?, PHONE_NO = ?, MOBILE_NO = ?, IS_ACTIVE = ?,IS_KEY_CONTACT = ?, UPDATED_BY = ?, UPDATED_DATE = ?, ROLE_ID = ?, COUNTRY_ID = ? WHERE USR_ID = ?";
		return simpleJdbcTemplate.update(strQuery, user.getUsrId(), user.getUserName(), user.getName(), user.getPhoneNo(), user.getMobileNo(), user.getActive(), user.getKeyContact(), user.getUpdatedBy(), user.getUpdatedDate(), user.getRoleId(), user.getCountry().getId(), user.getUsrId());
	}
	
	/**
	 * Used to list a single user by Id.
	 */
	@Override
	@Transactional
	public User getUserById(int iUserId) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE USR_ID = ?";
		return simpleJdbcTemplate.queryForObject(strQuery.toString(), this, iUserId);
	}
	
	@Override
	@Transactional
	public List<User> findAllUsers() throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName();
		return simpleJdbcTemplate.query(strQuery.toString(), this);
	}
	
	@Override
	@Transactional
	public int updatePassword(User user, String password) throws DataAccessException
	{
		String query = "UPDATE " + getTableName() + " SET PASSWORD = md5(?),UPDATED_BY=?,UPDATED_DATE=? WHERE USER_NAME = ? AND PASSWORD = md5(?)";
		return simpleJdbcTemplate.update(query, password, user.getUpdatedBy(), user.getUpdatedDate(), user.getUserName(), user.getPassword());
	}
	
	@Override
	@Transactional
	public int forgotPassword(User user, String password) throws DataAccessException
	{
		String query = "UPDATE " + getTableName() + " SET PASSWORD = md5(?),UPDATED_BY=?,UPDATED_DATE=? WHERE USER_NAME = ? AND PASSWORD = ?";
		return simpleJdbcTemplate.update(query, password, user.getUpdatedBy(), user.getUpdatedDate(), user.getUserName(), user.getPassword());
	}
	
	@Override
	@Transactional
	public User getUserByEmail(String userEmail) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE USER_NAME = ?";
		final List<User> objList = simpleJdbcTemplate.query(strQuery.toString(), this, userEmail);
		if (objList == null || objList.isEmpty())
		{
			return null;
		}
		else
		{
			return objList.get(0);
		}
	}
	
	@Override
	@Transactional
	public User getUserByUserName(String userName) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE USER_NAME = ?";
		final List<User> objList = simpleJdbcTemplate.query(strQuery.toString(), this, userName);
		if (objList == null || objList.isEmpty())
		{
			return null;
		}
		else
		{
			return objList.get(0);
		}
	}
	
	
	@Override
	@Transactional
	public User getUser(String strNamedQuery, Object... strParam) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE USER_NAME = ? AND PASSWORD = md5(?)";
		final List<User> objList = simpleJdbcTemplate.query(strQuery.toString(), this, strParam);
		if (objList == null || objList.isEmpty())
		{
			return null;
		}
		else
		{
			return objList.get(0);
		}
	}
	
	@Override
	public List<User> getUsers(User user) throws DataAccessException
	{
		StringBuilder strQuery = new StringBuilder();
		strQuery.append("SELECT " + getFields() + " FROM " + getTableName() + " myUser");
		
		List<String> queryParam = new ArrayList<String>();
		
		boolean blnCondition = false;
		if (StringUtil.isValidStr(user.getName()))
		{
			strQuery.append(" WHERE ");
			strQuery.append("myUser.NAME like ?");
			queryParam.add("%" + user.getName() + "%");
			blnCondition = true;
		}
		
		if (StringUtil.isValidStr(user.getUserName()))
		{
			if (blnCondition)
			{
				strQuery.append(" AND ");
			}
			else
			{
				strQuery.append(" WHERE ");
			}
			strQuery.append("myUser.USER_NAME like ?");
			queryParam.add("%" + user.getUserName() + "%");
			blnCondition = true;
		}
		
		if (IntegerUtil.isValidInt(user.getUsrId()))
		{
			if (blnCondition)
			{
				strQuery.append(" AND ");
			}
			else
			{
				strQuery.append(" WHERE ");
			}
			queryParam.add(user.getUsrId().toString());
			strQuery.append("myUser.USR_ID not in(?)");
			blnCondition = true;
		}
		if (blnCondition)
		{
			strQuery.append(" AND ");
		}
		else
		{
			strQuery.append(" WHERE ");
		}
		strQuery.append("myUser.ROLE_ID != " + AppConstants.ROLE_KEY_CONTACT);
		return simpleJdbcTemplate.query(strQuery.toString(), this, queryParam.toArray());
	}
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		User user = new User();
		user.setUsrId(rs.getInt("USR_ID"));
		user.setUserName(rs.getString("USER_NAME"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setName(rs.getString("NAME"));
		user.setPhoneNo(rs.getString("PHONE_NO"));
		user.setMobileNo(rs.getString("MOBILE_NO"));
		user.setActive(rs.getInt("IS_ACTIVE"));
		user.setKeyContact(rs.getInt("IS_KEY_CONTACT"));
		user.setCreatedBy(rs.getString("CREATED_BY"));
		user.setCreatedDate(rs.getDate("CREATED_DATE"));
		user.setUpdatedBy(rs.getString("UPDATED_BY"));
		user.setUpdatedDate(rs.getDate("UPDATED_DATE"));
		user.setRoleId(rs.getInt("ROLE_ID"));
		user.getCountry().setId(rs.getInt("COUNTRY_ID"));
		return user;
	}
	
	@Override
	@Transactional
	public int userExist(String Email) throws DataAccessException
	{
		String query = "SELECT COUNT(USER_NAME) FROM " + getTableName() + " WHERE USER_NAME = ?";
		return simpleJdbcTemplate.queryForInt(query, Email);
	}
	
	@Override
	@Transactional
	public int passwordExist(User user) throws DataAccessException
	{
		String query = "SELECT COUNT(USER_NAME) FROM " + getTableName() + " WHERE USER_NAME = ? AND PASSWORD = md5(?)";
		return simpleJdbcTemplate.queryForInt(query, user.getUserName(), user.getPassword());
	}
	
}
