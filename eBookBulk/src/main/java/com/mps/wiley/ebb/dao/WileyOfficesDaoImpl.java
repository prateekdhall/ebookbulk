package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.WileyOffices;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("WileyOfficesDao")
@Transactional
public class WileyOfficesDaoImpl extends AbstractBaseDao<WileyOffices> implements WileyOfficesDao
{
	@Override
	public String getFields()
	{
		return "OFFICE_ID, OFFICE_NAME, TIME_DIFF_TO_EST";
	}
	
	@Override
	public String getTableName()
	{
		return "WILEY_OFFICES";
	}
	
	@Override
	public WileyOffices mapRow(ResultSet rs, int arg1) throws SQLException
	{
		WileyOffices wileyOffices = new WileyOffices();
		wileyOffices.setId(rs.getInt("OFFICE_ID"));
		wileyOffices.setName(rs.getString("OFFICE_NAME"));
		wileyOffices.setEstDifference(rs.getDouble("TIME_DIFF_TO_EST"));
		return wileyOffices;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<WileyOffices> findAllWileyOffices() throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " ORDER BY OFFICE_NAME";
		return simpleJdbcTemplate.query(strQuery, this);
	}
}
