
<%@page import="java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


     <%
HttpSession hs=request.getSession(false);
String user=(String)hs.getAttribute("username");

     int lc=0;
     Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        int a=st.executeUpdate("delete from Lcount where username='"+user+"'");

  // HttpSession hs=request.getSession(false);
    hs.invalidate();

   %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:forward page="Home.jsp"/>
    </body>
</html>