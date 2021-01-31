package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.sql.Blob;

import com.kite.orm.annotation.Column;
import com.kite.orm.annotation.PrimaryKey;
import com.kite.orm.annotation.Table;

@Table(name="REGISTRATION_DETAILS")
@PrimaryKey(key="recordId")
public class RegistrationDetails implements Serializable
{
	private static final long serialVersionUID = 7679348464590675236L;
	
	@Column(name="RECORD_ID")
	private Integer recordId;
	
	@Column(name="PROJECT_ID")
	private Integer projectId;
	
	@Column(name="PRJ_MOMENTUM_ID")
	private Integer momentumId;
	
	@Column(name="IP_ADDRESS")
	private String ipAddress;
	
	@Column(name="URL_USED")
	private String usedUrl;
	
	@Column(name="REGISTRATION_OBJECT")
	private Blob registrationObject;
	
	/**
	 * @return the recordId
	 */
	public final Integer getRecordId()
	{
		return recordId;
	}
	
	/**
	 * @param recordId the recordId to set
	 */
	public final void setRecordId(Integer recordId)
	{
		this.recordId = recordId;
	}
	
	/**
	 * @return the projectId
	 */
	public final Integer getProjectId()
	{
		return projectId;
	}
	
	/**
	 * @param projectId the projectId to set
	 */
	public final void setProjectId(Integer projectId)
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
	
	/**
	 * @return the ipAddress
	 */
	public final String getIpAddress()
	{
		return ipAddress;
	}
	
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public final void setIpAddress(String ipAddress)
	{
		this.ipAddress = ipAddress;
	}
	
	/**
	 * @return the usedUrl
	 */
	public final String getUsedUrl()
	{
		return usedUrl;
	}
	
	/**
	 * @param usedUrl the usedUrl to set
	 */
	public final void setUsedUrl(String usedUrl)
	{
		this.usedUrl = usedUrl;
	}
	
	/**
	 * @return the registrationObject
	 */
	public final Blob getRegistrationObject()
	{
		return registrationObject;
	}
	
	/**
	 * @param registrationObject the registrationObject to set
	 */
	public final void setRegistrationObject(Blob registrationObject)
	{
		this.registrationObject = registrationObject;
	}
}
