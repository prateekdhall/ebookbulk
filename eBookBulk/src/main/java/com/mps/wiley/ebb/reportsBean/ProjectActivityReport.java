package main.java.com.mps.wiley.ebb.reportsBean;

import main.java.com.mps.common.dto.IdValueBean;

/**
 * 
 * @author : Krishna Gaur
 * @category : Reports
 * 
 */

public class ProjectActivityReport
{
	private Integer projectId;
	
	private String projectName;
	
	private IdValueBean projectType = new IdValueBean();

	private IdValueBean ecomp = new IdValueBean();
	
	private String url;
	
	private String date;
	
	private String registrations;
	
	private String promocodes;
	
	private String success;
	
	private String failure;
	
	private String abort;

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

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getRegistrations()
	{
		return registrations;
	}

	public void setRegistrations(String registrations)
	{
		this.registrations = registrations;
	}

	public String getPromocodes()
	{
		return promocodes;
	}

	public void setPromocodes(String promocodes)
	{
		this.promocodes = promocodes;
	}

	public String getSuccess()
	{
		return success;
	}

	public void setSuccess(String success)
	{
		this.success = success;
	}

	public String getFailure()
	{
		return failure;
	}

	public void setFailure(String failure)
	{
		this.failure = failure;
	}

	public String getAbort()
	{
		return abort;
	}

	public void setAbort(String abort)
	{
		this.abort = abort;
	}
	
}
