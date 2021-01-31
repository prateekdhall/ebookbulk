<%@page import="main.java.com.mps.common.util.StringUtil"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<script type="text/javascript">
function goBack()
{
		var objForm = document.forms[0];
		objForm.action = "ebbs/searchUser.do";
		objForm.submit();
}
</script>
<div class="medium-spacer"></div>
<s:form action="updateAdminUser" namespace="/ebbs" method="post" theme="css_xhtml">
<%
	if(StringUtil.isValidStr((String)request.getParameter("searchUser.name")))
	{
		%><input type="hidden" id="nameId" name="searchUser.name" value='<%=request.getParameter("searchUser.name")%>'/><%
	}
	else
	{
		%><input type="hidden" id="nameId" name="searchUser.name" value=''/><%
	}
	if(StringUtil.isValidStr(request.getParameter("searchUser.userName")))
	{
		%><input type="hidden" id="emailId" name="searchUser.userName" value='<%=request.getParameter("searchUser.userName") %>'/><%
	}
	else
	{
		%><input type="hidden" id="emailId" name="searchUser.userName" value=''/><%
	}
%>
	<input type="hidden" name="firstFlag" value='<%=request.getParameter("firstFlag") %>'/>
	<fieldset>
		<legend><s:text name="label.update"/></legend>
		<s:hidden name="user.usrId"></s:hidden>
		<tiles:insertAttribute name="elements" >
				<tiles:putAttribute name="action" value="edit"/>
		</tiles:insertAttribute>
	</fieldset>
	<div class="clear"></div>
	<!--Buttons-->
	<div class="btnWrapper">
		<input type="submit" class="submit_btn" value="Submit" tabindex="9"/> 
		<input type="reset" class="submit_btn" value="Cancel" tabindex="10" onclick="javascript:goBack()"/>
	</div>
	<div class="clear"></div>
</s:form>
<div class="clear"></div>
