package main.java.com.mps.common;


import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.kite.orm.dao.KiteDao;


public interface BaseDao<T> extends KiteDao<T>
{
	public String getFields();
	
	public String getTableName();
	
	@SuppressWarnings("hiding")
	public <T> T getSingleObject(String strQry, Object... objParam) throws DataAccessException;
	
	@SuppressWarnings("hiding")
	public <T> T getObject(String strQry, Object... objParam) throws DataAccessException;
	
	@SuppressWarnings("hiding")
	public <T> T getObject(String strQry, boolean blnCondition, Object... objParam) throws DataAccessException;
	
	public List<T> getObjectList(String strQry, Object... objParam) throws DataAccessException;
	
	public List<T> getObjectList(String strQry, boolean blnCondition, Object... objParam) throws DataAccessException;
	
	public List<T> getObjectList(String strQry, final Class<T> clazz, final String[] objParam, final int[] iParam, Object... args) throws DataAccessException;
	
	public Map<String, Object> getObjectMap(String strQry, Object... objParam) throws DataAccessException;
	
	public List<Map<String, Object>> getObjectMapList(String strQry, Object... objParam) throws DataAccessException;
}
