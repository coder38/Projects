package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class AllDelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" ");
 Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from doctors ");

        
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"yellow\"><center>\n");
      out.write("        <img src=\"logo.jpg\" align=\"right\"/>\n");
      out.write("         <table border=\"3\" bordercolor=\"green\" cellpadding=\"10\" bgcolor=\"pink\" >\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th><h2>User Name</h2></th>\n");
      out.write("                <th><h2>Role</h2></th>\n");
      out.write("                <th><h2>Specialization</h2></th>\n");
      out.write("                <th><h2>Location</h2></th>\n");
      out.write("                <th><h2>Experience</h2></th>\n");
      out.write("                <th><h2>Qualification</h2></th>\n");
      out.write("                <th><h2>Contact No.</h2></th>\n");
      out.write("                <th></th>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("            ");
 while(rs.next())
                {
            
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                   <th><h1> <a href=\"Delete.jsp?var1=");
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
      out.write("               </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </table></center>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
