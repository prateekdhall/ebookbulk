<%@page language="java" contentType="text/html;charset=ISO-8859-1" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<head>
<meta charset="utf-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Bulk eBook Project</title>
<meta name="description" content="">
<meta name="author" content="">

<meta name="viewport" content="width=device-width,initial-scale=1">

<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" type="text/css" media="screen" href="../themes/redmond/jquery-ui-1.8.1.custom.css" />
<link rel="stylesheet" type="text/css" media="screen" href="../themes/ui.jqgrid.css" />
<style type="text/css">
.ui-jqgrid-btable, .ui-jqgrid-htable, .ui-jqgrid-bdiv div {
	width:1200px !important;
	}
	.formRow{padding-left:200px;margin-bottom:10px;}
</style>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../js/libs/jquery-1.3.2.min.js"><\/script>')</script>
<script type="text/javascript" src="../fancybox/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<script defer src="js/plugins.js"></script>
<script defer src="js/script.js"></script>
<script type="text/javascript" src="../js/i18n/grid.locale-en.js"></script>
<script type="text/javascript" src="../ui/jquery.ui.widget.js"></script>
<script type="text/javascript" src="../js/jquery.jqGrid.src.js"></script>
<script type="text/javascript" src="../js/jquery-ui-1.8.1.custom.min.js"></script>
<script type="text/javascript" src="../ui/jquery.ui.dialog.js"></script>
<script type="text/javascript" src="../ui/jquery.ui.core.js"></script>
<script type="text/javascript">
$.subscribe('rowselect', function(event,data) {
    $("#gridinfo").html('<p>Edit Mode for Row : '+event.originalEvent.id+'</p>');
});
$.subscribe('oneditsuccess', function(event, data){
	var message = event.originalEvent.response.statusText;
	$("#gridinfo").html('<p>Status: ' + message + '</p>');
});
$.subscribe('rowadd', function(event,data) {
    $("#gridedittable").jqGrid('editGridRow',"new",{height:280,reloadAfterSubmit:false});
	});
$.subscribe('searchgrid', function(event,data) {
    $("#gridedittable").jqGrid('searchGrid', {sopt:['cn','bw','eq','ne','lt','gt','ew']} );
	});
$.subscribe('showcolumns', function(event,data) {
    $("#gridedittable").jqGrid('setColumns',{});
	});
  </pre>
  
</script>
<script src="../js/libs/modernizr-2.0.6.min.js"></script>
</head>
<body>
<div id="container">

  <div class="content-wrapper">
     
      <s:url id="remoteurl" action="jsontable"/>
    <s:url id="editurl" action="edit-grid-entry"/>
    <sjg:grid
    	id="gridedittable"
    	caption="Customers Examples (Editable)"
    	dataType="json"
    	href="%{remoteurl}"
    	pager="true"
    	navigator="true"
    	navigatorSearchOptions="{sopt:['eq','ne','lt','gt']}"
    	navigatorAddOptions="{height:280,reloadAfterSubmit:true}"
    	navigatorEditOptions="{height:280,reloadAfterSubmit:false}"
    	navigatorEdit="false"
    	navigatorView="false"
    	navigatorDelete="true"
    	navigatorDeleteOptions="{height:280,reloadAfterSubmit:true}"
    	navigatorExtraButtons="{
    		seperator: { 
    			title : 'seperator'  
    		}, 
    		hide : { 
	    		title : 'Show/Hide', 
	    		icon: 'ui-icon-wrench', 
	    		topic: 'showcolumns'
    		},
    		alert : { 
	    		title : 'Alert', 
	    		onclick: function(){ alert('Grid Button clicked!') }
    		}
    	}"
    	gridModel="gridModel"
    	rowList="10,15,20"
    	rowNum="15"
    	editurl="%{editurl}"
    	editinline="true"
    	onSelectRowTopics="rowselect"
    	onEditInlineSuccessTopics="oneditsuccess"
    	viewrecords="true"
    	width="700"
    	shrinkToFit="false"
    >
    	<sjg:gridColumn name="id" frozen="true" index="id" title="ID" width="60" formatter="integer" editable="false" sortable="false" search="true" searchoptions="{sopt:['eq','ne','lt','gt']}"/>
    	<sjg:gridColumn name="name" frozen="true" index="name" title="Name" width="250" editable="true" edittype="text" sortable="true" search="false"/>
    	<sjg:gridColumn name="lastName" index="lastName" title="Last Name" sortable="false"/>
    	<sjg:gridColumn name="firstName" index="firstName" title="First Name" sortable="false"/>
    	<sjg:gridColumn name="addressLine1" index="addressLine1" title="Adress" sortable="false"/>
    	<sjg:gridColumn name="country" index="country" title="Country" editable="true" edittype="select" editoptions="{value:'France:France;USA:USA;Australia:Australia;Norway:Norway;Poland:Poland;Germany:Germany;Spain:Spain'}" sortable="false" search="false"/>
    	<sjg:gridColumn name="city" index="city" title="City" editable="true" edittype="text" sortable="false" search="false"/>
    	<sjg:gridColumn name="creditLimit" index="creditLimit" title="Credit Limit" align="right" formatter="currency" editable="true" edittype="text" sortable="false" search="false"/>
    </sjg:grid>
	<br/>
    <sj:submit id="grid_edit_addbutton" value="Add Row" onClickTopics="rowadd" button="true"/>
    <sj:submit id="grid_edit_searchbutton" value="Search" onClickTopics="searchgrid" button="true"/>
    <sj:submit id="grid_edit_colsbutton" value="Show/Hide Columns" onClickTopics="showcolumns" button="true"/>
	<br/>
	<br/>
    <div id="gridinfo" class="ui-widget-content ui-corner-all"><p>Edit Mode for Row :</p></div>
    </div>
    <footer>
      <p>Copyright 2006-<%= Calendar.getInstance().get(Calendar.YEAR) %> MPS Ltd.</p>
    </footer>
  </div>
 
  <div class="clear"></div>
</body>
</html>