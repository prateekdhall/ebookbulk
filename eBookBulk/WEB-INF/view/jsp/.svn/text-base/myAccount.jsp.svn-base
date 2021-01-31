<%@page import="java.util.Calendar"%>
<%@page import="main.java.com.mps.wiley.ebb.domain.MenuItem"%>
<%@page import="java.util.List"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@page import="main.java.com.mps.wiley.common.AppConstants"%>
<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<div class="medium-spacer"></div>

<script>
	function homePage()
	{
		window.location = "ebbs/home.do";
	}
	function beforeSubmit()
	{
		var objForm = document.forms[0];
		objForm["user.roleId"].disabled = false;
		objForm["user.active"][0].disabled = false;
		objForm["user.active"][1].disabled = false;
	}
</script>

<s:form action="updateMyAccount" namespace="/ebbs" method="post"
	theme="css_xhtml">
	<fieldset>
		<legend><s:text name="label.myaccount"/></legend>
		<s:hidden name="user.usrId"></s:hidden>
		
<div class="medium-spacer"></div>

		<div class="col-1">
			<s:textfield key="user.name" theme="xhtml" required="true" labelSeparator=" :" tabindex="1" maxlength="50"  cssErrorClass="error-alert"/>
		</div>
		<div class="col-2">
			<s:textfield key="user.phoneNo" labelSeparator=" :" theme="xhtml" tabindex="5" maxlength="50"/>
		</div>
		<div class="clear"></div>
		
		<div class="col-1">
			<s:textfield key="user.userName" theme="xhtml" required="true" labelSeparator=" :" tabindex="2" maxlength="50" cssClass="txtread-only" cssErrorClass="error-alert"/>
		</div>
		<div class="col-2">
			<s:textfield key="user.mobileNo" labelSeparator=" :" theme="xhtml" tabindex="6" maxlength="50"/>
		</div>
		<div class="clear"></div>
		
		<div class="col-1" style="width:46%">
			<s:password key="user.password" theme="xhtml" required="true" labelSeparator=" :" maxlength="20" showPassword="true" readonly="true" cssClass="txtread-only" cssErrorClass="error-alert"/>
			<s:hidden name="user.keyContact" value="0"/>
			<s:hidden name="user.password" value="1"/>
		</div>
		<div class="col-2" style="padding-top:5px;margin-left:0!important">
			<s:a action="changePassword.do"><strong tabindex="3"><s:text name="label.changePassword"/></strong></s:a>
		</div>
		<div class="clear"></div>
		
		<div class="col-1">
			<s:select name="user.country.id" label="Country" id="country" required="true" labelSeparator=" :" list="countries" listKey="id" listValue="name" headerKey="-1" headerValue="Select Country" theme="xhtml" tabindex="4" cssErrorClass="error-alert"/>
		</div>
		<div class="clear"></div>
		
		<div class="col-1">
			<s:select key="user.roleId" list="roles" listKey="roleId" listValue="roleName" headerKey="-1" headerValue="select Role" required="true" labelSeparator=" :" theme="xhtml" disabled="true"/>
		</div>
		<div class="clear"></div>
		
		<div class="radiobtn">			
			<label class="labelTxt"><s:text name="user.active"/> :</label>
			<s:radio name="user.active" list="#{'1':'Yes','0':'No'}" theme="simple" disabled="true"/>
		</div>


	</fieldset>
	<div class="clear"></div>
	<!--Buttons-->
	<div class="btnWrapper">
		<s:submit value="Submit" theme="simple" cssClass="submit_btn" tabindex="7" onclick="javascript:beforeSubmit();"/>
		<s:reset value="Cancel" theme="simple" cssClass="submit_btn" tabindex="8" onclick="javascript:homePage()"/>
		
<%-- 		<s:url id="homeUrl" action="home.do" /> --%>
<%-- 		<s:a href="%{homeUrl}"><s:text name="label.Cancel"/></s:a> --%>
	</div>
	<div class="clear"></div>
</s:form>
<div class="clear"></div>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/libs/jquery-1.6.2.min.js"><\/script>')</script>
<script defer src="js/plugins.js"></script>
<script defer src="js/script.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.1.custom.min.js"></script>
