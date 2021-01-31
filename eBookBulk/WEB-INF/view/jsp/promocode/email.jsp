<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="text/javascript" src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/ckeditor/ckeditor.js"></script>
<style type="text/css">
		@import url(<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/css/style.css);
		@import url(<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/css/jTabs.css);
	</style>
	
<script>
function closeBox()
{
window.close();
}
</script>
<script>
jQuery("document").ready(function(event,data) {
	CKEDITOR.replace( 'corrMessage',
	{
		height: '100px',
		width: '830px',
		toolbar :
		[
				{ name: 'basicstyles', items : [ 'Bold','Italic','Underline','Strike','Subscript','Superscript','-','RemoveFormat' ] },
				{ name: 'paragraph', items : [ 'NumberedList','BulletedList','-','Outdent','Indent','-','Blockquote','-       ','JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock' ] },
				{ name: 'links', items : [ 'Link','Unlink','Anchor' ] },
				{ name: 'styles', items : [ 'Format','Font','FontSize' ] },
				{ name: 'colors', items : [ 'TextColor','BGColor' ] }
		]
	});
 });
</script>

<script>
function validator() 
{
	var to = document.getElementById("to").value;
	
	var cc = document.getElementById("cc").value;
	
	//var editor = document.getElementById("editor").value;
	//alert(editor)
	
	if (to == "") {
		document.getElementById("message").style.color = "red";
		document.getElementById("message").style.visibility = "visible";
		document.getElementById("message").innerHTML = "To field requried cannot be left blank.";
		
		document.getElementById("to").style.border = "3";
		document.getElementById("to").style.borderColor = "red";
		document.getElementById("to").focus();
		return false;
	} else {

		document.getElementById("to").style.borderColor = "gray";
	}
	
	if(to.indexOf(";") == -1)
		{
		document.getElementById("message").style.color = "red";
		document.getElementById("message").style.visibility = "visible";
		document.getElementById("message").innerHTML = "Please enter email-ids separated by(;).";
		
		document.getElementById("to").style.border = "3";
		document.getElementById("to").style.borderColor = "red";
		document.getElementById("to").focus();
		return false;
		}
	else {

		document.getElementById("to").style.borderColor = "gray";
	}
	if (cc == "") {
		document.getElementById("message").style.color = "red";
		document.getElementById("message").style.visibility = "visible";
		document.getElementById("message").innerHTML = "CC field requried cannot be left blank";
		document.getElementById("cc").style.border = "3";
		document.getElementById("cc").style.borderColor = "red";
		document.getElementById("cc").focus();
		return false;
	} else {
		document.getElementById("cc").style.borderColor = "gray";

	}
	
	if(cc.indexOf(";") == -1)
		{
		document.getElementById("message").style.color = "red";
		document.getElementById("message").style.visibility = "visible";
		document.getElementById("message").innerHTML = "Please enter email-ids separated by(;).";
		document.getElementById("cc").style.border = "3";
		document.getElementById("cc").style.borderColor = "red";
		document.getElementById("cc").focus();
		return false;
	} else {
		document.getElementById("cc").style.borderColor = "gray";

	}
	
	/*if (editor == "") {
		document.getElementById("message").style.color = "red";
		document.getElementById("message").style.visibility = "visible";
		document.getElementById("message").innerHTML = "Message Body field requried cannot be left blank";
		document.getElementById("editor").style.border = "3";
		document.getElementById("editor").style.borderColor = "red";
		document.getElementById("editor").focus();
		return false;
	} else {
		document.getElementById("message").style.visibility = "hidden";

	}*/

	document.frm.submit();
	

}

function addChar()
{
	var to="";
	var cc="";
	to=document.getElementById("to").value;
	cc=document.getElementById("cc").value;
	if(to!="")
		{
		to=trim(to);
		to=ltrim(to);
		to=rtrim(to);
		
		if(to.charAt( to.length-1 ) != ";") 
		{
			to=to+";";
			document.getElementById("to").value=to;
		}
		}
	
	if(cc!="")
	{
		cc=trim(cc);
		cc=ltrim(cc);
		cc=rtrim(cc);
	if(cc.charAt( cc.length-1 ) != ";") 
	{
		cc=cc+";";
		document.getElementById("cc").value=cc;
	}
	}
}

function openXls() {
	
	response.setContentType("application/vnd.ms-excel");   
	 response.setHeader("Content-Disposition", "attachment;filename=\"j.xls\""); 
	
	//window.location = "ebbs/openXls.do";
	
	//window.location = "ebbs/nextPage.do";
}

</script>

</head>

<!-- To get values from request object set in Action 
value="%{request.toList}"
value="%{request.ccList}" -->
<div id="message" style="font-size: 14px;"></div>
<br/>
<br/>
<fieldset>
<legend>Email</legend>
<s:form action="sendEmailWithAttachment" namespace="/ebbs" method="post" theme="css_xhtml"  id="sendMailInfoInfo" name="frm">

    
    
    
    <div class="col-1 expanded">
     <s:textfield key="email.from" theme="xhtml" tabindex="2" cssClass="extended" readonly="true" />
         </div>
    
     <div class="clear"></div>
     
     <div class="col-1 expanded">
      <s:textfield key="email.to" id="to" theme="xhtml" tabindex="2"  cssClass="extended" title="Please enter email ids separated by (;)." onblur="addChar()" />
    </div>
    
      <div class="clear"></div>
      
      <div class="col-1 expanded">
      <s:textfield key="email.cc" id="cc" theme="xhtml" tabindex="2"  cssClass="extended" title="Please enter email ids separated by (;)." onblur="addChar()"/>
      </div>
    
     <div class="clear"></div>
     <div class="col-1 expanded">
     <s:textfield key="email.subject" theme="xhtml" tabindex="2" value="%{@main.java.com.mps.wiley.common.AppConstants@Subject}" cssClass="extended" readonly="true" />
     </div>
     
     <div class="clear"></div>
     <div class="col-1 expanded">
     <a href="#" onclick="openXls()">Attachment.xls</a>
     </div>
    
    
    
    <div class="clear"></div>
     
     <div class="col-1 expanded">
     <label>Message Body:</label>
     </div>
     <div class="clear"></div>
	 
	 <div class="col-1 expanded cskLabel">
	 <s:textarea key="email.editor" theme="xhtml" tabindex="2" cssClass="ckeditor" cols="60" rows="5" id="corrMessage" value="%{@main.java.com.mps.wiley.common.AppConstants@body}"></s:textarea>	
    
    </div>

  <div class="clear"></div>
  <div class="butSet">
    <input type="button" name="save" value="Send" class="submit_btn" onclick="return validator();" id="save"/>
    <input type="button" name="cancel" value="Cancel" class="submit_btn" id="cancel" onclick="javascript:parent.jQuery.fancybox.close();" />
  </div>

</s:form>
	</fieldset>
<%
if(request.getAttribute("success")!=null) if(request.getAttribute("success").toString().equals("success"))
{%>
<script>
//document.getElementById('save').disabled="true";
//document.getElementById('cancel').disabled="true";
alert("Email sent successfully.");
parent.document.forms[0]["project.urlFlag"].value=1;
parent.jQuery.fancybox.close();
</script>

<%}
%>
