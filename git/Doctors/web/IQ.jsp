<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#808000">
        <div align="right"><h2><a href="Lcount.jsp">LogOut</a></h2></div>
        <img src="logo.jpg" align="right"/>
        <h1>
        <form action="iq.do">
        Query :<input type="textarea" width="200" name="t1"/>
        
        <input type="submit" value="Post Query"/>
        </form></h1>
    </body>
</html>
