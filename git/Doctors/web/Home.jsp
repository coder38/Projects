<%@page import="java.sql.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%
        int c = 0, lc = 0;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/doc", "root", "pass");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from doctors ");
//int c=rs.getInt();

        while (rs.next()) {
            c++;
        }
//out.println("Registered Users: "+c);
        ResultSet r = st.executeQuery("select * from Lcount");
        while (r.next()) {
            lc++;
        }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <style type="text/css">

            body {
                background-image: url(red-cross-logo%20-%20Copy.png);
                background-repeat: no-repeat;
                background-position:top;
            }
            .style1 {
                font-size: 36px;
                font-family: "Times New Roman", Times, serif;
                font-weight: bold;
            }
            .style2 {
                font-family: Georgia, "Times New Roman", Times, serif;
                font-style:italic;
            }
            h1{text-align:center}
            .center{
                margin:auto;
                width:15%;
            }
            .right{
                position:absolute;
                left:30px;
                width:300px;
                font-style:italic;
                font-family:sans-serif;
            }
    </style></head>

    <body >
        <img src="logo.jpg" align="right"/>
        <div align="center">
            <h1 class="style1" align="center"><font size="40" ><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;DOCTORS'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FORUM </b></font></h1>
        </div>
        <div class="right"><b>Registered Users: <%=c%> <br><br> Online Users: <%=lc%> </b> </div>


        <div class="center">
            <p>&nbsp;</p>
            <h1 class="style3"> LOGIN</h1>
            <ul>
                <li>
                    <h2 class="style2" ><a href="AdminLogin.jsp">ADMIN</a></h2>
                </li>
                <li>
                    <h2 class="style2"><a href="Login.jsp">USER</a></h2>
                </li>
                <li>
                    <h2 class="style2"><a href="Registration.jsp">NEW USER </a></h2>
                </li>
            </ul>
        </div>
    </body>
</html>





