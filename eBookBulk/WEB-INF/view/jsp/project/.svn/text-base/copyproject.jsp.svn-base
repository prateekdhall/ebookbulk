<%@taglib uri="/struts-tags" prefix="s"%>

<div class="medium-spacer"></div>
(You may copy an existing project from the listing below else you may move to the next section to create a new one.)
<s:form action="copyCriteriaProject" namespace="/ebbs" method="post" theme="css_xhtml">
	<div class="medium-spacer"></div>
	<s:select name="projectId" list="projectList" listKey="projectId" listValue="projectName" headerKey="-1" headerValue="Select Project" />
	<div class="clear"></div>
	<div class="clear"></div>
	<div class="clear"></div>
	<s:submit value="Copy" id="submit_btn" cssClass="submit_btn" theme="simple" onclick="javascript:call();"/>
</s:form>

<script>
	function call()
	{
		var objForm = document.forms[0];
		parent.copyProject(objForm["projectId"].value);
	}
</script>