<%@taglib uri="/struts-tags" prefix="s"%>
<SCRIPT type="text/javascript">
	parent.jQuery('#fancybox-overlay, #fancybox-wrap').css('display', 'none');		
</SCRIPT>
<s:if test="hasActionErrors()">
	<s:iterator value="actionErrors">
		<SCRIPT type="text/javascript">
		    alert("<s:property escape="false"/>");
		</SCRIPT>
	</s:iterator>
</s:if>
<s:if test="hasActionMessages()">
	<s:iterator value="actionMessages">
		<SCRIPT type="text/javascript">
		    alert("<s:property escape="false"/>");
		</SCRIPT>
	</s:iterator>
</s:if>	
<SCRIPT type="text/javascript">
	parent.reloadForm(); // needed to write this method in the parent page 
</SCRIPT>

