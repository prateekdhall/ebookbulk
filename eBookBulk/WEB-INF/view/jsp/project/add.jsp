<%@page import="main.java.com.mps.wiley.common.Modules"%>
<%@page import="main.java.com.mps.common.util.StringUtil"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="ISO-8859-1"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%
	final String strModuleId = StringUtil.validStr(request.getParameter("module"));
%>
<s:url id="copyPrj" action="copyProject.do" />
<script>
jQuery(document).ready(function(){
   $("#create").fancybox({
		'width'				: '50%',
		'height'			: '50%',
		'autoScale'			: 'true',
		'transitionIn'		: 'elastic',
		'transitionOut'		: 'elastic',
		'type'				: 'iframe',
		'padding'			: '10',
		'margin'			: '0',
		'top'				: '0',
		'left'				: '0',
		'scrolling'   		: 'no'  		
	});
   });
   
function copyProject(iPrjId)
{
	location.href = "./ebbs/copyProject.do?project.projectId="+iPrjId;
	jQuery.fancybox.close();	
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
<!--Copy Project-->
<!-- <div style="text-align: right"> -->
<%-- 	<s:a action="copyCriteriaProject.do" id="create"> --%>
<%-- 		<strong><s:text name="label.copyProject" /></strong> --%>
<%-- 	</s:a> --%>
<!-- </div> -->
<s:form action="addSubmitProject" namespace="/ebbs" method="post" theme="css_xhtml" onsubmit="return beforeSubmit();">

	<tiles:insertAttribute name="elements">
		<tiles:putAttribute name="action" value="add"/>
	</tiles:insertAttribute>

	<div class="medium-spacer"></div>
	<div class="clear"></div>
	<div class="btnWrapper">
		<input type="submit" class="submit_btn" value="Save"  tabindex="17">
		<input type="reset" class="submit_btn" value="Cancel" tabindex="18" onclick="javascript:goBack()">
	</div>
</s:form>
<div class="clear"></div>