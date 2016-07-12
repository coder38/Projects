<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

   <%/*try{
        String id=request.getParameter("qid");
        String answer=request.getParameter("answer");
        String user=request.getParameter("user");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from q where qid="+id);
        while(rs.next())
            {${sessionScope.answer}
               */ %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body bgcolor="olive"><img src="logo.jpg" align="right"/>
    <% Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from q  ");
        while(rs.next())
            {
            if(rs.getString(4)!=null){
            %>


    <h1> Query <%=rs.getString(1)%>: <a href="Ans.jsp?qid=<%=rs.getString(1)%>">    <%=rs.getString(2)%></a><br>
       Answer <%=rs.getString(1)%> : <%=rs.getString(4)%><br>
       Answered By : <%=rs.getString(5)%></h1>

<%
        }}
        %><h1><a href="Query.jsp">Back</a></h1>
    </body>
</html>
  
        
