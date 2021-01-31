package main.java.com.mps.common.util;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.domain.Country;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.Role;


public final class AppUtil
{
	private AppUtil()
	{
	}
	
	public static Map<Integer, Role> getMapObject(List<Role> objList)
	{
		Map<Integer, Role> objMap = new HashMap<Integer, Role>();
		for (Role role : objList)
		{
			objMap.put(role.getRoleId(), role);
		}
		return objMap;
	}
	
	public static Map<Integer, Country> getMapObjectOfCountry(List<Country> objList)
	{
		Map<Integer, Country> objMap = new HashMap<Integer, Country>();
		for (Country country : objList)
		{
			objMap.put(country.getCountryId(), country);
		}
		return objMap;
	}
	
	public static Map<Integer, DynamicField> getMapObjectOfDynamicFields(List<DynamicField> objList)
	{
		Map<Integer, DynamicField> objMap = new HashMap<Integer, DynamicField>();
		for (DynamicField df : objList)
		{
			objMap.put(df.getFieldId(), df);
		}
		return objMap;
	}
	
	public static <T> Map<Integer, T> getMapOfEntity(List<T> objList)
	{
		Map<Integer, T> objMap = new HashMap<Integer, T>();
		for (T role : objList)
		{
			objMap.put(role.hashCode(), role);
		}
		return objMap;
	}
	
	public final static int arraySize(final Object[] objParam)
	{
		return (objParam != null) ? objParam.length : 0;
	}
	
	public final static int listSize(final List<?> objParam)
	{
		return (objParam != null) ? objParam.size() : 0;
	}
	
	public final static int mapSize(final Map<?, ?> objParam)
	{
		return (objParam != null) ? objParam.size() : 0;
	}
	
	public static final String[] castToStringArray(final List<String> objParam)
	{
		return (String[])objParam.toArray(new String[objParam.size()]);
	}
	
	public static final String castToString(final List<String> objParam)
	{
		return AppUtil.convertArrayToQueryIn((String[])objParam.toArray(new String[objParam.size()]));
	}
	
	public static final String convertArrayToQueryIn(final int[] objParam)
	{
		return AppUtil.convertArrayToQueryIn(objParam, ",");
	}
	
	public static final String convertArrayToQueryIn(final int[] objParam, final String strParam)
	{
		StringBuffer strBuf = new StringBuffer();
		
		final int iSize = objParam.length;
		
		for (int iCount = 0; iCount < iSize; iCount++)
		{
			if (iCount != 0)
			{
				strBuf.append(strParam);
			}
			
			strBuf.append(objParam[iCount]);
		}
		
		return strBuf.toString();
	}
	
	public static final String convertArrayToQueryIn(final String[] objParam)
	{
		return AppUtil.convertArrayToQueryIn(objParam, ",");
	}
	
	public static final String convertArrayToQueryIn(final String[] objParam, final String strParam)
	{
		StringBuffer strBuf = new StringBuffer();
		
		final int iSize = AppUtil.arraySize(objParam);
		
		for (int iCount = 0; iCount < iSize; iCount++)
		{
			if (iCount != 0)
			{
				strBuf.append(strParam);
			}
			
			strBuf.append(objParam[iCount]);
		}
		
		return strBuf.toString();
	}
	
	public static final String convertArrayToQueryInString(final String[] objParam)
	{
		StringBuffer strBuf = new StringBuffer();
		final int iSize = AppUtil.arraySize(objParam);
		
		for (int iCount = 0; iCount < iSize; iCount++)
		{
			
			if (iCount != 0)
			{
				strBuf.append(",");
			}
			strBuf.append("'" + objParam[iCount] + "'");
		}
		
		return strBuf.toString();
	}
}
