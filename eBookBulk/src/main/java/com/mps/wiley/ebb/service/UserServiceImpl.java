package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import main.java.com.mps.wiley.ebb.dao.UserDao;
import main.java.com.mps.wiley.ebb.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService
{
	/**
	 * Instantiates a new UserServiceImpl.
	 * 
	 */
	public UserServiceImpl()
	{
	}
	
	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDao userDAO;
	
	/**
	 * Load an existing User entity
	 * 
	 */
	@Override
	@Transactional
	public List<User> loadUsers() throws DataAccessException
	{
		return userDAO.findAllUsers();
	}
	
	/**
	 * Delete an existing User entity
	 * 
	 */
	@Override
	@Transactional
	public void deleteUser(User user) throws DataAccessException
	{
	}
	
	/**
	 * Save an existing User entity
	 * 
	 */
	@Override
	@Transactional
	public void saveUser(User user) throws DataAccessException
	{
		System.out.println("User Id in service::" + user.getUsrId());
		if (user.getUsrId() == null)
		{
			userDAO.insertUser(user);
		}
		else
		{
			userDAO.updateUser(user);
		}
	}
	
	@Override
	public User loadUser(int id) throws DataAccessException
	{
		return userDAO.getUserById(id);
	}
	
	@Override
	@Transactional
	public int changePassword(User user, String newPassword) throws DataAccessException
	{
		return userDAO.updatePassword(user, newPassword);
		
	}
	
	@Override
	@Transactional
	public int passwordExist(User user) throws DataAccessException
	{
		return userDAO.passwordExist(user);
		
	}
	
	@Override
	@Transactional
	public int forgotPassword(User user, String newPassword) throws DataAccessException
	{
		return userDAO.forgotPassword(user, newPassword);
		
	}
	
	
	@Override
	@Transactional
	public User getUserByEmail(String userEmail) throws DataAccessException
	{
		return userDAO.getUserByEmail(userEmail);
		
	}
	
	@Override
	@Transactional
	public User getUserByUserName(String userName) throws DataAccessException
	{
		return userDAO.getUserByUserName(userName);
		
	}
	
	@Override
	@Transactional
	public User getUser(String strNamedQuery, Object... objParam) throws DataAccessException
	{
		return userDAO.getUser(strNamedQuery, objParam);
	}
	
	@Override
	@Transactional
	public List<User> getUsers(User user) throws DataAccessException
	{
		return userDAO.getUsers(user);
	}
	
	@Override
	@Transactional
	public List<User> getUsersByRole(Integer iRoleId) throws DataAccessException
	{
		return userDAO.getObjectList("ROLE_ID = ?", iRoleId);
	}
	
	@Override
	@Transactional
	public List<User> getUsersByRoles(Object... role) throws DataAccessException
	{
		StringBuilder strQry = new StringBuilder();
		boolean blnFlag = false;
		strQry.append("ROLE_ID in (");
		final int iLen = role.length;
		for (int i = 0; i < iLen; i++)
		{
			if (blnFlag)
			{
				strQry.append(",");
			}
			blnFlag = true;
			strQry.append("?");
		}
		strQry.append(") ORDER BY USER_NAME");
		System.out.println("QRY===>"+strQry.toString());
		return userDAO.getObjectList(strQry.toString(), role);
	}
	
	@Override
	@Transactional
	public List<User> getUsersByIds(Object... userid) throws DataAccessException
	{
		StringBuilder strQry = new StringBuilder();
		boolean blnFlag = false;
		strQry.append("USR_ID in (");
		final int iLen = userid.length;
		for (int i = 0; i < iLen; i++)
		{
			if (blnFlag)
			{
				strQry.append(",");
			}
			blnFlag = true;
			strQry.append("?");
		}
		strQry.append(") ORDER BY USER_NAME");
		System.out.println("QRY===>"+strQry.toString());
		return userDAO.getObjectList(strQry.toString(), userid);
	}
	
	@Override
	@Transactional
	public int userExist(String Email) throws DataAccessException
	{
		return userDAO.userExist(Email);
	}
}
