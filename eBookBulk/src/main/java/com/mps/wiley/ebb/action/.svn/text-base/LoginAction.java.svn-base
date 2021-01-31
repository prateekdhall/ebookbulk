package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.mps.common.AppSystem;
import main.java.com.mps.common.mail.MailObject;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.common.util.StringUtil;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.MenuItem;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.MenuItemService;
import main.java.com.mps.wiley.ebb.service.PasswordGeneratorService;
import main.java.com.mps.wiley.ebb.service.UserService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;


@Namespace("/login")
public class LoginAction extends Struts2AbstractAction implements ModelDriven<User>, Preparable
{
	private static final long serialVersionUID = -3022636306602564743L;
	
	private User user;
	
	public final User getUser()
	{
		return user;
	}
	
	public final void setUser(User user)
	{
		this.user = user;
	}
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private MenuItemService menuItemService;
	
	@Override
	public User getModel()
	{
		user = new User();
		return user;
	}
	
	@Action(value = "index",
			results = {@Result(name = "success", type = "dispatcher", location = "/WEB-INF/view/jsp/login.jsp")})
	public String execute() throws Exception
	{
		return SUCCESS;
	}
	
	@Action(value = "login",
			results = {
					@Result(name = "success", type = "redirect", location = "/ebbs/home.do"),
					//@Result(name = "success", type = "tiles", location = "home"),
					@Result(name = "input", type = "dispatcher", location = "/WEB-INF/view/jsp/login.jsp")
			})
	public String loginSubmit() throws Exception
	{
		if (StringUtil.isValidStr(user.getUserName()) && StringUtil.isValidStr(user.getPassword()))
		{
			user = userService.getUser("", user.getUserName(), user.getPassword());
			if (null != user)
			{
				if (user.getActive() == 0)
				{
					addActionError(getText("login.inactive", new String[] {getText("user.userName"), getText("user.password")}));
					return INPUT;
				}
				else
				{
					responseObject.setHeader("Cache-Control", "no-store, no-cache");
					responseObject.setHeader("Pragma", "no-cache");
					responseObject.setDateHeader("Expires", 0);

					session.put(AppConstants.USER_OBJECT, user);
					final List<MenuItem> objMenuList = menuItemService.loadAllResourses(user.getRoleId());
					final Map<Integer, List<MenuItem>> objMenuMap = new HashMap<Integer, List<MenuItem>>();
					List<MenuItem> objMList = new ArrayList<MenuItem>();
					int iType = 0;
					for (MenuItem menuItem : objMenuList)
					{
						if (iType != 0 && menuItem.getMenuType() != iType)
						{
							objMenuMap.put(iType, objMList);
							objMList = new ArrayList<MenuItem>();
						}
						objMList.add(menuItem);
						iType = menuItem.getMenuType();
					}
					objMenuMap.put(iType, objMList);
					session.put(AppConstants.MENU_LIST, objMenuMap);
					// requestObject.getSession().setAttribute(AppConstants.MENU_LIST, objMenuMap);
					return SUCCESS;
				}
			}
			else
			{
				addActionError(getText("login.error", new String[] {getText("user.userName"), getText("user.password")}));
				return INPUT;
			}
		}
		else
		{
			if (!StringUtil.isValidStr(user.getUserName()))
			{
				addFieldError("user.userName", getText("mandatory.field", new String[] {getText("user.userName")}));
			}
			if (!StringUtil.isValidStr(user.getPassword()))
			{
				addFieldError("user.password", getText("mandatory.field", new String[] {getText("user.password")}));
			}
			return INPUT;
		}
	}
	
	@Action(value = "forgotPassword",
			results = {@Result(name = "success", type = "dispatcher",
					location = "/WEB-INF/view/jsp/forgotPassword.jsp")})
	public String forgotPassword() throws Exception
	{
		return SUCCESS;
	}
	
	@Action(value = "submitForgotPassword",
			results = {
					@Result(name = "input", type = "dispatcher",
							location = "/WEB-INF/view/jsp/forgotPassword.jsp"),
					@Result(name = "success", type = "dispatcher",
							location = "/WEB-INF/view/jsp/login.jsp")})
	public String sendEmail() throws Exception
	{
		int iSendMail = 0;
		log.info("Email: " + user.getUserName());
		log.info("#################### MAIL TEST ################");
		
		user = userService.getUserByUserName(user.getUserName());
		
		if (user != null)
		{
			
			PasswordGeneratorService passGenerator = new PasswordGeneratorService(7,false);
			String newPassword=passGenerator.getNewPassword();
			userService.forgotPassword(user, newPassword);
			
			MailObject bean = new MailObject();
			bean.setTemplate("forgotpassword.vm");
			bean.setTo(user.getUserName());
			bean.setFrom(AppSystem.getMailConfig("admin.email"));
			bean.setSubject("Credentials of eBookBulk Application.");
			bean.put("firstName", user.getName());
			bean.put("userName", user.getUserName());
			bean.put("password", newPassword);
			
			iSendMail = AppSystem.EMAILSERVER.sendEmail(bean);
			System.out.println(" Send email Successfully : " + iSendMail);
			log.info(" Send email Successfully ,,,,," + iSendMail);
		}
		if (iSendMail == 1)
		{
			addActionError(getText("forgotPasswordSucess"));
			return SUCCESS;
		}
		else
		{
			addActionError(getText("forgotPasswordFailure"));
			return INPUT;
		}
	}
	
	@Action(value = "logoff",
			results = {@Result(name = "success", type = "redirect", location = "index.do")})
	public String logoff() throws Exception
	{
		responseObject.setHeader("Cache-Control", "no-store, no-cache");
		responseObject.setHeader("Pragma", "no-cache");
		responseObject.setDateHeader("Expires", 0);

		requestObject.getSession().invalidate();
		
		return SUCCESS;
	}
	
	@Override
	public void prepare() throws Exception
	{
	}
}
