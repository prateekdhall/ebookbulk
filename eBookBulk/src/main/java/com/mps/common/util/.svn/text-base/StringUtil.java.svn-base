package main.java.com.mps.common.util;


public final class StringUtil
{
	private StringUtil()
	{
	}
	
	public static final boolean isValidStr(final String strParam)
	{
		return ((strParam != null) && !strParam.equals("") && !strParam.equals("null"));
	}
	
	public static final String validStr(final String strParam)
	{
		return StringUtil.isValidStr(strParam) ? strParam : "";
	}
	
	public static final String validStr(final StringBuffer strParam)
	{
		return (strParam != null) ? strParam.toString() : "";
	}
}
