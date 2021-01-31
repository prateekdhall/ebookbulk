<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<div class="medium-spacer"></div>
<div class="wrapperDiv">
<s:form action="searchCustomer" namespace="/ebbs" method="post" theme="css_xhtml">
	<fieldset>
		<legend>Search</legend>

		<div class="col-1 expanded remove-br-tag">

			<s:hidden name="firstFlag" value="1"></s:hidden>
			<s:textfield cssClass="extended" key="searchCustomer.companyName" labelSeparator=" :" theme="xhtml"/> 

<%--				
				       <s:url id="remoteurl" action="autoCompleterAction?moduleId=2&componentId=1"/>
				        <sj:autocompleter        
				        key="searchCustomer.companyName"
				        id="customer"
				        href="%{remoteurl}"
				        delay="50"
				        loadMinimumCount="3" 
				        loadingText ="false"
				        timeout = "3000"
				        targets="true"
				        maxlength="50"
				        cssClass="extended"
				        
				        />
--%>
				
		</div>

		<div class="clear"></div>

		<div class="col-1">
			<s:select name="searchCustomer.country.id" label="Country" list="countries" listKey="countryId" listValue="countryName"  headerKey="-1" headerValue="Select Country" labelSeparator=" :" theme="xhtml"/>
		</div>
	</fieldset>

<div class="clear"></div>

<div class="btnWrapper">
	<s:submit value="Search" id="submit_btn" cssClass="submit_btn" theme="simple" />
	<s:reset value="Cancel" cssClass="submit_btn" theme="simple" onclick="javascript:parent.jQuery.fancybox.close();"/>
</div>

</s:form>

<script type="text/javascript">

	function check(cellvalue, options, rowObject) 
	{
		return "<a href='javascript:viewCustomer("+rowObject.customerId+");'><img src='<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/edit-template-icon.png' border='0' title='View/Edit Customer'/></a>";
	}

	function selectCustomer(cellvalue, options, rowObject) 
	{
		return "<a class='radioSprite' href='javascript:setCustomer("+rowObject.customerId+");'> </a>";
	}

	function setCustomer(iCustomerId)
	{
		parent.selectCustomer(iCustomerId);
	}

	function viewCustomer(iCustomerId)
	{
		var objForm = document.forms[0];
		objForm.action = "ebbs/viewCustomer.do?customer.customerId="+iCustomerId;
		objForm.submit();
	}
</script>

<div class="utility-block"  hidden="true">
	<div class="exportResults">
		Export Result As: <img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/csv.gif">
		<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/xls.gif">
	</div>
</div>



<s:div>

<s:if test="%{firstFlag==1}">
	<legend></legend>
		<s:url id="remoteurl" action="searchCustomerGridAction"
			escapeAmp="false">
			<s:param name="companyName" value="searchCustomer.companyName" />
			<s:param name="customer.country.id" value="searchCustomer.country.id" />
			<s:param name="firstFlag" value="firstFlag" />
		</s:url>
		<sjg:grid id="searchCustomerGrid"
	    	caption=""
		    dataType="json"
	    	href="%{remoteurl}"
	    	pager="true"
	    	gridModel="customerGridModel"
	    	rowList="5,10,20"
	    	rowNum="10"
			editinline="false"
	    	onSelectRowTopics="rowselect"
	    	viewrecords="true"
			height="110"
			width="908"
	    	shrinkToFit="false">
	    	<sjg:gridColumn name="selectId" index="customerId" title="" width="20" sortable="false" formatter="selectCustomer"/>
	    	<sjg:gridColumn name="editId" index="customerId" title="" width="20" sortable="false" formatter="check"/>
	    	<sjg:gridColumn name="companyName" index="companyName" title="Company Name" width="250" sortable="true"/>
	    	<sjg:gridColumn name="customerId" index="customerId" title="Customer Id" width="250" hidden="true"/>
	    	<sjg:gridColumn name="address" index="address" title="Address" width="250" sortable="true"/>
	    	<sjg:gridColumn name="city" index="city" title="City" width="150" sortable="true"/>
	    	<sjg:gridColumn name="country.value" value="country.value" index="country.value" title="country" width="250" sortable="true"/>
		</sjg:grid>
</s:if>
</s:div>
  <!--Content Wrapper-->
  <div class="clear"></div>
</div>