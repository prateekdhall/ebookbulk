<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<script type="text/javascript">

	function copy(cellvalue, options, rowObject) 
	{
		return "<a href='javascript:copyProject("+rowObject.projectId+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/copyPoject-icon.png' border='0' title='Copy Project'/></a>";
	}
	
	function copyProject(iPrjId)
	{
		location.href = "ebbs/copyProject.do?project.projectId="+iPrjId+"&module=<s:property value="%{@main.java.com.mps.wiley.common.Modules@PROJECT_SEARCH}"/>";
	}

	function edit(cellvalue, options, rowObject) 
	{
		return "<a href='javascript:editProject("+rowObject.projectId+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/edit-template-icon.png' border='0' title='View/Edit Project'/></a>";
	}
	
	function editProject(iPrjId)
	{
		var objForm = document.forms[0];
		objForm.action = "ebbs/viewProject.do?project.projectId="+iPrjId+"&module=<s:property value="%{@main.java.com.mps.wiley.common.Modules@PROJECT_SEARCH}"/>";
		objForm.submit();
	}

	function generate(cellvalue, options, rowObject) 
	{
		if (rowObject.soldQty > 0 && rowObject.stUrl!="")
		{
			return "<a id='generateCode' href='javascript:generateUrl("+rowObject.projectId+","+rowObject.urlFlag+","+rowObject.onceActive+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/generateurl.png' border='0' title='Share Url & Promo Codes' class='pop'/></a>";
		}
		else
		{
			return "";
		}
	}

	function generateUrl(iPrjId,iUrlFlag,iOnceActive)
	{
		$(".pop").click(function()
				{
					 $.fancybox([
				             {
								'href' : "ebbs/generateProjectUrl.do?projecturl.projectId="+iPrjId+"&state="+iUrlFlag+"&isActive="+iOnceActive
				                 //'href'  : 'ebbs/home.do'
				             }
				             ], {
							'width'				: '97%',		
							'autoScale'			: 'true',
							'transitionIn'		: 'elastic',
							'transitionOut'		: 'elastic',
							'type'				: 'iframe',
							'padding'			: '0',
							'margin'			: '0',
							'top'				: '0',
							'left'				: '0',
							'scrolling'   		: 'auto',
							 'onComplete' : function() {
								    $('#fancybox-frame').load(function() { // wait for frame to load and then gets it's height
								      $('#fancybox-content').height($(this).contents().find('body').height()+20);
								    });
								  }  		
						});
				});
	}

	function ecomp(cellvalue, options, rowObject) 
	{
		if (rowObject.ecomp == 1)
		{
			return "Yes";
		}
		else if (rowObject.ecomp == 0) 
		{
			return "No";
		}
		else
		{
			return "-";	
		}
	}

	function status(cellvalue, options, rowObject) 
	{
		if (rowObject.projectStatus == 1)
		{
			return "Pending";
		}
		else if (rowObject.projectStatus == 2) 
		{
			return "Active";
		} 
		else if (rowObject.projectStatus == 3) 
		{
			return "InActive";
		}
		else if (rowObject.projectStatus == 4) 
		{
			return "Deleted";
		}
		else
		{
			return "-";	
		}
	}

	function type(cellvalue, options, rowObject) 
	{
		if (rowObject.projectType == 1)
		{
			return "Single";
		}
		else if (rowObject.projectType == 2) 
		{
			return "Multiple";
		}
		else
		{
			return "-";	
		}
	}

	function check(cellvalue, options, rowObject) 
	{
		return cellvalue;
	}

</script>

<script>
function homePage()
{
	window.location = "ebbs/home.do";
}
</script>

      <div class="medium-spacer"></div>
      <s:form  method="post" namespace="/ebbs" action="searchProject" theme="css_xhtml">
      <fieldset>
      <legend>Search</legend>
      <div class="col-1">
        <s:textfield key="searchProject.projectId" labelSeparator=" :" theme="xhtml" maxlength="9" tabindex="1"/>
        <s:hidden name="firstFlag" value="1"/>
      </div>
      
    
      <div class="col-2">
      
       <s:select key="searchProject.customer.value" labelSeparator=" :" cssClass="select-width" list="customerList" listKey="companyName" listValue="companyName" headerKey="" headerValue="Please Select" theme="xhtml" cssErrorClass="error-alert" tabindex="6"/>
 
<%--   <s:textfield key="searchProject.customer.value" theme="xhtml" id="customerId" maxlength="50"/> --%>
      
<%-- 
       <s:url id="remoteurl" action="autoCompleterAction?moduleId=2&componentId=1"/>
        <sj:autocompleter        
        key="searchProject.customer.value"
        id="customer"
        href="%{remoteurl}"
        delay="50"
        loadMinimumCount="3" 
        loadingText ="false"
        timeout = "3000"
        targets="true"
        maxlength="50"
        />
 --%>
    
       </div>
       
      <div class="clear"></div>
      <div class="col-1">
      
        <s:textfield key="searchProject.projectName" labelSeparator=" :" theme="xhtml" maxlength="20" tabindex="2"/> 

<%--       
        <s:url id="remoteurl" action="autoCompleterAction?moduleId=1&componentId=1"/>
        <sj:autocompleter        
        key="searchProject.projectName"
        id="prjName"
        href="%{remoteurl}"
        delay="50"
        loadMinimumCount="3" 
        loadingText ="false"
        timeout = "3000"
        targets="true"
        maxlength="50"
             
        /> 
 --%>

      </div>
      <div class="col-2">
      
       <s:select key="searchProject.requester.value" labelSeparator=" :" list="adminList" listKey="userName" listValue="userName" headerKey="" headerValue="Please Select" theme="xhtml" cssErrorClass="error-alert" tabindex="7"/>
      
<%--         <s:textfield key="searchProject.requester.value" theme="xhtml" maxlength="50"/> --%>

<%--        
        <s:url id="remoteurl" action="autoCompleterAction?moduleId=3&componentId=1"/>
        <sj:autocompleter        
        key="searchProject.requester.value"
        id="requester"
        href="%{remoteurl}"
        delay="50"
        loadMinimumCount="3" 
        loadingText ="false"
        timeout = "3000"
        targets="true"
        maxlength="50"
        />
--%>
        
      </div>
      <div class="clear"></div>
      <div class="col-1">
        <s:textfield key="searchProject.createdBy" labelSeparator=" :" theme="xhtml" maxlength="100" tabindex="3"/>
      <!-- this feild is used for Title -->
      </div>
      <div class="col-2">
      
        <s:select key="searchProject.prjAdmin.value" labelSeparator=" :" list="adminList" listKey="userName" listValue="userName" headerKey="" headerValue="Please Select" theme="xhtml" cssErrorClass="error-alert" tabindex="8"/>
      
<%--    <s:textfield key="searchProject.prjAdmin.value" theme="xhtml" maxlength="50"/> --%>

<%--        
        <s:url id="remoteurl" action="autoCompleterAction?moduleId=3&componentId=1"/>
        <sj:autocompleter        
        key="searchProject.prjAdmin.value"
        id="prjAdmin"
        href="%{remoteurl}"
        delay="50"
        loadMinimumCount="3" 
        loadingText ="false"
        timeout = "3000"
        targets="true"
        maxlength="50"
        />
 --%>
        
      </div>
      <div class="clear"></div>
      <div class="col-1">
        <s:select key="searchProject.projectType" labelSeparator=" :" list="#{'1':'Single','2':'Mutiple'}" headerKey="-1" headerValue="Please Select" theme="xhtml" tabindex="4"/>
      </div>
      <div class="col-2">
        <s:select key="searchProject.ecomp" labelSeparator=" :" list="#{'1':'Yes','0':'No'}" headerKey="-1" headerValue="Please Select" theme="xhtml" tabindex="9"/>
      </div>
      <div class="clear"></div>
      <div class="col-1">
        <s:select label="Project Status" labelSeparator=" :" name="statusArray" multiple="true" list="#{'1':'Pending','2':'Active','3':'InActive','4':'Deleted'}" theme="xhtml" tabindex="5"/>
        <s:hidden name="status"/>
      </div>
      <div class="clear"></div>
      </fieldset>
      <div class="btnWrapper">
        <s:submit label="Search" theme="simple" cssClass="submit_btn" />
		<s:reset value="Cancel" theme="simple" cssClass="submit_btn"  onclick="javascript:homePage()"/>
      </div>
      </s:form>
<div class="clear"></div>
<s:div>
<s:if test="%{firstFlag==1}">
		<div class="utility-block" hidden="true">
			<div class="exportResults">
				Export Result As: <img src="img/csv.gif"> <a href="downloadURLs.xls"><img border="0" alt="" src="img/xls.gif"></a>
			</div>
		</div>
		<s:url id="remoteurl" action="projectGridAction" escapeAmp="false">
			<s:param name="projectId" value="searchProject.projectId" />
			<s:param name="projectName" value="searchProject.projectName" />
			<s:param name="requester.value" value="searchProject.requester.value" />
			<s:param name="prjAdmin.value" value="searchProject.prjAdmin.value" />
			<s:param name="customer.value" value="searchProject.customer.value" />
			<s:param name="projectType" value="searchProject.projectType" />
			<s:param name="ecomp" value="searchProject.ecomp" />
			<s:param name="status" value="status" />
			<s:param name="createdBy" value="searchProject.createdBy" />
			<s:param name="module" value="@main.java.com.mps.wiley.common.Modules@PROJECT_SEARCH" />
		</s:url>
		<sjg:grid id="gridedittable"
		   	caption=""
		    dataType="json"
		   	href="%{remoteurl}"
		   	pager="true"
		   	navigator="true"
		   	navigatorAdd="false"
		   	navigatorEdit="false"
		   	navigatorDelete="false"
		   	navigatorSearch="false"
		   	navigatorView="false"
		   	navigatorRefresh="false"
		   	gridModel="projectGridModel"
		   	rowList="30,40,50"
		   	rowNum="30"
		   	editinline="false"
		   	onSelectRowTopics="rowselect"
		   	viewrecords="true"
			height="110"
			width="908"
		   	shrinkToFit="false">

			<sjg:gridColumn name="editId" index="projectId" title="" width="20" sortable="false" formatter="edit"/>
			<s:if test="%{@main.java.com.mps.common.AppSystem@ROLES_MAP[#session[@main.java.com.mps.wiley.common.AppConstants@USER_OBJECT].roleId].roleRights=='RW'}">
		    	<sjg:gridColumn name="selectId" index="projectId" title="" width="20" sortable="false" formatter="copy"/>
		    </s:if>
		   	<sjg:gridColumn name="generateId" index="projectId" title="" width="20" sortable="false" formatter="generate" />
		   	<sjg:gridColumn name="projectName" index="projectName" title="Project Name" width="100" formatter="check" sortable="true"/>
		   	<sjg:gridColumn name="customer.value" value="customer.value" index="customer.value" title="Customer" width="100" sortable="true" />
		   	<sjg:gridColumn name="requester.value" value="requester.value" index="Requester" title="Requestor" width="100" sortable="true" />
		   	<sjg:gridColumn name="prjAdmin.value" value="prjAdmin.value" index="prjAdmin.value" title="Project Admin" width="100" sortable="true" />
		   	<sjg:gridColumn name="projectType" index="projectType" title="Project Type" width="80" sortable="true" formatter="type" />
		   	<sjg:gridColumn name="ecomp" index="ecomp" title="eComp" width="60" sortable="true" formatter="ecomp"/>
		   	<sjg:gridColumn name="notes" index="notes" title="Identifier(ISBN/ISSN/SKU)" width="100" sortable="true"/>
		   	<sjg:gridColumn name="template" index="template" title="Template" width="100" sortable="true"/>
		   	<sjg:gridColumn name="projectStatus" index="projectStatus" title="Status" width="80" formatter="status" sortable="true" />
		</sjg:grid>
</s:if>
</s:div>
  <div class="clear"></div>
  
<script type="text/javascript">
	function onLoad()
	{
		var objForm = document.forms[0];
		var status = objForm["status"].value.split(',');
		for(var i=0;i<status.length;i++)
		{
			objForm["statusArray"][status[i]-1].selected=true;
		}
	}
	onLoad();
</script>