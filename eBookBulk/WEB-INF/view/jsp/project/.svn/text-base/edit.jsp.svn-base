<%@page import="main.java.com.mps.wiley.ebb.domain.User"%>
<%@page import="main.java.com.mps.wiley.common.AppConstants"%>
<%@page import="main.java.com.mps.wiley.common.Modules"%>
<%@page import="main.java.com.mps.common.util.StringUtil"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="ISO-8859-1"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%
	final String strModuleId = StringUtil.validStr(request.getParameter("module"));
%>
<script type="text/javascript">

function reloadForm(msg)
{
	window.location = 'viewProject.do?project.projectId=<s:property value="project.projectId"/>&module=<%=strModuleId%>';
}

function goBack()
{
	<%
	if(strModuleId.equals(Modules.PROJECT_SEARCH+""))
	{
	%>
		var objForm = document.forms[0];
		objForm.action = "ebbs/searchProject.do";
		objForm.submit();
	<%
	}
	else if(strModuleId.equals(Modules.MY_PROJECT+""))
	{
	%>
		var objForm = document.forms[0];
		objForm.action = "ebbs/myProject.do";
		objForm.submit();
	<%
	}
	else
	{
		%>location.href = "ebbs/home.do";<%
	}
	%>
}
</script>
<span class="mandatory"><em>( <s:text name="mandatoryIndicator.note"/>)</em></span>
<div class="medium-spacer"></div>

<!--Create Project-->
<!-- <div class="rightAnchor" > -->
<%-- 		<s:url id="url" action="createProject.do"/> --%>
<%-- 		<s:a href="%{url}"><s:text name="label.createProject"/></s:a> --%>
<!-- </div> -->

<!--Generate Link-->
<s:set var="objStatus" value="project.projectStatus"/>
<s:set var="onceActiveStatus" value="project.onceActive"/>
<s:set var="soldQtyStatus" value="project.soldQty"/>
<s:set var="urlStatus" value="project.stUrl"/>
<s:if test="#soldQtyStatus>0">
	<s:if test="#urlStatus!=''">
		<div class="rightAnchor">
			<div id="ppurl">
				<s:a action="generateProjectUrl.do?projecturl.projectId=%{project.projectId}&state=%{project.urlFlag}&isActive=%{project.onceActive}" id="projectUrl" >
					<strong>Share URL & Promo Code</strong>
				</s:a>
			</div>
		</div>
	</s:if>
</s:if>
<s:form action="updateProject" namespace="/ebbs" method="post" theme="css_xhtml" onsubmit="return beforeSubmit();">

	<%
			if(strModuleId.equals(Modules.PROJECT_SEARCH+""))
			{
				if(StringUtil.isValidStr((String)request.getParameter("searchProject.projectId")))
				{
					%><input type="hidden" name="searchProject.projectId" value='<%=request.getParameter("searchProject.projectId")%>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.projectId" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.customer.value")))
				{
					%><input type="hidden" name="searchProject.customer.value" value='<%=request.getParameter("searchProject.customer.value") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.customer.value" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.projectName")))
				{
					%><input type="hidden" name="searchProject.projectName" value='<%=request.getParameter("searchProject.projectName") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.projectName" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.requester.value")))
				{
					%><input type="hidden" name="searchProject.requester.value" value='<%=request.getParameter("searchProject.requester.value") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.requester.value" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.createdBy")))
				{
					%><input type="hidden" name="searchProject.createdBy" value='<%=request.getParameter("searchProject.createdBy") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.createdBy" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.prjAdmin.value")))
				{
					%><input type="hidden" name="searchProject.prjAdmin.value" value='<%=request.getParameter("searchProject.prjAdmin.value") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.prjAdmin.value" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.projectType")))
				{
					%><input type="hidden" name="searchProject.projectType" value='<%=request.getParameter("searchProject.projectType") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.projectType" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.projectStatus")))
				{
					%><input type="hidden" name="searchProject.projectStatus" value='<%=request.getParameter("searchProject.projectStatus") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.projectStatus" value=''/><%
				}
				if(StringUtil.isValidStr(request.getParameter("searchProject.ecomp")))
				{
					%><input type="hidden" name="searchProject.ecomp" value='<%=request.getParameter("searchProject.ecomp") %>'/><%
				}
				else
				{
					%><input type="hidden" name="searchProject.ecomp" value=''/><%
				}
				
				int str=0;
				if(request.getParameter("firstFlag")!=null)
				{
				str=Integer.parseInt(request.getParameter("firstFlag").toString());
				} 
				%><input type="hidden" name="firstFlag" value='<%=str %>'/><%
			}
			%>
	
	<tiles:insertAttribute name="elements">
		<tiles:putAttribute name="action" value="edit"/>
	</tiles:insertAttribute>

	<div class="medium-spacer"></div>
	<div class="clear"></div>
	<div class="btnWrapper">
		<s:if test="%{@main.java.com.mps.common.AppSystem@ROLES_MAP[#session[@main.java.com.mps.wiley.common.AppConstants@USER_OBJECT].roleId].roleRights=='RW'}">
			<s:if test="#objStatus!=4">
				<input type="submit" class="submit_btn" value="Save" tabindex="17">
			</s:if>
		</s:if>
		<input type="reset" class="submit_btn" value="Cancel" tabindex="18" onclick="javascript:goBack()">
	</div>
</s:form>
<!--Content Wrapper-->
<div class="clear"></div>

