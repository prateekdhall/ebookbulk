package main.java.com.mps.wiley.ebb.reportsBean;

import main.java.com.mps.common.dto.IdValueBean;


public class ProjectHistoryReport
{
	private Integer serialNo;
	
	private Integer projectId;
	
	private String projectName;
	
	private IdValueBean projectType = new IdValueBean();
	
	private IdValueBean ecomp = new IdValueBean();

	private String available;
	
	private String expiration;
	
	private String soldQuantity;
	
	private String backupQuantity;
	
	private String status;
	
	private String createdDate;
	
	private String createdBy;
	
	public Integer getSerialNo()
	{
		return serialNo;
	}
	
	public void setSerialNo(Integer serialNo)
	{
		this.serialNo = serialNo;
	}
	
	
	public String getAvailable()
	{
		return available;
	}
	
	public void setAvailable(String available)
	{
		this.available = available;
	}
	
	public String getExpiration()
	{
		return expiration;
	}
	
	public void setExpiration(String expiration)
	{
		this.expiration = expiration;
	}
	
	public String getSoldQuantity()
	{
		return soldQuantity;
	}
	
	public void setSoldQuantity(String soldQuantity)
	{
		this.soldQuantity = soldQuantity;
	}
	
	public String getBackupQuantity()
	{
		return backupQuantity;
	}
	
	public void setBackupQuantity(String backupQuantity)
	{
		this.backupQuantity = backupQuantity;
	}
	
	public IdValueBean getProjectType()
	{
		return projectType;
	}

	public void setProjectType(IdValueBean projectType)
	{
		this.projectType = projectType;
	}

	public IdValueBean getEcomp()
	{
		return ecomp;
	}

	public void setEcomp(IdValueBean ecomp)
	{
		this.ecomp = ecomp;
	}

	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
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
	
	public String getCreatedDate()
	{
		return createdDate;
	}
	
	public void setCreatedDate(String createdDate)
	{
		this.createdDate = createdDate;
	}
	
	public String getCreatedBy()
	{
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
}
