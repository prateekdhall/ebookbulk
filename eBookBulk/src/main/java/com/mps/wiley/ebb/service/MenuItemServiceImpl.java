package main.java.com.mps.wiley.ebb.service;

import java.util.List;

import main.java.com.mps.wiley.ebb.dao.MenuItemDao;
import main.java.com.mps.wiley.ebb.domain.MenuItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("MenuItemService")
@Transactional
public class MenuItemServiceImpl implements MenuItemService
{
	public MenuItemServiceImpl()
	{
	}
	
	@Autowired
	private MenuItemDao menuItemDao;

	@Override
	@Transactional
	public List<MenuItem> loadAllResourses(final Integer iRoleId)
	{
		return menuItemDao.findAllResources(iRoleId);
	}
}
