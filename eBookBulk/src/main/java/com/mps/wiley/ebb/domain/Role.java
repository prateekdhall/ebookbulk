package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;


public class Role implements Serializable
{
	private static final long serialVersionUID = 2628914080034257053L;
	
	private Integer roleId;
	
	private String roleName;
	
	private String roleRights;
	
	/**
	 * Method 'Role'
	 * 
	 */
	public Role()
	{
	}
	
	/**
	 * Method 'getRoleId'
	 * 
	 * @return Integer
	 */
	public Integer getRoleId()
	{
		return roleId;
	}
	
	/**
	 * Method 'setRoleId'
	 * 
	 * @param roleId
	 */
	public void setRoleId(Integer roleId)
	{
		this.roleId = roleId;
	}
	
	/**
	 * Method 'getRoleName'
	 * 
	 * @return String
	 */
	public String getRoleName()
	{
		return roleName;
	}
	
	/**
	 * Method 'setRoleName'
	 * 
	 * @param roleName
	 */
	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}
	
	/**
	 * Method 'getRoleRights'
	 * 
	 * @return Integer
	 */
	public String getRoleRights()
	{
		return roleRights;
	}
	
	/**
	 * Method 'setRoleRights'
	 * 
	 * @param roleRights
	 */
	public void setRoleRights(String roleRights)
	{
		this.roleRights = roleRights;
	}
}
