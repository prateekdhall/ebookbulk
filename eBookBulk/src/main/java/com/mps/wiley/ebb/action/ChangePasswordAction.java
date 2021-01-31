//package main.java.com.mps.wiley.ebb.action;
//
//
//import java.util.Date;
//
//import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
//import main.java.com.mps.wiley.common.AppConstants;
//import main.java.com.mps.wiley.ebb.domain.User;
//import main.java.com.mps.wiley.ebb.service.UserService;
//
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
//import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.ParentPackage;
//import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.interceptor.validation.SkipValidation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//
//import com.opensymphony.xwork2.ModelDriven;
//import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
//import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
//import com.opensymphony.xwork2.validator.annotations.Validations;
//import com.opensymphony.xwork2.validator.annotations.ValidatorType;
//
//
//@ParentPackage("ebbs")
//@Namespace("/ebbs")
//@Validations(requiredStrings = {@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "user.userName", key = "label.mandatory"), @RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "user.password", key = "label.mandatory"), @RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "newPassword", key = "label.mandatory"), @RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "conPassword", key = "label.mandatory")},
//				stringLengthFields = {	@StringLengthFieldValidator(type = ValidatorType.FIELD,fieldName="newPassword",
//												key = "error.StringLength", 
//												trim = true, minLength = "6"),
//												@StringLengthFieldValidator(type = ValidatorType.FIELD,fieldName="conPassword",
//												key = "error.StringLength", 
//												trim = true, minLength = "6")
//												})
//public class ChangePasswordAction extends Struts2AbstractAction implements ModelDriven<User>
//{
//	private static final long serialVersionUID = -7963770823458903013L;
//	
//	@Autowired
//	private UserService userService;
//	
//	private String newPassword;
//	
//	private String conPassword;
//	
//	private User user;
//	
//	public User getUser()
//	{
//		return user;
//	}
//	
//	public void setUser(User user)
//	{
//		this.user = user;
//	}
//	
//	public String getNewPassword()
//	{
//		return newPassword;
//	}
//	
//	public void setNewPassword(String newPassword)
//	{
//		this.newPassword = newPassword;
//	}
//	
//	public String getConPassword()
//	{
//		return conPassword;
//	}
//	
//	public void setConPassword(String conPassword)
//	{
//		this.conPassword = conPassword;
//	}
//	
//	@Action(value = "changePassword", interceptorRefs = {@InterceptorRef("defaultStack")}, results = {@Result(name = "success", type = "tiles", location = "changePassword"), @Result(name = "input", type = "tiles", location = "changePassword")})
//	@SkipValidation
//	public String changePassword()
//	{
//		try
//		{
//			log.info("Change request for user password");
//			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
//			user = new User();
//			user.setUserName(sessionUser.getUserName());
//			return SUCCESS;
//		}
//		catch (Exception e)
//		{
//			log.debug(e.getMessage());
//			addActionError(getText("error.unexpect"));
//			return INPUT;
//		}
//	}
//	
//	@Action(value = "updatePassword", interceptorRefs = {@InterceptorRef("defaultStack")},
//			results = {@Result(name = "success", type = "redirect", location = "myAccount.do"),
//			@Result(name = "input", type = "tiles", location = "changePassword")})
//	public String updatePassword()
//	{
//		try
//		{
//			log.info("Update request for user password");
//			log.info(user.getPassword());
//			log.info(user.getUserName());
//			log.info(newPassword);
//			if (!newPassword.equals(conPassword))
//			{
//				addActionError(getText("password.notMatch"));
//				addFieldError("newPassword", "");
//				addFieldError("conPassword", "");
//				return INPUT;
//			}
//			
//			if (newPassword.equalsIgnoreCase(user.getPassword()))
//			{
//				addActionError(getText("password.notchanged"));
//				return INPUT;
//			}
//			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
//			user.setUpdatedBy(sessionUser.getEmail());
//			user.setUpdatedDate(new Date());
//			int iUpdateStatus = userService.changePassword(user, newPassword);
//			if (iUpdateStatus == 0)
//			{
//				addActionError(getText("changepassword.failure"));
//				addFieldError("user.password", "");
//				return INPUT;
//			}
//			else
//			{
//				addActionMessage(getText("changepassword.success"));
//				
//				session.put(AppConstants.ACTION_MSG, getText("changepassword.success"));
//				return SUCCESS;
//			}
//		}
//		catch (DataAccessException e)
//		{
//			log.debug(e.getMessage());
//			addActionError(getText("error.unexpect"));
//			return INPUT;
//		}
//		catch (Exception e)
//		{
//			log.debug(e.getMessage());
//			addActionError(getText("error.unexpect"));
//			return INPUT;
//		}
//	}
//	
//	@Override
//	public User getModel()
//	{
//		return user;
//	}
//}