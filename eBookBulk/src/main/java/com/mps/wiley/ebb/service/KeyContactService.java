package main.java.com.mps.wiley.ebb.service;


import main.java.com.mps.wiley.ebb.domain.Project;

import org.springframework.dao.DataAccessException;


public interface KeyContactService
{
	public String getProjectKeyContacts(Project project) throws DataAccessException;
}
