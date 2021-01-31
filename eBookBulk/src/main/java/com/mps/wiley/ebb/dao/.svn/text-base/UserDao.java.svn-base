package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.User;

import org.springframework.dao.DataAccessException;


public interface UserDao extends BaseDao<User>
{
	public User getUserById(int userId) throws DataAccessException;
	
	public List<User> findAllUsers() throws DataAccessException;
	
	public int forgotPassword(User user, String password) throws DataAccessException;
	
	public int updatePassword(User user, String password) throws DataAccessException;
	
	public int passwordExist(User user) throws DataAccessException;
	
	public User getUserByEmail(String userEmail) throws DataAccessException;
	
	public User getUserByUserName(String userEmail) throws DataAccessException;	
	
	public User getUser(String strNamedQuery, Object... strParam) throws DataAccessException;
	
	public List<User> getUsers(User user) throws DataAccessException;
	
	public int insertUser(User user) throws DataAccessException;
	
	public int updateUser(User user) throws DataAccessException;
	
	public int userExist(String Email) throws DataAccessException;
}
