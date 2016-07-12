package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fjavascript_0026_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform_0026_005fonsubmit_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fpassword_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fsubmit_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fjavascript_0026_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform_0026_005fonsubmit_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fpassword_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fsubmit_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhtml.release();
    _005fjspx_005ftagPool_005fh_005fjavascript_0026_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fform_0026_005fonsubmit_005faction.release();
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fpassword_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fsubmit_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      if (_jspx_meth_h_005fhtml_005f0(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_h_005fhtml_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_h_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fh_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_h_005fhtml_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhtml_005f0.setParent(null);
    int _jspx_eval_h_005fhtml_005f0 = _jspx_th_h_005fhtml_005f0.doStartTag();
    if (_jspx_eval_h_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    <head> \n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body bgcolor=\"#40e0d0\">\n");
        out.write("        <img src=\"logo.jpg\" align=\"right\"/>\n");
        out.write("        ");
        if (_jspx_meth_h_005fjavascript_005f0(_jspx_th_h_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       <center> ");
        if (_jspx_meth_h_005fform_005f0(_jspx_th_h_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\n");
        out.write("    </body>\n");
        int evalDoAfterBody = _jspx_th_h_005fhtml_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005fhtml.reuse(_jspx_th_h_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fhtml.reuse(_jspx_th_h_005fhtml_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fjavascript_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_h_005fjavascript_005f0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _005fjspx_005ftagPool_005fh_005fjavascript_0026_005fformName_005fnobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_h_005fjavascript_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fjavascript_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fhtml_005f0);
    // /Registration.jsp(13,8) name = formName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fjavascript_005f0.setFormName("RegistrationBean");
    int _jspx_eval_h_005fjavascript_005f0 = _jspx_th_h_005fjavascript_005f0.doStartTag();
    if (_jspx_th_h_005fjavascript_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005fjavascript_0026_005fformName_005fnobody.reuse(_jspx_th_h_005fjavascript_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fjavascript_0026_005fformName_005fnobody.reuse(_jspx_th_h_005fjavascript_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fh_005fform_0026_005fonsubmit_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fhtml_005f0);
    // /Registration.jsp(14,16) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fform_005f0.setAction("reg.do");
    // /Registration.jsp(14,16) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fform_005f0.setOnsubmit("return validateRegistrationBean(this)");
    int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
    if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("           <h3> UserName");
        if (_jspx_meth_h_005ftext_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("            Password");
        if (_jspx_meth_h_005fpassword_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("               Role ");
        if (_jspx_meth_h_005ftext_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("            Specialization");
        if (_jspx_meth_h_005ftext_005f2(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("                Location ");
        if (_jspx_meth_h_005ftext_005f3(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("                    Experience ");
        if (_jspx_meth_h_005ftext_005f4(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("                            Qualification ");
        if (_jspx_meth_h_005ftext_005f5(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("                                Contact No");
        if (_jspx_meth_h_005ftext_005f6(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br><br>\n");
        out.write("                                    Privacy");
        if (_jspx_meth_h_005fradio_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("Public<br>\n");
        out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        if (_jspx_meth_h_005fradio_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("Private<br><br>\n");
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_h_005fsubmit_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</h3>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005fform_0026_005fonsubmit_005faction.reuse(_jspx_th_h_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fform_0026_005fonsubmit_005faction.reuse(_jspx_th_h_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(16,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005ftext_005f0.setProperty("user");
    int _jspx_eval_h_005ftext_005f0 = _jspx_th_h_005ftext_005f0.doStartTag();
    if (_jspx_th_h_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_h_005fpassword_005f0 = (org.apache.struts.taglib.html.PasswordTag) _005fjspx_005ftagPool_005fh_005fpassword_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_h_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(17,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fpassword_005f0.setProperty("pass");
    int _jspx_eval_h_005fpassword_005f0 = _jspx_th_h_005fpassword_005f0.doStartTag();
    if (_jspx_th_h_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005fpassword_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005fpassword_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fpassword_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005fpassword_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(18,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005ftext_005f1.setProperty("role");
    int _jspx_eval_h_005ftext_005f1 = _jspx_th_h_005ftext_005f1.doStartTag();
    if (_jspx_th_h_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(19,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005ftext_005f2.setProperty("sp");
    int _jspx_eval_h_005ftext_005f2 = _jspx_th_h_005ftext_005f2.doStartTag();
    if (_jspx_th_h_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_h_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(20,25) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005ftext_005f3.setProperty("loc");
    int _jspx_eval_h_005ftext_005f3 = _jspx_th_h_005ftext_005f3.doStartTag();
    if (_jspx_th_h_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_h_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(21,31) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005ftext_005f4.setProperty("exp");
    int _jspx_eval_h_005ftext_005f4 = _jspx_th_h_005ftext_005f4.doStartTag();
    if (_jspx_th_h_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_h_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(22,42) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005ftext_005f5.setProperty("qual");
    int _jspx_eval_h_005ftext_005f5 = _jspx_th_h_005ftext_005f5.doStartTag();
    if (_jspx_th_h_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_h_005ftext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(23,42) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005ftext_005f6.setProperty("cont");
    int _jspx_eval_h_005ftext_005f6 = _jspx_th_h_005ftext_005f6.doStartTag();
    if (_jspx_th_h_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_h_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_h_005fradio_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_h_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_h_005fradio_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(24,43) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fradio_005f0.setProperty("privacy");
    // /Registration.jsp(24,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fradio_005f0.setValue("public");
    int _jspx_eval_h_005fradio_005f0 = _jspx_th_h_005fradio_005f0.doStartTag();
    if (_jspx_th_h_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_h_005fradio_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_h_005fradio_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fradio_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_h_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_h_005fradio_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(25,66) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fradio_005f1.setProperty("privacy");
    // /Registration.jsp(25,66) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fradio_005f1.setValue("private");
    int _jspx_eval_h_005fradio_005f1 = _jspx_th_h_005fradio_005f1.doStartTag();
    if (_jspx_th_h_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_h_005fradio_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fradio_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_h_005fradio_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_h_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fh_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_h_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Registration.jsp(27,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fsubmit_005f0.setValue("Register");
    int _jspx_eval_h_005fsubmit_005f0 = _jspx_th_h_005fsubmit_005f0.doStartTag();
    if (_jspx_th_h_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_h_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_h_005fsubmit_005f0);
    return false;
  }
}
