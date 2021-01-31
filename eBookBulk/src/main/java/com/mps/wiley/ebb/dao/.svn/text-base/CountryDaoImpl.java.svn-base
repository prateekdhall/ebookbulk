package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.Country;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("CountryDao")
@Transactional
public class CountryDaoImpl extends AbstractBaseDao<Country> implements CountryDao
{
	public CountryDaoImpl()
	{
		super();
	}
	
	
	@Override
	public String getTableName()
	{
		return "COUNTRY";
	}
	
	@Override
	public String getFields()
	{
		return "COUNTRY_ID, COUNTRY_CODE, COUNTRY_NAME, ISO_CODE";
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Country> findAllCountries() throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " ORDER BY COUNTRY_NAME";
		return simpleJdbcTemplate.query(strQuery, this);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Country findCountriesByIsoCode(String strIsoCode) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE ISO_CODE = ?";
		return simpleJdbcTemplate.queryForObject(strQuery, this, strIsoCode);
	}
	
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Country country = new Country();
		country.setCountryId(rs.getInt("COUNTRY_ID"));
		country.setCountryCode(rs.getString("COUNTRY_CODE"));
		country.setCountryName(rs.getString("COUNTRY_NAME"));
		country.setCountryCode(rs.getString("COUNTRY_CODE"));
		country.setIsoCode(rs.getString("ISO_CODE"));
		return country;
	}
}
