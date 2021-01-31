package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.util.Date;


public class ProjectHistory implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4263981083029350511L;
	
	/**
	 * This attribute maps to the column HST_ID in the PROJECT_HISTORY table.
	 */
	private Integer hstId;
	
	/**
	 * This attribute maps to the column PROJECT_ID in the PROJECT_HISTORY table.
	 */
	private Integer projectId;
	
	/**
	 * This attribute maps to the column FIELD_NAME in the PROJECT_HISTORY table.
	 */
	private String fieldName;
	
	/**
	 * This attribute maps to the column PREV_VALUE in the PROJECT_HISTORY table.
	 */
	private String prevValue;
	
	/**
	 * This attribute maps to the column CURR_VALUE in the PROJECT_HISTORY table.
	 */
	private String currValue;
	
	/**
	 * This attribute maps to the column NOTIFICATION in the PROJECT_HISTORY table.
	 */
	private Integer notification = new Integer(1);
	
	/**
	 * This attribute maps to the column UPDATED_BY in the PROJECT_HISTORY table.
	 */
	private Integer createdBy;
	
	/**
	 * This attribute maps to the column UPDATED_DATE in the PROJECT_HISTORY table.
	 */
	private Date createdDate = new Date();
	
	/**
	 * Method 'ProjectHistory'
	 * 
	 */
	public ProjectHistory()
	{
	}
	
	/**
	 * Method 'getHstId'
	 * 
	 * @return Integer
	 */
	public Integer getHstId()
	{
		return hstId;
	}
	
	/**
	 * Method 'setHstId'
	 * 
	 * @param hstId
	 */
	public void setHstId(Integer hstId)
	{
		this.hstId = hstId;
	}
	
	/**
	 * Method 'getProjectId'
	 * 
	 * @return Integer
	 */
	public Integer getProjectId()
	{
		return projectId;
	}
	
	/**
	 * Method 'setProjectId'
	 * 
	 * @param projectId
	 */
	public void setProjectId(Integer projectId)
	{
		this.projectId = projectId;
	}
	
	/**
	 * Method 'getFieldName'
	 * 
	 * @return String
	 */
	public String getFieldName()
	{
		return fieldName;
	}
	
	/**
	 * Method 'setFieldName'
	 * 
	 * @param fieldName
	 */
	public void setFieldName(String fieldName)
	{
		this.fieldName = fieldName;
	}
	
	/**
	 * Method 'getPrevValue'
	 * 
	 * @return String
	 */
	public String getPrevValue()
	{
		return prevValue;
	}
	
	/**
	 * Method 'setPrevValue'
	 * 
	 * @param prevValue
	 */
	public void setPrevValue(String prevValue)
	{
		this.prevValue = prevValue;
	}
	
	/**
	 * Method 'getCurrValue'
	 * 
	 * @return String
	 */
	public String getCurrValue()
	{
		return currValue;
	}
	
	/**
	 * Method 'setCurrValue'
	 * 
	 * @param currValue
	 */
	public void setCurrValue(String currValue)
	{
		this.currValue = currValue;
	}
	
	/**
	 * Method 'getNotification'
	 * 
	 * @return Integer
	 */
	public Integer getNotification()
	{
		return notification;
	}
	
	/**
	 * Method 'setNotification'
	 * 
	 * @param notification
	 */
	public void setNotification(Integer notification)
	{
		this.notification = notification;
	}
	
	/**
	 * Method 'getCreatedBy'
	 * 
	 * @return Integer
	 */
	public Integer getCreatedBy()
	{
		return createdBy;
	}
	
	/**
	 * Method 'setCreatedBy'
	 * 
	 * @param createdBy
	 */
	public void setCreatedBy(Integer createdBy)
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
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append("hstId=" + hstId);
		ret.append(", projectId=" + projectId);
		ret.append(", fieldName=" + fieldName);
		ret.append(", prevValue=" + prevValue);
		ret.append(", currValue=" + currValue);
		ret.append(", notification=" + notification);
		ret.append(", createdBy=" + createdBy);
		ret.append(", createdDate=" + createdDate);
		return ret.toString();
	}
}
