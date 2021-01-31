<%@taglib uri="/struts-tags" prefix="s"%>
<style type="text/css">		
  @import url(<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/css/main.css);
</style>
<style>
.template_gallery {
	overflow: hidden;
	margin: 0;
	padding: 0;
}

.template_gallery li {
	display: block;
	float: left;
	margin: 20px;
	border: 2px solid #3aabcf;
	padding: 8px;
}
</style>
<s:url id="refreshUrl" action="createTemplate" escapeAmp="true">
</s:url>
<script type="text/javascript">
function back()
{
	window.location="ebbs/home.do";
}

function reloadForm(msg)
{
	window.location="createTemplate.do";
}
</script>
<br />
	<div class="medium-spacer"></div>

	<div class="clear"></div>
	<ul class="splitter">
		<li>
			<ul>
				<li class="segment-1 selected-1"><a href="javascript:;" data-value="all">All</a></li>
				<li class="segment-1"><a href="javascript:;" data-value="SINGLE">Single Page Templates(s)</a></li>
				<li class="segment-1"><a href="javascript:;" data-value="MULTI">Multi Page Template(s)</a></li>
				<li class="segment-1"><a href="javascript:;" data-value="BLANK">Blank Template(s)</a></li>
			</ul>
		</li>
	</ul>
	<fieldset>
		<legend>Templates</legend>
		<div class="col-1 expanded">
			<ul id="list" class="template_gallery">
				<s:iterator value="temlateList">
					<li data-id='id-<s:property value="templateId"/>' class="<s:property value="category"/>" style="background-color: #ebf2f4;">
						<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@configMap['templatePath']}"/>/<s:property value="type"/>/<s:property value="name"/>.jpg" alt="" height="146 px" width="225 px"/>
						<div class="text">
							<h2><s:property value="title"/></h2>
							<div class="desc">
								<p><s:property value="description"/></p>
							</div>
							<p>
								<s:url id="remoteurl" action="viewTemplate" escapeAmp="true">
									<s:param name="template.templateId" value="templateId" />
									<s:param name="template.type" value="type" />
									<s:param name="actionName" value="1" />
								</s:url>
								<div align="center">
									<s:a href="%{@main.java.com.mps.common.AppSystem@configMap['templatePath']}/%{type}/%{name}.html" id="preview" cssClass="preview_btn fancybox preview_btn popup" />
									<s:a href="%{remoteurl}" id="edit" cssClass="copy_btn fancybox details_btn popup" />
									<s:if test="%{type=='USER'}">
										<s:url id="editurl" action="viewTemplate" escapeAmp="true">
											<s:param name="template.templateId" value="templateId" />
											<s:param name="template.type" value="type" />
											<s:param name="actionName" value="0" />
										</s:url>
										<s:a href="%{editurl}" id="edit" cssClass="details_btn fancybox details_btn popup" />
									</s:if>
								</div>
							</p>
						</div>
					</li>
				</s:iterator>
			</ul>
		</div>
	</fieldset>
	<script src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/js/jquery-1.4.1-and-plugins.min.js" type="text/javascript"></script>
