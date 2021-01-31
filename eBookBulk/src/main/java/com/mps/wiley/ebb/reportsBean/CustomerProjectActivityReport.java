package main.java.com.mps.wiley.ebb.reportsBean;

import java.io.Serializable;

public class CustomerProjectActivityReport implements Serializable
{ 
	private static final long serialVersionUID = 1L;
	private Integer projectId;
 	private String projectName;
	private String url;
	private String dates;
	private String names;	
	private String company;
	private String email;
	private String phone;
	private String mobile;
	private String country;
	private String promoCodes;	
	private String download;
	public Integer getProjectId()
	{
		return projectId;
	}
	public void setProjectId(Integer projectId)
	{
		this.projectId = projectId;
	}
	public String getProjectName()
	{
		return projectName;
	}
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	public String getDates()
	{
		return dates;
	}
	public void setDates(String dates)
	{
		this.dates = dates;
	}
	public String getNames()
	{
		return names;
	}
	public void setNames(String names)
	{
		this.names = names;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getPromoCodes()
	{
		return promoCodes;
	}
	public void setPromoCodes(String promoCodes)
	{
		this.promoCodes = promoCodes;
	}
	public String getDownload()
	{
		return download;
	}
	public void setDownload(String download)
	{
		this.download = download;
	}
	
	 
  
}
