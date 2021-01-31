<%@taglib uri="/struts-tags" prefix="s"%>
<s:form action="drmDefineProject" namespace="/ebbs" method="post" theme="css_xhtml">
<br/>
<div>
<fieldset style="border: none;">
	<div class="col-1 drmCol">			
			<label class="labelTxt"><s:text name="project.printAllowed"/> :</label>
			<input type="radio" name="printAllowedId" value="1" checked="checked"> <span class="spanBold"><s:text name="label.no" /> </span>
			<input type="radio" name="printAllowedId" value="0"><span class="spanBold"> <s:text name="label.yes"/> </span>
	</div>
<div class="clear"></div>
    <div class="col-1 drmCol">			
			<label class="labelTxt"><s:text name="project.copyAllowed"/> :</label>
			<input type="radio" name="copyAllowedId" value="1" checked="checked"> <span class="spanBold"><s:text name="label.no"/> </span>
			<input type="radio" name="copyAllowedId" value="0"><span class="spanBold"> <s:text name="label.yes"/> </span>
	</div>
	<div class="clear"></div>
    <div class="col-1 drmCol">			
			<label class="labelTxt"><s:text name="project.conversionAllowed"/> :</label>
			<input type="radio" name="conversionAllowedId" value="1" checked="checked"> <span class="spanBold"><s:text name="label.no"/> </span>
			<input type="radio" name="conversionAllowedId" value="0"><span class="spanBold"> <s:text name="label.yes"/> </span>
	</div>		
	<div class="clear"></div>
	<br/>
	<br/>
	 <div align="left" style="margin-left:100px">		
	<input type="submit" class="submit_btn" value="Save" onclick="javascript:drmDefine();"/>
	<input type="reset" class="submit_btn" value="Cancel" onclick="javascript:parent.jQuery.fancybox.close();"/>
	</div>
</fieldset>
</div>
</s:form>
<script>
	function drmDefine()
	{
		var printAllowed = document.getElementsByName("printAllowedId");
		var copyAllowed = document.getElementsByName("copyAllowedId");
		var conversionAllowed = document.getElementsByName("conversionAllowedId");
		var print=null;
		var copy=null;
		var conversion=null;
		
		for (var x = 0; x < printAllowed.length; x ++) {
			    if (printAllowed[x].checked) {
			          print=printAllowed[x].value;
			        }
			     }
		for (var x = 0; x < copyAllowed.length; x ++) {
		    if (copyAllowed[x].checked) {
		          copy=copyAllowed[x].value;
		        }
		     }
		for (var x = 0; x < conversionAllowed.length; x ++) {
		    if (conversionAllowed[x].checked) {
		          conversion=conversionAllowed[x].value;
		        }
		     }
		parent.drmProject(print,copy,conversion);
	}
	
	$(document).ready(function (){
		if(parent.document.forms[0]["printAllowedId"].value==1)
		{
			document.getElementsByName("printAllowedId")[0].checked = true;
		}
		else
		{
			document.getElementsByName("printAllowedId")[1].checked = true;
		}
		if(parent.document.forms[0]["copyAllowedId"].value==1)
		{
			document.getElementsByName("copyAllowedId")[0].checked = true;
		}
		else
		{
			document.getElementsByName("copyAllowedId")[1].checked = true;
		}
		if(parent.document.forms[0]["conversionAllowedId"].value==1)
		{
			document.getElementsByName("conversionAllowedId")[0].checked = true;
		}
		else
		{
			document.getElementsByName("conversionAllowedId")[1].checked = true;
		}
	})
</script>
