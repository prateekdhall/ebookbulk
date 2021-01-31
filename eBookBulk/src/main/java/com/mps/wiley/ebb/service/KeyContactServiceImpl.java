package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import main.java.com.mps.wiley.ebb.dao.KeyContactDao;
import main.java.com.mps.wiley.ebb.domain.KeyContact;
import main.java.com.mps.wiley.ebb.domain.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("KeyContactService")
@Transactional
public class KeyContactServiceImpl implements KeyContactService
{
	/**
	 * Instantiates a new KeyContactServiceimpl.
	 * 
	 */
	public KeyContactServiceImpl()
	{
	}
	
	@Autowired
	private KeyContactDao keyContactDao;
	
	@Override
	@Transactional(readOnly = true)
	public String getProjectKeyContacts(Project project) throws DataAccessException
	{
		List<KeyContact> keycontactlist = keyContactDao.findAllProjectKeyContact(project);
		String keyContactList = "";
		for (KeyContact keyContactEntity : keycontactlist)
		{
			keyContactList = keyContactList + keyContactEntity.getName() + "<" + keyContactEntity.getEmail() + ">" + "; ";
		}
		return keyContactList;
	}
}
