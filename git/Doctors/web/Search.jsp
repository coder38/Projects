<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/doc" user="root" password="pass"/>
<sql:query var="rs" sql="select * from doctors"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#2F4F4F"><div align="right"><h1><a href="Lcount.jsp">LogOut</a></h1></div>
        <img src="logo.jpg" align="right"/>
        <h2>FIND DOCTOR...</h2>
                
        
         <form action="">
             <select name ="loc" onchange="form.submit()">
                 <option>--Select Location--</option>
                 <c:forEach var="data" items="${rs.rows}">
             <option>${data.location}</option>
                 </c:forEach>
             </select>
               <c:if test="${param.loc!=null}">

             <sql:query var="data" sql="select * from doctors where location='${param.loc}'" />
                 <center>
                     <c:forEach var="d" items="${data.rows}">
                         <h3>Location:${d.location}<br>
                         Name:${d.name}<br>
                             Role:${d.role}<br>
                             Specialization:${d.specialization}<br>
                             Location:${d.location}<br>
                              Experience:${d.experience}<br>
                              Qualification:${d.qualification}<br>
                              Contact No:${d.contactno}</h3>
                              
                     </c:forEach>
                 </center>

         </c:if>

<select name ="name" onchange="form.submit()">
                 <option>--Select Name--</option>
                 <c:forEach var="data" items="${rs.rows}">
             <option>${data.name}</option>
                 </c:forEach>
             </select>
               <c:if test="${param.name!=null}">

             <sql:query var="data" sql="select * from doctors where name='${param.name}'" />
                 <center>
                     <c:forEach var="d" items="${data.rows}">
                         <h3>Name:${d.name}<br>
                             role:${d.role}<br>
                             specialization:${d.specialization}<br>
                             Location:${d.location}<br>
                              experience:${d.experience}<br>
                              qualification:${d.qualification}<br>
                              Contact No:${d.contactno}</h3>
                     </c:forEach>
                     </center>
                     </c:if>



<select name ="sp" onchange="form.submit()">
                 <option>--Select Specialization--</option>
                 <c:forEach var="data" items="${rs.rows}">
             <option>${data.specialization}</option>
                 </c:forEach>
             </select>
               <c:if test="${param.sp!=null}">

             <sql:query var="data" sql="select * from doctors where specialization='${param.sp}'" />
                 <center>
                     <c:forEach var="d" items="${data.rows}">
                         <h3>Specialization:${d.specialization} <br>
                         Name:${d.name}<br>
                             Role:${d.role}<br>
                             Location:${d.location}<br>
                              Experience:${d.experience}<br>
                              Qualification:${d.qualification}<br>
                              Contact No:${d.contactno}<br><br><br></h3>
                     </c:forEach>
                 </center>

         </c:if>
          </form>

        </body>
</html>




