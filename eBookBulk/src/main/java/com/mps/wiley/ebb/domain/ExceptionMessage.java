package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;


public class ExceptionMessage implements Serializable
{
	private static final long serialVersionUID = 2241148587552100878L;
	private Integer id;
	private Integer msgId;
	private Integer projectId;
	private Integer momentumId;
	private String exceptionEvent;
	private String exceptionText;
	
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
	
	public Integer getMsgId()
	{
		return msgId;
	}
	
	public void setMsgId(Integer msgId)
	{
		this.msgId = msgId;
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
	
	public String getExceptionEvent()
	{
		return exceptionEvent;
	}
	
	public void setExceptionEvent(String exceptionEvent)
	{
		this.exceptionEvent = exceptionEvent;
	}
	
	public String getExceptionText()
	{
		return exceptionText;
	}
	
	public void setExceptionText(String exceptionText)
	{
		this.exceptionText = exceptionText;
	}
}
