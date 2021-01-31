/* Copyright (c) 2007-2008 MPSTech. All Rights Reserved.
 * 
 *  This software is the confidential and proprietary information of MPSTech
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with MPSTech.
 *  
 * MPSTech MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE 
 * SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF 
 * MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. MPSTech SHALL NOT BE 
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF 
 * USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS 
 * DERIVATIVES.
 * 
 */
package main.java.com.mps.wiley.exception;


public class UnableToProcessException extends Exception
{
	private static final long serialVersionUID = 1L;

	private String exceptionMessage;

	/**
	 * default constructor
	 *
	 */
	public UnableToProcessException()
	{
	}

	/**
	 * message constructor
	 * @param exceptionMessage
	 */
	public UnableToProcessException(String exceptionMessage)
	{
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * cause constructor
	 * @param throwable
	 */
	public UnableToProcessException(Throwable throwable)
	{
		super(throwable);
	}

	/**
	 * message and cause constructor
	 * @param exceptionMessage
	 * @param exceptionClass
	 */
	public UnableToProcessException(String exceptionMessage,
			Throwable exceptionClass)
	{
		this.exceptionMessage = exceptionMessage;
		this.initCause(exceptionClass);
	}


	public String toString()
	{
		String s = getClass().getName();

		return s + ": " + exceptionMessage;
	}

	public String getMessage()
	{
		return exceptionMessage;
	}


	public void setCause(Throwable exceptionClass)
	{
		this.initCause(exceptionClass);
	}
}
