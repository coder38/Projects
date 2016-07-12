<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
        String name=request.getParameter("user");
        String pass=request.getParameter("pass");
        String specialization=request.getParameter("sp");
        String location=request.getParameter("loc");
        String experience=request.getParameter("exp");
        String qualification=request.getParameter("qual");
        String contactno=request.getParameter("cont");
        String role=request.getParameter("role");
        String privacy=request.getParameter("privacy");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        int a=st.executeUpdate("update doctors set password='"+pass+"',role='"+role+"',specialization='"+specialization+"',location='"+location+"',experience='"+experience+"',qualification='"+qualification+"',contactno='"+contactno+"',privacy='"+privacy+"' where name='"+name+"' ");
        if(a>0)
            {
        %>
        <font color="green"><h1>Record Updated</h1></font>
        <jsp:include page="User.jsp"/>
        <%
            }
        %>
    </body>
</html>
