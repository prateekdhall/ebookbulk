<%@page language="java" contentType="text/html;charset=ISO-8859-1" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
function goBack()
{
		location.href = "ebbs/myAccount.do";
}
</script>
     <div class="loginCenter">
      <div class="medium-spacer"></div>
      
	  <s:form namespace="/ebbs" action="updatePassword" method="post" theme="css_xhtml">
      <fieldset class="loginBox passwordbox loginBox-Height">
      <div class="superImpose">
      <span style="float: right" class="mandatory"><em>( <s:text name="mandatoryIndicator.note"/>)</em></span>
     
      <div class="clear"></div>
      <div class="clear"></div>
        
        <div class="col-1 expanded">
          <s:textfield key="user.userName" required="true" labelSeparator=" :" id="txtuserid" theme="xhtml" readonly="true" maxlength="20" tabindex="1" cssErrorClass="error-alert"/>
        </div>
        <div class="clear"></div>
        <div class="col-1 expanded">
          <s:password name="user.password" key="oldpassword" required="true" labelSeparator=" :" id="txtoldpassid" theme="xhtml" maxlength="20" showPassword="true" tabindex="2" cssErrorClass="error-alert"></s:password>
        </div>
        <div class="clear"></div>
        <div class="col-1 expanded">
          <s:password name="newPassword" key="newpassword" required="true" labelSeparator=" :" id="txtpassid" theme="xhtml" maxlength="20" showPassword="true" tabindex="3" cssErrorClass="error-alert"></s:password>
        </div>
        <div class="clear"></div>
        <div class="col-1 expanded">
          <s:password name="conPassword" key="conpassword" required="true" labelSeparator=" :" id="txtconfpassid" theme="xhtml" maxlength="20" showPassword="true" tabindex="4" cssErrorClass="error-alert"></s:password >
        </div>
        <div class="clear"></div>
        <div class="btnWrapper" style="text-align:right;">
		
<%--         <s:submit label="Submit" theme="simple" cssClass="submit_btn" tabindex="5"/> --%>
<%-- 		<s:reset label="Cancel" theme="simple" cssClass="submit_btn" onclick="javascript:goBack()" tabindex="6"/> --%>
		
		<input type="submit" class="submit_btn" value="Submit" onclick="javascript:beforeSubmit();" tabindex="5">
		<input type="reset" class="submit_btn" value="Cancel" onclick="javascript:goBack()" tabindex="6">
		
      </div>
      </div>
	  </fieldset>
	  </s:form>
	  </div>