<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<script>
 
function copy(cellvalue, options, rowObject) 
{
	return "<a href='javascript:copyProject("+rowObject.projectId+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/copyPoject-icon.png' border='0' title='Copy Project'/></a>";
}

function copyProject(iPrjId)
{
	location.href = "ebbs/copyProject.do?project.projectId="+iPrjId+"&module=<s:property value="%{@main.java.com.mps.wiley.common.Modules@MY_PROJECT}"/>";
}

function edit(cellvalue, options, rowObject) 
{
	return "<a href='javascript:editProject("+rowObject.projectId+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/edit-template-icon.png' border='0' title='View/Edit Project'/></a>";
}

function editProject(iPrjId)
{
	location.href = "ebbs/viewProject.do?project.projectId="+iPrjId+"&module=<s:property value="%{@main.java.com.mps.wiley.common.Modules@MY_PROJECT}"/>";
}

function callProject(cellvalue, options, rowObject) 
{
	return cellvalue;
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

function formatExportXLS(cellvalue, options, rowObject) 
{
	return "<a href='./ebbs/myprojectXls.do?project.projectStatus="+ rowObject.projectStatus+ "' style='text-decoration: none;'  title='Export Excel File'>"+ rowObject.thresoldQty + "</a>";
}

function formatExportCSV(cellvalue, options, rowObject) 
{
	return "<a href='./ebbs/myprojectCsv.do?project.projectStatus="+ rowObject.projectStatus+ "' style='text-decoration: none;' title='Export CSV File'>"+ rowObject.thresoldQty + "</a>";
}

datePick = function date(cellvalue, options, rowObject) 
{
	$(elem).datepicker();
	$('#ui-datepicker-div').css("z-index", 2000);
}
</script>
<script type="text/javascript">
$(function () {
$('#availableDate').datepicker({
dateFormat: 'dd-M-yy',
numberOfMonths: 2,
autoSize: true,
changeMonth: true,
changeYear: true,
showButtonPanel: true,
maxDate: 0
});
});
</script>
<div class="utility-block">
	<s:url id="xls" action="myProjectReport.do">
	</s:url>
	<div class="exportResults">
		Export Result As: 
		<a href="${xls}" id="exportxls"><img src="webresources/img/xls.gif"></a>
	</div>
</div> 

<s:if test="%{project.projectStatus==1}">
	<s:set var="caption" value="%{'In Progress'}" />
</s:if>
<s:elseif test="%{project.projectStatus==2}">
	<s:set var="caption" value="%{'Active'}" />
</s:elseif>
<s:elseif test="%{project.projectStatus==3}">
	<s:set var="caption" value="%{'In Active'}" />
</s:elseif>

<s:url id="remoteurl" action="projectGridAction" escapeAmp="false">
	<s:param name="project.projectStatus" value="project.projectStatus"/>
	<s:param name="module" value="@main.java.com.mps.wiley.common.Modules@MY_PROJECT" />
</s:url>
<sjg:grid	
    id="gridtable%{project.projectStatus}" 
    caption="%{caption}"
    formIds="mygridtable%{project.projectStatus}"  
    reloadTopics="reloadGrid"  
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
   	rowList="10,20,30,40,50"
   	editinline="false"
   	onSelectRowTopics="rowselect"
   	viewrecords="true"
	height="110"
	width="908"
   	rowNum="10"
   	page="1"
 	sortname="projectName"
 	sortorder="desc"
   	shrinkToFit="false">

	<sjg:gridColumn name="editId" index="projectId" title="" width="20" sortable="false" formatter="edit"/>
   	<sjg:gridColumn name="selectId" index="projectId" title="" width="20" sortable="false" formatter="copy"/>
	<s:if test="%{project.projectStatus!=3}">
	   	<sjg:gridColumn name="generateId" index="projectId" title="" width="20" sortable="false" formatter="generate" />
	</s:if>
	<sjg:gridColumn name="customer.value" index="customer.value" title="Customer" dataType="text" editable="true"  sortable="true"/>
	<sjg:gridColumn name="projectName" index="projectName" title="Project" width="200" dataType="text" editable="true" formatter="callProject" sortable="true"/>
   	<sjg:gridColumn name="template" index="template" title="Title" width="375" sortable="true"/>
   	<sjg:gridColumn name="notes" index="notes" title="Identifier" width="150" sortable="true"/>

</sjg:grid>
