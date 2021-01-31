package org.apache.jsp.WEB_002dINF.view.jsp.promocode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fnamespace_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fid_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fcssClass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fnamespace_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fnamespace_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fid_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fcssClass_005fnobody.release();
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
      out.write("<style>\r\n");
      out.write("#mainwrapper\r\n");
      out.write("{\r\n");
      out.write("overflow-x: hidden; \r\n");
      out.write("height: 100px; \r\n");
      out.write("border: 1px gray solid; \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showRow(tableID)\r\n");
      out.write("{\r\n");
      out.write("\tvar table = document.getElementById(tableID);\r\n");
      out.write("\tvar isActive=document.getElementById('isActiveFlag').value;\r\n");
      out.write("\t//alert(isActive);\r\n");
      out.write("\tvar myString=document.getElementById('promoCodeId').value;\r\n");
      out.write("\tvar temp = new Array();\r\n");
      out.write("\ttemp = myString.split(',');\r\n");
      out.write("\tfor(var i=0;i<temp.length;i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\tvar row = table.insertRow(i);\r\n");
      out.write("\t\t\tvar cell1 = row.insertCell(0);\r\n");
      out.write("\t\t    var element1 = document.createElement(\"input\");\r\n");
      out.write("\t\t    element1.type = \"checkbox\";\r\n");
      out.write("\t\t  //  element1.checked = \"true\";\r\n");
      out.write("\t\t  if(isActive==1)\r\n");
      out.write("\t\t\t  element1.disabled=\"true\"; \t\t  \r\n");
      out.write("\t\t    cell1.appendChild(element1);\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t    var cell2 = row.insertCell(1);\r\n");
      out.write("\t\t\tvar element2 = document.createElement(\"input\");\r\n");
      out.write("\t\t\telement2.type = \"text\";\r\n");
      out.write("\t\t\telement2.value=temp[i];\r\n");
      out.write("\t\t\telement2.name = \"valueId\" + i;\r\n");
      out.write("\t\t\telement2.id = \"valueId\" + i;\r\n");
      out.write("\t\t\tif(isActive==1)\r\n");
      out.write("\t\t\telement2.disabled=\"true\";\r\n");
      out.write("\t\t\tcell2.appendChild(element2);\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function addRow(tableID) {\r\n");
      out.write("\t \r\n");
      out.write("    var table = document.getElementById(tableID);\r\n");
      out.write("    var rowCount = table.rows.length;\r\n");
      out.write("    var row = table.insertRow(rowCount);\r\n");
      out.write("    var cell1 = row.insertCell(0);\r\n");
      out.write("    var element1 = document.createElement(\"input\");\r\n");
      out.write("    element1.type = \"checkbox\";\r\n");
      out.write("    cell1.appendChild(element1);\r\n");
      out.write("\r\n");
      out.write("    var cell2 = row.insertCell(1);\r\n");
      out.write("\tvar element2 = document.createElement(\"input\");\r\n");
      out.write("\telement2.type = \"text\";\r\n");
      out.write("\telement2.name = \"valueId\" + rowCount;\r\n");
      out.write("\telement2.id = \"valueId\" + rowCount;\r\n");
      out.write("\tcell2.appendChild(element2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function deleteRow(tableID) {\r\n");
      out.write("    try {\r\n");
      out.write("    var table = document.getElementById(tableID);\r\n");
      out.write("    var rowCount = table.rows.length;\r\n");
      out.write("\r\n");
      out.write("    for(var i=0; i<rowCount; i++) {\r\n");
      out.write("        var row = table.rows[i];\r\n");
      out.write("        var chkbox = row.cells[0].childNodes[0];\r\n");
      out.write("        if(null != chkbox && true == chkbox.checked) {\r\n");
      out.write("            table.deleteRow(i);\r\n");
      out.write("            rowCount--;\r\n");
      out.write("            i--;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    }catch(e) {\r\n");
      out.write("        alert(e);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function Display(obj)\r\n");
      out.write("{\r\n");
      out.write(" manualName=document.getElementById(\"MANUALID\");\r\n");
      out.write(" styleName=document.getElementById(\"STYLEID\");\r\n");
      out.write(" typeName=document.getElementById(\"TYPE\");\r\n");
      out.write(" singlePrefix=document.getElementById(\"SINGLEPREFIX\");\r\n");
      out.write(" multiPrefix=document.getElementById(\"MULTIPREFIX\");\r\n");
      out.write(" singleAuto=document.getElementById(\"SINGLEAUTO\");\r\n");
      out.write(" multiAuto=document.getElementById(\"MULTIAUTO\");\r\n");
      out.write(" seltypeName=document.getElementById(\"TYPEID\");\r\n");
      out.write(" if (styleName.value==\"MANUAL\" && obj.value==\"MANUAL\") {manualName.style.display=\"block\";typeName.style.display=\"none\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"none\";multiAuto.style.display=\"none\"}\r\n");
      out.write(" else if (styleName.value==\"PREFIX\" && obj.value==\"PREFIX\") {seltypeName.value=\"MULTI\";manualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"block\";singleAuto.style.display=\"none\";multiAuto.style.display=\"none\"}\r\n");
      out.write(" else if (styleName.value==\"AUTO\" && obj.value==\"AUTO\") { seltypeName.value=\"MULTI\";manualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"none\";multiAuto.style.display=\"block\"}\r\n");
      out.write(" else if (styleName.value==\"PREFIX\" && obj.value==\"MULTI\") { manualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"block\";singleAuto.style.display=\"none\";multiAuto.style.display=\"none\"}\r\n");
      out.write(" else if (styleName.value==\"PREFIX\" && obj.value==\"SINGLE\") { manualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"block\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"none\";multiAuto.style.display=\"none\"}\r\n");
      out.write(" else if (styleName.value==\"AUTO\" && obj.value==\"MULTI\") { manualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"none\";multiAuto.style.display=\"block\"}\r\n");
      out.write(" else if (styleName.value==\"AUTO\" && obj.value==\"SINGLE\") { manualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"block\";multiAuto.style.display=\"none\"}\r\n");
      out.write(" else { typeName.style.display=\"none\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"none\";multiAuto.style.display=\"none\"}\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function beforeSubmit()\r\n");
      out.write("{\r\n");
      out.write("\tvar objForm = document.forms[0];\r\n");
      out.write("\tobjForm.codeStyle.value=null;\r\n");
      out.write("\tobjForm.codeType.value=\"\";\r\n");
      out.write("\tobjForm.codePrefix.value=null;\r\n");
      out.write("\tobjForm.codeQuantity.value=null;\r\n");
      out.write("\tobjForm.codeSize.value=\"\";\r\n");
      out.write("\tstyleName=document.getElementById(\"STYLEID\");\r\n");
      out.write("\ttypeName=document.getElementById(\"TYPEID\");\r\n");
      out.write("\tif (styleName.value==\"MANUAL\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tobjForm.codeStyle.value=styleName.value;\r\n");
      out.write("\t\tvar table = document.getElementById(\"dataTable\");\r\n");
      out.write("\t\tvar rowCount = table.rows.length;\r\n");
      out.write("\t\tvar valuesStr= null;\r\n");
      out.write("\t\tfor ( var i = 0; i < rowCount; i++) \r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar valueId = \"valueId\" + i;\r\n");
      out.write("\t\t\tif(!document.getElementById(valueId).disabled)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\tvar values = document.getElementById(valueId);\r\n");
      out.write("\t\t\tif(valuesStr == null)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\tvaluesStr=values.value;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\tvaluesStr=valuesStr+\",\"+values.value;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tobjForm.promoCodeId.value=valuesStr;\r\n");
      out.write("\t\tobjForm.codeTypeValue.value=\"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tobjForm.action=\"ebbs/addPromoValue.do\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (styleName.value==\"PREFIX\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tobjForm.codeStyle.value=styleName.value;\r\n");
      out.write("\t\tobjForm.codeType.value=typeName.value;\r\n");
      out.write("\t\tif(objForm.codeType.value==\"MULTI\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tobjForm.codePrefix.value=document.getElementById(\"multiprefixid\").value;\r\n");
      out.write("\t\tobjForm.codeQuantity.value=document.getElementById(\"prefixqtyid\").value;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(objForm.codeType.value==\"SINGLE\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tobjForm.codePrefix.value=document.getElementById(\"singleprefixid\").value;\r\n");
      out.write("\t\tobjForm.codeQuantity.value=1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(styleName.value==\"AUTO\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tobjForm.codeStyle.value=styleName.value;\r\n");
      out.write("\t\tobjForm.codeType.value=typeName.value;\r\n");
      out.write("\t\tif(objForm.codeType.value==\"MULTI\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tobjForm.codeSize.value=document.getElementById(\"multiautoid\").value;\r\n");
      out.write("\t\t\tobjForm.codeQuantity.value=document.getElementById(\"autoqtyid\").value;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\telse if(objForm.codeType.value==\"SINGLE\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//alert(document.getElementById(\"singleautoid\").value);\r\n");
      out.write("\t\tobjForm.codeSize.value=document.getElementById(\"singleautoid\").value;\r\n");
      out.write("\t\t//alert(objForm.codeSize.value);\r\n");
      out.write("\t\tobjForm.codeQuantity.value=1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t//onLoad();\r\n");
      out.write("\t\r\n");
      out.write("\tobjForm.submit();\r\n");
      out.write("\tparent.document.forms[0][\"checked9\"].checked = true;\r\n");
      out.write("\tparent.jQuery.fancybox.close();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function validator() {\r\n");
      out.write("\tvar titles = document.getElementById(\"titles\").value;\r\n");
      out.write("\tvar description = document.getElementById(\"description\").value;\r\n");
      out.write("\tif (titles == \"\") {\r\n");
      out.write("\t\tdocument.getElementById(\"message\").style.color = \"red\";\r\n");
      out.write("\t\tdocument.getElementById(\"message\").style.visibility = \"visible\";\r\n");
      out.write("\t\tdocument.getElementById(\"message\").innerHTML = \"Titles field requried cannot be left blank\";\r\n");
      out.write("\t\tdocument.getElementById(\"titles\").style.border = \"3\";\r\n");
      out.write("\t\tdocument.getElementById(\"titles\").style.borderColor = \"red\";\r\n");
      out.write("\t\tdocument.getElementById(\"titles\").focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.getElementById(\"titles\").style.borderColor = \"gray\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif (description == \"\") {\r\n");
      out.write("\t\tdocument.getElementById(\"message\").style.color = \"red\";\r\n");
      out.write("\t\tdocument.getElementById(\"message\").style.visibility = \"visible\";\r\n");
      out.write("\t\tdocument.getElementById(\"message\").innerHTML = \"Description field requried cannot be left blank\";\r\n");
      out.write("\t\tdocument.getElementById(\"description\").style.border = \"3\";\r\n");
      out.write("\t\tdocument.getElementById(\"description\").style.borderColor = \"red\";\r\n");
      out.write("\t\tdocument.getElementById(\"description\").focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tdocument.getElementById(\"message\").style.visibility = \"hidden\";\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"medium-spacer\"></div>\r\n");
      out.write("<div class=\"promoContainer\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("<legend>");
      if (_jspx_meth_s_005ftext_005f0(_jspx_page_context))
        return;
      out.write("</legend>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-1\">\r\n");
      out.write("<label class=\"labelTxt\">");
      if (_jspx_meth_s_005ftext_005f1(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("<select id=\"STYLEID\" onChange=\"Display(this);\"  ");
 if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){
      out.write(" disabled=\"disabled\" ");
}
      out.write(" >\r\n");
      out.write("  <option value=\"MANUAL\" >Manual</option>\r\n");
      out.write("  <option value=\"PREFIX\">Prefix</option>\r\n");
      out.write("  <option value=\"AUTO\">Auto</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clear\"> </div>\r\n");
      out.write("<div ID=\"TYPE\" style=\"display:none;\" class=\"col-1\">\r\n");
      out.write("<label class=\"labelTxt\">");
      if (_jspx_meth_s_005ftext_005f2(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("<select id=\"TYPEID\" onChange=\"Display(this);\"  ");
 if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){
      out.write(" disabled=\"disabled\" ");
}
      out.write(" >\r\n");
      out.write("  <option value=\"MULTI\" >Multi</option>\r\n");
      out.write("  <option value=\"SINGLE\">Single</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<div ID=\"SINGLEPREFIX\" style=\"display:none;\" class=\"col-1\">\r\n");
      out.write("<label class=\"labelTxt\">");
      if (_jspx_meth_s_005ftext_005f3(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write(" <input type=\"text\" name=\"prefix\" size=\"34\" id=\"singleprefixid\" ");
 if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){
      out.write(" disabled=\"disabled\" ");
}
      out.write(">\r\n");
      out.write("</div>\r\n");
      out.write("<div ID=\"MULTIPREFIX\" style=\"display:none;\">\r\n");
      out.write("<div class=\"col-1\">\r\n");
      out.write("<label class=\"labelTxt\">");
      if (_jspx_meth_s_005ftext_005f4(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("<input type=\"text\" name=\"prefix\" size=\"34\" id=\"multiprefixid\"  ");
 if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){
      out.write(" disabled=\"disabled\" ");
}
      out.write(">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-2\">\r\n");
      out.write("<label class=\"labelTxt\" id=\"q1\">");
      if (_jspx_meth_s_005ftext_005f5(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("  <input type=\"text\" name=\"quantity\" size=\"34\" id=\"prefixqtyid\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div ID=\"SINGLEAUTO\" style=\"display:none;\" class=\"col-1\">\r\n");
      out.write("<label class=\"labelTxt\">");
      if (_jspx_meth_s_005ftext_005f6(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("<select id=\"singleautoid\" ");
 if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){
      out.write(" disabled=\"disabled\" ");
}
      out.write(" >\r\n");
      out.write("  <option value=\"5-ALPHANUMERIC\" >5 alphanumeric</option>\r\n");
      out.write("  <option value=\"6-ALPHANUMERIC\">6 alphanumeric</option>\r\n");
      out.write("  <option value=\"7-ALPHANUMERIC\">7 alphanumeric</option>\r\n");
      out.write("  <option value=\"8-ALPHANUMERIC\">8 alphanumeric</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("<div ID=\"MULTIAUTO\" style=\"display:none;\">\r\n");
      out.write("<div class=\"col-1\">\r\n");
      out.write("<label class=\"labelTxt\">");
      if (_jspx_meth_s_005ftext_005f7(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("<select id=\"multiautoid\" ");
 if(request.getAttribute("isActiveFlag")!=null) if(request.getAttribute("isActiveFlag").toString().equals("1")){
      out.write(" disabled=\"disabled\" ");
}
      out.write(" >\r\n");
      out.write("  <option value=\"5-ALPHANUMERIC\" >5 alphanumeric</option>\r\n");
      out.write("  <option value=\"6-ALPHANUMERIC\">6 alphanumeric</option>\r\n");
      out.write("  <option value=\"7-ALPHANUMERIC\">7 alphanumeric</option>\r\n");
      out.write("  <option value=\"8-ALPHANUMERIC\">8 alphanumeric</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-2\">\r\n");
      out.write("<label class=\"labelTxt\" id=\"q2\">");
      if (_jspx_meth_s_005ftext_005f8(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("<input type=\"text\" name=\"quantity\" size=\"34\" id=\"autoqtyid\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"clear\"> </div>\r\n");
      out.write("<div class=\"col-1\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=MANUALID>\r\n");
      out.write("\t<div class=\"col1\">\r\n");
      out.write("\t<label>&nbsp;</label>\r\n");
      out.write("\t\t<table class=\"tableClass\" height=\"24px\" width=\"212\">\r\n");
      out.write("\t    \t<tr>\r\n");
      out.write("\t   \t\t\t<td width=\"208\">\r\n");
      out.write("\t   \t\t\t\t\t<label> Promo Code </label>   \t\t    \t\r\n");
      out.write("\t   \t\t\t</td>\r\n");
      out.write("\t   \t\t</tr>\r\n");
      out.write("    \t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clear\"> </div>\r\n");
      out.write("\t<div class=\"col1\">\r\n");
      out.write("\t<label>&nbsp;</label>\r\n");
      out.write("\t<TABLE id=\"dataTable\" border=\"1\" class=\"promoTable\">\r\n");
      out.write("         \r\n");
      out.write("    \r\n");
      out.write("    </TABLE>\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t</div>\r\n");
      out.write("<div class=\"clear\"> </div>\r\n");
      out.write("\t<div class=\"col1\">\r\n");
      out.write("\t\t<label >&nbsp;</label> \r\n");
      out.write("\t\t<table class=\"tableClass\"  height=\"28px\" width=\"212\">\r\n");
      out.write("\t    \t<tr>\r\n");
      out.write("\t   \t\t\t<td width=\"208\">\r\n");
      out.write("\t   \t\t\t\r\n");
      out.write("\t\t    \t\t<INPUT type=\"button\" onclick=\"addRow('dataTable')\" class=\"addIcon\" />\r\n");
      out.write("\t\t    \t\t<INPUT type=\"button\" onclick=\"deleteRow('dataTable')\" class=\"deleteIcon\"/>    \t\r\n");
      out.write("\t   \t\t\t</td>\r\n");
      out.write("\t   \t\t</tr>\r\n");
      out.write("    \t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"clear\"> </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     \r\n");
      out.write("  \r\n");
      out.write("     </div>\r\n");
      out.write("</fieldset>\r\n");
      out.write("</div>\r\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

String flag="";
if(request.getAttribute("isActiveFlag")!=null)
	flag=(String)request.getAttribute("isActiveFlag");

      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"isActiveFlag\" id=\"isActiveFlag\" value=\"");
      out.print(flag);
      out.write("\"/>\r\n");
      out.write("<script>\r\n");
      out.write("function onCancelEvent()\r\n");
      out.write("{\r\n");
      out.write("\tif(parent.document.forms[0][\"checked9\"].checked)\r\n");
      out.write("\t\tparent.document.forms[0][\"checked9\"].checked = true;\r\n");
      out.write("\telse \r\n");
      out.write("\t\tparent.document.forms[0][\"checked9\"].checked = false;\r\n");
      out.write("\t\r\n");
      out.write("\tparent.jQuery.fancybox.close();\r\n");
      out.write("}\r\n");
      out.write("function onLoad()\r\n");
      out.write("{\r\n");
      out.write("\t//alert(document.getElementById('codeType').value);\r\n");
      out.write("\tvar isActiveF=document.getElementById('isActiveFlag').value;\r\n");
      out.write("\r\n");
      out.write("\tdocument.getElementById('STYLEID').value=document.getElementById('codeStyle').value;\r\n");
      out.write("\tDisplay(document.getElementById('codeType'));\r\n");
      out.write("\tdocument.getElementById('TYPEID').value=document.getElementById('codeType').value;\r\n");
      out.write("\t\r\n");
      out.write("\tif(document.getElementById('codeType').value=='SINGLE')\r\n");
      out.write("\t\tdocument.getElementById('singleprefixid').value=document.getElementById('codePrefix').value;\r\n");
      out.write("\t\telse if(document.getElementById('codeType').value=='MULTI')\r\n");
      out.write("\t\t\tdocument.getElementById('multiprefixid').value=document.getElementById('codePrefix').value;\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.getElementById('prefixqtyid').value=document.getElementById('codeQuantity').value;\r\n");
      out.write("\tif(document.getElementById('codeType').value=='MULTI')\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById('multiautoid').value=document.getElementById('codeSize').value;\t\r\n");
      out.write("\t\t//{ \r\n");
      out.write("\t\t//manualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"none\";multiAuto.style.display=\"block\"}\r\n");
      out.write("\t\t//Display(document.getElementById('STYLEID'));\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(document.getElementById('codeType').value=='SINGLE')\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById('singleautoid').value=document.getElementById('codeSize').value;\r\n");
      out.write("\t\tif(document.getElementById('STYLEID').value==\"AUTO\")\r\n");
      out.write("\t\t{ \r\n");
      out.write("\t\t\tmanualName.style.display=\"none\";typeName.style.display=\"block\";singlePrefix.style.display=\"none\";multiPrefix.style.display=\"none\";singleAuto.style.display=\"block\";multiAuto.style.display=\"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t/* if(document.getElementById('prefixqtyid'))\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.getElementById('prefixqtyid').style.display=\"none\";\r\n");
      out.write("\t\t\t\tdocument.getElementById('q1').style.display=\"none\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tif(document.getElementById('autoqtyid'))\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.getElementById('autoqtyid').style.display=\"none\";\r\n");
      out.write("\t\t\t\tdocument.getElementById('q2').style.display=\"none\";\r\n");
      out.write("\t\t\t\t} */\r\n");
      out.write("\t\t\t\tif(isActiveF==1)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('submitButton').disabled=true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t//Display(document.getElementById('STYLEID'));\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.getElementById('autoqtyid').value=document.getElementById('codeQuantity').value;\r\n");
      out.write("\r\n");
      out.write("\tshowRow('dataTable');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("onLoad();\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_s_005ftext_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(224,8) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("codeConfig.legend");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f1 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f1.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(227,24) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f1.setName("codeConfig.codeStyle");
    int _jspx_eval_s_005ftext_005f1 = _jspx_th_s_005ftext_005f1.doStartTag();
    if (_jspx_th_s_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f2 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f2.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(236,24) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f2.setName("codeConfig.codeType");
    int _jspx_eval_s_005ftext_005f2 = _jspx_th_s_005ftext_005f2.doStartTag();
    if (_jspx_th_s_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f3 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f3.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(244,24) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f3.setName("codeConfig.codePrefix");
    int _jspx_eval_s_005ftext_005f3 = _jspx_th_s_005ftext_005f3.doStartTag();
    if (_jspx_th_s_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f4 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f4.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(249,24) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f4.setName("codeConfig.codePrefix");
    int _jspx_eval_s_005ftext_005f4 = _jspx_th_s_005ftext_005f4.doStartTag();
    if (_jspx_th_s_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f5 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f5.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(253,32) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f5.setName("codeConfig.codeQuantity");
    int _jspx_eval_s_005ftext_005f5 = _jspx_th_s_005ftext_005f5.doStartTag();
    if (_jspx_th_s_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f6 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f6.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(258,24) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f6.setName("codeConfig.codeSize");
    int _jspx_eval_s_005ftext_005f6 = _jspx_th_s_005ftext_005f6.doStartTag();
    if (_jspx_th_s_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f7 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f7.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(268,24) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f7.setName("codeConfig.codeSize");
    int _jspx_eval_s_005ftext_005f7 = _jspx_th_s_005ftext_005f7.doStartTag();
    if (_jspx_th_s_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f8 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f8.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(277,32) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f8.setName("codeConfig.codeQuantity");
    int _jspx_eval_s_005ftext_005f8 = _jspx_th_s_005ftext_005f8.doStartTag();
    if (_jspx_th_s_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fnamespace_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /WEB-INF/view/jsp/promocode/edit.jsp(329,0) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/view/jsp/promocode/edit.jsp(329,0) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setNamespace("/ebbs");
    // /WEB-INF/view/jsp/promocode/edit.jsp(329,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("updatePromoCode");
    // /WEB-INF/view/jsp/promocode/edit.jsp(329,0) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setTheme("css_xhtml");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("     \r\n");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f8(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f9(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("<div class=\"btnWrapper\">\r\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fsubmit_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</div>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fnamespace_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fnamespace_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(330,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("codeConfig.codeStyle");
    // /WEB-INF/view/jsp/promocode/edit.jsp(330,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("codeStyle");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(331,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("codeConfig.codeType");
    // /WEB-INF/view/jsp/promocode/edit.jsp(331,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("codeType");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f2 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(332,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("codeConfig.codePrefix");
    // /WEB-INF/view/jsp/promocode/edit.jsp(332,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("codePrefix");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f3 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(333,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setName("codeConfig.codeQuantity");
    // /WEB-INF/view/jsp/promocode/edit.jsp(333,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setId("codeQuantity");
    int _jspx_eval_s_005fhidden_005f3 = _jspx_th_s_005fhidden_005f3.doStartTag();
    if (_jspx_th_s_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f4 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(334,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setName("codeConfig.codeSize");
    // /WEB-INF/view/jsp/promocode/edit.jsp(334,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setId("codeSize");
    int _jspx_eval_s_005fhidden_005f4 = _jspx_th_s_005fhidden_005f4.doStartTag();
    if (_jspx_th_s_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f5 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(335,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setName("codeConfig.projectId");
    // /WEB-INF/view/jsp/promocode/edit.jsp(335,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setId("projectId");
    int _jspx_eval_s_005fhidden_005f5 = _jspx_th_s_005fhidden_005f5.doStartTag();
    if (_jspx_th_s_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f6 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(336,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setName("codeConfig.cfId");
    // /WEB-INF/view/jsp/promocode/edit.jsp(336,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setId("cfId");
    int _jspx_eval_s_005fhidden_005f6 = _jspx_th_s_005fhidden_005f6.doStartTag();
    if (_jspx_th_s_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f7 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(337,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setName("codeValue.codeType");
    // /WEB-INF/view/jsp/promocode/edit.jsp(337,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setId("codeTypeValue");
    int _jspx_eval_s_005fhidden_005f7 = _jspx_th_s_005fhidden_005f7.doStartTag();
    if (_jspx_th_s_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f8 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(338,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setName("codeValue.count");
    // /WEB-INF/view/jsp/promocode/edit.jsp(338,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setId("countId");
    int _jspx_eval_s_005fhidden_005f8 = _jspx_th_s_005fhidden_005f8.doStartTag();
    if (_jspx_th_s_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f9 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(339,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setName("codeValue.promoCode");
    // /WEB-INF/view/jsp/promocode/edit.jsp(339,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setId("promoCodeId");
    int _jspx_eval_s_005fhidden_005f9 = _jspx_th_s_005fhidden_005f9.doStartTag();
    if (_jspx_th_s_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fid_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(342,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("Submit");
    // /WEB-INF/view/jsp/promocode/edit.jsp(342,2) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setTheme("simple");
    // /WEB-INF/view/jsp/promocode/edit.jsp(342,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setCssClass("submit_btn");
    // /WEB-INF/view/jsp/promocode/edit.jsp(342,2) name = onclick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setOnclick("beforeSubmit()");
    // /WEB-INF/view/jsp/promocode/edit.jsp(342,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setId("submitButton");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/promocode/edit.jsp(343,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setValue("Cancel");
    // /WEB-INF/view/jsp/promocode/edit.jsp(343,2) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setTheme("simple");
    // /WEB-INF/view/jsp/promocode/edit.jsp(343,2) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setCssClass("submit_btn");
    // /WEB-INF/view/jsp/promocode/edit.jsp(343,2) name = onclick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setOnclick("javascript:onCancelEvent();");
    int _jspx_eval_s_005fsubmit_005f1 = _jspx_th_s_005fsubmit_005f1.doStartTag();
    if (_jspx_th_s_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fcssClass_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftheme_005fonclick_005fcssClass_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
    return false;
  }
}
