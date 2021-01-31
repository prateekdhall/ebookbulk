package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("DynamicFieldDao")
@Transactional
public class DynamicFieldDaoImpl extends AbstractBaseDao<DynamicField> implements DynamicFieldDao
{
	public DynamicFieldDaoImpl()
	{
		super();
	}
	
	@Override
	public String getTableName()
	{
		return "DYNAMIC_FIELDS";
	}
	
	@Override
	public String getFields()
	{
		return "FLD_ID,FLD_NAME,FLD_TYPE";
	}
	
	@Override
	@Transactional
	public List<DynamicField> findAllDynamicFields() throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName();
		return simpleJdbcTemplate.query(strQuery.toString(), this);
	}
	
	
	public DynamicField mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		DynamicField dynamicField = new DynamicField();
		dynamicField.setFieldId(rs.getInt("FLD_ID"));
		dynamicField.setFieldName(rs.getString("FLD_NAME"));
		dynamicField.setFieldType(rs.getString("FLD_TYPE"));
		
		return dynamicField;
	}
}
