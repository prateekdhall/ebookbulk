
<%@ taglib uri="/struts-tags" prefix="s"%>

<script type="text/javascript" src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/ckeditor/ckeditor.js"></script>

<script type="text/javascript">
var clicked = false;
	function preview() 
	{
		var fileContent = document.getElementById('fileContent').value;
		window.document.write("<center><div id='main' role='main'><div style='text-align:left;margin-bottom:5px;'><input class='submit_btn' type='button' onclick='history.back(-2);' value='Back'>	</div>"
						+ fileContent + "</center");
	}
	
	function makeForm() 
	{
		clicked = true;
		var templateId = document.getElementById('templateId').value;
		var projectId = document.getElementById('projectId').value;
		var pageide = document.getElementById('pageide').value;
		var pageCheck = document.getElementById('pageCheck').value;
		if(pageCheck==null) pageCheck="";
		
		$('#nextbutton').live('click', function(e){
			e.preventDefault();
					 $.fancybox([
				             {
				            	'href' : "ebbs/makeForm.do?template.templateId="+templateId+"&template.projectId="+projectId+"&pageid="+pageide+"&pageCheck="+pageCheck
				                 //'href'  : 'ebbs/home.do'
				             }
				             ], {
							'width'				: '100%',		
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
								      $('#fancybox-content').height($(this).contents().find('body').height()+25);
								    });
								  }  		
						});
				});
		//window.location = "ebbs/makeForm.do?template.templateId="+templateId+ "&pageid=" + pageide;
	}
	
	function pageNavigation(blnBack) 
	{
		var pageide = document.getElementById('pageide').value;
		var pageid;
		var checkbutonClicked;
		if(blnBack)
		{
			pageid=parseInt(pageide)-parseInt(1);
		}
		else
		{
			pageid=parseInt(pageide)+parseInt(1);
		}
		
			//alert(clicked);
			
		if(document.getElementById('dynamicChecked'))
			{
			if(document.getElementById('dynamicChecked').value=="")
				checkbutonClicked=clicked;
			else
				checkbutonClicked=document.getElementById('dynamicChecked').value;
			}
		
		
		
		document.frm.action="ebbs/nextPageSubmit.do?back="+blnBack+"&buttonClicked="+checkbutonClicked;
		document.getElementById('pageide').value=pageid;
		document.frm.submit();
	}
	
	function validator() 
	{
		var titles = document.getElementById("titles").value;
		var description = document.getElementById("description").value;
		if (titles == "") 
		{
			document.getElementById("message").style.color = "red";
			document.getElementById("message").style.visibility = "visible";
			document.getElementById("message").innerHTML = "Titles field requried cannot be left blank";
			document.getElementById("titles").style.border = "3";
			document.getElementById("titles").style.borderColor = "red";
			document.getElementById("titles").focus();
			return false;
		} 
		else 
		{
			document.getElementById("titles").style.borderColor = "gray";
		}
		if (description == "") 
		{
			document.getElementById("message").style.color = "red";
			document.getElementById("message").style.visibility = "visible";
			document.getElementById("message").innerHTML = "Description field requried cannot be left blank";
			document.getElementById("description").style.border = "3";
			document.getElementById("description").style.borderColor = "red";
			document.getElementById("description").focus();
			return false;
		} 
		else 
		{
			document.getElementById("message").style.visibility = "hidden";
		}
		return true;
		//parent.jQuery.fancybox.close();
	}
</script>
<div class="wrapperDiv">
		<fieldset class="noBorder">
	<s:form action="templateSubmit" namespace="/ebbs" method="post" onsubmit="return validator();" name="frm" theme="css_xhtml">
		<div id="message" style="font-size: 14px;"></div>
		<p style="padding-left: 200px;">
			<s:hidden name="template.templateId" id="templateId" />
			<s:hidden name="template.type" id="templateType"/>
			<s:hidden name="template.category" id="tempcategory"/>
			<s:hidden name="template.name"/>
			<s:hidden name="template.createdBy"/>
			<s:hidden name="template.createdDate"/>
			<s:hidden name="template.projectId" id="projectId"/>
			<s:hidden name="template.pageCount"/>
			<s:hidden name="pageid" value="%{request.pageId}" id="pageide" />
			<s:hidden name="actionName"/>
			<s:hidden name="htmlContent" id="htmlContent" />
		</p>
		<s:set var="pageCount" value="template.pageCount"/>
		<s:set var="templateCategory" value="template.category"/>
		<s:set var="pageidvalue" value="%{request.pageId}" />
		<s:set var="projectId" value="template.projectId"/>
		<s:set var="RegistrationDivExist" value="%{request.DivExist}" />
	
			<div class="btn_top_location">
				<s:if test="#pageidvalue>1">
					<input class="submit_btn" type="button" onclick="pageNavigation(true);" value="<< Previous"> 
				</s:if>
				<s:if test="#pageidvalue==#pageCount">
					<input class="submit_btn" type="submit" id="saveEditorData" value="Save">
				</s:if>
				<s:if test="%{#projectId!='' && #projectId>0 && #RegistrationDivExist=='true'}" >
					<input class="submit_btn_large" type="button" onclick="makeForm()" value="Dynamic Fields" id="nextbutton" name="nextbutton"> 
				</s:if>
<!-- 				<input class="submit_btn" type="button" onclick="javascript:preview();" value="Preview"> -->
				
				<s:if test="%{#pageidvalue>=1 && #pageidvalue<#pageCount}" >
				<!-- <input class="submit_btn" type="submit" id="saveEditorData" value="Next >>">-->
					<input class="submit_btn" type="button" onclick="pageNavigation(false);" value="Next >>"> 
				</s:if>
			</div>
			
			<div class="col-1 expanded"><label>Title :</label>
					<s:textfield name="template.title" theme="css_xhtml" id="titles" ></s:textfield>
				</div>
				<div class="clear"></div>
			<div class="col-1 expanded"><label>Description :</label>
					<s:textarea name="template.description" theme="css_xhtml" rows="1" cols="100" id="description"></s:textarea>
				</div>
				<div class="clear"></div>
			<s:textarea id="fileContent" name="template.fileContent" theme="simple"></s:textarea>

				<script type="text/javascript">
					CKEDITOR.replace('fileContent', {
						height : "650",
						width : "900",
						 toolbar : [
									['Preview','Print','-','Bold','Italic','Underline','-','Undo','Redo','TextColor','BGColor','-','NumberedList','BulletedList','Outdent','Indent','JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock','-','Find','Replace','SpellChecker','SelectAll','PasteFromWord','Maximize','HorizontalRule','Smiley','SpecialChar'],
									['Styles','Format','Font','FontSize']
							       ]
					});
				</script>
	
	</s:form>
	<s:hidden name="pageCheck" id="pageCheck" value="%{request.pageCheck}" />
	<s:hidden name="dynamicChecked" id="dynamicChecked" value="%{request.dynamicHTMLClicked}" />
	</fieldset>
	</div>
<script>
function onLoad()
{
	if(document.getElementById("htmlContent").value!="")
	{
		parent.document.getElementById("htmlContent").value=document.getElementById("htmlContent1").value;
	}
}

//onLoad();
</script>