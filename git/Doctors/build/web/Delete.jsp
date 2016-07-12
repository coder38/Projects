<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="logo.jpg" align="right"/>
        <%
    String name=request.getParameter("var1");
    String role=request.getParameter("var2");
    String specialization=request.getParameter("var3");
    String location=request.getParameter("var4");
    String experience=request.getParameter("var5");
    String qualification=request.getParameter("var6");
    String contactno=request.getParameter("var7");
    String password=request.getParameter("var8");
    String privacy=request.getParameter("var9");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        int a=st.executeUpdate("delete from doctors where name='"+name+"' ");
        if(a>0)
          {
            %>
          <font color="green"><h1>Record Deleted</h1></font>

          <%
          }
        %>
    </body>
</html>
