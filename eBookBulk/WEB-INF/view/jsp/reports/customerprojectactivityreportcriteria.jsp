<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@taglib uri="/struts-tags" prefix="s"%>
      <div class="medium-spacer"></div>
    
      <s:form  method="post" namespace="/ebbs" action="projectActivityCustomerReportExport" theme="css_xhtml">
      <fieldset>
      <legend>Search</legend>
      <div class="col-1">
        <s:textfield key="reportCriteriaBean.projectName" labelSeparator=" :" theme="xhtml" maxlength="9" tabindex="1"/>
        <s:hidden name="firstFlag" value="1"/>
      </div>
      <div class="col-2">
         <s:textfield key="reportCriteriaBean.projectId"  labelSeparator=" :" theme="xhtml" maxlength="9" tabindex="2"/>
      </div>
       
      <div class="clear"></div>
      <div class="col-1">
        <s:textfield key="reportCriteriaBean.customer.value" labelSeparator=" :" theme="xhtml" maxlength="20" tabindex="3"/> 
      </div>
       
      <div class="clear"></div>
      </fieldset>
      <div class="btnWrapper">
        <s:submit label="Search" theme="simple" cssClass="submit_btn" />
		<s:reset value="Cancel" theme="simple" cssClass="submit_btn"  onclick="javascript:homePage()"/>
      </div>
      </s:form>
<div class="clear"></div>
