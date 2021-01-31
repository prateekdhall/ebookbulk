package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.Role;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("RoleDao")
@Transactional
public class RoleDaoImpl extends AbstractBaseDao<Role> implements RoleDao
{
	public RoleDaoImpl()
	{
		super();
	}
	
	@Override
	public String getTableName()
	{
		return "ROLE";
	}
	
	@Override
	public String getFields()
	{
		return "ROLE_ID, ROLE_NAME, ROLE_RIGHTS";
	}
	
	@Override
	@Transactional
	public List<Role> findAllRoles() throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM ROLE WHERE ROLE_ID != ?";
		return simpleJdbcTemplate.query(strQuery, this, 4);
	}
	
	public Role mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Role role = new Role();
		role.setRoleId(rs.getInt("ROLE_ID"));
		role.setRoleName(rs.getString("ROLE_NAME"));
		role.setRoleRights(rs.getString("ROLE_RIGHTS"));
		return role;
	}
}
