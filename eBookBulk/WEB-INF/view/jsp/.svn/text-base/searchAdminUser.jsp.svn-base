<%@page import="java.util.Calendar"%>
<%@page import="main.java.com.mps.wiley.ebb.domain.MenuItem"%>
<%@page import="java.util.List"%>
<%@page import="main.java.com.mps.wiley.common.AppConstants"%>
<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="main.java.com.mps.common.AppSystem"%>

<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<script type="text/javascript">
	function getRoleName(cellvalue, options, rowObject) 
	{	
		return rowObject.roleId;
	}
	
	function getActive(cellvalue, options, rowObject) 
	{	
		if(rowObject.active==1)
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
	}
	
	function check(cellvalue, options, rowObject) 
	{	
		return "<a href='javascript:viewUser("+rowObject.usrId+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/edit-template-icon.png' border='0' title='View/Edit User'/></a>";
	}

	function viewUser(iUserId)
	{
		var objForm = document.forms[0];
		objForm.action = "ebbs/viewUser.do?user.usrId="+iUserId;
		objForm.submit();
	}
	
	function homePage()
	{
		window.location = "ebbs/home.do";
	}
</script>
<div class="medium-spacer"></div>
<div style="text-align:right">
<s:a action="createUser.do"><strong tabindex="5"><s:text name="label.createUser" /></strong></s:a>
</div>

<s:form action="searchUser" namespace="/ebbs" method="post"
	theme="css_xhtml">
	<fieldset>
		<legend><s:text name="label.search"/></legend>

		<div class="col-1">
			<s:textfield key="searchUser.userName" labelSeparator=" :" theme="xhtml" tabindex="1" maxlength="50" />
		</div>		
		<div class="col-2">
			<s:textfield key="searchUser.name" labelSeparator=" :" theme="xhtml" tabindex="2" maxlength="50"/>
			<s:hidden name="firstFlag" value="1"/>
		</div>
		<div class="clear"></div>
	</fieldset>
	<div class="clear"></div>
	<!--Buttons-->
	<div class="btnWrapper">
		<s:submit label="Search" theme="simple" cssClass="submit_btn" tabindex="3"/>
		<s:reset value="Cancel" theme="simple" cssClass="submit_btn" tabindex="4" onclick="javascript:homePage()"/>
	</div>
</s:form>
<!--Buttons-->
<!--Utility Block-->
<s:if test="%{firstFlag==1}">
<div class="utility-block" hidden="true">
	<div class="exportResults">
		Export Result As: <img src="<%=AppSystem.STATIC_PATH%>/img/csv.gif">
		<img src="<%=AppSystem.STATIC_PATH%>/img/xls.gif">
	</div>
</div>
</s:if>
<s:div>
<s:if test="%{firstFlag==1}">
	<s:url id="remoteurl" action="searchUserGridAction" escapeAmp="false">
		<s:param name="name" value="searchUser.name"/>
		<s:param name="userName" value="searchUser.userName"/>
		<s:param name="firstFlag" value="firstFlag"/>
	</s:url>				    
						     <sjg:grid id="gridedittable"
						    	caption=""
 						    	dataType="json"
						    	href="%{remoteurl}"
						    	pager="true"
						    	navigator="true"
						    	navigatorAdd="false"
						    	navigatorEdit="false"
						    	navigatorDelete="false"
						    	navigatorSearch="false"
						    	navigatorView="false"
						    	navigatorRefresh="false"
						    	gridModel="userGridModel"
						    	rowList="2,5,10,20"
						    	rowNum="10"
						    	editinline="false"
						    	onSelectRowTopics="rowselect"
						    	viewrecords="true"
								height="110"
								width="908"
						    	shrinkToFit="false"
						    >
						    
						    	<sjg:gridColumn name="editId" index="projectId" title="" width="20" sortable="false" formatter="check"/>
						    	<sjg:gridColumn name="selectId" index="usrId" title="ID" formatter="integer" key="true" sortable="true" hidden="true"/>
						    	<sjg:gridColumn name="name" index="name" title="Name" width="300" sortable="true"/>
						    	<sjg:gridColumn name="userName" index="userName" title="Email (User Name)" width="300" sortable="true" />
<%-- 						    	<sjg:gridColumn name="roleId" index="role" title="Role" width="200" sortable="true" formatter="getRoleName"/> --%>
						    	<sjg:gridColumn name="active" index="active" title="Active" width="300" sortable="true" formatter="getActive"/>
						    	</sjg:grid>
</s:if>
</s:div>