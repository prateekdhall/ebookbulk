package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import org.springframework.dao.DataAccessException;

import main.java.com.mps.wiley.ebb.domain.User;


public interface UserService
{
	/**
	 * Load all Users
	 * 
	 */
	public List<User> loadUsers() throws DataAccessException;
	
	/**
	 * Delete an existing User entity
	 * 
	 */
	public void deleteUser(User user) throws DataAccessException;
	
	/**
	 * Save an existing User entity
	 * 
	 */
	public void saveUser(User user) throws DataAccessException;
	
	/**
	 * Load User on string criteria
	 * 
	 */
	public User loadUser(int id) throws DataAccessException;
	
	public int forgotPassword(User user, String newPassword) throws DataAccessException;
	
	public int changePassword(User user, String newPassword) throws DataAccessException;
	
	public int passwordExist(User user) throws DataAccessException;
	
	public User getUserByEmail(String userEmail) throws DataAccessException;
	
	public User getUserByUserName(String userName) throws DataAccessException;
	
	public User getUser(String strNamedQuery, Object... objParam) throws DataAccessException;
	
	public List<User> getUsers(User user) throws DataAccessException;
	
	public List<User> getUsersByRole(Integer iRoleId) throws DataAccessException;
	
	public List<User> getUsersByRoles(Object... role) throws DataAccessException;
	
	public List<User> getUsersByIds(Object... userid) throws DataAccessException;
	
	public int userExist(String Email) throws DataAccessException;
}
