package org.apache.jsp.WEB_002dINF.view.jsp.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.mps.wiley.common.Modules;
import main.java.com.mps.common.util.StringUtil;
import main.java.com.mps.common.AppSystem;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fonsubmit_005fnamespace_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005fputAttribute_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fonsubmit_005fnamespace_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005fputAttribute_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fonsubmit_005fnamespace_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname.release();
    _005fjspx_005ftagPool_005ftiles_005fputAttribute_0026_005fvalue_005fname_005fnobody.release();
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

	final String strModuleId = StringUtil.validStr(request.getParameter("module"));

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("jQuery(document).ready(function(){\r\n");
      out.write("   $(\"#create\").fancybox({\r\n");
      out.write("\t\t'width'\t\t\t\t: '50%',\r\n");
      out.write("\t\t'height'\t\t\t: '50%',\r\n");
      out.write("\t\t'autoScale'\t\t\t: 'true',\r\n");
      out.write("\t\t'transitionIn'\t\t: 'elastic',\r\n");
      out.write("\t\t'transitionOut'\t\t: 'elastic',\r\n");
      out.write("\t\t'type'\t\t\t\t: 'iframe',\r\n");
      out.write("\t\t'padding'\t\t\t: '10',\r\n");
      out.write("\t\t'margin'\t\t\t: '0',\r\n");
      out.write("\t\t'top'\t\t\t\t: '0',\r\n");
      out.write("\t\t'left'\t\t\t\t: '0',\r\n");
      out.write("\t\t'scrolling'   \t\t: 'no'  \t\t\r\n");
      out.write("\t});\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("function copyProject(iPrjId)\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href = \"./ebbs/copyProject.do?project.projectId=\"+iPrjId;\r\n");
      out.write("\tjQuery.fancybox.close();\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goBack()\r\n");
      out.write("{\r\n");
      out.write("\t");

	if(strModuleId.equals(Modules.PROJECT_SEARCH+""))
	{
	
      out.write("\r\n");
      out.write("\t\tvar objForm = document.forms[0];\r\n");
      out.write("\t\tobjForm.action = \"ebbs/searchProject.do\";\r\n");
      out.write("\t\tobjForm.submit();\r\n");
      out.write("\t");

	}
	else if(strModuleId.equals(Modules.MY_PROJECT+""))
	{
	
      out.write("\r\n");
      out.write("\t\tvar objForm = document.forms[0];\r\n");
      out.write("\t\tobjForm.action = \"ebbs/myProject.do\";\r\n");
      out.write("\t\tobjForm.submit();\r\n");
      out.write("\t");

	}
	else
	{
		
      out.write("location.href = \"ebbs/home.do\";");

	}
	
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<span class=\"mandatory\"><em>( ");
      if (_jspx_meth_s_005ftext_005f0(_jspx_page_context))
        return;
      out.write(")</em></span>\r\n");
      out.write("<div class=\"medium-spacer\"></div>\r\n");
      out.write("<!--Copy Project-->\r\n");
      out.write("<!-- <div style=\"text-align: right\"> -->\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- </div> -->\r\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"clear\"></div>");
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

  private boolean _jspx_meth_s_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /WEB-INF/view/jsp/project/add.jsp(10,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setId("copyPrj");
    // /WEB-INF/view/jsp/project/add.jsp(10,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("copyProject.do");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent(null);
    // /WEB-INF/view/jsp/project/add.jsp(60,30) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("mandatoryIndicator.note");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fonsubmit_005fnamespace_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /WEB-INF/view/jsp/project/add.jsp(68,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("addSubmitProject");
    // /WEB-INF/view/jsp/project/add.jsp(68,0) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setNamespace("/ebbs");
    // /WEB-INF/view/jsp/project/add.jsp(68,0) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/view/jsp/project/add.jsp(68,0) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setTheme("css_xhtml");
    // /WEB-INF/view/jsp/project/add.jsp(68,0) name = onsubmit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setOnsubmit("return beforeSubmit();");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t");
        if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t<div class=\"medium-spacer\"></div>\r\n");
        out.write("\t<div class=\"clear\"></div>\r\n");
        out.write("\t<div class=\"btnWrapper\">\r\n");
        out.write("\t\t<input type=\"submit\" class=\"submit_btn\" value=\"Save\"  tabindex=\"17\">\r\n");
        out.write("\t\t<input type=\"reset\" class=\"submit_btn\" value=\"Cancel\" tabindex=\"18\" onclick=\"javascript:goBack()\">\r\n");
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
      _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fonsubmit_005fnamespace_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fonsubmit_005fnamespace_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/jsp/project/add.jsp(70,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setName("elements");
    int _jspx_eval_tiles_005finsertAttribute_005f0 = _jspx_th_tiles_005finsertAttribute_005f0.doStartTag();
    if (_jspx_eval_tiles_005finsertAttribute_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tiles_005finsertAttribute_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tiles_005finsertAttribute_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tiles_005finsertAttribute_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_tiles_005fputAttribute_005f0(_jspx_th_tiles_005finsertAttribute_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_tiles_005finsertAttribute_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tiles_005finsertAttribute_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_tiles_005finsertAttribute_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname.reuse(_jspx_th_tiles_005finsertAttribute_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname.reuse(_jspx_th_tiles_005finsertAttribute_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005fputAttribute_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_005finsertAttribute_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:putAttribute
    org.apache.tiles.jsp.taglib.PutAttributeTag _jspx_th_tiles_005fputAttribute_005f0 = (org.apache.tiles.jsp.taglib.PutAttributeTag) _005fjspx_005ftagPool_005ftiles_005fputAttribute_0026_005fvalue_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.PutAttributeTag.class);
    _jspx_th_tiles_005fputAttribute_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005fputAttribute_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_005finsertAttribute_005f0);
    // /WEB-INF/view/jsp/project/add.jsp(71,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fputAttribute_005f0.setName("action");
    // /WEB-INF/view/jsp/project/add.jsp(71,2) name = value type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fputAttribute_005f0.setValue(new String("add"));
    int _jspx_eval_tiles_005fputAttribute_005f0 = _jspx_th_tiles_005fputAttribute_005f0.doStartTag();
    if (_jspx_th_tiles_005fputAttribute_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005fputAttribute_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_tiles_005fputAttribute_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005fputAttribute_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_tiles_005fputAttribute_005f0);
    return false;
  }
}
