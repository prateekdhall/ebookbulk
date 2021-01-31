package main.java.com.mps.wiley.ebb.service;


import main.java.com.mps.wiley.ebb.dao.RegistrationDetailsDao;
import main.java.com.mps.wiley.ebb.domain.RegistrationDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("RegistrationDetailsService")
@Transactional
public class RegistrationDetailsServiceImpl implements RegistrationDetailsService
{
	
	public RegistrationDetailsServiceImpl()
	{
	}
	
	
	@Autowired
	private RegistrationDetailsDao registrationDetailsDao;
	
	
	@Override
	@Transactional
	public String insertRegisteration(RegistrationDetails registerObj) throws DataAccessException
	{
		registrationDetailsDao.insertRegistrationDetails(registerObj);
		return "";
	}
	
	
}
