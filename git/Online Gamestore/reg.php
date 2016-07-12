<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white">
<?php

$name=$_POST['t1'];
$pass=$_POST['t2'];

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
  $query = "insert into customer (c_name, password) values ('$name' , '$pass')";
  mysql_query( $query,$conn );
  //if(mysql_query( $query,$conn ))
 
 // {
  $query2 = "select max(c_id) from customer ";
  $result = mysql_query( $query2,$conn );
  $id = mysql_result($result, 0);
  
  	echo" <br><br><br><br><br>Welcome to the Gamestore! <br><br>
  		You can login with ID $id  
  		<br><br> ";
  	
	 echo '<script language="javascript">';
	 echo 'alert("Registration Successful!!")';
	 echo '</script>';
  
  
 // Close the database.
  mysql_close( $conn);

?>
<form method="post" action="index.html">
<input type = "submit"  name = "act" value = "Home"/></form>
 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "regsuc"/>
	</form> 
</center>
</body>
</html>
</center></h3></body></html>