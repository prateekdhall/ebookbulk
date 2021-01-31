<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Calendar"%>
<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>eBook Bulk Sales</title>

<script type="text/javascript" src="<%=AppSystem.STATIC_PATH%>/js/libs/jquery-1.6.2.js"></script>
<script type="text/javascript">
jQuery(document).ready(function(){	
	jQuery('#btnSubmit').click(function(event) {
		if(jQuery('#username').val() == ''){
			jQuery("input:text").focus();
			alert('Please provide email address.');			
			return false;
		}else{
			if(!isValidEmailAddress(jQuery('input#username').val())){
 			   alert("This should be an email address, for eg:jsmith@wiley.com ");
 			  jQuery("#username").focus();
 			  return false;
 		   }
		}
	});
	
	jQuery('input#username').change(function() {
		if(jQuery('input#username').val() != ""){					
			if(!isValidEmailAddress(jQuery('input#username').val())){
 			  alert("This should be an email address, for eg:jsmith@wiley.com ");
 			  jQuery("#username").focus();
 			  return false;
 		   }
		   }
	});

});

function isValidEmailAddress(emailAddress) {
	var pattern = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
	return pattern.test(emailAddress);
}

</script>

<meta name="description" content="">
<meta name="author" content="">
<!-- Mobile viewport optimized: j.mp/bplateviewport -->
<meta name="viewport" content="width=device-width,initial-scale=1">
<!-- Place favicon.ico and apple-touch-icon.png in the root directory: mathiasbynens.be/notes/touch-icons -->
<!-- CSS: implied media=all -->
<!-- CSS concatenated and minified via ant build script-->

<s:head theme="simple" />
<style type="text/css">
@import url(<%=AppSystem.STATIC_PATH%>/css/style.css);
</style>

<!-- end CSS-->
<!-- More ideas for your <head> here: h5bp.com/d/head-Tips -->
<!-- All JavaScript at the bottom, except for Modernizr / Respond.
       Modernizr enables HTML5 elements & feature detects; Respond is a polyfill for min/max-width CSS3 Media Queries
       For optimal performance, use a custom Modernizr build: www.modernizr.com/download/ -->


<script src="<%=AppSystem.STATIC_PATH%>/js/libs/modernizr-2.0.6.min.js"></script>
</head>
<body>
	<div id="container">
		<header> <!--Application Navigation-->
		<div id="application-bar">
			<div class="pubLogo" style="position: relative; top: 32px;">
				<img src="<%=AppSystem.STATIC_PATH%>/img/wiley-logo.png" alt="Wiley" />
			</div>
			<div class="tabbedNavigation"></div>
		</div>
		<!--Application Navigation--> </header>
		<div class="content-wrapper">
			<div id="main" role="main">
				<h1 class="pagehead"> <s:text name="eBookFPLevel"/></h1>
				<div style="margin: 50px 270px">
					<s:if test="hasActionErrors()">
						<s:actionerror/>
					</s:if>
					<s:form method="post" action="submitForgotPassword.do" theme="css_xhtml">
						<fieldset class="loginBox">
							<div class="superImpose">
								<span style="float: right" class="mandatory"><em>( <s:text name="mandatoryIndicator.note"/>)</em></span>
								<h4><s:text name="forgotPasswordHeading"/></h4>							
								<div class="col-1 expanded">
									<s:textfield key="user.userName" id="username" required="true" labelSeparator=" :" value="" style="width:365px;" theme="xhtml" />
									<!--      <span style="font-style:italic">(This should be an email address, for eg:jsmith@wiley.com)</span> -->
								</div>
								<div class="clear"></div>
								<div class="btnWrapper" style="text-align: right;">
									<s:submit value="Send" cssClass="submit_btn" id="btnSubmit" theme="css_xhtml"/>
								</div>
							</div>
						</fieldset>
					</s:form>
				</div>
			</div>
			<!--Main-->
			<footer>
			<p>Copyright &copy 2006-<%= Calendar.getInstance().get(Calendar.YEAR) %> MPS Technologies Ltd.</p>
			</footer>
		</div>
		<!--Content Wrapper-->
		<div class="clear"></div>
	</div>

	<!--! end of #container -->
	<!-- JavaScript at the bottom for fast page loading -->
	<!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if offline -->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js/libs/jquery-1.6.2.min.js"><\/script>')</script>
	<!-- scripts concatenated and minified via ant build script-->
	<script defer src="js/plugins.js"></script>
	<script defer src="js/script.js"></script>
	<!-- end scripts-->
	<!-- Prompt IE 6 users to install Chrome Frame. Remove this if you want to support IE 6.
       chromium.org/developers/how-tos/chrome-frame-getting-started -->
	<!--[if lt IE 7 ]>
    <script src="//ajax.googleapis.com/ajax/libs/chrome-frame/1.0.3/CFInstall.min.js"></script>
    <script>window.attachEvent('onload',function(){CFInstall.check({mode:'overlay'})})</script>
  <![endif]-->
</body>
</html>