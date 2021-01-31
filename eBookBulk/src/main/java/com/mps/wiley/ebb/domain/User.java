package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.util.Date;

import main.java.com.mps.common.dto.IdValueBean;


public class User implements Serializable
{
	private static final long serialVersionUID = -6654863573307376715L;
	
	private Integer usrId;
	
	private String userName;
	
	private String password;
	
	private String name;
	
	private String phoneNo;
	
	private String mobileNo;
	
	private Integer active = new Integer(1);
	
	private Integer keyContact = new Integer(0);
	
	private String createdBy;
	
	private Date createdDate = new Date();
	
	private String updatedBy;
	
	private Date updatedDate = new Date();
	
	private Integer roleId;
	
	private IdValueBean country = new IdValueBean();
	
	public IdValueBean getCountry()
	{
		return country;
	}
	
	public void setCountry(IdValueBean country)
	{
		this.country = country;
	}

	
	/**
	 * Method 'User'
	 * 
	 */
	public User()
	{
	}
	
	/**
	 * Method 'getUsrId'
	 * 
	 * @return Integer
	 */
	public Integer getUsrId()
	{
		return usrId;
	}
	
	/**
	 * Method 'setUsrId'
	 * 
	 * @param usrId
	 */
	public void setUsrId(Integer usrId)
	{
		this.usrId = usrId;
	}
	
	/**
	 * Method 'getUserName'
	 * 
	 * @return String
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Method 'setUserName'
	 * 
	 * @param userName
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}
	
	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	/**
	 * Method 'getName'
	 * 
	 * @return String
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Method 'getPhoneNo'
	 * 
	 * @return String
	 */
	public String getPhoneNo()
	{
		return phoneNo;
	}
	
	/**
	 * Method 'setPhoneNo'
	 * 
	 * @param phoneNo
	 */
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	
	/**
	 * Method 'getMobileNo'
	 * 
	 * @return String
	 */
	public String getMobileNo()
	{
		return mobileNo;
	}
	
	/**
	 * Method 'setMobileNo'
	 * 
	 * @param mobileNo
	 */
	public void setMobileNo(String mobileNo)
	{
		this.mobileNo = mobileNo;
	}
	
	/**
	 * Method 'getActive'
	 * 
	 * @return Integer
	 */
	public Integer getActive()
	{
		return active;
	}
	
	/**
	 * Method 'setActive'
	 * 
	 * @param active
	 */
	public void setActive(Integer active)
	{
		this.active = active;
	}
	
	/**
	 * Method 'getKeyContact'
	 * 
	 * @return Integer
	 */
	public Integer getKeyContact()
	{
		return keyContact;
	}
	
	/**
	 * Method 'setKeyContact'
	 * 
	 * @param keyContact
	 */
	public void setKeyContact(Integer keyContact)
	{
		this.keyContact = keyContact;
	}
	
	/**
	 * Method 'getCreatedBy'
	 * 
	 * @return String
	 */
	public String getCreatedBy()
	{
		return createdBy;
	}
	
	/**
	 * Method 'setCreatedBy'
	 * 
	 * @param createdBy
	 */
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
	
	/**
	 * Method 'getCreatedDate'
	 * 
	 * @return Date
	 */
	public Date getCreatedDate()
	{
		return createdDate;
	}
	
	/**
	 * Method 'setCreatedDate'
	 * 
	 * @param createdDate
	 */
	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}
	
	/**
	 * Method 'getUpdatedBy'
	 * 
	 * @return String
	 */
	public String getUpdatedBy()
	{
		return updatedBy;
	}
	
	/**
	 * Method 'setUpdatedBy'
	 * 
	 * @param updatedBy
	 */
	public void setUpdatedBy(String updatedBy)
	{
		this.updatedBy = updatedBy;
	}
	
	/**
	 * Method 'getUpdatedDate'
	 * 
	 * @return Date
	 */
	public Date getUpdatedDate()
	{
		return updatedDate;
	}
	
	/**
	 * Method 'setUpdatedDate'
	 * 
	 * @param updatedDate
	 */
	public void setUpdatedDate(Date updatedDate)
	{
		this.updatedDate = updatedDate;
	}
	
	/**
	 * Method 'getRole'
	 * 
	 * @return Role
	 */
	public Integer getRoleId()
	{
		return roleId;
	}
	
	/**
	 * Method 'setRole'
	 * 
	 * @param role
	 */
	public void setRoleId(Integer roleId)
	{
		this.roleId = roleId;
	}
}
