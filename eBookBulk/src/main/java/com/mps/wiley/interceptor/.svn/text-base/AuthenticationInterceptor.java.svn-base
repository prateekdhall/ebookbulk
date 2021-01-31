package main.java.com.mps.wiley.interceptor;


import java.util.Map;

import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.User;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


public class AuthenticationInterceptor extends AbstractInterceptor
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5470473986969317667L;
	
	public void destroy()
	{
	}
	
	public void init()
	{
	}
	
	public String intercept(ActionInvocation actionInvocation) throws Exception
	{
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		
		User user = (User)session.get(AppConstants.USER_OBJECT);
		
		boolean isAuthenticated = (null != user);
		
		System.out.println(isAuthenticated+" ************************** AuthenticationInterceptor **************************");

		if (!isAuthenticated)
		{
			return "AUTHENTICATION_ERROR";
		}
		else
		{
			return actionInvocation.invoke();
		}
		
	}
}