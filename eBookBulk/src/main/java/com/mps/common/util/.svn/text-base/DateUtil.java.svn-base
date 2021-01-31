package main.java.com.mps.common.util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.com.mps.wiley.common.AppConstants;


public class DateUtil
{
	
	DateUtil()
	{
		
	}
	
	public static String getDateStringFormat(Date date)
	{
		try
		{
			if (date == null)
			{
				return "";
			}
			SimpleDateFormat dateFormatObj = new SimpleDateFormat();
			
			dateFormatObj.applyPattern(AppConstants.DATE_FORMAT);
			return dateFormatObj.format(date);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}
	
	public static String getDateStringFormatFromString(String dateString)
	{
		try
		{
			if (StringUtil.isValidStr(dateString))
			{
				dateString = (String)dateString.subSequence(0, dateString.length() - 2);
			}
			
			SimpleDateFormat formatter;
			Date date;
			String dateStringR;
			formatter = new SimpleDateFormat(AppConstants.DATE_FORMAT);
			
			if (!StringUtil.isValidStr(dateString))
			{
				return "";
			}
			
			formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			date = formatter.parse(dateString);
			formatter = new SimpleDateFormat(AppConstants.DATE_FORMAT);
			dateStringR = formatter.format(date);
			
			return dateStringR;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}
	
	
	public static String getDateNoTimeStringFormatFromString(String dateString)
	{
		try
		{
			if (StringUtil.isValidStr(dateString))
			{
				dateString = (String)dateString.subSequence(0, dateString.length() - 2);
			}
			
			SimpleDateFormat formatter;
			Date date;
			String dateStringR;
			formatter = new SimpleDateFormat(AppConstants.DATE_FORMAT_NO_TIME);
			
			if (!StringUtil.isValidStr(dateString))
			{
				return "";
			}
			
			formatter = new SimpleDateFormat("yyyy-MM-dd");
			date = formatter.parse(dateString);
			formatter = new SimpleDateFormat(AppConstants.DATE_FORMAT_NO_TIME);
			dateStringR = formatter.format(date);
			
			return dateStringR;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}
	
	
	
	public static Date getDateFormat(String dateString)
	{
		try
		{
			DateFormat formatter;
			Date date;
			formatter = new SimpleDateFormat(AppConstants.DATE_FORMAT);
			
			dateString.replace("-", "/");
			
			if (dateString == null || dateString.equals("null") || dateString.equals(null))
			{
				return new Date();
			}
			
			date = (Date)formatter.parse(dateString);
			return date;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Date();
		}
	}
	
	public static Date getDateFormatFromNoTime(String dateString)
	{
		try
		{
			DateFormat formatter;
			Date date;
			formatter = new SimpleDateFormat(AppConstants.DATE_FORMAT_NO_TIME);
			
			dateString.replace("-", "/");
			
			if (dateString == null || dateString.equals("null") || dateString.equals(null))
			{
				return new Date();
			}
			
			date = (Date)formatter.parse(dateString);
			return date;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Date();
		}
	}
	
	
}
