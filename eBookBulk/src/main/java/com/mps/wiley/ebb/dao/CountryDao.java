package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.wiley.ebb.domain.Country;

import org.springframework.dao.DataAccessException;


public interface CountryDao
{
	public List<Country> findAllCountries() throws DataAccessException;
	
	public Country findCountriesByIsoCode(String strIsoCode) throws DataAccessException;
}
