package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.util.Date;


public class KeyContact implements Serializable
{
	private static final long serialVersionUID = -1994454818568186628L;
	
	private Integer kcId;
	
	private String email;

	private String name;
	
	private String phoneNo;
	
	private String mobileNo;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String zipCode;
	
	private Integer active = new Integer(1);
	
	private String createdBy;
	
	private Date createdDate = new Date();
	
	private String updatedBy;
	
	private Date updatedDate = new Date();
	
	private Integer customer = new Integer(0);
	
	private Integer country = new Integer(0);
	
	
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Method 'Customer'
	 * 
	 */
	public KeyContact()
	{
	}
	
	/**
	 * Method 'getUsrId'
	 * 
	 * @return Integer
	 */
	public Integer getKcId()
	{
		return kcId;
	}
	
	/**
	 * Method 'setUsrId'
	 * 
	 * @param usrId
	 */
	public void setKcId(Integer kcId)
	{
		this.kcId = kcId;
	}
	
	/**
	 * Method 'getUserName'
	 * 
	 * @return String
	 */
	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
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
	 * Method 'getAddress'
	 * 
	 * @return String
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * Method 'setAddress'
	 * 
	 * @param address
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
	 * Method 'setState'
	 * 
	 * @param state
	 */
	public void setState(String state)
	{
		this.state = state;
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
	 * Method 'setZipCode'
	 * 
	 * @param zipCode
	 */
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
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
	 * Method 'getCustomer'
	 * 
	 * @return Integer
	 */
	public Integer getCustomer()
	{
		return customer;
	}
	
	/**
	 * Method 'setCustomer'
	 * 
	 * @param customer
	 */
	public void setCustomer(Integer customer)
	{
		this.customer = customer;
	}
	
	/**
	 * Method 'getCustomer'
	 * 
	 * @return Integer
	 */
	public Integer getCountry()
	{
		return country;
	}
	
	/**
	 * Method 'setCountry'
	 * 
	 * @param country
	 */
	public void setCountry(Integer country)
	{
		this.country = country;
	}
	
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append("kcId=" + kcId);
		ret.append(", custId=" + customer);
		ret.append(", email=" + email);
		ret.append(", name=" + name);
		ret.append(", phoneNo=" + phoneNo);
		ret.append(", mobileNo=" + mobileNo);
		ret.append(", address=" + address);
		ret.append(", addCity=" + city);
		ret.append(", addState=" + state);
		ret.append(", addZipcode=" + zipCode);
		ret.append(", countryId=" + country);
		ret.append(", isActive=" + active);
		ret.append(", createdBy=" + createdBy);
		ret.append(", createdDate=" + createdDate);
		ret.append(", updatedBy=" + updatedBy);
		ret.append(", updatedDate=" + updatedDate);
		return ret.toString();
	}
	
}
