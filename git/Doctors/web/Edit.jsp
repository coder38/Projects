<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="olive"><img src="logo.jpg" align="right"/><div align="right"><h1><a href="Lcount.jsp">LogOut</a></h1></div>
        <center>
        <form action="Update.jsp">
            <h3>User Name <input type="text" readonly="true" name="user" value="<%=name%>"/><br>
            Password <input type="password" name="pass" value="<%=password%>"/><br>
            Specialization <input type="text" name="sp" value="<%=specialization%>"/><br>
            Location <input type="text" name="loc" value="<%=location%>"/><br>
            Experience <input type="text" name="exp" value="<%=experience%>"/><br>
            Qualification <input type="text" name="qual" value="<%=qualification%>"/><br>
            Contact No <input type="text" name="cont" value="<%=contactno%>"/><br>
            Role <input type="text" name="role" value="<%=role%>"/><br>
            Privacy<input type="radio" name="privacy" value="public"/>Public<br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" property="privacy" value="private"/>Private<br><br>

                 <input type="submit" style=" border-color:red" size="30" value="Update"></h3>
        </form></center>
    </body>
    </html>

