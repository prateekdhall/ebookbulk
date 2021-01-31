package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.util.Date;


public class ProjectUrl implements Serializable
{
	
	
	private static final long serialVersionUID = 5904787009010681899L;
	private Integer id;
	private Integer projectId;
	private Integer momentumId;
	private String url;
	private String urlType;
	private Integer codeStatus = new Integer(1);
	private String generatedBy;
	private String urlcount;
	
	/**
	 * @return the id
	 */
	public final Integer getId()
	{
		return id;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id)
	{
		this.id = id;
	}
	
	
	/**
	 * @return the momentumId
	 */
	public final Integer getMomentumId()
	{
		return momentumId;
	}
	
	
	/**
	 * @param momentumId the momentumId to set
	 */
	public final void setMomentumId(Integer momentumId)
	{
		this.momentumId = momentumId;
	}
	
	
	public String getUrlcount()
	{
		return urlcount;
	}
	
	
	public void setUrlcount(String urlcount)
	{
		this.urlcount = urlcount;
	}
	
	
	public String getGeneratedBy()
	{
		return generatedBy;
	}
	
	
	public void setGeneratedBy(String generatedBy)
	{
		this.generatedBy = generatedBy;
	}
	
	
	private Date generatedDate = new Date();
	
	public Integer getProjectId()
	{
		return projectId;
	}
	
	
	public void setProjectId(Integer projectId)
	{
		this.projectId = projectId;
	}
	
	
	public String getUrl()
	{
		return url;
	}
	
	
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	
	public String getUrlType()
	{
		return urlType;
	}
	
	
	public void setUrlType(String urlType)
	{
		this.urlType = urlType;
	}
	
	
	public Integer getCodeStatus()
	{
		return codeStatus;
	}
	
	
	public void setCodeStatus(Integer codeStatus)
	{
		this.codeStatus = codeStatus;
	}
	
	
	public Date getGeneratedDate()
	{
		return generatedDate;
	}
	
	
	public void setGeneratedDate(Date generatedDate)
	{
		this.generatedDate = generatedDate;
	}
	
	
	public ProjectUrl()
	{
	}
	
	
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append("projectId=" + projectId);
		ret.append(", url=" + url);
		ret.append(", urlType=" + urlType);
		ret.append(", codeStatus=" + codeStatus);
		ret.append(", generatedBy=" + generatedBy);
		return ret.toString();
	}
}
