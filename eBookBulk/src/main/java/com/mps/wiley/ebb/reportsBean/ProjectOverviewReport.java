package main.java.com.mps.wiley.ebb.reportsBean;

import main.java.com.mps.common.dto.IdValueBean;

/**
 * 
 * @author : Krishna Gaur
 * @category : Reports
 * 
 */

public class ProjectOverviewReport
{
	
	private Integer projectId;
	
	private String projectName;
	
	private IdValueBean projectType = new IdValueBean();

	private IdValueBean ecomp = new IdValueBean();
	
	private String availableDate;

	private String expiryDate;
	
	private Integer soldQty;

	private Integer backupQty;
	
	private String activationStart;
	
	private String acivationEnd;
	
	private String title;
	
	private Integer downloads;
	
	private Integer registrations;
	private Integer registrationsApplicable;
	
	private Integer promoCodes;
	private Integer promoCodesApplicable;
	
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
	public String getAvailableDate()
	{
		return availableDate;
	}
	public void setAvailableDate(String availableDate)
	{
		this.availableDate = availableDate;
	}
	public String getExpiryDate()
	{
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate)
	{
		this.expiryDate = expiryDate;
	}
	public Integer getSoldQty()
	{
		return soldQty;
	}
	public void setSoldQty(Integer soldQty)
	{
		this.soldQty = soldQty;
	}
	public Integer getBackupQty()
	{
		return backupQty;
	}
	public void setBackupQty(Integer backupQty)
	{
		this.backupQty = backupQty;
	}
	public String getActivationStart()
	{
		return activationStart;
	}
	public void setActivationStart(String activationStart)
	{
		this.activationStart = activationStart;
	}
	public String getAcivationEnd()
	{
		return acivationEnd;
	}
	public void setAcivationEnd(String acivationEnd)
	{
		this.acivationEnd = acivationEnd;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public Integer getDownloads()
	{
		return downloads;
	}
	public void setDownloads(Integer downloads)
	{
		this.downloads = downloads;
	}
	public Integer getRegistrations()
	{
		return registrations;
	}
	public void setRegistrations(Integer registrations)
	{
		this.registrations = registrations;
	}
	public Integer getRegistrationApplicable()
	{
		return registrationsApplicable;
	}
	public void setRegistrationApplicable(Integer registrationApplicable)
	{
		this.registrationsApplicable = registrationApplicable;
	}
	public Integer getPromoCodes()
	{
		return promoCodes;
	}
	public void setPromoCodes(Integer promoCodes)
	{
		this.promoCodes = promoCodes;
	}
	public Integer getPromoCodesApplicable()
	{
		return promoCodesApplicable;
	}
	public void setPromoCodesApplicable(Integer promoCodesApplicable)
	{
		this.promoCodesApplicable = promoCodesApplicable;
	}

}
