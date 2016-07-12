<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style type="text/css">
    h1{background-color:olive}
    h2{background-color:pink}
    </style>
    </head><body>
        <div align="right"><h1><a href="Lcount.jsp">LogOut</a></h1></div>
        <img src="logo.jpg" align="right"/>
    <center>
        <h1>SOLVE YOUR QUERY</h1>
       <% Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from q ");
        while(rs.next())
            {
            %>
            
            <h2> Query <%=rs.getString(1)%>:<a href="Ans.jsp?qid=<%=rs.getString(1)%>">    <%=rs.getString(2)%></a>
            Click on the query to Check its Answer 
            </h2>

            <%
                
            }
        %>
        <h2>
            <a href="IQ.jsp">New Query</a>
        </h2>
        
        </center>
    </body>
</html>
