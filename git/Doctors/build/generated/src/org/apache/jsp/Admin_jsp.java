package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#008b8b\">\n");
      out.write("        <img src=\"logo.jpg\" align=\"right\"/>\n");
      out.write("        <h1>Hello Admin ");
      out.print((String)session.getAttribute("username"));
      out.write("</h1>\n");
      out.write("         ");

        String name=request.getParameter("user");
        String pass=request.getParameter("pass");
         Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from doctors where name='"+name+"' and password='"+pass+"'");

        if(rs.next())
            {
            
      out.write("\n");
      out.write("            <center>\n");
      out.write("               <h3> User Name   &nbsp;&nbsp;<font color=\" #99FFCC\">");
      out.print(rs.getString(1));
      out.write("</font><br>\n");
      out.write("\n");
      out.write("                Password    &nbsp;&nbsp;<font color=\"red\">");
      out.print(rs.getString(8));
      out.write("</font><br>\n");
      out.write("\n");
      out.write("                Role   &nbsp;&nbsp; <font color=\"red\">");
      out.print(rs.getString(2));
      out.write("</font><br>\n");
      out.write("\n");
      out.write("                Specialization  &nbsp;&nbsp;<font color=\"red\">");
      out.print(rs.getString(3));
      out.write("</font><br>\n");
      out.write("\n");
      out.write("                Location   &nbsp;&nbsp;<font color=\"red\">");
      out.print(rs.getString(4));
      out.write("</font> <br>\n");
      out.write("\n");
      out.write("                Experience &nbsp;&nbsp; <font color=\"red\">");
      out.print(rs.getString(5));
      out.write("</font><br>\n");
      out.write("\n");
      out.write("                Qualification   &nbsp;&nbsp;<font color=\"red\">");
      out.print(rs.getString(6));
      out.write("</font><br>\n");
      out.write("\n");
      out.write("                Contact No.&nbsp;&nbsp; <font color=\"red\">");
      out.print(rs.getString(7));
      out.write("<br></font></h3>\n");
      out.write("\n");
      out.write("     <h1> <a href=\"Edit.jsp?var1=");
      out.print(rs.getString(1));
      out.write("&var8=");
      out.print(rs.getString(8));
      out.write("&var2=");
      out.print(rs.getString(2));
      out.write("&var3=");
      out.print(rs.getString(3));
      out.write("&var4=");
      out.print(rs.getString(4));
      out.write("&var5=");
      out.print(rs.getString(5));
      out.write("&var6=");
      out.print(rs.getString(6));
      out.write("&var7=");
      out.print(rs.getString(7));
      out.write("\">Edit</a>|<a href=\"Delete.jsp?var1=");
      out.print(rs.getString(1));
      out.write("&var2=");
      out.print(rs.getString(2));
      out.write("&var3=");
      out.print(rs.getString(3));
      out.write("&var4=");
      out.print(rs.getString(4));
      out.write("&var5=");
      out.print(rs.getString(5));
      out.write("&var6=");
      out.print(rs.getString(6));
      out.write("&var7=");
      out.print(rs.getString(7));
      out.write("&var8=");
      out.print(rs.getString(8));
      out.write("\">Delete</a></h1>\n");
      out.write("     </center>\n");
      out.write("\n");
      out.write("            ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <center> <h2><a href=\"AllDelete.jsp\">All Doctors</a></h2></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2><font color=\"yellow\" style=\"unicode-bidi:bidi-override\" ><a href=\"Search.jsp\">Search Doctor</a></font></h2>\n");
      out.write("        <h1><a href=\"Query.jsp\"> queries</a></h1>\n");
      out.write("    </body>\n");
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
