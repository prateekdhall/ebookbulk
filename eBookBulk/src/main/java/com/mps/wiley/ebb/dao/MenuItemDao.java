package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.wiley.ebb.domain.MenuItem;

import org.springframework.dao.DataAccessException;


public interface MenuItemDao
{
	public List<MenuItem> findAllResources(final Integer iRoleId) throws DataAccessException;
}
