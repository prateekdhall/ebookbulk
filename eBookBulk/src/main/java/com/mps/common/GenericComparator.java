package main.java.com.mps.common;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;


public class GenericComparator implements Comparator<Object>
{
	private String methodName = null;
	private boolean descending;
	private String sord;
	
	public GenericComparator(String methodName, String sord)
	{
		super();
		this.methodName = methodName;
		
		if ("desc".equals(sord))
		{
			descending = true;
		}
		else
		{
			descending = false;
		}
		
	}
	
	public int compare(Object o1, Object o2)
	{
		
		try
		{
			if (methodName == null || methodName.equals(""))
			{
				return 0;
			}
			
			if (o1 == null && o2 == null)
			{
				return 0;
			}
			else if (o1 == null)
			{
				return descending ? 1 : -1;
			}
			else if (o2 == null)
			{
				return descending ? -1 : 1;
			}
			
			Object value1 = getValue(o1);
			Object value2 = getValue(o2);
			
			if (value1 == null && value2 == null)
			{
				return 0;
			}
			else if (value1 == null)
			{
				return descending ? 1 : -1;
			}
			else if (value2 == null)
			{
				return descending ? -1 : 1;
			}
			
			return descending ? -1 * this.compareField(value1, value2) : this.compareField(value1, value2);
			
		}
		catch (Exception nsfe)
		{
			nsfe.printStackTrace();
			return 0;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private int compareField(Object value1, Object value2) throws IllegalAccessException
	{
		if ((value1 instanceof Comparable) && (value1 instanceof String))
		{
			return ((Comparable<String>)value1.toString().toLowerCase()).compareTo(value2.toString().toLowerCase());
		}
		else if (value1 instanceof Comparable)
		{
			return ((Comparable<Object>)value1).compareTo(value2);
		}
		else
		{
			return value1.toString().compareTo(value2.toString()); // try String
			// sort.
		}
		
	}
	
	@SuppressWarnings("unused")
	private Method getAccessibleMethod(Object object)
	{
		Method[] methods = object.getClass().getMethods();
		for (int i = 0; i < methods.length; i++)
		{
			if (this.methodName.equals(methods[i].getName()))
			{
				return methods[i];
			}
		}
		return null;
	}
	
	private Object getValue(Object object) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		Class<? extends Object> d = object.getClass();
		Object e = object;
		
		
		String[] fieldnames = this.methodName.split("\\.");
		for (int i = 0; i < fieldnames.length; i++)
		{
			String name = fieldnames[i];
			StringBuilder newName = new StringBuilder(name.length());
			for (int k = 0; k < name.length(); k++)
			{
				if (k == 0)
				{
					newName.append(Character.toUpperCase(name.charAt(k)));
				}
				else
				{
					newName.append(name.charAt(k));
				}
			}
			Method[] methods = d.getMethods();
			Method tobeinvoked = null;
			for (int j = 0; j < methods.length; j++)
			{
				if (("get" + newName.toString()).equals(methods[j].getName()))
				{
					tobeinvoked = methods[j];
					break;
				}
			}
			
			if (tobeinvoked == null)
			{
				return null;
			}
			
			e = tobeinvoked.invoke(e, new Object[0]);
			
			if (e == null)
			{
				return null;
			}
			d = e.getClass();
			
		}
		return e;
	}
	
	public String getSord()
	{
		return sord;
	}
	
	public void setSord(String sord)
	{
		this.sord = sord;
	}
}