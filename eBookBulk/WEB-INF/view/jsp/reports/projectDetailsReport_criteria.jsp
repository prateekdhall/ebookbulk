<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@taglib uri="/struts-tags" prefix="s"%>
      <div class="medium-spacer"></div>
      <s:form  method="post" namespace="/ebbs" action="projectDetailsReportExport" theme="css_xhtml">
      <fieldset>
      <legend>Search</legend>
      <div class="col-1">
        <s:textfield key="reportCriteriaBean.projectId" labelSeparator=" :" theme="xhtml" maxlength="9" tabindex="1"/>
        <s:hidden name="firstFlag" value="1"/>
      </div>
      <div class="col-2">
       <s:select key="reportCriteriaBean.customer.value" labelSeparator=" :" cssClass="select-width" list="customerList" listKey="companyName" listValue="companyName" headerKey="" headerValue="All" theme="xhtml" cssErrorClass="error-alert" tabindex="6"/>
       </div>
       
      <div class="clear"></div>
      <div class="col-1">
        <s:textfield key="reportCriteriaBean.projectName" labelSeparator=" :" theme="xhtml" maxlength="20" tabindex="2"/> 
      </div>
      <div class="col-2">
       <s:select key="reportCriteriaBean.requester.value" labelSeparator=" :" list="adminList" listKey="userName" listValue="userName" headerKey="" headerValue="All" theme="xhtml" cssErrorClass="error-alert" tabindex="7"/>
      </div>
      <div class="clear"></div>
      <div class="col-1">
        <s:textfield key="reportCriteriaBean.createdBy" labelSeparator=" :" theme="xhtml" maxlength="100" tabindex="3"/>
      <!-- this feild is used for Title -->
      </div>
      <div class="col-2">
        <s:select key="reportCriteriaBean.prjAdmin.value" labelSeparator=" :" list="adminList" listKey="userName" listValue="userName" headerKey="" headerValue="All" theme="xhtml" cssErrorClass="error-alert" tabindex="8"/>
      </div>
      <div class="clear"></div>
      <div class="col-1">
        <s:select key="reportCriteriaBean.projectType" labelSeparator=" :" list="#{'1':'Single','2':'Mutiple'}" headerKey="-1" headerValue="All" theme="xhtml" tabindex="4"/>
      </div>
      <div class="col-2">
        <s:select key="reportCriteriaBean.ecomp" labelSeparator=" :" list="#{'1':'Yes','0':'No'}" headerKey="-1" headerValue="All" theme="xhtml" tabindex="9"/>
      </div>
      <div class="clear"></div>
      <div class="col-1">
        <s:select key="reportCriteriaBean.statusArray" labelSeparator=" :" multiple="true" list="#{'1':'Pending','2':'Active','3':'InActive','4':'Deleted'}" theme="xhtml" tabindex="5"/>
      </div>
      <div class="clear"></div>
      </fieldset>
      <div class="btnWrapper">
        <s:submit label="Search" theme="simple" cssClass="submit_btn" />
		<s:reset value="Cancel" theme="simple" cssClass="submit_btn"  onclick="javascript:homePage()"/>
      </div>
      </s:form>
<div class="clear"></div>

<script>
function homePage()
{
	window.location = "ebbs/home.do";
}
</script>