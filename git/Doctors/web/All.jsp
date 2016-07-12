
<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

   <%ResultSet rs;
   String privacy=request.getParameter("privacy");
   Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet r=st.executeQuery("select * from doctors where privacy='public' " );
        
        %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
        <img src="logo.jpg" align="right"/>
         <table border="3" bordercolor="green" cellpadding="10" bgcolor="pink" >

            <tr>
                <th><h2>User Name</h2></th>
                <th><h2>Role</h2></th>
                <th><h2>Specialization</h2></th>
                <th><h2>Location</h2></th>
                <th><h2>Experience</h2></th>
                <th><h2>Qualification</h2></th>
                <th><h2>Contact No.</h2></th>
                <th><h2>Privacy</h2></th>

           </tr>
            <%
           
                  while(r.next())
                  {
            %>
               <tr>
                   <td><%=r.getString(1)%></td>
                   <td><%=r.getString(2)%></td>
                   <td><%=r.getString(3)%></td>
                   <td><%=r.getString(4)%></td>
                   <td><%=r.getString(5)%></td>
                   <td><%=r.getString(6)%></td>
                   <td><%=r.getString(7)%></td>
                   <td><%=r.getString(9)%></td>
               </tr>
            <%
                }

            rs=st.executeQuery("select name,role,specialization,privacy from doctors where privacy='private' " );
                while(rs.next())
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
                   <td>private</td>
                   </tr>
                   <%
                }
            %>
            </table></center>
    </body>
</html>
