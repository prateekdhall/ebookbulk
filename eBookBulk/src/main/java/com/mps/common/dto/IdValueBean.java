package main.java.com.mps.common.dto;


import java.io.Serializable;


public class IdValueBean implements Serializable
{
	private static final long serialVersionUID = 8478215009206678965L;
	
	private Integer id;
	
	private String value;
	
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
	 * @return the value
	 */
	public final String getValue()
	{
		return value;
	}
	
	/**
	 * @param value the value to set
	 */
	public final void setValue(String value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		return "id=" + id + ", value=" + value;
	}
}
