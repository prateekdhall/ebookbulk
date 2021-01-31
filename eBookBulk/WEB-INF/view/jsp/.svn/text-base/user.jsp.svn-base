<%@page import="java.util.Calendar"%>
<%@page import="main.java.com.mps.wiley.ebb.domain.MenuItem"%>
<%@page import="java.util.List"%>
<%@page import="main.java.com.mps.wiley.common.AppConstants"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<tiles:useAttribute name="action" id="iAction"/>
<%
final boolean blnAdd = iAction.equals("add");
%>

<div class="medium-spacer"></div>

		<div class="col-1">
			<s:textfield key="user.name" theme="xhtml" required="true" cssErrorClass="error-alert" labelSeparator=" :" tabindex="1" maxlength="50"/>
		</div>
		<div class="col-2">
			<s:textfield key="user.phoneNo" theme="xhtml" tabindex="7" labelSeparator=" :" maxlength="50"/>
		</div>
		<div class="clear"></div>
		
		<div class="col-1">
			<s:textfield key="user.userName" theme="xhtml" required="true" cssErrorClass="error-alert" labelSeparator=" :" tabindex="2" maxlength="50"/>
			<s:hidden name="user.keyContact" value="0"/>
		</div>
		<div class="col-2">
			<s:textfield key="user.mobileNo" theme="xhtml" labelSeparator=" :" tabindex="8" maxlength="50"/>
		</div>
		<div class="clear"></div>
		
		<div class="col-1">
		<%
		if(blnAdd)
		{
			%><s:password key="user.password" theme="xhtml" required="true" cssErrorClass="error-alert" labelSeparator=" :" tabindex="3" maxlength="20" showPassword="true"/><%
		}
		else
		{
			%><s:password key="user.password" theme="xhtml" required="true" cssErrorClass="error-alert" labelSeparator=" :" tabindex="3" maxlength="20" showPassword="true" readonly="true"/><%
		}
		%>
		</div>

		<div class="clear"></div>

		<div class="col-1">
			<s:select name="user.country.id" label="Country" id="country" required="true" cssErrorClass="error-alert" labelSeparator=" :" list="countries" listKey="id" listValue="name" headerKey="-1" headerValue="Select Country" theme="xhtml" tabindex="4" />
		</div>
		<div class="clear"></div>
		
		<div class="col-1">
			<s:select key="user.roleId" list="roles" listKey="roleId" listValue="roleName" headerKey="-1" headerValue="Select Role" required="true" cssErrorClass="error-alert" labelSeparator=" :" theme="xhtml" tabindex="5"/>
		</div>
		<div class="clear"></div>
		
		<div class="radiobtn">			
			<label class="labelTxt"><s:text name="user.active"/> :</label>
			<s:radio name="user.active" list="#{'1':'Yes','0':'No'}" theme="simple" cssErrorClass="error-alert" labelSeparator=" :" tabindex="6"/>
		</div>
		<div class="clear"></div>
		
		

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/libs/jquery-1.6.2.min.js"><\/script>')</script>
<script defer src="js/plugins.js"></script>
<script defer src="js/script.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.1.custom.min.js"></script>

