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
  
  if (!$conn)
  {
  	echo "Please try later.";
  }
  // Select a database.
  mysql_select_db( $database, $conn );
  
	//$id= $_POST['s_id'];
	$asin = $_GET['asin']; 	
	$query 	= "select * from game2 where ASIN = '$asin'";
	echo " <br> $query <br>";
	
	mysql_query($query, $conn);
	
	$result = mysql_query($query, $conn);	
	$num 	= mysql_numrows($result);	
	echo "	<br><br><h2>Listing Game Details...</h2>";
	if ($num != 0) {	
		echo "<table border='5' cellpadding='10' cellspacing='5'>
			  <tr bgcolor='white'> <th> ASIN </th> <th> TITLE </th> <th> PRICE </th><th> QUANTITY </th> </tr>
			 ";	
		for ($i = 0; $i < $num; $i++) {
			$asin = mysql_result($result, $i, "ASIN");
			$title = mysql_result($result, $i, "title");
			$price = mysql_result($result, $i, "price");
			$qty = mysql_result($result, $i, "quantity");
			
			echo "	<tr bgcolor='white'><td> $asin</td>
					<td>$title</td>
					<td>$price</td>
					<td>$qty</td></tr>
				";
		}		
		echo "</table><br><br>";
	}
	else
	{
		echo "No Results Found!<br><br><br>";
	}
	
	mysql_close($conn);
	?>
	<form method="post" action="custhome.php">
	  <input type = "submit"  name = "act" value = "Back"/>	 
	</form> 	
	
	<form method="post" action="index.html">
	  <input type = "submit"  name = "act" value = "Home"/>
	</form> 
	 <br><br><br>			
	<form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "gamedetail"/>
	</form>
	</body></html>
	 
	
	