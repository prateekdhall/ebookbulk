package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.User;

import org.springframework.dao.DataAccessException;


public interface DynamicFieldDao extends BaseDao<DynamicField>
{
	
	public List<DynamicField> findAllDynamicFields() throws DataAccessException;
	
}
