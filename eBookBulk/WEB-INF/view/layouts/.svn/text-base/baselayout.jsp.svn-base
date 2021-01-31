<?xml version="1.0" encoding="utf-8"?>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!doctype html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<head>
	<base href="<%=basePath%>" />
	<title>eBook Bulk</title>
	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="keywords" content="struts2, jquery, jquery-ui, plugin, jqgrid" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<meta name="description" content=""/>
	<meta name="author" content=""/>
	<meta name="viewport" content="width=device-width,initial-scale=1"/>
	

	<style type="text/css">
		@import url(<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/css/style.css);
		@import url(<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/css/jTabs.css);
	</style>
	<link href="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/css/styles_basic.css" rel="stylesheet" type="text/css" />
	<link href="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/css/form_content.css" rel="stylesheet" type="text/css" />
	<link href="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/fancybox/fancybox/jquery.fancybox-1.3.4.css" rel="stylesheet" type="text/css" media="screen" />
	<link rel="stylesheet" type="text/css" media="screen" href="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/themes/redmond/jquery-ui-1.8.1.custom.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/themes/ui.jqgrid.css" />
	<script type="text/javascript" src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/javascript/apputil.js"></script>
	<!-- 
	All JavaScript at the bottom, except for Modernizer / Respond.
	Modernizer enables HTML5 elements & feature detects; Respond is a polyfill for min/max-width CSS3 Media Queries
	For optimal performance, use a custom Modernizer build: www.modernizr.com/download/ 
	-->
	<script src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/js/libs/modernizr-2.0.6.min.js"></script>
	<sj:head jqueryui="true" jquerytheme="redmond"/>


		
</head>
	<body onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">
	<div id="container">
		<header>
			<tiles:insertAttribute name="header" />
		</header>
	
		<div class="content-wrapper">
			<div id="main">
				<div class="pagehead">
					<h1 class="h1c"><tiles:getAsString name="title"/></h1>					
					<div class="leftbtn"> 
						<s:if test="hasActionErrors()">
							<s:actionerror/>
						</s:if>
						<s:if test="hasActionMessages()">
							<s:actionmessage/>
						</s:if>	
					</div>	
					<div class="clear"> </div>
				</div>

				<div id="body_bg">
					<tiles:insertAttribute name="body" />
    			</div>
				
			</div>
			<!--Main-->
		
			<footer>	
				<tiles:insertAttribute name="footer" />
			</footer>
		 </div>
		 <!--Content Wrapper-->
		 <div class="clear"></div>
		</div>
		<script src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/js/mylibs/myJS.js" type="text/javascript"></script>
<script type="text/javascript" src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/fancybox/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript" src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/js/jquery-ui-1.8.1.custom.min.js"></script>
<script type="text/javascript" src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/ui/jquery.ui.datepicker.js"></script>
<script type="text/javascript" src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/ui/jquery-ui-timepicker-addon.js"></script>
<script type="text/javascript">
$(".datepickerNoTime").datetimepicker({
	dateFormat: 'd-M-yy',
	timeFormat: 'h:m',
	showOn: 'button',
	buttonImage: '<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/calendar.gif',
	buttonImageOnly: true
});

$(".datepickerNoTimeNoBack").datetimepicker({
	dateFormat: 'd-M-yy',
// 	timeFormat: 'h:m',
	timeFormat: 'hh:mm:ss',
	minDate: '0',
	showSecond: true,
	showOn: 'button',
	buttonImage: '<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/calendar.gif',
	buttonImageOnly: true
});

$(".datepickerNoTimeNoForward").datetimepicker({
	dateFormat: 'd-M-yy',
	timeFormat: 'h:m',
	maxDate: '0',
	showOn: 'button',
	buttonImage: '<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/calendar.gif',
	buttonImageOnly: true
});

</script>
	</body>
	
	
</html>
