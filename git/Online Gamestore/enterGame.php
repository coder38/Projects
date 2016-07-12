<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white">
<?php

$asin=$_POST['t1'];
$title=$_POST['t2'];
$price=$_POST['t3'];
$quantity=$_POST['t4'];

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
  $query = "insert into game2 values ('$asin' , '$title' , '$price', $quantity)";
  mysql_query( $query,$conn );
  //if(mysql_query( $query,$conn ))
 
 // {
  	echo" <br><br><br><br><br>Thank You! <br><br><br><br> ";
  	
	 echo '<script language="javascript">';
	 echo 'alert("Game added successfully !!")';
	 echo '</script>';
  
  
 // Close the database.
  mysql_close( $conn);

?>
<br>
 <form method="post" action="adminhome.php">
	  	<input type = "submit"  name = "act" value = "Back"/>
		<input type = "hidden"  name = "id" value = "a"/>
		<input type = "hidden"  name = "password" value = "b"/>
 </form><br>
 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "entergame"/>
	</form> </center>
<div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
</h3></body></html>