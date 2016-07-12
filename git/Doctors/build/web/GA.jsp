
<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="olive">
        <%try{
        String id=request.getParameter("qid");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from q where qid="+id);
        while(rs.next())
            {
            %>
        <h1><form action="act.do">
            Answer <%=rs.getString(1)%><input type="textarea" size="100" name="answer" />
            <input type="submit" value="Submit">
        </form>
        </h1>
    </body>
</html>
<%
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
%>

