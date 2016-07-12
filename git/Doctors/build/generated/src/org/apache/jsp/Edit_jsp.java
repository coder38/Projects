package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");

    String name=request.getParameter("var1");
    String role=request.getParameter("var2");
    String specialization=request.getParameter("var3");
    String location=request.getParameter("var4");
    String experience=request.getParameter("var5");
    String qualification=request.getParameter("var6");
    String contactno=request.getParameter("var7");
    String password=request.getParameter("var8");
    String privacy=request.getParameter("var9");
    
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"olive\"><img src=\"logo.jpg\" align=\"right\"/><div align=\"right\"><h1><a href=\"Lcount.jsp\">LogOut</a></h1></div>\n");
      out.write("        <center>\n");
      out.write("        <form action=\"Update.jsp\">\n");
      out.write("            <h3>User Name <input type=\"text\" readonly=\"true\" name=\"user\" value=\"");
      out.print(name);
      out.write("\"/><br>\n");
      out.write("            Password <input type=\"password\" name=\"pass\" value=\"");
      out.print(password);
      out.write("\"/><br>\n");
      out.write("            Specialization <input type=\"text\" name=\"sp\" value=\"");
      out.print(specialization);
      out.write("\"/><br>\n");
      out.write("            Location <input type=\"text\" name=\"loc\" value=\"");
      out.print(location);
      out.write("\"/><br>\n");
      out.write("            Experience <input type=\"text\" name=\"exp\" value=\"");
      out.print(experience);
      out.write("\"/><br>\n");
      out.write("            Qualification <input type=\"text\" name=\"qual\" value=\"");
      out.print(qualification);
      out.write("\"/><br>\n");
      out.write("            Contact No <input type=\"text\" name=\"cont\" value=\"");
      out.print(contactno);
      out.write("\"/><br>\n");
      out.write("            Role <input type=\"text\" name=\"role\" value=\"");
      out.print(role);
      out.write("\"/><br>\n");
      out.write("            Privacy<input type=\"radio\" name=\"privacy\" value=\"public\"/>Public<br>\n");
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"radio\" property=\"privacy\" value=\"private\"/>Private<br><br>\n");
      out.write("\n");
      out.write("                 <input type=\"submit\" style=\" border-color:red\" size=\"30\" value=\"Update\"></h3>\n");
      out.write("        </form></center>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("\n");
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
