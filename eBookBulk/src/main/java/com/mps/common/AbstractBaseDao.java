package main.java.com.mps.common;


import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.mps.common.util.StringUtil;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.kite.orm.dao.AbstractKiteDao;




@Transactional
public abstract class AbstractBaseDao<T> extends AbstractKiteDao<T> implements BaseDao<T>, RowMapper<T>
{
	public final static int INTEGER = 1;
	
	/**
	 * String Mapping for SQL
	 */
	public final static int STRING = 2;
	
	/**
	 * Decimal Mapping for SQL
	 */
	public final static int DECIMAL = 3;
	
	/**
	 * Date Mapping for SQL
	 */
	public final static int DATE = 4;
	
	/**
	 * Time Mapping for SQL
	 */
	public final static int TIME = 5;
	
	/**
	 * DateTime Mapping for SQL
	 */
	public final static int TIMESTAMP = 6;
	
	/**
	 * Object Mapping for SQL
	 */
	public final static int OBJECT = 7;
	
	/**
	 * Float Mapping for SQL
	 */
	public final static int FLOAT = 8;
	
	/**
	 * Big Int Mapping for SQL
	 */
	public final static int BIGINT = 9;
	
	@SuppressWarnings({"hiding", "unchecked"})
	@Override
	@Transactional
	public <T> T getSingleObject(String strQry, Object... objParam) throws DataAccessException
	{
		return (T)simpleJdbcTemplate.queryForObject("SELECT " + getFields() + " FROM " + getTableName() + " WHERE " + strQry, this, objParam);
	}
	
	@SuppressWarnings({"hiding"})
	@Override
	@Transactional
	public <T> T getObject(String strQry, Object... objParam) throws DataAccessException
	{
		return getObject(strQry, false, objParam);
	}
	
	@SuppressWarnings({"unchecked", "hiding"})
	@Override
	@Transactional
	public <T> T getObject(String strQry, boolean blnCondition, Object... objParam) throws DataAccessException
	{
		if (blnCondition)
		{
			List<T> objList = (List<T>)simpleJdbcTemplate.query(strQry, this, objParam);
			return (objList == null || objList.isEmpty()) ? null : objList.get(0);
		}
		else
		{
			List<T> objList = (List<T>)simpleJdbcTemplate.query("SELECT " + getFields() + " FROM " + getTableName() + " WHERE " + strQry, this, objParam);
			return (objList == null || objList.isEmpty()) ? null : objList.get(0);
		}
	}
	
	@Override
	@Transactional
	public List<T> getObjectList(String strQry, Object... objParam) throws DataAccessException
	{
		return getObjectList(strQry, false, objParam);
	}
	
	@Override
	@Transactional
	public List<T> getObjectList(String strQry, boolean blnCondition, Object... objParam) throws DataAccessException
	{
		if (blnCondition)
		{
			return simpleJdbcTemplate.query(strQry, this, objParam);
		}
		else
		{
			return simpleJdbcTemplate.query("SELECT " + getFields() + " FROM " + getTableName() + " WHERE " + strQry, this, objParam);
		}
	}
	
	@Override
	@Transactional
	public List<T> getObjectList(String strQry, final Class<T> clazz, final String[] objParam, final int[] iParam, Object... args) throws DataAccessException
	{
		return simpleJdbcTemplate.query(strQry, new RowMapper<T>()
			{
				@Override
				public T mapRow(ResultSet objRs, int arg1) throws SQLException
				{
					T objBean = null;
					try
					{
						objBean = clazz.newInstance();
						Map<String, Object> objMap = new HashMap<String, Object>();
						int i = 0;
						for (String strParam : objParam)
						{
							objMap.put(strParam, getResultObjectValue(iParam[i], objRs, i + 1));
							i++;
						}
						BeanUtils.copyProperties(objBean, objMap);
					}
					catch (Exception e)
					{
						e.printStackTrace();
						throw new SQLException(e);
					}
					return objBean;
				}
			}, args);
	}
	
	private final Object getResultObjectValue(int iType, ResultSet objRs, int iParam) throws SQLException
	{
		Object obj = null;
		switch (iType)
		{
			case STRING:
				obj = StringUtil.validStr(objRs.getString(iParam));
				break;
			case INTEGER:
				obj = new Integer(objRs.getInt(iParam));
				break;
			case DATE:
				obj = objRs.getDate(iParam);
				break;
			case DECIMAL:
				obj = new Double(objRs.getDouble(iParam));
				break;
			case FLOAT:
				obj = new Float(objRs.getFloat(iParam));
				break;
			case BIGINT:
				obj = new Long(objRs.getLong(iParam));
				break;
			case TIMESTAMP:
				obj = objRs.getTimestamp(iParam);
				break;
			case TIME:
				obj = objRs.getTime(iParam);
				break;
			case OBJECT:
				final Blob objBlob = objRs.getBlob(iParam);
				obj = objBlob.getBytes(1, (int)objBlob.length());
				break;
			default:
				obj = StringUtil.validStr(objRs.getString(iParam));
				break;
		}
		return obj;
	}
	
	@Override
	@Transactional
	public Map<String, Object> getObjectMap(String strQry, Object... objParam) throws DataAccessException
	{
		return simpleJdbcTemplate.queryForMap(strQry, objParam);
	}
	
	@Override
	@Transactional
	public List<Map<String, Object>> getObjectMapList(String strQry, Object... objParam) throws DataAccessException
	{
		return simpleJdbcTemplate.queryForList(strQry, objParam);
	}
}
