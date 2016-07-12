<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 <% Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from doctors ");

        %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
        <img src="logo.jpg" align="right"/>
         <table border="3" bordercolor="green" cellpadding="6" bgcolor="pink" >

            <tr>
                <th><h2>User Name</h2></th>
                <th><h2>Role</h2></th>
                <th><h2>Specialization</h2></th>
                <th><h2>Location</h2></th>
                <th><h2>Experience</h2></th>
                <th><h2>Qualification</h2></th>
                <th><h2>Contact No.</h2></th>
                <th><h2>Privacy</h2></th>
                <th></th>

           </tr>
            <% while(rs.next())
                {
            %>
               <tr>
                   <td><%=rs.getString(1)%></td>
                   <td><%=rs.getString(2)%></td>
                   <td><%=rs.getString(3)%></td>
                   <td></td>
                   <td></td>
                   <td></td>
                   <td></td>
                   <td><%=rs.getString(9)%></td>
                   <th><h1> <a href="Delete.jsp?var1=<%=rs.getString(1)%>&var2=<%=rs.getString(2)%>&var3=<%=rs.getString(3)%>&var4=<%=rs.getString(4)%>&var5=<%=rs.getString(5)%>&var6=<%=rs.getString(6)%>&var7=<%=rs.getString(7)%>&var8=<%=rs.getString(8)%>&var9=<%=rs.getString(9)%>">Delete</a></h1>
               </tr>
            <%
                }
            %>
            </table></center>
    </body>
</html>