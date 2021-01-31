package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.MenuItem;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("MenuItemDao")
@Transactional
public class MenuItemDaoImpl extends AbstractBaseDao<MenuItem> implements MenuItemDao
{
	public MenuItemDaoImpl()
	{
	}
	
	@Override
	public String getTableName()
	{
		return "MENU_ITEM";
	}
	
	@Override
	public String getFields()
	{
		return "MENU_ID, MENU_TYPE, MENU_NAME, MENU_URL, MENU_IMG, MENU_ORDER, MENU_SHOW";
	}
	
	@Override
	@Transactional
	public List<MenuItem> findAllResources(final Integer iRoleId) throws DataAccessException
	{
		final StringBuilder strQuery = new StringBuilder();
		strQuery.append("SELECT " + getFields() + " FROM " + getTableName() + " mi join ROLE_PROFILE rp on (mi.MENU_ID = rp.RES_ID)");
		strQuery.append(" where rp.ROLE_ID = ? and mi.MENU_SHOW = 1 ORDER BY mi.MENU_TYPE, mi.MENU_ORDER");
		return simpleJdbcTemplate.query(strQuery.toString(), this, iRoleId);
	}
	
	public MenuItem mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		MenuItem mi = new MenuItem();
		mi.setMenuId(rs.getInt("MENU_ID"));
		mi.setMenuType(rs.getInt("MENU_TYPE"));
		mi.setMenuName(rs.getString("MENU_NAME"));
		mi.setMenuUrl(rs.getString("MENU_URL"));
		mi.setMenuImg(rs.getString("MENU_IMG"));
		mi.setMenuOrder(rs.getInt("MENU_ORDER"));
		mi.setMenuShow(rs.getInt("MENU_SHOW"));
		return mi;
	}
}
