<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white">
<?php

  $username = "abhatia";
  $password = "password";
  $database = "abhatia";
  $host     = "mysqldev.aero.und.edu";

  // Connect to the database.
  $conn     = mysql_connect( $host, $username, $password );
  
 // echo "connect= ". $conn;
  if (!$conn)
  {
  	echo "Please try later.";
  }
  // Select a database.
  mysql_select_db( $database, $conn );
  $query = "delete from game2";
  mysql_query( $query,$conn );
  $query2 = "delete from customer";
  mysql_query( $query2,$conn );
  $query3 = "delete from cart2";
  mysql_query( $query3,$conn );
  $query4 = "delete from purchase";
  mysql_query( $query4,$conn );
  
  
	 echo '<script language="javascript">';
	 echo 'alert("System Cleared !!")';
	 echo '</script>';
  
  
 // Close the database.
  mysql_close( $conn);

?>
<form method="post" action="index.html"><br><br><br><br><br><br>
<input type = "submit"  name = "act" value = "Home"/></form> 
</center>
</body>
</html>
</center></h3></body></html>