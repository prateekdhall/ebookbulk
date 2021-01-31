package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import org.springframework.dao.DataAccessException;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.KeyContact;
import main.java.com.mps.wiley.ebb.domain.Project;


public interface KeyContactDao extends BaseDao<KeyContact>
{
	public List<KeyContact> getKeyContactGridDetails(int customerId);
	
	public void insertKeyContact(KeyContact keyContact) throws DataAccessException;
	public void updateKeyContact(KeyContact keyContact) throws DataAccessException;
	public void updateKeyIsActiveContact(KeyContact keyContact) throws DataAccessException;
	public void removeKeyContact(KeyContact keyContact) throws DataAccessException;
	public List<KeyContact> findAllProjectKeyContact(Project project) throws DataAccessException;
}
