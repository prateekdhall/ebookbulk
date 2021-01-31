package main.java.com.mps.wiley.ebb.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface AutocompleterDao
{
	public List<String> getContentByAutoSearch(int moduleId, int componentId, String searchData) throws DataAccessException;
}
