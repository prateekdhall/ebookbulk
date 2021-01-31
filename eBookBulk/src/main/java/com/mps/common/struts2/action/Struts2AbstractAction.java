package main.java.com.mps.common.struts2.action;


import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Validateable;
import com.opensymphony.xwork2.ValidationAware;


public class Struts2AbstractAction extends ActionSupport implements
		ParameterAware, RequestAware, ServletContextAware, ServletRequestAware, ServletResponseAware, SessionAware, ValidationAware, Validateable
{
	private static final long serialVersionUID = -5973052850385968282L;
	public Logger log = Logger.getLogger(this.getClass());
	public Map<String, String[]> parameters;
	public Map<String, Object> request;
	public Map<String, Object> session;
	public ServletContext servletContext;
	public HttpServletRequest requestObject;
	public HttpServletResponse responseObject;
	
	@Override
	public void setParameters(Map<String, String[]> parameters)
	{
		this.parameters = parameters;
	}
	
	@Override
	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
	}
	
	@Override
	public void setServletContext(ServletContext context)
	{
		this.servletContext = context;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest requestObject)
	{
		this.requestObject = requestObject;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse responseObject)
	{
		this.responseObject = responseObject;
	}
	
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}
	
	/**
	 * @return ServletRequest Host header value
	 */
	public String getHost()
	{
		return requestObject.getHeader("Host");
	}
	
	public String getRealPath()
	{
		String basePath = ServletActionContext.getServletContext().getRealPath("/");
		
		return basePath;
		
	}
	
}
