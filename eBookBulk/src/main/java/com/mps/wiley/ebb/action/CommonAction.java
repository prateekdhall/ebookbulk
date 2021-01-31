package main.java.com.mps.wiley.ebb.action;


import main.java.com.mps.common.struts2.action.Struts2AbstractAction;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class CommonAction extends Struts2AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6105616664093170133L;
	
	@Action(value = "home",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "tiles", location = "home"),
					@Result(name = "input", type = "redirect", location = "/ebbs/index.do")
			})
	public String homePage() throws Exception
	{
		try
		{
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return SUCCESS;
		}
	}
	
	@Action(value = "closeFancyBox",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "dispatcher", location = "/WEB-INF/view/jsp/alertrefresh.jsp"),
					@Result(name = "input", type = "redirect", location = "/ebbs/index.do")
			})
	public String closeFancyBox() throws Exception
	{
		try
		{
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return SUCCESS;
		}
	}
}
