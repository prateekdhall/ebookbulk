package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.util.Date;


public class CodeConfig implements Serializable, Comparable<CodeConfig>
{
	private static final long serialVersionUID = -6654863573307376790L;
	
	private Integer cfId;
	
	private String codeStyle;
	
	private String codeType;
	
	private String codeSize;
	
	private String codePrefix;
	
	private Integer projectId;
	
	private Integer momentumId;
	
	private Integer codeQuantity;
	
	private String createdBy;
	
	private Date createdDate = new Date();
	
	private String updatedBy;
	
	private Date updatedDate = new Date();
	
	public CodeConfig()
	{
	}
	
	public Integer getCfId()
	{
		return cfId;
	}
	
	public void setCfId(Integer cfId)
	{
		this.cfId = cfId;
	}
	
	public String getCodeStyle()
	{
		return codeStyle;
	}
	
	public void setCodeStyle(String codeStyle)
	{
		this.codeStyle = codeStyle;
	}
	
	public String getCodeType()
	{
		return codeType;
	}
	
	public void setCodeType(String codeType)
	{
		this.codeType = codeType;
	}
	
	public String getCodeSize()
	{
		return codeSize;
	}
	
	public void setCodeSize(String codeSize)
	{
		this.codeSize = codeSize;
	}
	
	public String getCodePrefix()
	{
		return codePrefix;
	}
	
	public void setCodePrefix(String codePrefix)
	{
		this.codePrefix = codePrefix;
	}
	
	public Integer getProjectId()
	{
		return projectId;
	}
	
	public void setProjectId(Integer projectId)
	{
		this.projectId = projectId;
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
	
	public Integer getCodeQuantity()
	{
		return codeQuantity;
	}
	
	public void setCodeQuantity(Integer codeQuantity)
	{
		this.codeQuantity = codeQuantity;
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
	
	public int compareTo(CodeConfig codeConfig)
	{
		return 0;
	}
}
