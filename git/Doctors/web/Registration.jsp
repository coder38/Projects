<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="h" uri="/WEB-INF/struts-html.tld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<h:html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#40e0d0">
        <img src="logo.jpg" align="right"/>
        <h:javascript formName="RegistrationBean"/>
       <center> <h:form action="reg.do" onsubmit="return validateRegistrationBean(this)" >

           <h3> UserName<h:text property="user"/><br><br>
            Password<h:password property="pass"/><br><br>
               Role <h:text property="role"/><br><br>
            Specialization<h:text property="sp"/><br><br>
                Location <h:text property="loc"/><br><br>
                    Experience <h:text property="exp"/><br><br>
                            Qualification <h:text property="qual"/><br><br>
                                Contact No<h:text property="cont"/><br><br>
                                    Privacy<h:radio property="privacy" value="public"/>Public<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:radio property="privacy" value="private"/>Private<br><br>

                <h:submit value="Register"/></h3>
        </h:form></center>

    </body>
</h:html>
