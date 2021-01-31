package main.java.com.mps.wiley.ebb.dao;

import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.ExceptionMessage;

import org.springframework.dao.DataAccessException;

public interface ExceptionMessageDao extends BaseDao<ExceptionMessage>
{
	public List<ExceptionMessage> getInitialExceptionMessage(Integer projectId) throws DataAccessException;
	
	public int insertExceptionMessage(ExceptionMessage exceptionMessage) throws DataAccessException;
	
	public int updateExceptionMessage(ExceptionMessage exceptionMessage) throws DataAccessException;
	
}

