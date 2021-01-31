package main.java.com.mps.wiley.ebb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface AutoCompleterService
{
	
	public List<String> getContentByAutoSearch(int moduleId, int componentId, String searchData) throws DataAccessException;
	
}
