package main.java.com.mps.wiley.ebb.service;

import java.util.List;

import main.java.com.mps.wiley.ebb.dao.AutocompleterDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("AutoCompleterService")
public class AutoCompleterServiceImpl implements AutoCompleterService
{

	@Autowired
	AutocompleterDao autocompleterDao ;
	
	@Override
	@Transactional
	public List<String> getContentByAutoSearch(int moduleId, int componentId, String searchData) throws DataAccessException
	{
		return autocompleterDao.getContentByAutoSearch(moduleId, componentId, searchData);
	}
	
}
