<%@page language="java" contentType="text/html; charset=utf-8"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<style>
#mainwrapper
{
overflow-x: hidden; 
height: 100px; 
border: 1px gray solid; 
}
</style>

<script type="text/javascript">
function showRow(tableID)
{
	var table = document.getElementById(tableID);
	var isActive=document.getElementById('isActiveFlag').value;
	//alert(isActive);
	var myString=document.getElementById('promoCodeId').value;
	var temp = new Array();
	temp = myString.split(',');
	for(var i=0;i<temp.length;i++)
	{
			var row = table.insertRow(i);
			var cell1 = row.insertCell(0);
		    var element1 = document.createElement("input");
		    element1.type = "checkbox";
		  //  element1.checked = "true";
		  if(isActive==1)
			  element1.disabled="true"; 		  
		    cell1.appendChild(element1);
		    
		   
		    var cell2 = row.insertCell(1);
			var element2 = document.createElement("input");
			element2.type = "text";
			element2.value=temp[i];
			element2.name = "valueId" + i;
			element2.id = "valueId" + i;
			if(isActive==1)
			element2.disabled="true";
			cell2.appendChild(element2);
	
	}
	
	
}
function addRow(tableID) {
	 
    var table = document.getElementById(tableID);
    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);
    var cell1 = row.insertCell(0);
    var element1 = document.createElement("input");
    element1.type = "checkbox";
    cell1.appendChild(element1);

    var cell2 = row.insertCell(1);
	var element2 = document.createElement("input");
	element2.type = "text";
	element2.name = "valueId" + rowCount;
	element2.id = "valueId" + rowCount;
	cell2.appendChild(element2);
}



function deleteRow(tableID) {
    try {
    var table = document.getElementById(tableID);
    var rowCount = table.rows.length;

    for(var i=0; i<rowCount; i++) {
        var row = table.rows[i];
        var chkbox = row.cells[0].childNodes[0];
        if(null != chkbox && true == chkbox.checked) {
            table.deleteRow(i);
            rowCount--;
            i--;
        }
    }
    }catch(e) {
        alert(e);
    }
}

</script>
<script type="text/javascript">

function Display(obj)
{
 manualName=document.getElementById("MANUALID");
 styleName=document.getElementById("STYLEID");
 typeName=document.getElementById("TYPE");
 singlePrefix=document.getElementById("SINGLEPREFIX");
 multiPrefix=document.getElementById("MULTIPREFIX");
 singleAuto=document.getElementById("SINGLEAUTO");
 multiAuto=document.getElementById("MULTIAUTO");
 seltypeName=document.getElementById("TYPEID");
 if (styleName.value=="MANUAL" && obj.value=="MANUAL") {manualName.style.display="block";typeName.style.display="none";singlePrefix.style.display="none";multiPrefix.style.display="none";singleAuto.style.display="none";multiAuto.style.display="none"}
 else if (styleName.value=="PREFIX" && obj.value=="PREFIX") {seltypeName.value="MULTI";manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="none";multiPrefix.style.display="block";singleAuto.style.display="none";multiAuto.style.display="none"}
 else if (styleName.value=="AUTO" && obj.value=="AUTO") { seltypeName.value="MULTI";manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="none";multiPrefix.style.display="none";singleAuto.style.display="none";multiAuto.style.display="block"}
 else if (styleName.value=="PREFIX" && obj.value=="MULTI") { manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="none";multiPrefix.style.display="block";singleAuto.style.display="none";multiAuto.style.display="none"}
 else if (styleName.value=="PREFIX" && obj.value=="SINGLE") { manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="block";multiPrefix.style.display="none";singleAuto.style.display="none";multiAuto.style.display="none"}
 else if (styleName.value=="AUTO" && obj.value=="MULTI") { manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="none";multiPrefix.style.display="none";singleAuto.style.display="none";multiAuto.style.display="block"}
 else if (styleName.value=="AUTO" && obj.value=="SINGLE") { manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="none";multiPrefix.style.display="none";singleAuto.style.display="block";multiAuto.style.display="none"}
 else { typeName.style.display="none";singlePrefix.style.display="none";multiPrefix.style.display="none";singleAuto.style.display="none";multiAuto.style.display="none"}
};

function beforeSubmit()
{
	var objForm = document.forms[0];
	objForm.codeStyle.value=null;
	objForm.codeType.value="";
	objForm.codePrefix.value=null;
	objForm.codeQuantity.value=null;
	objForm.codeSize.value="";
	styleName=document.getElementById("STYLEID");
	typeName=document.getElementById("TYPEID");
	if (styleName.value=="MANUAL")
	{
		objForm.codeStyle.value=styleName.value;
		var table = document.getElementById("dataTable");
		var rowCount = table.rows.length;
		var valuesStr= null;
		for ( var i = 0; i < rowCount; i++) 
		{
			var valueId = "valueId" + i;
			if(!document.getElementById(valueId).disabled)
				{
			var values = document.getElementById(valueId);
			if(valuesStr == null)
				{
				valuesStr=values.value;
				}
			else
				{
				valuesStr=valuesStr+","+values.value;
				}
				}
		}
		objForm.promoCodeId.value=valuesStr;
		objForm.codeTypeValue.value="";
		
		objForm.action="ebbs/addPromoValue.do";
	}
	else if (styleName.value=="PREFIX")
	{
		objForm.codeStyle.value=styleName.value;
		objForm.codeType.value=typeName.value;
		if(objForm.codeType.value=="MULTI")
		{
		objForm.codePrefix.value=document.getElementById("multiprefixid").value;
		objForm.codeQuantity.value=document.getElementById("prefixqtyid").value;
		}
		else if(objForm.codeType.value=="SINGLE")
		{
		objForm.codePrefix.value=document.getElementById("singleprefixid").value;
		objForm.codeQuantity.value=1;
		}
	}
	else if(styleName.value=="AUTO")
		{
		objForm.codeStyle.value=styleName.value;
		objForm.codeType.value=typeName.value;
		if(objForm.codeType.value=="MULTI")
			{
			
			objForm.codeSize.value=document.getElementById("multiautoid").value;
			objForm.codeQuantity.value=document.getElementById("autoqtyid").value;
			}
		else if(objForm.codeType.value=="SINGLE")
		{
			//alert(document.getElementById("singleautoid").value);
		objForm.codeSize.value=document.getElementById("singleautoid").value;
		//alert(objForm.codeSize.value);
		objForm.codeQuantity.value=1;
		}
		}
	//onLoad();
	
	objForm.submit();
	parent.document.forms[0]["checked9"].checked = true;
	parent.jQuery.fancybox.close();
}


function validator() {
	var titles = document.getElementById("titles").value;
	var description = document.getElementById("description").value;
	if (titles == "") {
		document.getElementById("message").style.color = "red";
		document.getElementById("message").style.visibility = "visible";
		document.getElementById("message").innerHTML = "Titles field requried cannot be left blank";
		document.getElementById("titles").style.border = "3";
		document.getElementById("titles").style.borderColor = "red";
		document.getElementById("titles").focus();
		return false;
	} else {

		document.getElementById("titles").style.borderColor = "gray";
	}
	if (description == "") {
		document.getElementById("message").style.color = "red";
		document.getElementById("message").style.visibility = "visible";
		document.getElementById("message").innerHTML = "Description field requried cannot be left blank";
		document.getElementById("description").style.border = "3";
		document.getElementById("description").style.borderColor = "red";
		document.getElementById("description").focus();
		return false;
	} else {
		document.getElementById("message").style.visibility = "hidden";

	}
	return true;

}


</script>
<div class="medium-spacer"></div>
<div class="promoContainer">
<fieldset>
<legend><s:text name="codeConfig.legend"/></legend>

<div class="col-1">
<label class="labelTxt"><s:text name="codeConfig.codeStyle"/>:</label>
<select id="STYLEID" onChange="Display(this);"  <% if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){%> disabled="disabled" <%}%> >
  <option value="MANUAL" >Manual</option>
  <option value="PREFIX">Prefix</option>
  <option value="AUTO">Auto</option>
</select>
</div>
<div class="clear"> </div>
<div ID="TYPE" style="display:none;" class="col-1">
<label class="labelTxt"><s:text name="codeConfig.codeType"/>:</label>
<select id="TYPEID" onChange="Display(this);"  <% if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){%> disabled="disabled" <%}%> >
  <option value="MULTI" >Multi</option>
  <option value="SINGLE">Single</option>
</select>
</div>
<div class="clear"></div>
<div ID="SINGLEPREFIX" style="display:none;" class="col-1">
<label class="labelTxt"><s:text name="codeConfig.codePrefix"/>:</label>
 <input type="text" name="prefix" size="34" id="singleprefixid" <% if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){%> disabled="disabled" <%}%>>
</div>
<div ID="MULTIPREFIX" style="display:none;">
<div class="col-1">
<label class="labelTxt"><s:text name="codeConfig.codePrefix"/>:</label>
<input type="text" name="prefix" size="34" id="multiprefixid"  <% if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){%> disabled="disabled" <%}%>>
</div>
<div class="col-2">
<label class="labelTxt" id="q1"><s:text name="codeConfig.codeQuantity" />:</label>
  <input type="text" name="quantity" size="34" id="prefixqtyid">
</div>
</div>
<div ID="SINGLEAUTO" style="display:none;" class="col-1">
<label class="labelTxt"><s:text name="codeConfig.codeSize"/>:</label>
<select id="singleautoid" <% if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){%> disabled="disabled" <%}%> >
  <option value="5-ALPHANUMERIC" >5 alphanumeric</option>
  <option value="6-ALPHANUMERIC">6 alphanumeric</option>
  <option value="7-ALPHANUMERIC">7 alphanumeric</option>
  <option value="8-ALPHANUMERIC">8 alphanumeric</option>
</select>
</div>
<div ID="MULTIAUTO" style="display:none;">
<div class="col-1">
<label class="labelTxt"><s:text name="codeConfig.codeSize"/>:</label>
<select id="multiautoid" <% if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){%> disabled="disabled" <%}%> >
  <option value="5-ALPHANUMERIC" >5 alphanumeric</option>
  <option value="6-ALPHANUMERIC">6 alphanumeric</option>
  <option value="7-ALPHANUMERIC">7 alphanumeric</option>
  <option value="8-ALPHANUMERIC">8 alphanumeric</option>
</select>
</div>
<div class="col-2">
<label class="labelTxt" id="q2"><s:text name="codeConfig.codeQuantity" />:</label>
<input type="text" name="quantity" size="34" id="autoqtyid">
</div>
</div>

<div class="clear"> </div>
<div class="col-1">
	
	<div id=MANUALID>
	<div class="col1">
	<label>&nbsp;</label>
		<table class="tableClass" height="24px" width="212">
	    	<tr>
	   			<td width="208">
	   					<label> Promo Code </label>   		    	
	   			</td>
	   		</tr>
    	</table>
	</div>
	<div class="clear"> </div>
	<div class="col1">
	<label>&nbsp;</label>
	<TABLE id="dataTable" border="1" class="promoTable">
         
    
    </TABLE>
  
    
    
    
	</div>
<div class="clear"> </div>
	<div class="col1">
		<label >&nbsp;</label> 
		<table class="tableClass"  height="28px" width="212">
	    	<tr>
	   			<td width="208">
	   			
		    		<INPUT type="button" onclick="addRow('dataTable')" class="addIcon" />
		    		<INPUT type="button" onclick="deleteRow('dataTable')" class="deleteIcon"/>    	
	   			</td>
	   		</tr>
    	</table>
	</div>
	
<div class="clear"> </div>
     </div>
     
  
     </div>
</fieldset>
</div>
<s:form  method="post" namespace="/ebbs" action="updatePromoCode" theme="css_xhtml">     
<s:hidden name="codeConfig.codeStyle" id="codeStyle"/>
<s:hidden name="codeConfig.codeType" id="codeType"/>
<s:hidden name="codeConfig.codePrefix" id="codePrefix"/>
<s:hidden name="codeConfig.codeQuantity" id="codeQuantity"/>
<s:hidden name="codeConfig.codeSize" id="codeSize"/>
<s:hidden name="codeConfig.projectId" id="projectId"/>
<s:hidden name="codeConfig.cfId" id="cfId"/>
<s:hidden name="codeValue.codeType" id="codeTypeValue"/>
<s:hidden name="codeValue.count" id="countId"/>
<s:hidden name="codeValue.promoCode" id="promoCodeId"/>

<div class="btnWrapper">
		<s:submit value="Submit" theme="simple" cssClass="submit_btn" onclick="beforeSubmit()" id="submitButton"/>
		<s:submit value="Cancel" theme="simple" cssClass="submit_btn" onclick="javascript:onCancelEvent();" />
	</div>
</s:form>
<%
String flag="";
if(request.getAttribute("isActiveFlag")!=null)
	flag=(String)request.getAttribute("isActiveFlag");
%>
<input type="hidden" name="isActiveFlag" id="isActiveFlag" value="<%=flag%>"/>
<script>
function onCancelEvent()
{
	if(parent.document.forms[0]["checked9"].checked)
		parent.document.forms[0]["checked9"].checked = true;
	else 
		parent.document.forms[0]["checked9"].checked = false;
	
	parent.jQuery.fancybox.close();
}
function onLoad()
{
	//alert(document.getElementById('codeType').value);
	var isActiveF=document.getElementById('isActiveFlag').value;

	document.getElementById('STYLEID').value=document.getElementById('codeStyle').value;
	Display(document.getElementById('codeType'));
	document.getElementById('TYPEID').value=document.getElementById('codeType').value;
	
	if(document.getElementById('codeType').value=='SINGLE')
		document.getElementById('singleprefixid').value=document.getElementById('codePrefix').value;
		else if(document.getElementById('codeType').value=='MULTI')
			document.getElementById('multiprefixid').value=document.getElementById('codePrefix').value;
	
	document.getElementById('prefixqtyid').value=document.getElementById('codeQuantity').value;
	if(document.getElementById('codeType').value=='MULTI')
	{
		document.getElementById('multiautoid').value=document.getElementById('codeSize').value;	
		//{ 
		//manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="none";multiPrefix.style.display="none";singleAuto.style.display="none";multiAuto.style.display="block"}
		//Display(document.getElementById('STYLEID'));
	}
	else if(document.getElementById('codeType').value=='SINGLE')
	{
		
		document.getElementById('singleautoid').value=document.getElementById('codeSize').value;
		if(document.getElementById('STYLEID').value=="AUTO")
		{ 
			manualName.style.display="none";typeName.style.display="block";singlePrefix.style.display="none";multiPrefix.style.display="none";singleAuto.style.display="block";multiAuto.style.display="none";
		}
		
			
				/* if(document.getElementById('prefixqtyid'))
				{
				document.getElementById('prefixqtyid').style.display="none";
				document.getElementById('q1').style.display="none";
				}
		
				if(document.getElementById('autoqtyid'))
				{
				document.getElementById('autoqtyid').style.display="none";
				document.getElementById('q2').style.display="none";
				} */
				if(isActiveF==1)
				{
			document.getElementById('submitButton').disabled=true;
				}
		//Display(document.getElementById('STYLEID'));
	}
	
	document.getElementById('autoqtyid').value=document.getElementById('codeQuantity').value;

	showRow('dataTable');
}

onLoad();

</script>
