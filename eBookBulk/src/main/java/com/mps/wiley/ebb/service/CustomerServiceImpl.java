package main.java.com.mps.wiley.ebb.service;


import java.util.List;
import java.util.Map;

import main.java.com.mps.common.util.RandomCodeGenerator;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.dao.CustomerDao;
import main.java.com.mps.wiley.ebb.dao.KeyContactDao;
import main.java.com.mps.wiley.ebb.dao.UserDao;
import main.java.com.mps.wiley.ebb.domain.Customer;
import main.java.com.mps.wiley.ebb.domain.KeyContact;
import main.java.com.mps.wiley.ebb.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService
{
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private KeyContactDao keyContactDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public List<KeyContact> getKeyContactGridDetails(int customerId) throws DataAccessException
	{
		return keyContactDao.getKeyContactGridDetails(customerId);
	}
	
	@Override
	@Transactional
	public Customer viewCustomer(int customerId) throws DataAccessException
	{
		return customerDao.getCustomerById(customerId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public int saveCustomer(Customer customer, Map<String, Object> session) throws DataAccessException
	{
		int custId;
		User userTemp;
		User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
		
		if (customer.getCustomerId() == null || customer.getCustomerId() == 0)
		{
			custId = customerDao.insertCustomer(customer);
			
			List<KeyContact> tempKeyContactList = (List<KeyContact>)session.get(AppConstants.KC_GRID_LIST);
			if (null != tempKeyContactList && !tempKeyContactList.isEmpty())
			{
				for (KeyContact keyContactTemp : tempKeyContactList)
				{
					keyContactTemp.setCustomer(custId);
					if (keyContactTemp.getKcId() < 0)
					{
						keyContactTemp.setCreatedBy(sessionUser.getUserName());
						keyContactTemp.setUpdatedBy(sessionUser.getUserName());
						keyContactDao.insertKeyContact(keyContactTemp);
						
						userTemp = getUserFromKeyContact(keyContactTemp);
						userDao.insertUser(userTemp);
					}
					else
					{
						keyContactTemp.setUpdatedBy(sessionUser.getUserName());
						keyContactDao.updateKeyContact(keyContactTemp);
						
						userTemp = userDao.getUserByEmail(keyContactTemp.getEmail());
						userTemp = getUserFromKeyContact(keyContactTemp);
						
						userDao.updateUser(userTemp);
					}
				}
			}
			return custId;
		}
		else
		{
			custId = customerDao.updateCustomer(customer);
			
			List<KeyContact> tempKeyContactList = (List<KeyContact>)session.get(AppConstants.KC_GRID_LIST);
			List<KeyContact> deletedKeyContactList = (List<KeyContact>)session.get(AppConstants.KC_DELETE_LIST);
			
			for (KeyContact delKeyContactTemp : deletedKeyContactList)
			{
				delKeyContactTemp.setActive(AppConstants.NO);
				delKeyContactTemp.setUpdatedBy(customer.getUpdatedBy());
				delKeyContactTemp.setCustomer(customer.getCustomerId());
				keyContactDao.updateKeyIsActiveContact(delKeyContactTemp);
				
				
			}
			
			for (KeyContact keyContactTemp : tempKeyContactList)
			{
				if (keyContactTemp.getKcId() < 0)
				{
					keyContactTemp.setCreatedBy(sessionUser.getUserName());
					keyContactTemp.setUpdatedBy(sessionUser.getUserName());
					keyContactDao.insertKeyContact(keyContactTemp);
					
					userTemp = getUserFromKeyContact(keyContactTemp);
					userDao.insertUser(userTemp);
				}
				else
				{
					keyContactTemp.setUpdatedBy(sessionUser.getUserName());
					keyContactDao.updateKeyContact(keyContactTemp);
					
					userTemp = userDao.getUserByEmail(keyContactTemp.getEmail());
					userTemp = getUserFromKeyContact(keyContactTemp);
					
					userDao.updateUser(userTemp);
				}
			}
			
			return custId;
		}
	}
	
	private User getUserFromKeyContact(KeyContact keyContactTemp)
	{
		User userTemp = new User();
//		userTemp.setUserName(keyContactTemp.getEmail());
		RandomCodeGenerator randomCodeGenerator=new RandomCodeGenerator();
		userTemp.setUserName(randomCodeGenerator.randomGenerator(5).concat("_"+keyContactTemp.getEmail()));
		userTemp.setPassword("pass123");
		userTemp.setName(keyContactTemp.getName());
		userTemp.setPhoneNo(keyContactTemp.getPhoneNo());
		userTemp.setMobileNo(keyContactTemp.getMobileNo());
		userTemp.setActive(AppConstants.YES);
		userTemp.setKeyContact(AppConstants.YES);
		// userTemp.getCountry().setId(keyContactTemp.getCountry());
		userTemp.setCreatedBy(keyContactTemp.getCreatedBy());
		userTemp.setCreatedDate(keyContactTemp.getCreatedDate());
		userTemp.setUpdatedBy(keyContactTemp.getUpdatedBy());
		userTemp.setUpdatedDate(keyContactTemp.getUpdatedDate());
		userTemp.setRoleId(AppConstants.ROLE_KEY_CONTACT);
		return userTemp;
	}
	
	@Override
	public List<Customer> getCustomers(Customer customer) throws DataAccessException
	{
		return customerDao.getCustomers(customer);
	}
	
	public List<Customer> getAllCustomers() throws DataAccessException
	{
		return customerDao.getAllCustomers();
	}
	
	@Override
	public Customer getCustomerById(int customerId) throws DataAccessException
	{
		
		return customerDao.getCustomerById(customerId);
	}
	
	
}
