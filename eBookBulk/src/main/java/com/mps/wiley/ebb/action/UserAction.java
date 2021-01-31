package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import main.java.com.mps.common.AppSystem;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.Role;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.domain.WileyOffices;
import main.java.com.mps.wiley.ebb.service.UserService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;


@ParentPackage("ebbs")
@Namespace("/ebbs")
@Validations(
		emails = {
				@EmailValidator(type = ValidatorType.SIMPLE, fieldName = "user.userName", key = "error.invalid.email")},
		intRangeFields = {@IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "user.roleId", min = "1", key = "error.usrRolId.required"),
				@IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "user.country.id", min = "1", key = "error.usrcountryId.required")}, requiredStrings = {@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "user.userName", key = "required.field"),
				@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "user.name", key = "required.field"),
				@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "user.password", key = "required.field")},
		stringLengthFields = {
				@StringLengthFieldValidator(type = ValidatorType.FIELD, fieldName = "user.userName", key = "error.StringLength", trim = true, minLength = "6"),
				@StringLengthFieldValidator(type = ValidatorType.FIELD, fieldName = "user.password", key = "error.StringLength", trim = true, minLength = "6")})
public class UserAction extends Struts2AbstractAction implements ModelDriven<User>, Preparable
{
	private static final long serialVersionUID = -6659925652584240539L;
	
	private User user;
	private User searchUser;
	
	private List<User> userList = new ArrayList<User>();
	
	private List<Role> roles = AppSystem.ROLES;
	
	private String newPassword;
	
	public String getConPassword()
	{
		return conPassword;
	}
	
	public void setConPassword(String conPassword)
	{
		this.conPassword = conPassword;
	}
	
	private String conPassword;
	
	private int firstFlag = 0;
	
	public int getFirstFlag()
	{
		return firstFlag;
	}
	
	public void setFirstFlag(int firstFlag)
	{
		this.firstFlag = firstFlag;
	}
	
	public List<WileyOffices> getCountries()
	{
		return countries;
	}
	
	public List<WileyOffices> countries = AppSystem.WILEY_OFFICES;
	
	public String getNewPassword()
	{
		return newPassword;
	}
	
	public void setNewPassword(String newPassword)
	{
		this.newPassword = newPassword;
	}
	
	public User getSearchUser()
	{
		return searchUser;
	}
	
	public void setSearchUser(User searchUser)
	{
		this.searchUser = searchUser;
	}
	
	@Override
	public void prepare() throws Exception
	{
		log.info("################# @@@@@@@@@@@@@@@@@@@@ #################");
	}
	
	public User getUser()
	{
		log.info("*********** Getter User ***********");
		return user;
	}
	
	public void setUser(User user)
	{
		log.info("*********** Setter User ***********");
		user.toString();
		this.user = user;
	}
	
	public List<User> getUserList()
	{
		return userList;
	}
	
	public void setUserList(List<User> userList)
	{
		this.userList = userList;
	}
	
	public List<Role> getRoles()
	{
		return roles;
	}
	
	@Autowired
	private UserService userService;
	
	@Override
	public User getModel()
	{
		// user = new User();
		return user;
	}
	
	public void prepareUpdateUser() throws Exception
	{
		log.info("################# prepareUpdateUser() #################");
	}
	
	/**
	 * To save or update user.
	 * 
	 * @return String
	 */
	@Action(value = "submitUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "redirect", location = "listUser.do"), @Result(name = "input", type = "dispatcher", location = "/WEB-INF/view/jsp/register.jsp")})
	public String updateUser()
	{
		userService.saveUser(user);
		return SUCCESS;
	}
	
	public void prepareSaveUser() throws Exception
	{
		log.info("################# prepareSaveOrUpdate() #################");
		userList = (List<User>)userService.loadUsers();
	}
	
	/**
	 * To save or update user.
	 * 
	 * @return String
	 */
	@Action(value = "saveUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "redirect", location = "listUser.do"), @Result(name = "input", type = "dispatcher", location = "/WEB-INF/view/jsp/register.jsp")})
	public String saveUser()
	{
		log.info("Save User");
		userService.saveUser(user);
		return SUCCESS;
	}
	
	/**
	 * To delete a user.
	 * 
	 * @return String
	 */
	@Action(value = "deleteUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "redirect", location = "listUser.do")})
	@SkipValidation
	public String delete()
	{
		userService.deleteUser(user);
		return SUCCESS;
	}
	
	/**
	 * To list a single user by Id.
	 * 
	 * @return String
	 */
	@Action(value = "editUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "dispatcher", location = "/WEB-INF/view/jsp/register.jsp")})
	@SkipValidation
	public String edit()
	{
		user = userService.loadUser(user.getUsrId());
		return SUCCESS;
	}
	
	/**
	 * To list all users.
	 * 
	 * @return String
	 */
	@Action(value = "listUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "dispatcher", location = "/WEB-INF/view/jsp/register.jsp")})
	@SkipValidation
	public String list()
	{
		userList = (List<User>)userService.loadUsers();
		return SUCCESS;
	}
	
	@Action(value = "searchUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "input", type = "tiles", location = "searchUser"), @Result(name = "success", type = "tiles", location = "searchUser")
	
	})
	@SkipValidation
	public String searchUser() throws Exception
	{
		try
		{
			
			return SUCCESS;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "createUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "createUser"), @Result(name = "input", type = "tiles", location = "createUser")})
	@SkipValidation
	public String createUser() throws Exception
	{
		try
		{
			user = new User();
			user.setActive(AppConstants.YES);
			return SUCCESS;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "saveAdminUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "searchUser"), @Result(name = "input", type = "tiles", location = "createUser")})
	public String saveAdminUser() throws Exception
	{
		try
		{
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			user.setCreatedBy(sessionUser.getUserName());
			user.setCreatedDate(new Date());
			user.setUpdatedBy(sessionUser.getUserName());
			user.setUpdatedDate(new Date());
			log.info("Save User");
			userService.saveUser(user);
			addActionMessage(getText("userform.data.save"));
			user = null;
			user = new User();
			user.setActive(AppConstants.YES);
			return SUCCESS;
		}
		catch (org.springframework.dao.DuplicateKeyException de)
		{
			addFieldError("user.userName", getText("error.duplicate.username"));
			// addActionError(getText("error.duplicate.username"));
			return INPUT;
		}
		catch (DataAccessException e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "myAccount", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "myAccount"), @Result(name = "input", type = "tiles", location = "myAccount")})
	@SkipValidation
	public String myAccount() throws Exception
	{
		try
		{
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			setUser(sessionUser);
			
			return SUCCESS;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "updateMyAccount", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "home"), @Result(name = "input", type = "tiles", location = "myAccount")})
	public String updateMyAccount() throws Exception
	{
		try
		{
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			
			user.setUpdatedBy(sessionUser.getUserName());
			user.setUpdatedDate(new Date());
			userService.saveUser(user);
			user.setCreatedBy(sessionUser.getCreatedBy());
			user.setCreatedDate(sessionUser.getCreatedDate());
			session.put(AppConstants.USER_OBJECT, user);
			addActionMessage(getText("userform.data.update"));
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "viewUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "updateUser"), @Result(name = "input", type = "tiles", location = "updateUser")
	
	})
	@SkipValidation
	public String viewUser() throws Exception
	{
		try
		{
			User viewUser = userService.loadUser(user.getUsrId());
			setUser(viewUser);
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "updateAdminUser", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "searchUser"), @Result(name = "input", type = "tiles", location = "updateUser")
	
	})
	public String updateAdminUser() throws Exception
	{
		try
		{
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			user.setUpdatedBy(sessionUser.getUserName());
			user.setUpdatedDate(new Date());
			userService.saveUser(user);
			addActionMessage(getText("userform.data.update"));
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "changePassword", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "changePassword"), @Result(name = "input", type = "tiles", location = "changePassword")})
	@SkipValidation
	public String changePassword()
	{
		try
		{
			log.info("Change request for user password");
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			user = new User();
			user.setUserName(sessionUser.getUserName());
			return SUCCESS;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	
	@Action(value = "updatePassword", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "myAccount"), @Result(name = "input", type = "tiles", location = "changePassword")})
	@SkipValidation
	public String updatePassword()
	{
		boolean blnFlag = true;
		
		try
		{
			log.info("Update request for user password");
			log.info(user.getPassword());
			log.info(user.getUserName());
			log.info(newPassword);
			
			if (user.getPassword().equals(""))
			{
				addFieldError("user.password", getText("mandatory"));
				blnFlag = false;
			}
			else if (user.getPassword().length() < 6)
			{
				addFieldError("user.password", getText("error.StringLength"));
				blnFlag = false;
			}
			else if (user.getPassword().length() >= 6)
			{
				int pwdExists = userService.passwordExist(user);
				if (pwdExists == 0)
					addFieldError("user.password", getText("changepassword.failure"));
				blnFlag = false;
			}
			
			
			if (newPassword.equals(""))
			{
				addFieldError("newPassword", getText("mandatory"));
				blnFlag = false;
			}
			else if (newPassword.length() < 6)
			{
				addFieldError("newPassword", getText("error.StringLength"));
				blnFlag = false;
			}
			
			
			if (conPassword.equals(""))
			{
				addFieldError("conPassword", getText("mandatory"));
				blnFlag = false;
			}
			else if (conPassword.length() < 6)
			{
				addFieldError("conPassword", getText("error.StringLength"));
				blnFlag = false;
			}
			
			if (!newPassword.equals(conPassword))
			{
				if (!(newPassword.isEmpty() && conPassword.isEmpty()))
				{
					addActionError(getText("password.notMatch"));
					addFieldError("newPassword", "");
					addFieldError("conPassword", "");
					blnFlag = false;
				}
			}
			
			if (newPassword.equalsIgnoreCase(user.getPassword()))
			{
				if (!(newPassword.isEmpty() && user.getPassword().isEmpty()))
				{
					addFieldError("user.password", "");
					addFieldError("newPassword", "");
					addActionError(getText("password.notchanged"));
					blnFlag = false;
				}
				
			}
			
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			user.setUpdatedBy(sessionUser.getUserName());
			user.setUpdatedDate(new Date());
			
			if (blnFlag)
			{
				int iUpdateStatus = userService.changePassword(user, newPassword);
				if (iUpdateStatus == 0)
				{
					addActionError(getText("changepassword.failure"));
					addFieldError("user.password", "");
					blnFlag = false;
				}
				else
				{
					addActionMessage(getText("changepassword.success"));
					myAccount();
					blnFlag = true;
				}
			}
			if (blnFlag == true)
			{
				return SUCCESS;
			}
			else
			{
				return INPUT;
			}
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
}