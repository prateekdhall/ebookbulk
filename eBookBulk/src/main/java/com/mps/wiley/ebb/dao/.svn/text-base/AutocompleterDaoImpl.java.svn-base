package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("AutocompleterDao")

@Transactional
public class AutocompleterDaoImpl extends AbstractBaseDao<String> implements AutocompleterDao
{
	
	private String generateQuery(int moduleId, int componentId, String searchData)
	{
		String query = null;
		
		/*
		 * We assume as:
		 * moduleId = 1 reflect for TABLE 'project'
		 * 
		 * componentId =1 for COLUMN 'PROJECT_NAME'
		 */
		if (moduleId == 1)
		{
			if (componentId == 1)
			{
				query = "Select PROJECT_NAME from project where PROJECT_NAME like ?";
			}
		}
		/*
		 * We assume as:
		 * moduleId = 2 reflect for TABLE 'customer'
		 * 
		 * componentId =1 for COLUMN 'COMPANY_NAME'
		 */
		
		else if (moduleId == 2)
		{
			if (componentId == 1)
			{
				query = "Select COMPANY_NAME from customer where COMPANY_NAME like ?";
			}
		}
		
		/*
		 * We assume as:
		 * moduleId = 3 reflect for TABLE 'user'
		 * 
		 * componentId =1 for COLUMN 'USER_NAME'
		 */
		
		else if (moduleId == 3)
		{
			if (componentId == 1)
			{
				query = "Select USER_NAME from user where USER_NAME like ?";
			}
		}
		return query;
		
	}
	
	@Override
	@Transactional
	public List<String> getContentByAutoSearch(int moduleId, int componentId, String searchData)
	{
		System.out.println(" In  AutocompleterDaoImpl...............");
		
		String strQuery = generateQuery(moduleId, componentId, searchData);
//		System.out.println("generated Query :: " + strQuery);
		 List<String> listData = new ArrayList<String>();
		try
		{
		   listData = getObjectList(strQuery, true,searchData+"%");
//			System.out.println("list Size ::" + listData.size());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listData;
	}

	
	@Override
	public String mapRow(ResultSet rs, int arg1) throws SQLException
	{
	   return rs.getString(1);
	
	}

	@Override
	public String getFields()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTableName()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
