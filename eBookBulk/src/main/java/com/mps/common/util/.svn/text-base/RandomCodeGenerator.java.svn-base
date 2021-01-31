package main.java.com.mps.common.util;


import java.util.Random;


public class RandomCodeGenerator
{
	public String randomGenerator(int range)
	{
		String randomString = "";
		if (range <= 0)
		{
			return randomString;
		}
		StringBuffer sb = new StringBuffer();
		String block = "abcdefghijklmnopqrstuvwxyz1234567890";
		sb.append(block).append(block.toUpperCase());
		block = sb.toString();
		sb = new StringBuffer();
		Random random = new Random();
		try
		{
			
			for (int i = 0; i < range; i++)
			{
				sb.append(Character.toString(block.charAt(random.nextInt(34))));
			}
			randomString = sb.toString();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return randomString;
	}
	public String codeGenerator(int range,int count)
	{
		StringBuilder randomString = new StringBuilder();
		for(int i =0;i<count;i++)
		{
			if(i==0)
			{
				randomString.append(randomGenerator(range));
			}
			else
			{
				randomString.append(","+randomGenerator(range));
			}
		}
		return  randomString.toString();
	}
	
}
