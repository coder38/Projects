<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white"><br>
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
  
	$c_id= $_POST['c_id']; 	
	$asin= $_POST['r'];
	
	$query 	= "delete from cart2 where c_id = $c_id and asin = '$asin'";
	echo $query . "<br>";
	
	if(mysql_query($query, $conn))
		echo "<br> Game deleted from cart!";
	else 
		echo "<br>Game not deleted";
	
	$query1 = "delete from purchase where c_id = $c_id and asin = '$asin'";
	if (mysql_query($query1, $conn))
		echo "<br>Game deleted from customer's account!";
	else
		echo "<br>Game not deleted from customer's account!";
	
	$query2 	= "select * from purchase ";
	$result2 = mysql_query($query2, $conn);	
	$num 	= mysql_numrows($result2);	
	echo "	<br><h2>Listing Games Purchased...</h2>";
	//echo "<br><form method='post' action='delSupplier.php'>";
	
	if ($num != 0) {	
		echo "<table border='5' cellpadding='10' cellspacing='5'>
			  <tr bgcolor ='white'> <th>Customer ID </th> <th>ASIN </th> <th>Title </th><th>Quantity </th>
			  <th>Amount </th> </tr>
			 ";	
		for ($i = 0; $i < $num; $i++) {
			$c_id = mysql_result($result2, $i, "cust_id");
			$asin = mysql_result($result2, $i, "asin");
			$title = mysql_result($result2, $i, "title");
			$quantity= mysql_result($result2, $i, "quantity");
			$amount = mysql_result($result2, $i, "amount");
	
			echo "	<tr bgcolor ='white'>
					<td>$c_id</td>
					<td>$asin</td>
					<td>$title</td>
					<td>$quantity</td>
					<td>$amount</td>
					</tr>
			";
		}
		echo "</table><br><br>";
	}
	else
	{
		echo "No Results Found!<br><br><br>";
	}
	//echo "<br><br><input type='submit' name='act' value='Delete Game'>";
			echo"</form>";
	
	mysql_close($conn);
	?>
	<form method="post" action="listSuppliers.php">
	  <input type = "submit"  name = "act" value = "Back"/>
	  </form> 
	  	
	  <form method="post" action="index.html">
	  <input type = "submit"  name = "act" value = "Home"/>
	  </form>
	    <br><br><br>
	 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "delgame"/>
	</form>
	  </font>		
	  </center>
	<div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
	</body></html>
	 
	
	