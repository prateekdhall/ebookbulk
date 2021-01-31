package org.apache.jsp.WEB_002dINF.view.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import main.java.com.mps.wiley.ebb.domain.ProjectField;
import main.java.com.mps.wiley.util.StringUtility;
import main.java.com.mps.wiley.common.DynamicFieldConstants;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.common.AppSystem;;

public final class dynamicFields_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdiv;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005findicator_005fid_005fformIds_005fbutton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005fonClickTopics_005fid_005fbutton_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fdiv = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005findicator_005fid_005fformIds_005fbutton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005fonClickTopics_005fid_005fbutton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fdiv.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005faction.release();
    _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.release();
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005findicator_005fid_005fformIds_005fbutton_005fnobody.release();
    _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005fonClickTopics_005fid_005fbutton_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkAllCheckbox(tableID, promoCodeID) {\r\n");
      out.write("\t\ttry {\r\n");
      out.write("\t\t\tvar table = document.getElementById(tableID);\r\n");
      out.write("\t\t\tvar rowCount = table.rows.length;\r\n");
      out.write("\t\t\tfor ( var i = 1; i < rowCount; i++) {\r\n");
      out.write("\t\t\t\tvar row = table.rows[i];\r\n");
      out.write("\t\t\t\tvar chk = \"checked\" + i;\r\n");
      out.write("\t\t\t\tif(i!=promoCodeID)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(document.getElementById(chk).disabled == false)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif (document.getElementById('checked').checked == true) {\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(chk).checked = true;\r\n");
      out.write("\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\telse \r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(chk).checked = false;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} catch (e) {\r\n");
      out.write("\t\t\talert(e);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction getFielddata(tableID) {\r\n");
      out.write("\t\ttry {\r\n");
      out.write("\t\t\tvar table = document.getElementById(tableID);\r\n");
      out.write("\t\t\tvar checkedArray = new Array();\r\n");
      out.write("\t\t\tvar fieldIdArray = new Array();\r\n");
      out.write("\t\t\tvar fieldNameArray = new Array();\r\n");
      out.write("\t\t\tvar fieldTypeArray = new Array();\r\n");
      out.write("\t\t\tvar fieldMandatoryArray = new Array();\r\n");
      out.write("\t\t\tvar fieldOrderArray = new Array();\r\n");
      out.write("\t\t\tvar fieldLabelArray = new Array();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar rowCount = table.rows.length;\r\n");
      out.write("\t\t\tfor ( var i = 1; i < rowCount; i++) {\r\n");
      out.write("\t\t\t\tvar row = table.rows[i];\r\n");
      out.write("\t\t\t\tvar chkbox = row.cells[0].childNodes[0];\r\n");
      out.write("\t\t\t\tvar chk = \"checked\" + i;\r\n");
      out.write("\t\t\t\tif (document.getElementById(chk).checked == true) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar checked = \"checked\" + i;\r\n");
      out.write("\t\t\t\t\tvar fieldId = \"fieldId\" + i;\r\n");
      out.write("\t\t\t\t\tvar fieldName = \"fieldName\" + i;\r\n");
      out.write("\t\t\t\t\tvar fieldLabel = \"fieldLabel\" + i;\r\n");
      out.write("\t\t\t\t\tvar fieldType = \"fieldType\" + i;\r\n");
      out.write("\t\t\t\t\tvar mandatory = \"fieldMandatory\" + i;\r\n");
      out.write("\t\t\t\t\tvar fieldOrder = \"fieldOrder\" + i;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar checkeds = document.getElementById(checked);\r\n");
      out.write("\t\t\t\t\tvar fieldIds = document.getElementById(fieldId);\r\n");
      out.write("\t\t\t\t\tvar fieldNames = document.getElementById(fieldName);\r\n");
      out.write("\t\t\t\t\tvar fieldLabels = document.getElementById(fieldLabel);\r\n");
      out.write("\t\t\t\t\tvar fieldTypes = document.getElementById(fieldType);\r\n");
      out.write("\t\t\t\t\tvar mandatorys = document.getElementById(mandatory);\r\n");
      out.write("\t\t\t\t\tvar fieldOrder = document.getElementById(fieldOrder);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (document.getElementById(mandatory).checked == true) {\r\n");
      out.write("\t\t\t\t\t\tmandatorys = document.getElementById(mandatory).value = true;\r\n");
      out.write("\t\t\t\t\t\tfieldMandatoryArray.push(mandatorys);\r\n");
      out.write("\t\t\t\t\t} else if (document.getElementById(mandatory).checked == false) {\r\n");
      out.write("\t\t\t\t\t\tmandatorys = document.getElementById(mandatory).value = false;\r\n");
      out.write("\t\t\t\t\t\tfieldMandatoryArray.push(mandatorys);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tcheckedArray.push(checkeds.value);\r\n");
      out.write("\t\t\t\t\tfieldIdArray.push(fieldIds.value);\r\n");
      out.write("\t\t\t\t\tfieldNameArray.push(fieldNames.value);\r\n");
      out.write("\t\t\t\t\tfieldLabelArray.push(fieldLabels.value);\r\n");
      out.write("\t\t\t\t\tfieldTypeArray.push(fieldTypes.value);\r\n");
      out.write("\t\t\t\t\tfieldOrderArray.push(fieldOrder.value);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(checkedArray.length==0){\r\n");
      out.write("\t\t\t\talert(\"Please check the fields \");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t/* alert(checkedArray + \"  \" + fieldIdArray + \"  \" + fieldNameArray\r\n");
      out.write("\t\t\t\t\t\t+ \"  \" + fieldTypeArray + \"   \" + fieldMandatoryArray\r\n");
      out.write("\t\t\t\t\t\t+ \"   \" + fieldOrderArray+ \"   \" + fieldLabelArray); */\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\tvar templateId = document.getElementById('templateId').value;\r\n");
      out.write("\t\t\t\tvar pageId = document.getElementById('pageId').value;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar countrySelected = document.getElementById('countrySelected').value;\r\n");
      out.write("\t\t\t\tvar hearus = document.getElementById('hearus').value;\r\n");
      out.write("\t\t\t\tvar footNote = document.getElementById('footNote').value;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t/* alert( \"ebbs/dynamicFieldsAction.do?fieldId=\" + fieldIdArray\r\n");
      out.write("\t\t\t\t\t\t+ \"&fieldName=\" + fieldNameArray + \"&fieldType=\"\r\n");
      out.write("\t\t\t\t\t\t+ fieldTypeArray + \"&fieldMandatory=\" + fieldMandatoryArray\r\n");
      out.write("\t\t\t\t\t\t+ \"&fieldOrder=\" + fieldOrderArray+ \"&fieldLabel=\" + fieldLabelArray+\"&templateId=\"+templateId+\"&pageId=\"+pageId+\"&countrySelected=\"+countrySelected+\"&hearus=\"+hearus+\"&footNote=\"+footNote); */\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\twindow.location = \"ebbs/dynamicFieldsAction.do?fieldId=\" + fieldIdArray\r\n");
      out.write("\t\t\t\t\t+ \"&fieldName=\" + fieldNameArray + \"&fieldType=\"\r\n");
      out.write("\t\t\t\t\t+ fieldTypeArray + \"&fieldMandatory=\" + fieldMandatoryArray\r\n");
      out.write("\t\t\t\t\t+ \"&fieldOrder=\" + fieldOrderArray+ \"&fieldLabel=\" + fieldLabelArray+\"&templateId=\"+templateId+\"&pageId=\"+pageId+\"&countrySelected=\"+countrySelected+\"&hearus=\"+hearus+\"&footNote=\"+footNote;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//parent.refreshPage();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} catch (e) {\r\n");
      out.write("\t\t\talert(e);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"medium-spacer\"></div>\r\n");
      //  s:div
      org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_005fdiv_005f0 = (org.apache.struts2.views.jsp.ui.DivTag) _005fjspx_005ftagPool_005fs_005fdiv.get(org.apache.struts2.views.jsp.ui.DivTag.class);
      _jspx_th_s_005fdiv_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fdiv_005f0.setParent(null);
      int _jspx_eval_s_005fdiv_005f0 = _jspx_th_s_005fdiv_005f0.doStartTag();
      if (_jspx_eval_s_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fdiv_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fdiv_005f0.doInitBody();
        }
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');

String disabled="";
int onceActiveFlag=0;
if(request.getAttribute("onceActiveFlag")==null)
{
	onceActiveFlag=0;
}
else
{
	onceActiveFlag=(Integer)request.getAttribute("onceActiveFlag");
}
if(onceActiveFlag==1)
{
disabled="disabled";
}
else
{
	disabled="";
}
System.out.println("disabled==u===="+disabled);
String[] countryList = StringUtility.countryList;
String[] countryKey = StringUtility.countryKey;
String[] hearUSList = StringUtility.hearUSList;
String[] hearUSKey = StringUtility.hearUSKey;

String pageCheck=(String)request.getAttribute("pageCheck");
if(pageCheck==null)pageCheck="";

String htmlContent=(String)request.getAttribute("htmlContent");
if(htmlContent==null)htmlContent="";

String successMessage=(String)request.getAttribute("successMessage");
if(successMessage==null)successMessage="";

List <String> projectFieldListDB=(List<String>)request.getAttribute("projectFieldListDB");
if(projectFieldListDB==null) projectFieldListDB=new ArrayList();

List <ProjectField> projectFieldList=(List)request.getAttribute("projectFieldList");

          out.write('\r');
          out.write('\n');
          out.write('	');
          //  s:form
          org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
          _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_s_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f0);
          // /WEB-INF/view/jsp/dynamicFields.jsp(169,1) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_s_005fform_005f0.setAction("#");
          // /WEB-INF/view/jsp/dynamicFields.jsp(169,1) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_s_005fform_005f0.setTheme("xhtml");
          int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
          if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_s_005fform_005f0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t");

if(projectFieldList!=null)
{

              out.write("\r\n");
              out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"dataTable\" border=\"1\"\r\n");
              out.write("\t\t\tclass=\"dataTable\">\r\n");
              out.write("\r\n");
              out.write("\t\t\t<colgroup>\r\n");
              out.write("\t\t\t\t<col span=\"7\" />\r\n");
              out.write("\t\t\t\t<col />\r\n");
              out.write("\t\t\t</colgroup>\r\n");
              out.write("\t\t\t<tr style=\"font-size: 12px\">\r\n");
              out.write("\t\t\t\t<th width=\"20\"><input type=\"checkbox\" name=\"checked\"\r\n");
              out.write("\t\t\t\t\tid=\"checked\"\r\n");
              out.write("\t\t\t\t\tonclick=\"checkAllCheckbox('dataTable',");
              out.print(DynamicFieldConstants.PROMOCODE);
              out.write(")\"></th>\r\n");
              out.write("\t\t\t\t<th>Serial ID</th>\r\n");
              out.write("\t\t\t\t<th>Field Name</th>\r\n");
              out.write("\t\t\t\t<th>Field Type</th>\r\n");
              out.write("\t\t\t\t<th>Field Label</th>\r\n");
              out.write("\t\t\t\t<th>Mandatory</th>\r\n");
              out.write("\t\t\t\t<th>Order</th>\r\n");
              out.write("\t\t\t\t<th>Value</th>\r\n");
              out.write("\t\t\t\t<th>Field Footnote</th>\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t\t");
  
			String promoConfigExist =(String)request.getAttribute("promoConfigExist");
			String fieldIdArr="", fieldNameArr="", fieldTypeArr="";
			List<DynamicField> DYNAMIC_FIELDS=AppSystem.DYNAMIC_FIELDS;
			if(DYNAMIC_FIELDS!=null && DYNAMIC_FIELDS.size()>0)
			{
				for(DynamicField dfList : DYNAMIC_FIELDS)
				{
					fieldIdArr=fieldIdArr+String.valueOf(dfList.getFieldId())+",";
					fieldNameArr=fieldNameArr+dfList.getFieldName()+",";
					fieldTypeArr=fieldTypeArr+dfList.getFieldType()+",";
				}
			}
			fieldIdArr=fieldIdArr.substring(0,fieldIdArr.length()-1);
			fieldIdArr="\"\","+fieldIdArr;
			fieldNameArr=fieldNameArr.substring(0,fieldNameArr.length()-1);
			fieldNameArr="\"\","+fieldNameArr;
			fieldTypeArr=fieldTypeArr.substring(0,fieldTypeArr.length()-1);
			fieldTypeArr="\"\","+fieldTypeArr;
		
			
		    String[] fieldId=fieldIdArr.split(",");
            String[] fieldName=fieldNameArr.split(","); 
            String[] fieldType=fieldTypeArr.split(","); 
           
           ArrayList arr=new ArrayList();
             if(projectFieldList!=null)
             {
            	 for(ProjectField objfield : projectFieldList)
         		 {
            		 arr.add(objfield.getFldId());
         		 }	 
             }
             
             boolean b=false;
             
          
           for(int i=1;i<fieldName.length;i++)
           { 
         	  b=false;
         	 if(projectFieldList!=null)
         	  if(projectFieldList.size()==0)
         	  {
              out.write("\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<td style=\"text-align: center;\" align=\"justify\">\r\n");
              out.write("\t\t\t\t\t<!-- <input type=\"checkbox\" name=\"checked");
              out.print(i );
              out.write("\" id=\"checked");
              out.print(i );
              out.write("\"> -->\r\n");
              out.write("\t\t\t\t\t");
if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.PROMOCODE)))
				{
				System.out.println("fieldName[i]===="+fieldId[i]+"==="+i);
              out.write(' ');
              //  s:a
              org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
              _jspx_th_s_005fa_005f0.setPageContext(_jspx_page_context);
              _jspx_th_s_005fa_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
              // /WEB-INF/view/jsp/dynamicFields.jsp(242,65) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f0.setAction("displayPromocode.do");
              // /WEB-INF/view/jsp/dynamicFields.jsp(242,65) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f0.setId("promocode1");
              // /WEB-INF/view/jsp/dynamicFields.jsp(242,65) name = escapeAmp type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f0.setEscapeAmp("false");
              int _jspx_eval_s_005fa_005f0 = _jspx_th_s_005fa_005f0.doStartTag();
              if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_s_005fa_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_s_005fa_005f0.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  if (_jspx_meth_s_005fparam_005f0(_jspx_th_s_005fa_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  if (_jspx_meth_s_005fparam_005f1(_jspx_th_s_005fa_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"checked");
                  out.print(i );
                  out.write("\" id=\"checked");
                  out.print(i );
                  out.write("\">\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_s_005fa_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_s_005fa_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f0);
              out.write(' ');
}
				else 
				{
				
              out.write(" <input type=\"checkbox\" name=\"checked");
              out.print(i );
              out.write("\" id=\"checked");
              out.print(i );
              out.write("\">\r\n");
              out.write("\t\t\t\t\t");
} 
			   
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t<td width=\"20\" align=\"justify\"><input type=\"text\"\r\n");
              out.write("\t\t\t\t\tname=\"fieldId");
              out.print(i );
              out.write("\" id=\"fieldId");
              out.print(i );
              out.write("\" value=\"");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldLabel");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldLabel");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldName[i] );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldType");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldType");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldType[i] );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldName");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldName");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldName[i] );
              out.write('"');
              out.write('>');
              out.write(' ');
              if (_jspx_meth_s_005fset_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
                return;
              out.write(' ');

				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.PROMOCODE)))
				{
              out.write(' ');
              if (_jspx_meth_s_005fif_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
                return;
              out.write(' ');
}
				
              out.write("</td>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<td style=\"text-align: center;\"><input type=\"checkbox\"\r\n");
              out.write("\t\t\t\t\tname=\"fieldMandatory");
              out.print(i );
              out.write("\" id=\"fieldMandatory");
              out.print(i );
              out.write("\" value=\"1\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><select name=\"fieldOrder");
              out.print(i );
              out.write("\" id=\"fieldOrder");
              out.print(i );
              out.write("\">\r\n");
              out.write("\t\t\t\t\t\t");
for(int ii=1;ii<13;ii++){ 
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(ii);
              out.write('"');
              out.write('>');
              out.print(ii);
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\t\t\t\t");
if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.COUNTRY)))
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td><select name=\"countrySelected\" id=\"countrySelected\">\r\n");
              out.write("\t\t\t\t\t\t");
for (int is = 0; is < countryKey.length; is++)
						{
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(countryKey[is]);
              out.write('"');
              out.write('>');
              out.print(countryList[is] );
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\t\t\t\t");
}	
				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.WHERE_DID_YOU_HEAR_ABOUT_US)))
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td><select name=\"hearus\" id=\"hearus\">\r\n");
              out.write("\t\t\t\t\t\t");
for (int iss = 0; iss < hearUSKey.length; iss++)
						{
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(hearUSKey[iss]);
              out.write('"');
              out.write('>');
              out.print(hearUSList[iss] );
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\t\t\t\t");
}
				else
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
              out.write("\t\t\t\t");
}
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t");
if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.STATE)))
				{
				
              out.write("\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"footNote\" id=\"footNote\" /></td>\r\n");
              out.write("\t\t\t\t");
}
				else
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
              out.write("\t\t\t\t");

				}
				
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\r\n");
              out.write("\t\t\t");
}
         	  else
         	  {
         		 for(ProjectField obj : projectFieldList)
         		 {
         			 if(obj.getFldId()==i)
         			 {
           	  
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<td style=\"text-align: center;\" align=\"justify\">\r\n");
              out.write("\t\t\t\t\t");

				System.out.println("fieldName[i]===="+obj.getAutoId()+"==="+i);
				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.PROMOCODE))){
					System.out.println("fieldName[i]===="+fieldId[i]+"==="+i);
              out.write(' ');
              //  s:a
              org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
              _jspx_th_s_005fa_005f2.setPageContext(_jspx_page_context);
              _jspx_th_s_005fa_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
              // /WEB-INF/view/jsp/dynamicFields.jsp(345,66) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f2.setAction("displayPromocode.do");
              // /WEB-INF/view/jsp/dynamicFields.jsp(345,66) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f2.setId("promocode1");
              // /WEB-INF/view/jsp/dynamicFields.jsp(345,66) name = escapeAmp type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f2.setEscapeAmp("false");
              int _jspx_eval_s_005fa_005f2 = _jspx_th_s_005fa_005f2.doStartTag();
              if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_s_005fa_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_s_005fa_005f2.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  if (_jspx_meth_s_005fparam_005f4(_jspx_th_s_005fa_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  if (_jspx_meth_s_005fparam_005f5(_jspx_th_s_005fa_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"checked");
                  out.print(i );
                  out.write("\" id=\"checked");
                  out.print(i );
                  out.write("\"\r\n");
                  out.write("\t\t\t\t\t\t\t");
if(obj.getFldId()==i){ if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.PROMOCODE))){ if(promoConfigExist.equalsIgnoreCase("true")){ 
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\tchecked=\"checked\" ");
}}else {
                  out.write(" checked=\"checked\" ");
}
                  out.write(' ');
}
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.print(disabled);
                  out.write(' ');
}
                  out.write(">\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_s_005fa_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_s_005fa_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f2);
              out.write(' ');
}
				else if(!fieldName[i].equalsIgnoreCase("Promo Codes"))
				{
				
              out.write(" <input type=\"checkbox\" name=\"checked");
              out.print(i );
              out.write("\" id=\"checked");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i){ if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.PROMOCODE))){ if(promoConfigExist.equalsIgnoreCase("true")){ 
              out.write("\r\n");
              out.write("\t\t\t\t\tchecked=\"checked\" ");
}}else {
              out.write(" checked=\"checked\" ");
}}
              out.write("\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(disabled);
              out.write(' ');
}
              out.write('>');
              out.write(' ');
} 
              out.write("\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t<td width=\"20\" align=\"justify\"><input type=\"text\"\r\n");
              out.write("\t\t\t\t\tname=\"fieldId");
              out.print(i );
              out.write("\" id=\"fieldId");
              out.print(i );
              out.write("\" value=\"");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldLabel");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldLabel");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldName[i] );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldType");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldType");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldType[i] );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldName");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldName");
              out.print(i );
              out.write("\" value=\"");
              out.print(obj.getFldText() );
              out.write("\"\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(disabled);
              out.write(' ');
}
              out.write('>');
              out.write(' ');
              if (_jspx_meth_s_005fset_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
                return;
              out.write(' ');

				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.PROMOCODE)))
				{
              out.write(' ');
              if (_jspx_meth_s_005fif_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
                return;
              out.write(' ');
}
				
              out.write("</td>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<td style=\"text-align: center;\"><input type=\"checkbox\"\r\n");
              out.write("\t\t\t\t\tname=\"fieldMandatory");
              out.print(i );
              out.write("\" id=\"fieldMandatory");
              out.print(i );
              out.write("\" value=\"1\"\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldMandatory()==1){ 
              out.write(" checked=\"checked\" ");
} 
              out.write("\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(disabled);
              out.write(' ');
}
              out.write("></td>\r\n");
              out.write("\t\t\t\t<td><select name=\"fieldOrder");
              out.print(i );
              out.write("\" id=\"fieldOrder");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(disabled);
              out.write(' ');
}
              out.write(">\r\n");
              out.write("\t\t\t\t\t\t");
for(int ii=1;ii<13;ii++){ 
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(ii);
              out.write('"');
              out.write(' ');
if(obj.getFldOrder()==ii){ 
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\tselected=\"selected\" ");
} 
              out.write('>');
              out.print(ii);
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<!-- New Fields Added -->\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t");

				System.out.println("New Fields Added=="+fieldName[i]+"==obj.getFldDefault()=="+obj.getFldDefault());
				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.COUNTRY)))
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td><select name=\"countrySelected\" id=\"countrySelected\"\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(disabled);
              out.write(' ');
}
              out.write(">\r\n");
              out.write("\t\t\t\t\t\t");
for (int is = 0; is < countryKey.length; is++)
						{
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(countryKey[is]);
              out.write("\"\r\n");
              out.write("\t\t\t\t\t\t\t");
 if(obj.getFldDefault()!=null) if(obj.getFldDefault().equalsIgnoreCase(countryKey[is])){
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\tselected=\"selected\" ");
} 
              out.write('>');
              out.print(countryList[is] );
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\t\t\t\t");
}	
				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.WHERE_DID_YOU_HEAR_ABOUT_US)))
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td><select name=\"hearus\" id=\"hearus\"\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(disabled);
              out.write(' ');
}
              out.write(">\r\n");
              out.write("\t\t\t\t\t\t");
for (int iss = 0; iss < hearUSKey.length; iss++)
						{
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(hearUSKey[iss]);
              out.write("\"\r\n");
              out.write("\t\t\t\t\t\t\t");
 if(obj.getFldDefault()!=null) if(obj.getFldDefault().equalsIgnoreCase(hearUSKey[iss])){
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\tselected=\"selected\" ");
} 
              out.write('>');
              out.print(hearUSList[iss] );
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\t\t\t\t");
}
				else
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
              out.write("\t\t\t\t");
}
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t");
if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.STATE)))
				{
					String footNoteVal="";
					if(obj.getFldFootnote()!=null)
					{
						footNoteVal=obj.getFldFootnote();
					}
				
              out.write("\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"footNote\" id=\"footNote\"\r\n");
              out.write("\t\t\t\t\tvalue=\"");
              out.print(footNoteVal);
              out.write("\"\r\n");
              out.write("\t\t\t\t\t");
if(obj.getFldId()==i && projectFieldListDB.contains(String.valueOf(obj.getFldId()))){
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(disabled);
              out.write(' ');
}
              out.write(" /></td>\r\n");
              out.write("\t\t\t\t");
}
				else
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
              out.write("\t\t\t\t");

				}
				
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<!-- End -->\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t\t");

				 b=true;
         			 }
         			 else if(arr.contains(i))
         			 {
         				 b=false;
         			 }
         			 else 
         			 {
              out.write("\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<td style=\"text-align: center;\" align=\"justify\">\r\n");
              out.write("\t\t\t\t\t");
if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.PROMOCODE)))
				{
				System.out.println("fieldName[i]===="+fieldName[i]+"==="+i);
              out.write(' ');
              //  s:a
              org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f4 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
              _jspx_th_s_005fa_005f4.setPageContext(_jspx_page_context);
              _jspx_th_s_005fa_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
              // /WEB-INF/view/jsp/dynamicFields.jsp(483,67) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f4.setAction("displayPromocode.do");
              // /WEB-INF/view/jsp/dynamicFields.jsp(483,67) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f4.setId("promocode1");
              // /WEB-INF/view/jsp/dynamicFields.jsp(483,67) name = escapeAmp type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fa_005f4.setEscapeAmp("false");
              int _jspx_eval_s_005fa_005f4 = _jspx_th_s_005fa_005f4.doStartTag();
              if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_s_005fa_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_s_005fa_005f4.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  if (_jspx_meth_s_005fparam_005f8(_jspx_th_s_005fa_005f4, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  if (_jspx_meth_s_005fparam_005f9(_jspx_th_s_005fa_005f4, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"checked");
                  out.print(i );
                  out.write("\" id=\"checked");
                  out.print(i );
                  out.write("\">\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_s_005fa_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_s_005fa_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f4);
              out.write(' ');
}
				else 
				{
				
              out.write(" <input type=\"checkbox\" name=\"checked");
              out.print(i );
              out.write("\" id=\"checked");
              out.print(i );
              out.write("\">\r\n");
              out.write("\t\t\t\t\t");
} 
			   
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t<td width=\"20\" align=\"justify\"><input type=\"text\"\r\n");
              out.write("\t\t\t\t\tname=\"fieldId");
              out.print(i );
              out.write("\" id=\"fieldId");
              out.print(i );
              out.write("\" value=\"");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldLabel");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldLabel");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldName[i] );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldType");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldType");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldType[i] );
              out.write("\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"fieldName");
              out.print(i );
              out.write("\"\r\n");
              out.write("\t\t\t\t\tid=\"fieldName");
              out.print(i );
              out.write("\" value=\"");
              out.print(fieldName[i] );
              out.write('"');
              out.write('>');
              out.write(' ');
              if (_jspx_meth_s_005fset_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
                return;
              out.write(' ');

				if(fieldName[i].equalsIgnoreCase("Promo Codes"))
				{
              out.write(' ');
              if (_jspx_meth_s_005fif_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
                return;
              out.write(' ');
}
				
              out.write("</td>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<td style=\"text-align: center;\"><input type=\"checkbox\"\r\n");
              out.write("\t\t\t\t\tname=\"fieldMandatory");
              out.print(i );
              out.write("\" id=\"fieldMandatory");
              out.print(i );
              out.write("\" value=\"1\"\r\n");
              out.write("\t\t\t\t\treadonly=\"readonly\"></td>\r\n");
              out.write("\t\t\t\t<td><select name=\"fieldOrder");
              out.print(i );
              out.write("\" id=\"fieldOrder");
              out.print(i );
              out.write("\">\r\n");
              out.write("\t\t\t\t\t\t");
for(int ii=1;ii<13;ii++){ 
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(ii);
              out.write('"');
              out.write('>');
              out.print(ii);
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<!-- New Fields Added -->\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t");

				System.out.println("New Fields Added=="+fieldName[i]);
				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.COUNTRY)))
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td><select name=\"countrySelected\" id=\"countrySelected\">\r\n");
              out.write("\t\t\t\t\t\t");
for (int is = 0; is < countryKey.length; is++)
						{
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(countryKey[is]);
              out.write("\"\r\n");
              out.write("\t\t\t\t\t\t\t");
 if(obj.getFldDefault()!=null) if(obj.getFldDefault().equalsIgnoreCase(countryKey[is])){
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\tselected=\"selected\" ");
} 
              out.write('>');
              out.print(countryList[is] );
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\t\t\t\t");
}	
				if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.WHERE_DID_YOU_HEAR_ABOUT_US)))
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td><select name=\"hearus\" id=\"hearus\">\r\n");
              out.write("\t\t\t\t\t\t");
for (int iss = 0; iss < hearUSKey.length; iss++)
						{
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<option value=\"");
              out.print(hearUSKey[iss]);
              out.write("\"\r\n");
              out.write("\t\t\t\t\t\t\t");
 if(obj.getFldDefault()!=null) if(obj.getFldDefault().equalsIgnoreCase(hearUSKey[iss])){
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\tselected=\"selected\" ");
} 
              out.write('>');
              out.print(hearUSList[iss] );
              out.write("</option>\r\n");
              out.write("\t\t\t\t\t\t");
} 
              out.write("\r\n");
              out.write("\t\t\t\t</select></td>\r\n");
              out.write("\t\t\t\t");
}
				else
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
              out.write("\t\t\t\t");
}
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t");
if(fieldId[i].equalsIgnoreCase(String.valueOf(DynamicFieldConstants.STATE)))
				{
					String footNoteVal="";
					if(obj.getFldFootnote()!=null)
					{
						footNoteVal=obj.getFldFootnote();
					}
				
              out.write("\r\n");
              out.write("\t\t\t\t<td><input type=\"text\" name=\"footNote\" id=\"footNote\"\r\n");
              out.write("\t\t\t\t\tvalue=\"");
              out.print(footNoteVal);
              out.write("\" /></td>\r\n");
              out.write("\t\t\t\t");
}
				else
				{
              out.write("\r\n");
              out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
              out.write("\t\t\t\t");

				}
				
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<!-- End -->\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t\t");

         			b=true;
         			//break;
         			 }
         			 if(b)
         				 break;	
         			 }
         		
         		 }
         	  } 
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t</table>\r\n");
              out.write("\t\t");
}
else
{if(successMessage!=""){
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"dataTable\" border=\"1\"\r\n");
              out.write("\t\t\tstyle=\"background-color: #dfeffc; border-color: #dfeffc; border: thin;\">\r\n");
              out.write("\r\n");
              out.write("\t\t\t<tr style=\"font-size: 12px\">\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t<th>");
              out.print(successMessage );
              out.write("</th>\r\n");
              out.write("\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t\t");
}}

              out.write("\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005faction.reuse(_jspx_th_s_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005faction.reuse(_jspx_th_s_005fform_005f0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"successMessage\"\r\n");
          out.write("\t\t\t\tvalue=\"");
          out.print(successMessage );
          out.write("\" id=\"successMessage\">\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"htmlContent1\" value=\"");
          out.print(htmlContent );
          out.write("\"\r\n");
          out.write("\t\t\t\tid=\"htmlContent1\">\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"pageCheck\" value=\"");
          out.print(pageCheck );
          out.write("\"\r\n");
          out.write("\t\t\t\tid=\"pageCheck\">\r\n");
          out.write("\t\t\t<script>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t  \r\n");
          out.write("\t\t   \r\n");
          out.write("\t\t   \r\n");
          out.write("\t\tjQuery(document).ready(function(){\r\n");
          out.write("\t\t\t  $(\"#promocode, #promocode1\").fancybox({\r\n");
          out.write("\t\t\t\t\t'width'\t\t\t\t: '80%',\t\t\r\n");
          out.write("\t\t\t\t\t'autoScale'\t\t\t: 'true',\r\n");
          out.write("\t\t\t\t\t'transitionIn'\t\t: 'elastic',\r\n");
          out.write("\t\t\t\t\t'transitionOut'\t\t: 'elastic',\r\n");
          out.write("\t\t\t\t\t'type'\t\t\t\t: 'iframe',\r\n");
          out.write("\t\t\t\t\t'padding'\t\t\t: '0',\r\n");
          out.write("\t\t\t\t\t'margin'\t\t\t: '0',\r\n");
          out.write("\t\t\t\t\t'top'\t\t\t\t: '0',\r\n");
          out.write("\t\t\t\t\t'left'\t\t\t\t: '0',\r\n");
          out.write("\t\t\t\t\t'scrolling'   \t\t: 'auto',\r\n");
          out.write("\t\t\t\t\t 'onComplete' : function() {\r\n");
          out.write("\t\t\t\t\t\t    $('#fancybox-frame').load(function() { // wait for frame to load and then gets it's height\r\n");
          out.write("\t\t\t\t\t\t      $('#fancybox-content').height($(this).contents().find('body').height()+20);\r\n");
          out.write("\t\t\t\t\t\t    });\r\n");
          out.write("\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t});\r\n");
          out.write("\t\t});\r\n");
          out.write("\t\t\r\n");
          out.write("\t\r\n");
          out.write("\t\t</script>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fdiv_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fdiv_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");

	if(projectFieldList!=null)
	{
	
          out.write("\r\n");
          out.write("\t\t\t<div class=\"btnWrapper\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_sj_005fsubmit_005f0(_jspx_th_s_005fdiv_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_sj_005fsubmit_005f1(_jspx_th_s_005fdiv_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t");

	}
	
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_s_005fdiv_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fdiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fdiv_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fdiv.reuse(_jspx_th_s_005fdiv_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fdiv.reuse(_jspx_th_s_005fdiv_005f0);
      out.write("\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("function onLoad()\r\n");
      out.write("{\r\n");
      out.write("\tvar pageCheck=\"\";\r\n");
      out.write("\tif(document.getElementById(\"successMessage\").value!=\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tparent.document.getElementById(\"htmlContent\").value=document.getElementById(\"htmlContent1\").value;\r\n");
      out.write("\t\tpageCheck=document.getElementById(\"pageCheck\").value;\r\n");
      out.write("\t\tif(pageCheck==null) pageCheck=\"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(document.getElementById(\"htmlContent1\").value!=\"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar pageide = parent.document.getElementById('pageide').value;\r\n");
      out.write("\t\t\tvar pageid;\r\n");
      out.write("\t\t\tpageid=parseInt(pageide);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tparent.document.frm.action=\"ebbs/nextPageSubmit.do?back=\"+pageCheck+\"&refershPage=true&buttonClicked=true\";\r\n");
      out.write("\t\t\tparent.document.getElementById('pageide').value=pageid;\r\n");
      out.write("\t\t\tparent.document.frm.submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("onLoad();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fhidden_005f2(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f0 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(244,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f0.setName("codeConfig.projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(244,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f0.setValue("template.projectId");
    int _jspx_eval_s_005fparam_005f0 = _jspx_th_s_005fparam_005f0.doStartTag();
    if (_jspx_th_s_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f1 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(245,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f1.setName("codeValue.count");
    // /WEB-INF/view/jsp/dynamicFields.jsp(245,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f1.setValue("0");
    int _jspx_eval_s_005fparam_005f1 = _jspx_th_s_005fparam_005f1.doStartTag();
    if (_jspx_th_s_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f0 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(268,55) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f0.setVar("projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(268,55) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f0.setValue("template.projectId");
    int _jspx_eval_s_005fset_005f0 = _jspx_th_s_005fset_005f0.doStartTag();
    if (_jspx_th_s_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(271,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("%{#projectId!='' && #projectId>0 }");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fa_005f1(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(272,6) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setAction("displayPromocode.do");
    // /WEB-INF/view/jsp/dynamicFields.jsp(272,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setId("promocode");
    // /WEB-INF/view/jsp/dynamicFields.jsp(272,6) name = escapeAmp type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setEscapeAmp("false");
    int _jspx_eval_s_005fa_005f1 = _jspx_th_s_005fa_005f1.doStartTag();
    if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fparam_005f2(_jspx_th_s_005fa_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fparam_005f3(_jspx_th_s_005fa_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<img\r\n");
        out.write("\t\t\t\t\t\t\t\tsrc=\"");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fa_005f1, _jspx_page_context))
          return true;
        out.write("/img/generatepromo.png\"\r\n");
        out.write("\t\t\t\t\t\t\t\ttitle=\"Generate Promo\" />\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fa_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f2 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f1);
    // /WEB-INF/view/jsp/dynamicFields.jsp(273,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f2.setName("codeConfig.projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(273,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f2.setValue("template.projectId");
    int _jspx_eval_s_005fparam_005f2 = _jspx_th_s_005fparam_005f2.doStartTag();
    if (_jspx_th_s_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f3 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f1);
    // /WEB-INF/view/jsp/dynamicFields.jsp(274,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f3.setName("codeValue.count");
    // /WEB-INF/view/jsp/dynamicFields.jsp(274,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f3.setValue("0");
    int _jspx_eval_s_005fparam_005f3 = _jspx_th_s_005fparam_005f3.doStartTag();
    if (_jspx_th_s_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f1);
    // /WEB-INF/view/jsp/dynamicFields.jsp(277,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("%{@main.java.com.mps.common.AppSystem@STATIC_PATH}");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f4 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f2);
    // /WEB-INF/view/jsp/dynamicFields.jsp(347,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f4.setName("codeConfig.projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(347,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f4.setValue("template.projectId");
    int _jspx_eval_s_005fparam_005f4 = _jspx_th_s_005fparam_005f4.doStartTag();
    if (_jspx_th_s_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f5 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f2);
    // /WEB-INF/view/jsp/dynamicFields.jsp(348,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f5.setName("codeValue.count");
    // /WEB-INF/view/jsp/dynamicFields.jsp(348,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f5.setValue("0");
    int _jspx_eval_s_005fparam_005f5 = _jspx_th_s_005fparam_005f5.doStartTag();
    if (_jspx_th_s_005fparam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f1 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(376,26) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f1.setVar("projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(376,26) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f1.setValue("template.projectId");
    int _jspx_eval_s_005fset_005f1 = _jspx_th_s_005fset_005f1.doStartTag();
    if (_jspx_th_s_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(379,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("%{#projectId!='' && #projectId>0 }");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fa_005f3(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/view/jsp/dynamicFields.jsp(380,6) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setAction("displayPromocode.do");
    // /WEB-INF/view/jsp/dynamicFields.jsp(380,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setId("promocode");
    // /WEB-INF/view/jsp/dynamicFields.jsp(380,6) name = escapeAmp type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setEscapeAmp("false");
    int _jspx_eval_s_005fa_005f3 = _jspx_th_s_005fa_005f3.doStartTag();
    if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fparam_005f6(_jspx_th_s_005fa_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fparam_005f7(_jspx_th_s_005fa_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<!--<strong>Promo Code</strong>-->\r\n");
        out.write("\t\t\t\t\t\t\t<img\r\n");
        out.write("\t\t\t\t\t\t\t\tsrc=\"");
        if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005fa_005f3, _jspx_page_context))
          return true;
        out.write("/img/generatepromo.png\"\r\n");
        out.write("\t\t\t\t\t\t\t\ttitle=\"Generate Promo\" />\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fa_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f6 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f3);
    // /WEB-INF/view/jsp/dynamicFields.jsp(381,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f6.setName("codeConfig.projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(381,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f6.setValue("template.projectId");
    int _jspx_eval_s_005fparam_005f6 = _jspx_th_s_005fparam_005f6.doStartTag();
    if (_jspx_th_s_005fparam_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f7 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f3);
    // /WEB-INF/view/jsp/dynamicFields.jsp(382,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f7.setName("codeValue.count");
    // /WEB-INF/view/jsp/dynamicFields.jsp(382,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f7.setValue("0");
    int _jspx_eval_s_005fparam_005f7 = _jspx_th_s_005fparam_005f7.doStartTag();
    if (_jspx_th_s_005fparam_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f3);
    // /WEB-INF/view/jsp/dynamicFields.jsp(386,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("%{@main.java.com.mps.common.AppSystem@STATIC_PATH}");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f8 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f4);
    // /WEB-INF/view/jsp/dynamicFields.jsp(485,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f8.setName("codeConfig.projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(485,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f8.setValue("template.projectId");
    int _jspx_eval_s_005fparam_005f8 = _jspx_th_s_005fparam_005f8.doStartTag();
    if (_jspx_th_s_005fparam_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f9 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f4);
    // /WEB-INF/view/jsp/dynamicFields.jsp(486,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f9.setName("codeValue.count");
    // /WEB-INF/view/jsp/dynamicFields.jsp(486,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f9.setValue("0");
    int _jspx_eval_s_005fparam_005f9 = _jspx_th_s_005fparam_005f9.doStartTag();
    if (_jspx_th_s_005fparam_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f2 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(507,55) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f2.setVar("projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(507,55) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f2.setValue("template.projectId");
    int _jspx_eval_s_005fset_005f2 = _jspx_th_s_005fset_005f2.doStartTag();
    if (_jspx_th_s_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(510,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("%{#projectId!='' && #projectId>0 }");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fa_005f5(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f5 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /WEB-INF/view/jsp/dynamicFields.jsp(511,6) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f5.setAction("displayPromocode.do");
    // /WEB-INF/view/jsp/dynamicFields.jsp(511,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f5.setId("promocode");
    // /WEB-INF/view/jsp/dynamicFields.jsp(511,6) name = escapeAmp type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f5.setEscapeAmp("false");
    int _jspx_eval_s_005fa_005f5 = _jspx_th_s_005fa_005f5.doStartTag();
    if (_jspx_eval_s_005fa_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fparam_005f10(_jspx_th_s_005fa_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fparam_005f11(_jspx_th_s_005fa_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<!--<strong>Promo Code</strong>-->\r\n");
        out.write("\t\t\t\t\t\t\t<img\r\n");
        out.write("\t\t\t\t\t\t\t\tsrc=\"");
        if (_jspx_meth_s_005fproperty_005f2(_jspx_th_s_005fa_005f5, _jspx_page_context))
          return true;
        out.write("/img/generatepromo.png\"\r\n");
        out.write("\t\t\t\t\t\t\t\ttitle=\"Generate Promo\" />\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fa_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fid_005fescapeAmp_005faction.reuse(_jspx_th_s_005fa_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f10 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f5);
    // /WEB-INF/view/jsp/dynamicFields.jsp(512,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f10.setName("codeConfig.projectId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(512,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f10.setValue("template.projectId");
    int _jspx_eval_s_005fparam_005f10 = _jspx_th_s_005fparam_005f10.doStartTag();
    if (_jspx_th_s_005fparam_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f11 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f5);
    // /WEB-INF/view/jsp/dynamicFields.jsp(513,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f11.setName("codeValue.count");
    // /WEB-INF/view/jsp/dynamicFields.jsp(513,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f11.setValue("0");
    int _jspx_eval_s_005fparam_005f11 = _jspx_th_s_005fparam_005f11.doStartTag();
    if (_jspx_th_s_005fparam_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f5);
    // /WEB-INF/view/jsp/dynamicFields.jsp(517,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("%{@main.java.com.mps.common.AppSystem@STATIC_PATH}");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(656,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("template.templateId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(656,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("templateId");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(657,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("pageId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(657,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("pageId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(657,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setValue("%{request.pageId}");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_sj_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sj:submit
    com.jgeppert.struts2.jquery.views.jsp.ui.SubmitTag _jspx_th_sj_005fsubmit_005f0 = (com.jgeppert.struts2.jquery.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005findicator_005fid_005fformIds_005fbutton_005fnobody.get(com.jgeppert.struts2.jquery.views.jsp.ui.SubmitTag.class);
    _jspx_th_sj_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sj_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(663,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f0.setId("grid_edit_addbutton");
    // /WEB-INF/view/jsp/dynamicFields.jsp(663,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f0.setValue("Submit");
    // /WEB-INF/view/jsp/dynamicFields.jsp(663,4) name = button type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f0.setButton("true");
    // /WEB-INF/view/jsp/dynamicFields.jsp(663,4) name = indicator type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f0.setIndicator("indicator");
    // /WEB-INF/view/jsp/dynamicFields.jsp(663,4) name = formIds type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f0.setFormIds("submit");
    // /WEB-INF/view/jsp/dynamicFields.jsp(663,4) name = onclick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f0.setOnclick("javascript:getFielddata('dataTable');");
    int _jspx_eval_sj_005fsubmit_005f0 = _jspx_th_sj_005fsubmit_005f0.doStartTag();
    if (_jspx_th_sj_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005findicator_005fid_005fformIds_005fbutton_005fnobody.reuse(_jspx_th_sj_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005findicator_005fid_005fformIds_005fbutton_005fnobody.reuse(_jspx_th_sj_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_sj_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fdiv_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sj:submit
    com.jgeppert.struts2.jquery.views.jsp.ui.SubmitTag _jspx_th_sj_005fsubmit_005f1 = (com.jgeppert.struts2.jquery.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005fonClickTopics_005fid_005fbutton_005fnobody.get(com.jgeppert.struts2.jquery.views.jsp.ui.SubmitTag.class);
    _jspx_th_sj_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sj_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fdiv_005f0);
    // /WEB-INF/view/jsp/dynamicFields.jsp(666,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f1.setId("grid_cancel");
    // /WEB-INF/view/jsp/dynamicFields.jsp(666,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f1.setValue("Cancel");
    // /WEB-INF/view/jsp/dynamicFields.jsp(666,4) name = onClickTopics type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f1.setOnClickTopics("cancel");
    // /WEB-INF/view/jsp/dynamicFields.jsp(666,4) name = button type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f1.setButton("true");
    // /WEB-INF/view/jsp/dynamicFields.jsp(666,4) name = onclick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fsubmit_005f1.setOnclick("javascript:parent.jQuery.fancybox.close();");
    int _jspx_eval_sj_005fsubmit_005f1 = _jspx_th_sj_005fsubmit_005f1.doStartTag();
    if (_jspx_th_sj_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005fonClickTopics_005fid_005fbutton_005fnobody.reuse(_jspx_th_sj_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsj_005fsubmit_0026_005fvalue_005fonclick_005fonClickTopics_005fid_005fbutton_005fnobody.reuse(_jspx_th_sj_005fsubmit_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f2 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f2.setParent(null);
    // /WEB-INF/view/jsp/dynamicFields.jsp(702,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("pageId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(702,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("pageId");
    // /WEB-INF/view/jsp/dynamicFields.jsp(702,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setValue("%{request.pageId}");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
    return false;
  }
}
