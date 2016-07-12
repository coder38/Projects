package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class h_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tbackground-image: url();\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-color: #99FFCC;\n");
      out.write("}\n");
      out.write(".style2 {font-family: Georgia, \"Times New Roman\", Times, serif; }\n");
      out.write(".style3 {font-size: 24px}\n");
      out.write(".style4 {font-size: xx-large; }\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("body,td,th {\n");
      out.write("\tfont-family: Courier New, Courier, monospace;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #CC0033;\n");
      out.write("}\n");
      out.write(".style1 {font-family: Geneva, Arial, Helvetica, sans-serif}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("background-color: #CC0033;\n");
      out.write("background-color: #99FFCC;\n");
      out.write("</style></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div align=\"center\">\n");
      out.write("  <h1 class=\"style1\">DOCTORS' FORUM </h1>\n");
      out.write("</div>\n");
      out.write("<div align=\"center\">\n");
      out.write("  <p>&nbsp;</p> <div align=\"center\">\n");
      out.write("  <h1 class=\"style1\">DOCTORS' FORUM </h1>\n");
      out.write("</div>\n");
      out.write("  <h1 class=\"style4\"> LOGIN</h1>\n");
      out.write("  <ul class=\"style3\">\n");
      out.write("    <li>\n");
      out.write("      <h2 class=\"style2\">ADMIN</h2>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <h2>USER</h2>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <h2>NEW USER </h2>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
