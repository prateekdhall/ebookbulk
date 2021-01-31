package main.java.com.mps.wiley.ebb.service;

import java.util.List;

import main.java.com.mps.wiley.ebb.domain.Role;

public interface RoleService
{
	/**
	 * Load all Roles
	 * 
	 */
	public List<Role> loadAllRoles();
}
