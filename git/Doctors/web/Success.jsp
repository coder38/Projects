<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            #set{
                background:url() no-repeat;
                background-color:#3cb371;
            }
            h1{text-align:center}
        </style>
    </head>
    <body id="set">
        <img src="logo.jpg" align="right">
 <h1><BR><BR>
     <%
     String user=request.getParameter("user");
        String pass=request.getParameter("pass");
        String sp=request.getParameter("sp");
        String loc=request.getParameter("loc");
        String exp=request.getParameter("exp");
        String qual=request.getParameter("qual");
        String cont=request.getParameter("cont");
        String role=request.getParameter("role");
     String privacy=request.getParameter("privacy");%>
            UserName:${sessionScope.user}<br>
            Password:${sessionScope.pass}<br>
            Role:${sessionScope.role}<BR>
            Specialization:${sessionScope.sp}<br>
            Location:${sessionScope.loc}<br>
            Qualification:${sessionScope.qual}<br>
            Contact no:${sessionScope.cont}<br>
                Experience:${sessionScope.exp} years<br>
                Privacy:${sessionScope.privacy}<br>
                            
                            <font color="green"><marquee>Successfully Registered</marquee></font>
        </h1>
    </body>
</html>


        <%
        
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        int i=st.executeUpdate("Insert into doctors values('"+user+"','"+role+"','"+sp+"','"+loc+"','"+exp+"','"+qual+"','"+cont+"','"+pass+"','"+privacy+"')");


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
       %>

      