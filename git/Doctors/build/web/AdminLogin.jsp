<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="h" uri="/WEB-INF/struts-html.tld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<h:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="pink">
        <img src="logo.jpg" align="right"/>
        <center><h1>Administrator Login</h1>
        <h:javascript formName="AdminLoginBean"/>
        <h:form action="abc.do" onsubmit="return validateAdminLoginBean(this)">

           <h2>  Name<h:text property="user" style="border-left-color:aqua"/><br>
               Password<h:password property="pass"/><br></h2>
               <h:submit style="background-color:transparent"  value="SignIn"/>
        </h:form>
        <%
        String message=(String)request.getAttribute("msg");
       if(message!=null)
            {%>
        <%=message%>
        <%}
        %></center>
    </body>
</h:html>
