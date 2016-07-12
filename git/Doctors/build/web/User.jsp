<%@page import="java.sql.*;"contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


   <%
        String name=request.getParameter("user");
        String pass=request.getParameter("pass");
       // String privacy=request.getParameter("privacy");
        /*String specialization=request.getParameter("sp");
        String location=request.getParameter("loc");
        String experience=request.getParameter("exp");
        String qualification=request.getParameter("qual");
        String contactno=request.getParameter("cont");
        String role=request.getParameter("role");*/

   Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from doctors where name='"+name+"'and password='"+pass+"'");
        
        %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
    h2{background-color:#e0ffff}
    h1{font:xx-large fantasy}
    
    h1{background-color:pink}
    .right{font-style:italic;
        font-family:sans-serif;}
    </style>
    </head>

    <body><img src="logo.jpg" align="right"/>
    <div align="right"><h2><a href="Lcount.jsp">LogOut</a></h2></div>
        <b><h1> &nbsp;&nbsp; Hello User &nbsp;&nbsp;<font color="green"><%=(String)session.getAttribute("username")%></font></h1></b>
        
        <%if(rs.next())
            {
            %><center>
               <h2> User Name   &nbsp;&nbsp;<font color="red"><%=rs.getString(1)%></font><br>

                Password    &nbsp;&nbsp;<font color="red"><%=rs.getString(8)%></font><br>

                Role   &nbsp;&nbsp; <font color="red"><%=rs.getString(2)%></font><br>

                Specialization  &nbsp;&nbsp;<font color="red"><%=rs.getString(3)%></font><br>

                Location   &nbsp;&nbsp;<font color="red"><%=rs.getString(4)%></font> <br>

                Experience &nbsp;&nbsp; <font color="red"><%=rs.getString(5)%></font><br>

                Qualification   &nbsp;&nbsp;<font color="red"><%=rs.getString(6)%></font><br>

                Contact No.&nbsp;&nbsp; <font color="red"><%=rs.getString(7)%><br></font>

                Privacy.&nbsp;&nbsp; <font color="red"><%=rs.getString(9)%><br></font></h2>

     <h1><a href="Edit.jsp?var1=<%=rs.getString(1)%>&var8=<%=rs.getString(8)%>&var2=<%=rs.getString(2)%>&var3=<%=rs.getString(3)%>
     &var4=<%=rs.getString(4)%>&var5=<%=rs.getString(5)%>&var6=<%=rs.getString(6)%>&var7=<%=rs.getString(7)%>&var9=<%=rs.getString(9)%>">Edit</a>|
     <a href="Delete.jsp?var1=<%=rs.getString(1)%>&var2=<%=rs.getString(2)%>&var3=<%=rs.getString(3)%>&var4=<%=rs.getString(4)%>
     &var5=<%=rs.getString(5)%>&var6=<%=rs.getString(6)%>&var7=<%=rs.getString(7)%>&var8=<%=rs.getString(8)%>&var9=<%=rs.getString(9)%>">Delete</a></h1>
     </center>

            <%
            }
        %>
  

        <center> <h1><b><a href="All.jsp">All Doctors</a></b>&nbsp;&nbsp;|&nbsp;&nbsp; <b><a href="Query.jsp"> Queries</a></b></h1></center>
    </body>
</html>
