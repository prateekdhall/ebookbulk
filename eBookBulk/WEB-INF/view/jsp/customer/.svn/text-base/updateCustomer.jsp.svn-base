<%@page import="main.java.com.mps.common.util.StringUtil"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<script>
		function goBack()
		{
				var objForm = document.forms[0];
				objForm.action = "ebbs/searchCustomer.do";
				objForm.submit();
		}
</script>

    <div class="medium-spacer"></div>
	<s:form method="post" namespace="/ebbs" action="updateCustomer" theme="css_xhtml">
	<%
	
		if(StringUtil.isValidStr((String)request.getParameter("searchCustomer.companyName")))
		{
			%><input type="hidden" id="companyNameId" name="searchCustomer.companyName" value='<%=request.getParameter("searchCustomer.companyName")%>'/><%
		}
		else
		{
			%><input type="hidden" id="companyNameId" name="searchCustomer.companyName" value=''/><%
		}
		if(StringUtil.isValidStr(request.getParameter("searchCustomer.country.id")))
		{
			%><input type="hidden" id="countryId" name="searchCustomer.country.id" value='<%=request.getParameter("searchCustomer.country.id") %>'/><%
		}
		else
		{
			%><input type="hidden" id="countryId" name="searchCustomer.country.id" value='-1'/><%
		}
	%>
		<input type="hidden" name="firstFlag" value='<%=request.getParameter("firstFlag") %>'/>

		<fieldset>
			<s:hidden name="customer.customerId" />
			<tiles:insertAttribute name="elements" />
		</fieldset>

		<div class="medium-spacer"></div>
		<div class="clear"></div>

 		<fieldset>
			<legend>Key Contacts</legend>
					   <s:url id="remoteurl" action="keyContactGridAction"><s:param name="customerId" value="customer.customerId"/></s:url>
					   <s:url id="editurl" action="editKeyContactGrid"><s:param name="customerId" value="customer.customerId"/></s:url>				    
					     
						<tiles:insertAttribute name="grid" />
     		</fieldset>


		<div class="clear"></div>
		
		<div class="btnWrapper">
			<s:submit value="Submit" id="submit_btn" cssClass="submit_btn" theme="simple" />
			<s:reset value="Cancel" cssClass="submit_btn" theme="simple" onclick="javascript:goBack()"/>
		</div>
	
		<div class="clear"></div>

	</s:form>

