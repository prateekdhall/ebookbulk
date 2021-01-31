package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;


public class MenuItem implements Serializable
{
	private static final long serialVersionUID = 1646703799726355141L;
	
	private Integer menuId;
	
	private Integer menuType;
	
	private String menuName;
	
	private String menuUrl;
	
	private String menuImg;
	
	private Integer menuOrder;
	
	private Integer menuShow;
	
	/**
	 * Method 'MenuItem'
	 * 
	 */
	public MenuItem()
	{
	}
	
	/**
	 * Method 'getMenuId'
	 * 
	 * @return Integer
	 */
	public Integer getMenuId()
	{
		return menuId;
	}
	
	/**
	 * Method 'setMenuId'
	 * 
	 * @param menuId
	 */
	public void setMenuId(Integer menuId)
	{
		this.menuId = menuId;
	}
	
	/**
	 * Method 'getMenuName'
	 * 
	 * @return String
	 */
	public String getMenuName()
	{
		return menuName;
	}
	
	/**
	 * Method 'setMenuName'
	 * 
	 * @param menuName
	 */
	public void setMenuName(String menuName)
	{
		this.menuName = menuName;
	}
	
	/**
	 * @return the menuUrl
	 */
	public final String getMenuUrl()
	{
		return menuUrl;
	}
	
	/**
	 * @param menuUrl
	 *           the menuUrl to set
	 */
	public final void setMenuUrl(String menuUrl)
	{
		this.menuUrl = menuUrl;
	}
	
	/**
	 * @return the menuImg
	 */
	public final String getMenuImg()
	{
		return menuImg;
	}
	
	/**
	 * @param menuImg
	 *           the menuImg to set
	 */
	public final void setMenuImg(String menuImg)
	{
		this.menuImg = menuImg;
	}
	
	/**
	 * @return the menuType
	 */
	public final Integer getMenuType()
	{
		return menuType;
	}
	
	/**
	 * @param menuType
	 *           the menuType to set
	 */
	public final void setMenuType(Integer menuType)
	{
		this.menuType = menuType;
	}
	
	/**
	 * @return the menuOrder
	 */
	public final Integer getMenuOrder()
	{
		return menuOrder;
	}
	
	/**
	 * @param menuOrder
	 *           the menuOrder to set
	 */
	public final void setMenuOrder(Integer menuOrder)
	{
		this.menuOrder = menuOrder;
	}
	
	/**
	 * @return the menuShow
	 */
	public final Integer getMenuShow()
	{
		return menuShow;
	}
	
	/**
	 * @param menuShow
	 *           the menuShow to set
	 */
	public final void setMenuShow(Integer menuShow)
	{
		this.menuShow = menuShow;
	}
}
