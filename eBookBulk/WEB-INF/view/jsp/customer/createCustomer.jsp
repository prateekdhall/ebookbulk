<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

    <div class="medium-spacer"></div>

	<s:form method="post" namespace="/ebbs" action="submitCustomer" theme="css_xhtml">
<div class="wrapperDiv">
		<fieldset>
		<legend>Detail</legend>
				<s:hidden name="firstFlag" value="1"></s:hidden>
				<s:hidden name="customer.customerId" />
				<tiles:insertAttribute name="elements" />
		</fieldset>

		<div class="medium-spacer"></div>
		<div class="clear"></div>

		<fieldset>
			<legend>Key Contacts</legend>
			<s:url id="remoteurl" action="keyContactGridAction" />
			<s:url id="editurl" action="editKeyContactGrid"></s:url>
		
			<tiles:insertAttribute name="grid" />
		</fieldset>


		<div class="clear"></div>

	</div>
		<div class="btnWrapper">
			<s:submit value="Submit" id="submit_btn" cssClass="submit_btn" theme="simple" />
			<s:reset value="Cancel" cssClass="submit_btn" theme="simple" onclick="javascript:parent.jQuery.fancybox.close();"/>
		</div>

		<div class="clear"></div>
	</s:form>


<script type="text/javascript">
	function onLoad()
	{
		var objForm = document.forms[0];
		if(objForm["customer.customerId"].value!=0)
		{
			parent.insertCustomer(objForm["customer.customerId"].value,objForm["customer.companyName"].value);
		}
	}
	
	onLoad();
</script>

