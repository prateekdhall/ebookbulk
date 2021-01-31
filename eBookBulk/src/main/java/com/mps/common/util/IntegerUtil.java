package main.java.com.mps.common.util;

public class IntegerUtil
{
	IntegerUtil()
	{
		
	}
	public static final boolean isValidInt(final Integer intParam)
	{
		return ((intParam != null) && !intParam.equals("null"));
	}
}
