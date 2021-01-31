package main.java.com.mps.wiley.ebb.service;


/**
 * Classname		      	: PasswordGeneratorService
 * Description			: This class contains specific methods for generating password functionality. 
 */
public class PasswordGeneratorService
{
	public final static String IS_NUMERIC = "isNumeric";
	
	public final static String IS_ALPHANUM = "isAplhanum";
	
	private final String capAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private final String num = "0123456789";
	
	private boolean allowDups = false;
	
	private boolean isAlphanum = false;
	
	private int passwordLength = 0;
	
	private final String ERROR_MSG = "something went wrong; check options and try again.";
	
	/**
	 * Default Constructor
	 *
	 */
	public PasswordGeneratorService()
	{
	}
	
	/**
	 * Constructor with password lenth and boolean value to allow duplicate passwords.
	 * 
	 * @param int passwordLength
	 * @param boolean allowDups
	 */
	public PasswordGeneratorService(int passwordLength, boolean allowDups)
	{
		this.passwordLength = passwordLength;
		this.allowDups = allowDups;
		this.isAlphanum = true;
		getMaxLength();
	}
	
	/**
	 *  Method Name	: getMaxLength
	 *  Description	: calculate the max length that a password can be.
	 *  Creation Date   : Jul 17, 2008
	 *  @author	     	: s.prathipati
	 *  @return int
	 */
	public int getMaxLength()
	{
		int maxLength = 0;
		
		if (isAlphanum)
		{
			maxLength = 36;
		}
		
		if (allowDups)
		{
			maxLength = passwordLength + 1;
		}
		return maxLength;
	}
	
	/**
	 *  Method Name	: getNewPassword
	 *  Description	: randomly builds a new password string for the user.
	 *  Creation Date   : Jul 17, 2008
	 *  @author	     	: s.prathipati
	 *  @return String
	 */
	public String getNewPassword()
	{
		String returnVal = "";
		try
		{
			StringBuffer values = buildList();
			for (int inx = 0; inx < passwordLength; inx++)
			{
				int selChar = (int)(Math.random() * (values.length() - 1));
				returnVal += values.charAt(selChar);
				if (!allowDups)
				{
					values.deleteCharAt(selChar);
				}
			}
		}
		catch (Exception e)
		{
			returnVal = ERROR_MSG;
		}
		return returnVal;
	}
	
	/**
	 *  Method Name	: buildList
	 *  Description	: Randomly builds the StringBuffer to build the password from.
	 *  Creation Date   : Jul 17, 2008
	 *  @author	     	: s.prathipati
	 *  @return StringBuffer
	 */
	private StringBuffer buildList()
	{
		StringBuffer list = new StringBuffer(0);
		if (isAlphanum)
		{
			list.append(num);
			list.append(capAlpha);
		}
		
		int currLen = list.length();
		String returnVal = "";
		for (int inx = 0; inx < currLen; inx++)
		{
			int selChar = (int)(Math.random() * (list.length() - 1));
			returnVal += list.charAt(selChar);
			list.deleteCharAt(selChar);
		}
		list = new StringBuffer(returnVal);
		return list;
	}
}