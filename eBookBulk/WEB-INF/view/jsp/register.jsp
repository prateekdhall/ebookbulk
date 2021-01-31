<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<s:head theme="xhtml"/>
<style type="text/css">
@import url(../webresources/css/style.css);
</style>
</head>
<body>
<%=AppSystem.STATIC_PATH%>

<img alt="testImage" src="../webresources/img/add.gif"/>
<s:form namespace="/ebbs" action="submitUser.do">
<%-- 	<s:action namespace="/ebbs" name="submitUser.do" executeResult="true"/> --%>
   	<s:push value="user">
		<s:hidden name="usrId" />
		<s:textfield name="userName" label="User Name" required="true"/>
		<s:password name="password" label="Password"/>
		<s:textfield name="name" label="Name"/>
		<s:textfield name="phoneNo" label="Phone No" />
		<s:textfield name="mobileNo" label="Mobile No." />
		<s:radio name="active" label="Active" list="#{'1':'Yes','0':'No'}" value="1"/>
		<s:radio name="keyContact" label="KeyContact" list="#{'1':'Yes','0':'No'}" value="0"/>
		<s:hidden name="createdBy" value="dg"/>
		<s:hidden name="createdDate" />
		<s:hidden name="updatedBy" />
		<s:hidden name="updatedDate" />
		<s:select name="roleId" label="Role" list="roles" listKey="roleId" listValue="roleName" headerKey="-1" headerValue="select Role"/>
		<s:submit value="Save"/>
	</s:push>
</s:form>

<s:if test="userList.size() > 0">
	<div class="content">
	<table class="userTable" cellpadding="5px">
		<tr class="even">
			<th>User Id</th>
			<th>Name</th>
			<th>Role</th>
			<th>Active</th>
			<th>Key Contact</th>
			<th>Created By</th>
			<th>Created Date</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="userList" status="userStatus">
			<tr class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="userName" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="role.roleId" /> - <s:property value="role.roleRights" /></td>
				<td><s:property value="active" /></td>
				<td><s:property value="keyContact" /></td>
				<td><s:property value="createdBy" /></td>
				<td><s:property value="createdDate" /></td>
				<td>
					<s:url id="editURL" action="editUser.do">
						<s:param name="usrId" value="%{usrId}"></s:param>
					</s:url>
					<s:a href="%{editURL}">Edit</s:a>
				</td>
				<td>
					<s:url id="deleteURL" action="deleteUser.do">
						<s:param name="usrId" value="%{usrId}"></s:param>
					</s:url> 
					<s:a href="%{deleteURL}">Delete</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
</body>
</html>