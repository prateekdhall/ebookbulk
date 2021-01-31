package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.ExceptionMessage;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("ExceptiomMessageDao")
@Transactional
public class ExceptionMessageDaoImpl extends AbstractBaseDao<ExceptionMessage> implements ExceptionMessageDao
{
	
	@Override
	public String getFields()
	{
		return "AUTO_ID,MSG_ID,PROJECT_ID,PRJ_MOMENTUM_ID,EXCEPTION_EVENT,EXCEPTION_TEXT";
	}
	
	@Override
	public String getTableName()
	{
		return "PROJECT_EXCEPTION_MESSAGE";
	}
	
	@Override
	public ExceptionMessage mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ExceptionMessage exceptionMessage = new ExceptionMessage();
		
		exceptionMessage.setId(rs.getInt("AUTO_ID"));
		exceptionMessage.setMsgId(rs.getInt("MSG_ID"));
		exceptionMessage.setProjectId(rs.getInt("PROJECT_ID"));
		exceptionMessage.setMomentumId(rs.getInt("PRJ_MOMENTUM_ID"));
		exceptionMessage.setExceptionEvent(rs.getString("EXCEPTION_EVENT"));
		exceptionMessage.setExceptionText(rs.getString("EXCEPTION_TEXT"));
		
		return exceptionMessage;
	}
	
	@Override
	@Transactional
	public List<ExceptionMessage> getInitialExceptionMessage(Integer projectId) throws DataAccessException
	{
		// final String strQuery ="SELECT MSG_ID,null,EXCEPTION_EVENT,EXCEPTION_TEXT FROM WEBSITE_EXCEPTION_MESSAGE";
		// return simpleJdbcTemplate.query(strQuery.toString(), this);
		
		final String strQuery = "SELECT MSG_ID,null,null,EXCEPTION_EVENT,EXCEPTION_TEXT FROM WEBSITE_EXCEPTION_MESSAGE";
		List<ExceptionMessage> resultList = simpleJdbcTemplate.query(strQuery.toString(), new RowMapper<ExceptionMessage>()
			{
				@Override
				public ExceptionMessage mapRow(ResultSet rs, int rowNum) throws SQLException
				{
					ExceptionMessage exceptionMessage = new ExceptionMessage();
					
					exceptionMessage.setMsgId(rs.getInt("MSG_ID"));
					exceptionMessage.setProjectId(null);
					exceptionMessage.setMomentumId(null);
					exceptionMessage.setExceptionEvent(rs.getString("EXCEPTION_EVENT"));
					exceptionMessage.setExceptionText(rs.getString("EXCEPTION_TEXT"));
					
					return exceptionMessage;
				}
			});
		
		return resultList;
	}
	
	@Override
	public int insertExceptionMessage(ExceptionMessage exceptionMessage) throws DataAccessException
	{
		final String strQuery = "INSERT INTO " + getTableName() + " ( MSG_ID,PROJECT_ID,EXCEPTION_EVENT,EXCEPTION_TEXT ) VALUES ( ?, ?, ?, ?)";
		simpleJdbcTemplate.update(strQuery, exceptionMessage.getMsgId(), exceptionMessage.getProjectId(), exceptionMessage.getExceptionEvent(), exceptionMessage.getExceptionText());
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	@Override
	public int updateExceptionMessage(ExceptionMessage exceptionMessage) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET EXCEPTION_EVENT = ?, EXCEPTION_TEXT = ? WHERE PROJECT_ID = ? AND AUTO_ID = ?";
		return simpleJdbcTemplate.update(strQuery, exceptionMessage.getExceptionEvent(), exceptionMessage.getExceptionText(), exceptionMessage.getProjectId(), exceptionMessage.getId());
	}
	
}
