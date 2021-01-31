<%@page import="main.java.com.mps.common.AppSystem"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<tiles:useAttribute name="action" id="iAction"/>
<s:set var="objStatus" value="project.projectStatus"/>
<s:set var="onceActiveStatus" value="project.onceActive"/>
<s:if test="#onceActiveStatus==1">
	<s:set var="objKFDisable" value="%{'true'}"/>
	<s:set var="objGridDisable" value="%{'false'}"/>
</s:if>
<s:else>
	<s:set var="objKFDisable" value="%{'false'}"/>
	<s:set var="objGridDisable" value="%{'true'}"/>
</s:else>
<s:if test="#objStatus==2">
	<s:set var="objDisable" value="%{'true'}"/>
	<s:set var="objKFDisable" value="%{'true'}"/>
	<s:set var="objGridDisable" value="%{'false'}"/>
	<s:set var="objDateClass" value="%{''}"/>
</s:if>
<s:else>
	<s:set var="objDisable" value="%{'false'}"/>
	<s:set var="objDateClass" value="%{'datepickerNoTimeNoBack'}"/>
</s:else>
<%
final boolean blnAdd = iAction.equals("add");

%>
<script type="text/javascript">

		function threshholdQuantityCheck()
		{
			var objSoldQuantity = document.getElementById('soldQuantity').value;
			var objBackupQuantity = document.getElementById('backupQuantity').value;
			if(objSoldQuantity=='')
				objSoldQuantity=0;
			if(objBackupQuantity=='')
				objBackupQuantity=0;
			var sumQuantity=parseInt(objSoldQuantity)+parseInt(objBackupQuantity);
			if(parseInt(document.getElementById("threshholdQuantity").value)>sumQuantity)
			{
				alert("Threshhold Quantity cannot be greater than sum of Sold quantity and Backup quantity.");
				setTimeout("document.getElementById('threshholdQuantity').focus();",0);
				return false;
			}
			else
			{
				return true;
			}
		}

		function onblurQuantity(id, msg)
		{
			var onceActive="";
			onceActive=document.getElementById('onceActiveID').value;
			if(onceActive==null || onceActive=="")
			{
				onceActive="0";
			}
			//alert(id);
			//alert(sumQuantity);
			//alert(parseInt(document.getElementById(id).value));
			if(onceActive=="1")
			{
				//alert(document.getElementById(id).value);
				//alert(document.getElementById('hidden'+id).value);
				var objId = document.getElementById(id).value;
				var objHidId = document.getElementById('hidden'+id).value;
				if(objId=='')
					objId=0;
				if(objHidId=='')
					objHidId=0;
				if(parseInt(objId)<parseInt(objHidId))
			   	{
			   		alert("Entered Value cannot be less than last saved "+msg+" quantity.");
			   		setTimeout("document.getElementById('"+id+"').focus();",0);
			   		return false;
			   	}
			   	else
			   	{
				   	return true;
			   	}
			}
		   	else
		   	{
			   	return true;
		   	}
		}


		function upload(cellvalue, options, rowObject) 
		{
			return "<a href='javascript:uploadFile("+rowObject.fileId+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/upload.gif'></a>";
		}
		
		function uploadFile(iFileId)
		{
			//alert("iFileId: "+iFileId);
		}
		
		function formatPublicationDate(cellvalue, options, rowObject) 
		{
			var val = cellvalue;
			var year = val.substring(0,4);
			var month = val.substring(5,7);
 			var day = val.substring(8,10);
 			val = month + "/" + day + "/" + year;
			return val;
		}
		
		function toggleDisable(objForm, blnFlag)
		{
			objForm["project.prjAdmin.id"].disabled = blnFlag;
			objForm["project.projectName"].disabled = blnFlag;
			objForm["project.requester.id"].disabled = blnFlag;
			objForm["project.projectStatus"].disabled = blnFlag;
			objForm["project.customer.id"].disabled = blnFlag;
			objForm["project.notes"].disabled = blnFlag;
			objForm["project.projectType"].disabled = blnFlag;
			objForm["project.ecomp"].disabled = blnFlag;
			objForm["project.drm"].disabled = blnFlag;
			objForm["project.registration"].disabled = blnFlag;
			objForm["project.soldQty"].disabled = blnFlag;
			objForm["project.promoCode"].disabled = blnFlag;
			objForm["project.backupQty"].disabled = blnFlag;
			objForm["project.stUrl"].disabled = blnFlag;
			objForm["project.thresoldQty"].disabled = blnFlag;
		}
		
		function beforeSubmit()
		{
			var objForm = document.forms[0];
			toggleDisable(objForm, false);
			backupDisabled();
			var oldStatus = '<s:property value="project.projectStatus"/>';
			var blnReturn = true;
			blnReturn = onblurQuantity("soldQuantity", "Sold");
			if(!blnReturn)
			{
				return false;
			}	
			blnReturn = onblurQuantity("backupQuantity", "Backup");
			if(!blnReturn)
			{
				return false;
			}	
			blnReturn = threshholdQuantityCheck();
			if(!blnReturn)
			{
				return false;
			}
			if(oldStatus != 2)
			{
				if(objForm["project.projectStatus"].value==2)
				{
					if(!checkOldFields(objForm))
					{
						alert('Project Status & other changes in project information not allowed in the same project update. \nAll changes except Project Status saved.');
						objForm["project.projectStatus"].value=1;
						return true;
					}
					else
					{
						if(objForm["project.urlFlag"].value==0 || objForm["project.contentFlag"].value==0 || objForm["project.templateFlag"].value==0)
						{
							if(objForm["project.urlFlag"].value==0 && objForm["project.contentFlag"].value==0 && objForm["project.templateFlag"].value==0)
							{
								blnReturn = confirm("*  URLs & Promo codes not shared with Customer \n*  File(s) still not in Content Store \n*  Website Page still not deployed \n\nDo you wish to Continue making project Active (Y/N)?");
							}
							else if(objForm["project.urlFlag"].value==0 && objForm["project.contentFlag"].value==0)
							{
								blnReturn = confirm("*  URLs & Promo codes not shared with Customer \n*  File(s) still not in Content Store \n\nDo you wish to Continue making project Active (Y/N)?");
							}
							else if(objForm["project.urlFlag"].value==0 && objForm["project.templateFlag"].value==0)
							{
								blnReturn = confirm("*  URLs & Promo codes not shared with Customer \n*  Website Page still not deployed \n\nDo you wish to Continue making project Active (Y/N)?");
							}
							else if(objForm["project.contentFlag"].value==0 && objForm["project.templateFlag"].value==0)
							{
								blnReturn = confirm("*  File(s) still not in Content Store \n*  Website Page still not deployed \n\nDo you wish to Continue making project Active (Y/N)?");
							}
							else if(objForm["project.urlFlag"].value==0)
							{
								blnReturn = confirm("*  URLs & Promo codes not shared with Customer \n\nDo you wish to Continue making project Active (Y/N)?");
							}
							else if(objForm["project.contentFlag"].value==0)
							{
								blnReturn = confirm("*  File(s) still not in Content Store \n\nDo you wish to Continue making project Active (Y/N)?");
							}
							else
							{
								blnReturn = confirm("*  Website Page still not deployed \n\nDo you wish to Continue making project Active (Y/N)?");
							}
						}
						return blnReturn;
					}
				}
				else
				{
					return true;
				}
			}
			else
			{
				return true;
			}
		}
		
		function checkOldFields(objForm)
		{
			var oldProjectType = '<s:property value="project.projectType"/>';
			var oldEcomp = '<s:property value="project.ecomp"/>';
			var oldSTUrl = '<s:property value="project.stUrl"/>';
			var oldDrmType = '<s:property value="project.drm"/>';
			var oldProjectAdmin = '<s:property value="project.prjAdmin.id"/>';
			var oldRequstor = '<s:property value="project.requester.id"/>';
			var oldCustomer = '<s:property value="project.customer.id"/>';
			var oldContentFlag = '<s:property value="project.projectStatus"/>';
			var oldPromoFlag = '<s:property value="project.projectStatus"/>';
			var oldTemplateFlag = '<s:property value="project.projectStatus"/>';

// 			var newProjectType = objForm["project.projectType"].value;
// 			var newEcomp = objForm["project.ecomp"].value;
// 			var newSTUrl = objForm["project.stUrl"].value;
// 			var newDrmType = objForm["project.drm"].value;
// 			var newProjectAdmin = objForm["project.prjAdmin.id"].value;
// 			var newRequstor = objForm["project.requester.id"].value;
// 			var newCustomer = objForm["project.customer.id"].value;
// 			var newContentFlag = objForm["project.projectStatus"].value;
// 			var newPromoFlag = objForm["project.projectStatus"].value;
// 			var newTemplateFlag = objForm["project.projectStatus"].value;

			if(oldProjectType!=objForm["project.projectType"].value)
			{
				return false;
			}
			if(oldEcomp!=objForm["project.ecomp"].value)
			{
				return false;
			}
			if(oldSTUrl!=objForm["project.stUrl"].value)
			{
				return false;
			}
			if(oldDrmType!=objForm["project.drm"].value)
			{
				return false;
			}
			if(oldProjectAdmin!=objForm["project.prjAdmin.id"].value)
			{
				return false;
			}
			if(oldRequstor!=objForm["project.requester.id"].value)
			{
				return false;
			}
			if(oldCustomer!=objForm["project.customer.id"].value)
			{
				return false;
			}
			return true;
		}
</script>

<script type="text/javascript">

$(document).ready(function(){
	
	function makeArray() 
	{
		for (i = 0; i<makeArray.arguments.length; i++)
		this[i + 1] = makeArray.arguments[i];
	}
	
	var months = new makeArray('Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec');
	
	if (jQuery("#availableDateId").val()=='')
	{
		var d1=new Date();
//		jQuery("#availableDateId").val((d1.getMonth()+1)+"/"+(d1.getDate())+"/"+d1.getFullYear()+" "+d1.getHours()+":"+d1.getMinutes());

		var minStr = new String(d1.getMinutes());
		if(minStr.length == 1){minStr = "0".concat(minStr);}
		
		var secStr = new String(d1.getSeconds());
		if(secStr.length == 1){secStr = "0".concat(secStr);}

		jQuery("#availableDateId").val((d1.getDate())+"-"+months[(d1.getMonth()+1)]+"-"+d1.getFullYear()+" "+d1.getHours()+":"+minStr+":"+secStr);     
	}
	if (jQuery("#expiryDateId").val()=='')
	{
		var d2=new Date(d1);
		d2.setMonth(d2.getMonth()+18);
//		jQuery("#expiryDateId").val((d2.getMonth()+1)+"/"+(d2.getDate())+"/"+d2.getFullYear()+" "+d2.getHours()+":"+d2.getMinutes());
		jQuery("#expiryDateId").val((d2.getDate())+"-"+months[(d2.getMonth()+1)]+"-"+d2.getFullYear()+" "+d2.getHours()+":"+minStr+":"+secStr);
	}
	if (jQuery("#thresoldDateId").val()=='')
	{
		var d3=new Date(d2);
		d3.setMonth(d3.getMonth()-2);
//		jQuery("#thresoldDateId").val((d3.getMonth()+1)+"/"+(d3.getDate())+"/"+d3.getFullYear()+" "+d3.getHours()+":"+d3.getMinutes());
		jQuery("#thresoldDateId").val((d3.getDate())+"-"+months[(d3.getMonth()+1)]+"-"+d3.getFullYear()+" "+d3.getHours()+":"+minStr+":"+secStr);
	}

// 	var d=new Date(jQuery("#availableDateId").val());
// 	jQuery("#availableDateId").val((d.getDate())+"-"+months[(d.getMonth()+1)]+"-"+d.getFullYear()+" "+d.getHours()+":"+d.getMinutes());
	
// 	var d=new Date(jQuery("#expiryDateId").val());
// 	jQuery("#expiryDateId").val((d.getDate())+"-"+months[(d.getMonth()+1)]+"-"+d.getFullYear()+" "+d.getHours()+":"+d.getMinutes());
	
// 	var d=new Date(jQuery("#thresoldDateId").val());
// 	jQuery("#thresoldDateId").val((d.getDate())+"-"+months[(d.getMonth()+1)]+"-"+d.getFullYear()+" "+d.getHours()+":"+d.getMinutes());
	
})

function backupDisabled()
{
	var objForm = document.forms[0];
	var typeVal="";
	typeVal=document.getElementById('projectTypeId').value;
	if(objForm["project.projectStatus"].value!=2)
	{
		if(typeVal=="1")
		{
			document.getElementById('backupQuantity').readOnly=false;
		}
		else if(typeVal=="2")	
		{
			document.getElementById('backupQuantity').value="0";
			document.getElementById('backupQuantity').readOnly=true;
		}
	}
}
</script>

<div class="medium-spacer"></div>
<!--Project Details-->
<fieldset>
	<legend><s:text name="label.project"/></legend>
	<div class="col-1">
	<s:hidden name="module"/>
		<s:textfield key="project.projectId" cssClass="txtread-only" labelSeparator=" :" theme="xhtml" readonly="true"/>
		<span class="tip"><s:text name="label.auto-generated"/></span>
	</div>
	<div class="col-2">
	
		<s:select 	key="project.prjAdmin.id" 
					list="adminList" 
					listKey="usrId" 
					listValue="userName" 
					headerKey="-1" 
					headerValue="Please Select" 
					theme="xhtml" required="true" 
					labelSeparator=" :" 
					cssErrorClass="error-alert"
					disabled="#objKFDisable"
					tabindex="3"
		/>
 
<%--		
		<sj:autocompleter
    				key="project.prjAdmin.id"
    				list="adminList"
    				listKey="usrId"
    				listValue="userName"
    				selectBox="false"
    				selectBoxIcon="false"
    				required="true"
    				requiredposition="right"
    				labelSeparator=" :"
    				cssErrorClass="error-alert"
    				value="false"
    			/>
--%>		
		
	
	</div>
	<div class="clear"></div>
	<div class="col-1">
		<s:textfield key="project.projectName" maxlength="20" theme="xhtml" required="true" labelSeparator=" :" cssErrorClass="error-alert" disabled="#objDisable" tabindex="1"/>
	</div>
	<div class="col-2">
 		<s:select key="project.requester.id" list="adminList" listKey="usrId" listValue="userName" headerKey="-1" headerValue="Please Select" theme="xhtml" required="true" labelSeparator=" :" cssErrorClass="error-alert" disabled="#objKFDisable" tabindex="4"/> 
		
<%--		
		<sj:autocompleter
    				key="project.requester.id"
    				list="requesterList"
    				listKey="usrId"
    				listValue="userName"
    				selectBox="true"
    				selectBoxIcon="true"
    				required="true"
    				requiredposition="right"
    				labelSeparator=" :"
    				cssErrorClass="error-alert"
    	/>
--%>		
	</div>
	<div class="clear"></div>
	<div class="col-1">
		<%
		if(blnAdd)
		{
			%><s:select key="project.projectStatus" list="#{'1':'Pending'}" labelSeparator=" :" theme="xhtml" disabled="true" tabindex="2"/><%
		}
		else
		{
			%>
			<s:if test="#objStatus==1">
				<s:select key="project.projectStatus" list="#{'1':'Pending','2':'Active','4':'Delete'}" labelSeparator=" :" theme="xhtml" disabled="#objDisable"/>
			</s:if>
			<s:elseif test="#objStatus==2">
				<s:select key="project.projectStatus" list="#{'1':'Pending','2':'Active','3':'InActive'}" labelSeparator=" :" theme="xhtml" disabled="false"/>
			</s:elseif>
			<s:elseif test="#objStatus==3">
				<s:select key="project.projectStatus" list="#{'1':'Pending','3':'InActive','4':'Delete'}" labelSeparator=" :" theme="xhtml" disabled="#objDisable"/>
			</s:elseif>
			<s:elseif test="#objStatus==4">
				<s:select key="project.projectStatus" list="#{'4':'Delete'}" labelSeparator=" :" theme="xhtml" disabled="#objDisable"/>
			</s:elseif>
			<%
		}
		%>
	</div>
	<div class="col-2" style="width:50%">
		<s:select key="project.customer.id" cssClass="select-width" list="customerList" listKey="customerId" listValue="companyName" headerKey="-1" headerValue="Please Select" theme="xhtml" required="true" labelSeparator=" :" cssErrorClass="error-alert" disabled="#objKFDisable" tabindex="5"/>
		
 <%--		
		<sj:autocompleter
    				key="project.customer.id"
    				list="customerList"
    				listKey="customerId"
    				listValue="companyName"
    				selectBox="true"
    				selectBoxIcon="true"
    				required="true"
    				requiredposition="right"
    				labelSeparator=" :"
    				cssErrorClass="error-alert"
    	/>
--%>
		
		<s:if test="#objStatus!=2">
			<s:a action="createCustomer.do" id="event1"><img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/create-customer.png" title="Add Customer" /></s:a>
			<s:a action="searchCustomer.do" id="event2"><img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/search-customer.png" title="Edit Customer" /></s:a>
		</s:if>
<%-- 		<s:else> --%>
<%-- 			<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/create-customer.png" title="Add Customer" /> --%>
<%-- 			<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/search-customer.png" title="Edit Customer" /> --%>
<%-- 		</s:else> --%>
	</div>
	<div class="col-1 expanded">
		<s:textarea key="project.notes" cols="121" labelSeparator=" :" theme="xhtml" disabled="#objDisable" tabindex="6"/>
	</div>
	<div class="clear"></div>
</fieldset>
<div class="medium-spacer"></div>
<!--Specification-->
<fieldset>
	<legend><s:text name="label.specification"/></legend>
	<div class="col-1">
		<s:select key="project.projectType" cssClass="small" list="#{'1':'Single','2':'Mutiple'}" labelSeparator=" :" theme="xhtml" disabled="#objKFDisable" onchange="backupDisabled()" id="projectTypeId" tabindex="7"/>
	</div>
	<div class="col-2">
	
<%-- 			<sj:datepicker key="project.availableDate" id="availableDateId" displayFormat="MM/dd/yyyy hh:mm" cssClass="datepickerNoTime" readonly="false"/> --%>
	
<%-- 		<s:date name="project.availableDate" var="availableDateVal" format="MM/dd/yyyy hh:mm" /> --%>
<%-- 		<s:textfield key="project.availableDate" id="availableDateId" value="%{#availableDateVal}" theme="xhtml" cssClass="datepickerNoTime" readonly="true"/> --%>
			
			<s:textfield key="project.availableDate" id="availableDateId" labelSeparator=" :" theme="xhtml" cssClass="%{objDateClass}" readonly="true" tabindex="11"/>
	</div>
	<div class="clear"></div>
	<div class="col-1">
		<s:select key="project.ecomp" cssClass="small" list="#{'0':'No','1':'Yes'}" labelSeparator=" :" theme="xhtml" disabled="#objKFDisable" tabindex="8"/>
	</div>
	<div class="col-2">
<%-- 		<s:date name="project.expiryDate" var="expiryDateVal" format="MM/dd/yyyy hh:mm" /> --%>
<%-- 		<s:textfield key="project.expiryDate" id="expiryDateId" value="%{#availableDateVal}" cssClass="datepickerNoTime" theme="xhtml" readonly="true" cssErrorClass="error-alert"/> --%>

			<s:textfield key="project.expiryDate" id="expiryDateId" cssClass="%{objDateClass}" labelSeparator=" :" theme="xhtml" readonly="true" cssErrorClass="error-alert" tabindex="12"/>
	</div>
	<div class="clear"></div>
	<div class="col-1">
		<s:select key="project.drm" cssClass="small" list="#{'0':'No','1':'Yes'}" labelSeparator=" :" theme="xhtml" disabled="true"/>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<s:if test="#onceActiveStatus==0">
			<s:if test="#objStatus!=2">
				<s:a action="drmDefineProject.do" id="drmdefine">
				<strong tabindex="9">Define</strong>
				</s:a>
			</s:if>
		</s:if>
		<s:hidden name="project.printAllowed" id="printAllowedId" value="0"/>
		<s:hidden name="project.copyAllowed" id="copyAllowedId" value="0"/>
		<s:hidden name="project.conversionAllowed" id="conversionAllowedId" value="0"/>
	</div>
	<div class="col-2">
<%-- 		<s:date name="project.thresoldDate" var="thresoldDateVal" format="MM/dd/yyyy hh:mm" /> --%>
<%-- 		<s:textfield key="project.thresoldDate" id="thresoldDateId" value="%{#thresoldDateVal}" cssClass="datepickerNoTime" theme="xhtml" readonly="true" cssErrorClass="error-alert"/> --%>

			<s:textfield key="project.thresoldDate" id="thresoldDateId" cssClass="%{objDateClass}" labelSeparator=" :" theme="xhtml" readonly="true" cssErrorClass="error-alert" tabindex="13"/>
	</div>
	<div class="clear"></div>
	<div class="col-1">
		<s:select key="project.registration" cssClass="small" list="#{'0':'No','1':'Yes'}" labelSeparator=" :" theme="xhtml" disabled="true"/>
	</div>
	<div class="col-2">
		<s:textfield key="project.soldQty" maxlength="4" labelSeparator=" :" theme="xhtml" disabled="#objDisable" onkeypress="return numericOnly(event);" id="soldQuantity" tabindex="14"/>
	</div>
	<div class="clear"></div>
	<div class="col-1">
		<s:select key="project.promoCode" cssClass="small" list="#{'0':'No','1':'Yes'}" labelSeparator=" :" theme="xhtml" disabled="true"/>
	</div>
	<div class="col-2">
		<s:textfield key="project.backupQty" maxlength="4" labelSeparator=" :" theme="xhtml" disabled="#objDisable" onkeypress="return numericOnly(event);" id="backupQuantity" tabindex="15"/>
	</div>
	<div class="clear"></div>
	<div class="col-1">
		<s:textfield key="project.stUrl" maxlength="255" labelSeparator=" :" theme="xhtml" disabled="#objKFDisable" tabindex="10"/>
		<span style="margin:200px"><s:text name="label.sampleurl"/></span>
	</div>
	<div class="col-2">
		<s:textfield key="project.thresoldQty" maxlength="4" labelSeparator=" :" theme="xhtml" disabled="#objDisable" onkeypress="return numericOnly(event);" id="threshholdQuantity" tabindex="16"/>
	</div>
	
	<div class="col-2" hidden="true">
		<s:hidden name="actionName" label="Action Name" theme="xhtml"/>
	</div>
	
	
	<s:set var="urlStatus" value="project.urlFlag"/>
	
	<!--<s:if test="#urlStatus==0">
		<strong>Generate</strong>
	</s:if>
	<s:elseif test="#urlStatus==1">
	<s:a action="generateProjectUrl.do?projecturl.projectId=%{project.projectId}&state=%{project.urlFlag}" id="projectUrl" >
		<strong>Generate</strong>
	</s:a>
	</s:elseif>-->
	<s:hidden id="onceActiveID" name="project.onceActive"></s:hidden>
	<s:hidden id="urlFlagId" name="project.urlFlag"></s:hidden>
	<s:hidden id="contentFlagId" name="project.contentFlag"></s:hidden>
	<s:hidden id="templateFlagId" name="project.templateFlag"></s:hidden>
	
	
	<div class="clear"></div>
</fieldset>

<s:hidden id="hiddensoldQuantity" value="%{project.soldQty}" />
<s:hidden id="hiddenbackupQuantity" value="%{project.backupQty}" />
<s:hidden id="hiddenthreshholdQuantity" value="%{project.thresoldQty}" />
<div class="medium-spacer"></div>
<div class="clear"></div>
<!--Content-->
<fieldset>
	<legend>Content</legend>
	<!--Grid-->
	<s:url id="remoteurl" action="contentFileGridAction"><s:param name="projectId" value="project.projectId"/></s:url>
	<s:url id="editurl" action="editContentFileGrid"><s:param name="projectId" value="project.projectId"/></s:url>
	<sjg:grid 
		id="contentFileGridId" 
		caption="" 
		dataType="json"
		href="%{remoteurl}" 
		pager="true" 
		navigator="true"
		navigatorAddOptions="{height:250,reloadAfterSubmit:true}"
		navigatorEditOptions="{height:250,reloadAfterSubmit:true,closeAfterEdit:true}"
		navigatorDeleteOptions="{height:100,reloadAfterSubmit:true}"
		navigatorAdd="#objGridDisable" 
		navigatorEdit="#objGridDisable" 
		navigatorDelete="#objGridDisable" 
		navigatorSearch="false"
		navigatorView="false" 
		navigatorRefresh="false"
		gridModel="contentFileGridModel" 
		rowList="2,5,10,20" 
		rowNum="10"
		editurl="%{editurl}" 
		editinline="false" 
		onSelectRowTopics="rowselect"
		viewrecords="true" 
		height="110" 
		width="908"
		shrinkToFit="false">
		
		<sjg:gridColumn name="cfId" index="cfId" title="CF ID" width="100" formatter="integer" key="true" hidden="true"/>
		<sjg:gridColumn name="fileId" index="fileId" title="Identifier(ISBN/ISSN/SKU)" width="150" sortable="true" editable="true" formoptions=" {label:'Identifier(ISBN/ISSN/SKU) *'}" editrules="{ required: true }"/>
		<sjg:gridColumn name="title" index="title" title="Title" width="150" sortable="true" editable="true"  />
		<sjg:gridColumn name="authors" index="authors" title="Authors" width="150" sortable="true" editable="true" />
		<sjg:gridColumn name="noOfPages" index="noOfPages" title="No. of Pages" width="100" sortable="true" editable="true" editrules="{ number:true }"/>
<%-- 		<sjg:gridColumn name="publicationDate" index="publicationDate" title="publicationDate" width="100" sortable="true" formatter="date" width ="150"/> --%>

<%--  		<sjg:gridColumn name="publicationDate" index="publicationDate"  --%>
<%--  			title="Publication Date" sortable="true" editable="true"  --%>
<%--  			edittype="text" formatter="date" width="150" id="publicationDateId"  editoptions="{size:20, maxlength:20, dataInit:datePick}" --%>
<%--  			editrules="{ date:false }"  --%>
<%--  			formoptions="{srcformat: 'Y-m-dQH:i:sZ', newformat: 'Y/m/d g:i A'}"/>  --%>
	
 		<sjg:gridColumn name="publicationDate" index="publicationDate" 
 			title="Publication Date" sortable="true" editable="true" 
 			edittype="text" width="150" id="publicationDateId"  editoptions="{size:20, maxlength:20, dataInit:datePick, readonly:true}"
 			/> 

		<sjg:gridColumn name="fileName" index="fileName" title="File Name" width="175" sortable="true" editable="true" />
    	<sjg:gridColumn name="selectId" index="fileId" title="" width="30" sortable="false" formatter="upload"/>
		
				
	</sjg:grid>
	
	
	<!--Grid-->
</fieldset>

<div class="medium-spacer"></div>
<div class="clear"></div>
<!--Content-->
<fieldset>
	<legend>Exception Messages</legend>
	<!--Grid-->
	<s:url id="remoteurl" action="ExceptionMessageGridAction" escapeAmp="false"><s:param name="exceptionMessage.projectId" value="project.projectId"/><s:param name="actionName" value="actionName"/></s:url>
	<s:url id="editurl" action="editExceptionMessageGridAction"><s:param name="exceptionMessage.projectId" value="project.projectId"/></s:url>
	<sjg:grid 
		id="exceptionMessageGridId" 
		caption="" 
		dataType="json"
		href="%{remoteurl}" 
		pager="true" 
		navigator="true"
		navigatorEditOptions="{height:100,reloadAfterSubmit:true,closeAfterEdit:true}"
		navigatorEdit="#objGridDisable" 
		navigatorAdd="false" 
		navigatorDelete="false" 
		navigatorSearch="false"
		navigatorView="false" 
		navigatorRefresh="false"
		gridModel="exceptionMessageGridModel" 
		rowList="2,4,8,10" 
		rowNum="4"
		editurl="%{editurl}" 
		editinline="false" 
		onSelectRowTopics="rowselect"
		viewrecords="true" 
		width="908"
		shrinkToFit="false">
		
		<sjg:gridColumn name="id" index="id" title="MSG ID" width="200" formatter="integer" key="true" hidden="true"/>
		<sjg:gridColumn name="projectId" index="projectId" title="Project Id" width="200" formatter="integer" sortable="true" hidden="true"/>
		<sjg:gridColumn name="exceptionEvent" index="exceptionEvent" title="Exception Event" width="250" sortable="true"/>
		<sjg:gridColumn name="exceptionText" index="exceptionText" title="Exception Text" width="640" sortable="true" editable="true" formoptions=" {label:'Exception Text *'}" editrules="{ required: true }" editoptions="{size:50}"/>
				
	</sjg:grid>
	
	
	<!--Grid-->
</fieldset>

<div class="medium-spacer"></div>
<div class="clear"></div>
<!--Website-->
<fieldset>
	<legend>Website</legend>
	<div class="col-1 expanded spacer-height">
<%-- 	<s:select key="project.template" list="#{'SingleLanguageStandardFlow':'SingleLanguageStandardFlow','MultiLanguageStandardFlow':'MultiLanguageStandardFlow'}" labelSeparator=" :" theme="xhtml" disabled="#objKFDisable"/> --%>
		<s:hidden name="project.template"/>
	</div>	
	<div class="clear"></div>
	<div class="col-1 expanded spacer-height">	
		<label> &nbsp;</label>
		<s:set var="templateFlag" value="project.templateFlag"/>
		<s:if test="#templateFlag==0">
			
				<ul class="template_gallery spacer-height">		
					<li class="space">
						<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/noImage2.jpg" title="No Image" />
						
						
						<div class="text">
							<h2><s:property value="projectTemplate.title"/></h2>
							<div class="desc">
								<p><s:property value="projectTemplate.description"/></p>
							</div>
						
								<div align="center">
									<s:url id="templateAddUrl" action="createTemplate" escapeAmp="true">
										<s:param name="template.projectId" value="project.projectId" />
									</s:url>
								<%
								if(!blnAdd)
								{
								%>
									<s:a href="%{templateAddUrl}" id="add" cssClass="copy_btn fancybox details_btn popup" />
								<%	
								}
								%>
								</div>
						
						</div>
					</li>
					
				</ul>
			
		
		
		</s:if>
		<s:else>
		
			
				<ul class="template_gallery spacer-height">		
					<li class="space">
						<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@configMap['templatePath']}"/>/USER/<s:property value="projectTemplate.name"/>.jpg" alt="" height="146 px" width="225 px"/>
						
						<div class="text">
							<h2><s:property value="projectTemplate.title"/></h2>
							<div class="desc">
								<p><s:property value="projectTemplate.description"/></p>
							</div>
						
								<s:url id="templateEditUrl" action="viewTemplate" escapeAmp="true">
									<s:param name="template.projectId" value="project.projectId" />
								</s:url>
								<div align="center">
									<s:a href="%{@main.java.com.mps.common.AppSystem@configMap['templatePath']}/USER/%{projectTemplate.name}.html" id="preview" cssClass="preview_btn fancybox preview_btn popup" />
									<s:a href="%{templateEditUrl}" id="edit" cssClass="details_btn fancybox details_btn popup" />
								</div>
							
						</div>
					</li>
					<li class="space">
						<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@configMap['templatePath']}"/>/USER/<s:property value="projectTemplate.name"/>_error.jpg" alt="" height="146 px" width="225 px"/>
						
						<div class="text">
							<h2><s:property value="projectTemplate.title"/></h2>
							<div class="desc">
								<p><s:property value="projectTemplate.description"/></p>
							</div>
						
								<div align="center">
									<s:url id="templateErrorUrl" action="viewTemplate" escapeAmp="true">
										<s:param name="template.projectId" value="project.projectId" />
									</s:url>
<%-- 									<s:a href="%{templateErrorUrl}" id="edit" cssClass="details_btn fancybox details_btn popup" /> --%>
									<s:a href="%{@main.java.com.mps.common.AppSystem@configMap['templatePath']}/USER/%{projectTemplate.name}_error.html" id="preview" cssClass="preview_btn fancybox preview_btn popup" />
								</div>
							
						</div>
					</li>
				</ul>
		
		
		</s:else>
		<div class="clear"></div>
		<%
		if(!blnAdd)
		{
			%>
<%-- 	 		<s:a action="displayPromocode.do" id="promocode" escapeAmp="false"><s:param name="codeConfig.projectId" value="project.projectId"/><s:param name="codeValue.count" value="0"/>  --%>
<%-- 	 		<strong>Promo Code</strong>  --%>
<%-- 	 		</s:a>  --%>
			<%
		}
		%>
		<div class="clear"></div>
	</div>
</fieldset>

<script>

//datepicker for gridview editable mode
datePick = function(elem){
	$(elem).datepicker({
		dateFormat: 'd-M-yy',
		maxDate: 0		
	});	
}

function selectCustomer(customerId)
{
	var objForm = document.forms[0];
	objForm["project.customer.id"].value = customerId;
	jQuery.fancybox.close();	
}

function insertCustomer(id, name)
{
	var objForm = document.forms[0];
	addNewOption(objForm["project.customer.id"],name,id);
	jQuery.fancybox.close();	
}

jQuery(document).ready(function(){
   $("#event1,#event2,#projectUrl").fancybox({
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
	   $("#drmdefine").fancybox({
			'width'				: '40%',		
			'autoScale'			: 'true',
			'transitionIn'		: 'elastic',
			'transitionOut'		: 'elastic',
			'type'				: 'iframe',
			'padding'			: '0',
			'margin'			: '0',
			'top'				: '0',
			'left'				: '0',
			'scrolling'   		: 'no',
			 'onComplete' : function() {
				    $('#fancybox-frame').load(function() { // wait for frame to load and then gets it's height
				      $('#fancybox-content').height($(this).contents().find('body').height()+20);
				    });
				  }

		});
	   $("#promocode").fancybox({
			'width'				: '70%',		
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
	   // Jquery for modal frame position Starts
	   $('#edit_contentFileGridId').click(function(){
			var offset = $('#gbox_contentFileGridId').offset();	$('.ui-jqdialog').css({"position":"absolute","top": offset['top']+'px',"left": offset['left']+'px'});
		 });
		$('#edit_exceptionMessageGridId').click(function(){
			var offset = $('#gbox_exceptionMessageGridId').offset(); $('.ui-jqdialog').css({"position":"absolute","top":offset['top']+'px',"left": offset['left']+'px'});
		 });
	   // Jquery for modal frame position Ends
	   });
	   
function drmProject(iPrintAllowed,iCopyId,iConversionId)
{
	var objForm = document.forms[0];
	objForm.printAllowedId.value=iPrintAllowed;
	objForm.copyAllowedId.value=iCopyId;
	objForm.conversionAllowedId.value=iConversionId;
	if(iPrintAllowed == 0 && iCopyId == 0 && iConversionId == 0)
	{
		objForm["project.drm"].value = 0;
	}
	else
	{
		objForm["project.drm"].value = 1;
	}
	jQuery.fancybox.close();	
}

function onLoad()
{
	backupDisabled();
}

onLoad();
</script>