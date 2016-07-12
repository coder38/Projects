package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");

        int c = 0, lc = 0;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/doc", "root", "pass");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from doctors ");
//int c=rs.getInt();

        while (rs.next()) {
            c++;
        }
//out.println("Registered Users: "+c);
        ResultSet r = st.executeQuery("select * from Lcount");
        while (r.next()) {
            lc++;
        }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background-image: url(red-cross-logo%20-%20Copy.png);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position:top;\n");
      out.write("            }\n");
      out.write("            .style1 {\n");
      out.write("                font-size: 36px;\n");
      out.write("                font-family: \"Times New Roman\", Times, serif;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .style2 {\n");
      out.write("                font-family: Georgia, \"Times New Roman\", Times, serif;\n");
      out.write("                font-style:italic;\n");
      out.write("            }\n");
      out.write("            h1{text-align:center}\n");
      out.write("            .center{\n");
      out.write("                margin:auto;\n");
      out.write("                width:15%;\n");
      out.write("            }\n");
      out.write("            .right{\n");
      out.write("                position:absolute;\n");
      out.write("                left:30px;\n");
      out.write("                width:300px;\n");
      out.write("                font-style:italic;\n");
      out.write("                font-family:sans-serif;\n");
      out.write("            }\n");
      out.write("    </style></head>\n");
      out.write("\n");
      out.write("    <body >\n");
      out.write("        <img src=\"logo.jpg\" align=\"right\"/>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <h1 class=\"style1\" align=\"center\"><font size=\"40\" ><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;DOCTORS'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FORUM </b></font></h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right\"><b>Registered Users: ");
      out.print(c);
      out.write(" <br><br> Online Users: ");
      out.print(lc);
      out.write(" </b> </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"center\">\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <h1 class=\"style3\"> LOGIN</h1>\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <h2 class=\"style2\" ><a href=\"AdminLogin.jsp\">ADMIN</a></h2>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <h2 class=\"style2\"><a href=\"Login.jsp\">USER</a></h2>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <h2 class=\"style2\"><a href=\"Registration.jsp\">NEW USER </a></h2>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
