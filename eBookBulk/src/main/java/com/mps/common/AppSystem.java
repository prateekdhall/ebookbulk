package main.java.com.mps.common;


import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.mps.common.mail.MailServer;
import main.java.com.mps.common.util.AppUtil;
import main.java.com.mps.common.util.StringUtil;
import main.java.com.mps.wiley.ebb.dao.CountryDao;
import main.java.com.mps.wiley.ebb.dao.DynamicFieldDao;
import main.java.com.mps.wiley.ebb.dao.RoleDao;
import main.java.com.mps.wiley.ebb.dao.WileyOfficesDao;
import main.java.com.mps.wiley.ebb.domain.Country;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.Role;
import main.java.com.mps.wiley.ebb.domain.WileyOffices;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.web.context.WebApplicationContext;


public final class AppSystem implements Cloneable, Serializable
{
	private static final long serialVersionUID = -3221400117140113273L;
	
	private static AppSystem system = null;
	
	Logger log = Logger.getLogger(this.getClass());
	
	public static Map<String, String> configMap = null;
	public static Map<String, String> mailConfigMap = null;
	
	public static List<Role> ROLES;
	public static Map<Integer, Role> ROLES_MAP;
	
	public static List<Country> COUNTRIES;
	public static Map<Integer, Country> COUNTRIES_MAP;
	public static List<WileyOffices> WILEY_OFFICES;
	public static List<DynamicField> DYNAMIC_FIELDS;
	public static Map<Integer, DynamicField> DYNAMIC_FIELDS_MAP;
	
	public static String STATIC_PATH;
	public static MailServer EMAILSERVER;
	
	RoleDao roleDao;
	
	CountryDao countryDao;
	WileyOfficesDao woDao;
	DynamicFieldDao dfDao;
	
	static
	{
		system = new AppSystem();
	}
	
	private AppSystem()
	{
	}
	
	public Object clone()
	{
		return system;
	}
	
	public static AppSystem getInstance()
	{
		return system;
	}
	
	@SuppressWarnings("unchecked")
	public synchronized void initiateSystem(final ApplicationContext context)
	{
		try
		{
			log.info("===========CONTEXT Set===========");
			configMap = (HashMap<String, String>)context.getBean("appConfig");
			mailConfigMap = (HashMap<String, String>)context.getBean("mailConfig");
			
			EMAILSERVER = new MailServer(context);
			STATIC_PATH = configMap.get("staticFilePath");
			log.debug("=========== STATIC_PATH ===========" + STATIC_PATH);
			
			roleDao = (RoleDao)context.getBean("RoleDao");
			
			ROLES = roleDao.findAllRoles();
			ROLES_MAP = AppUtil.getMapObject(ROLES);
			
			countryDao = (CountryDao)context.getBean("CountryDao");
			woDao = (WileyOfficesDao)context.getBean("WileyOfficesDao");
			dfDao = (DynamicFieldDao)context.getBean("DynamicFieldDao");
			
			COUNTRIES = countryDao.findAllCountries();
			COUNTRIES_MAP = AppUtil.getMapObjectOfCountry(COUNTRIES);
			
			WILEY_OFFICES = woDao.findAllWileyOffices();
			
			DYNAMIC_FIELDS = dfDao.findAllDynamicFields();
			DYNAMIC_FIELDS_MAP = AppUtil.getMapObjectOfDynamicFields(DYNAMIC_FIELDS);
		}
		catch (DataAccessException e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
		}
	}
	
	public synchronized void initiateWebSystem(final WebApplicationContext webContext)
	{
		log.info("=========== Web CONTEXT Set===========");
	}
	
	public static String getConfig(final String configKey)
	{
		return StringUtil.validStr(configMap.get(configKey) + "");
	}
	
	public static String getMailConfig(final String configKey)
	{
		return StringUtil.validStr(mailConfigMap.get(configKey) + "");
	}
	
	public static interface AppKeys
	{
		public static String NAME = "name";
		public static String VERSION = "version";
		public static String ADMIN_USERNAME = "admin.username";
	}
	
	public synchronized void shutDown()
	{
		log.info("################################ SHUT DOWN #########################");
	}
}
