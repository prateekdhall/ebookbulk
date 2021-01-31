package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.util.Date;

import main.java.com.mps.common.dto.IdValueBean;


public class Customer implements Serializable
{
	private static final long serialVersionUID = 1871403856996961361L;
	
	private Integer customerId;
	
	private String companyName;
	
	private String phoneNo;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String zipCode;
	
	private String createdBy;
	
	private Date createdDate = new Date();
	
	private String updatedBy;
	
	private Date updatedDate = new Date();
	
	private IdValueBean country = new IdValueBean();
	
	public IdValueBean getCountry()
	{
		return country;
	}
	
	public void setCountry(IdValueBean countryId)
	{
		this.country = countryId;
	}
	
	/**
	 * Method 'Customer'
	 * 
	 */
	public Customer()
	{
	}
	
	/**
	 * Method 'getCustomerId'
	 * 
	 * @return Integer
	 */
	public Integer getCustomerId()
	{
		return customerId;
	}
	
	/**
	 * Method 'setCustomerId'
	 * 
	 * @param CustomerId
	 */
	public void setCustomerId(Integer customerId)
	{
		this.customerId = customerId;
	}
	
	/**
	 * Method 'getCompanyName'
	 * 
	 * @return String
	 */
	public String getCompanyName()
	{
		return companyName;
	}
	
	/**
	 * Method 'setCompanyName'
	 * 
	 * @param companyName
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
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
	 * Method 'getFirstAddress'
	 * 
	 * @return String
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * Method 'setFirstAddress'
	 * 
	 * @param firstAddress
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	/**
	 * Method 'getCity'
	 * 
	 * @return String
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * Method 'setCity'
	 * 
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	/**
	 * Method 'getState'
	 * 
	 * @return String
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * Method 'setState'
	 * 
	 * @param state
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * Method 'getZipCode'
	 * 
	 * @return String
	 */
	public String getZipCode()
	{
		return zipCode;
	}
	
	/**
	 * Method 'setZipCode'
	 * 
	 * @param zipCode
	 */
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
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
	
}
