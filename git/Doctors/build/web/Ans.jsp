<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


                      

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body bgcolor="olive"><img src="logo.jpg" align="right"/>
    
<%
//try{
        String id=request.getParameter("qid");
       
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from q where qid="+id);
        while(rs.next())
            {  String answer=request.getParameter("answer");
                String user=request.getParameter("user");
                if(rs.getString(4)==null)
                    {
                    %>
                    <h2> Query <%=rs.getString(1)%>: <%=rs.getString(2)%><br>
                           <a href="GA.jsp?qid=<%=rs.getString(1)%>">Give Answer</a></h2>
                    <%
                    }
                else
                 {
                    %>
        <h1>Query <%=rs.getString(1)%>: <%=rs.getString(2)%><br><br>
            Answer: <%=rs.getString(4)%><br>
            Answered By:<%=rs.getString(5)%><br>
        </h1>
    </body>
</html>
    <%
                }
            }
//}
//catch(Exception e){System.out.println(e);}
    
        %>