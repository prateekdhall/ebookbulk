<%@page import="java.util.Calendar"%>
<%@page import="main.java.com.mps.wiley.ebb.domain.MenuItem"%>
<%@page import="java.util.List"%>
<%@page import="main.java.com.mps.wiley.common.AppConstants"%>
<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<script type="text/javascript">
	function goBack()
	{
		window.location = "ebbs/searchUser.do";
	}
</script>

<div class="medium-spacer"></div>
<s:form action="saveAdminUser" namespace="/ebbs" method="post"
	theme="css_xhtml">
	<fieldset>
		<legend><s:text name="label.create"/></legend>
				
			<tiles:insertAttribute name="elements">
				<tiles:putAttribute name="action" value="add"/>	
			</tiles:insertAttribute>
		
	<div class="clear"></div>
	</fieldset>
	<!--Buttons-->
	<div class="btnWrapper">
		<s:submit theme="simple" cssClass="submit_btn" tabindex="9"/>
		<s:reset value="Cancel" theme="simple" cssClass="submit_btn" tabindex="10" onclick="javascript:goBack() "/>
	</div>
<div class="clear"></div>
</s:form>
<div class="clear"></div>

