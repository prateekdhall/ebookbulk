package main.java.com.mps.wiley.ebb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.mps.wiley.ebb.dao.RoleDao;
import main.java.com.mps.wiley.ebb.domain.Role;

@Service("RoleService")
@Transactional
public class RoleServiceImpl implements RoleService
{
	/**
	 * Instantiates a new RoleServiceImpl.
	 * 
	 */
	public RoleServiceImpl()
	{
	}
	
	@Autowired
	private RoleDao roleDao;

	@Override
	@Transactional
	public List<Role> loadAllRoles()
	{
		return roleDao.findAllRoles();
	}
	
}
