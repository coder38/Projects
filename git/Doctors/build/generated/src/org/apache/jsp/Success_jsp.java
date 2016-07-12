package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class Success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style type=\"text/css\">\n");
      out.write("            #set{\n");
      out.write("                background:url() no-repeat;\n");
      out.write("                background-color:#3cb371;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"set\">\n");
      out.write("        <img src=\"logo.jpg\" align=\"right\"><center>\n");
      out.write(" <center><h1>\n");
      out.write("            UserName:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("                Password:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("                    Role:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.role}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("                        Specialization:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sp}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("                            Location:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("                                Qualification:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.qual}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("                                    Contact no:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cont}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("                                        Experience:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.exp}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("            \n");
      out.write("                            <font color=\"green\"><marquee>Successfully Registered</marquee></font></center>\n");
      out.write("        </h1></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

        
        try
        {
        String user=request.getParameter("user");
        String pass=request.getParameter("pass");
        String sp=request.getParameter("sp");
        String loc=request.getParameter("loc");
        String exp=request.getParameter("exp");
        String qual=request.getParameter("qual");
        String cont=request.getParameter("cont");
        String role=request.getParameter("role");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        int i=st.executeUpdate("Insert into doctors values('"+user+"','"+role+"','"+sp+"','"+loc+"','"+exp+"','"+qual+"','"+cont+"','"+pass+"')");


        if(i>0)
            System.out.println("abc");
        }

        catch(Exception e)
                {
                    System.out.println(e);
                }
        finally
        {
               System.out.println("finally");
        }
       
      out.write("\n");
      out.write("\n");
      out.write("      ");
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
