<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
    h1{background-color:white}
    h1{font:xx-large fantasy;
    font-family: "Courier New", Courier, monospace
    
      }

    h2{
        font-style:italic;
        font-family:sans-serif;}
    a:link {
	color: #009966;
}
    </style>
    </head>
    <body bgcolor="olive">
        <div align="right"><h2><a href="Lcount.jsp">LogOut</a></h2></div>
        <img src="logo.jpg" align="right"/>
        <h1>Hello Admin <%=(String)session.getAttribute("username")%></h1>
         <%
        String name=request.getParameter("user");
        String pass=request.getParameter("pass");
         Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from doctors where name='"+name+"' and password='"+pass+"'");

        if(rs.next())
            {
            %>
            <center>
               <h3> User Name   &nbsp;&nbsp;<font color=" #99FFCC"><%=rs.getString(1)%></font><br>

                Password    &nbsp;&nbsp;<font color="red"><%=rs.getString(8)%></font><br>

                Role   &nbsp;&nbsp; <font color="red"><%=rs.getString(2)%></font><br>

                Specialization  &nbsp;&nbsp;<font color="red"><%=rs.getString(3)%></font><br>

                Location   &nbsp;&nbsp;<font color="red"><%=rs.getString(4)%></font> <br>

                Experience &nbsp;&nbsp; <font color="red"><%=rs.getString(5)%></font><br>

                Qualification   &nbsp;&nbsp;<font color="red"><%=rs.getString(6)%></font><br>

                Contact No.&nbsp;&nbsp; <font color="red"><%=rs.getString(7)%><br></font>

                Privacy.&nbsp;&nbsp; <font color="red"><%=rs.getString(9)%><br></font></h3>

     <b><h1> <a href="Edit.jsp?var1=<%=rs.getString(1)%>&var8=<%=rs.getString(8)%>&var2=<%=rs.getString(2)%>&var3=<%=rs.getString(3)%>
     &var4=<%=rs.getString(4)%>&var5=<%=rs.getString(5)%>&var6=<%=rs.getString(6)%>&var7=<%=rs.getString(7)%>&var9=<%=rs.getString(9)%>">Edit</a>|

     <a href="Delete.jsp?var1=<%=rs.getString(1)%>&var2=<%=rs.getString(2)%>&var3=<%=rs.getString(3)%>&var4=<%=rs.getString(4)%>
     &var5=<%=rs.getString(5)%>&var6=<%=rs.getString(6)%>&var7=<%=rs.getString(7)%>&var8=<%=rs.getString(8)%>&var9=<%=rs.getString(9)%>">Delete</a></h1></b>
     </center>

            <%
            }
        %>


        <center> <h2><a href="AllDelete.jsp">All Doctors</a></h2></center>


        <h2><font color="yellow" style="unicode-bidi:bidi-override" ><a href="Search.jsp">Search Doctor</a></font></h2>
        <h1><a href="Query.jsp"> Queries</a></h1>
    </body>
</html>
