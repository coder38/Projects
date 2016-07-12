<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="h" uri="/WEB-INF/struts-html.tld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<h:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#008080" >
        <img src="logo.jpg" align="right"/>
        <h:javascript formName="LoginBean"/>
        <center><h:form action="Login.do" onsubmit="return validateLoginBean(this)">
            <h1>Please Login to continue...</h1><br>
                Name<h:text property="user"/><br><br>
            Password<h:password property="pass"/><br><br>

        <h:submit value="SignIn"/>
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
