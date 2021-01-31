package main.java.com.mps.wiley.ebb.service;


import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.Template;

import org.springframework.dao.DataAccessException;


public interface DynamicFieldService
{
	/**
	 * Load all Users
	 * 
	 */
	public List<DynamicField> loadDynamicFields() throws DataAccessException;
	
	public String writeHtmlFile(List<DynamicField> obj, Template template, Map<String, Object> session, String countrySelected, String hearus, String footNote, int arr[]) throws Exception;
}
