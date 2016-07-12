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
	
	  $c_id= $_GET['c_id'];	
	  echo "<br> id $c_id";
			
		$query= "select cust_id, (select c_name from customer where c_id = 21) as c_name, p.asin, p.title, p.quantity,
		p.amount from purchase p where p.cust_id  =$c_id";
	 
	  $result = mysql_query( $query );	  
	  $num    = mysql_numrows( $result );
	 	
	 echo "	<h2>Customer's Account Details...</h2>";

	if ($num != 0 ) {
	
		echo "<table border='5' cellpadding='10' cellspacing='5'>
				  <tr bgcolor='white'> 
		  			<th>ID</th> <th> Name </th> <th> ASIN </th><th> Title </th> 
		  			<th> Quantity </th> <th> Amount </th> 
		  		  </tr>
			 ";

		for ($i = 0; $i < $num; $i++) {
			$c_id = mysql_result($result, $i, "cust_id");
			$c_name = mysql_result($result, $i, "c_name");
			$asin = mysql_result($result, $i, "asin");
			$title = mysql_result($result, $i, "title");
			$quantity = mysql_result($result, $i, "quantity");
			$amount = mysql_result($result, $i, "amount");
			
			echo "	<tr bgcolor='white'><td>$c_id</td>
					<td>$c_name</td>
					<td>$asin</td>
					<td>$title</td>
					<td>$quantity</td>
					<td>$$amount</td>
					</tr>								
				 ";				
			}		
		
		echo "</table>";
		$query2= "select sum(amount) from purchase where cust_id = $c_id";
		$result2= mysql_query($query2);
		//$num2= mysql_num_rows($result2);
		$total= mysql_result($result2, 0);
		echo "<br> Total amount spent by $c_name on all games is $$total<br>";
	} 
	else
	{
		echo "No Results Found!";
	}	
	
	  // Close the database.
	  mysql_close( );

?>
<br><br><br>
 <!-- <form method="post" action="adminhome.php">
	  	<input type = "submit"  name = "act" value = "Back"/>
		<input type = "hidden"  name = "id" value = "a"/>
		<input type = "hidden"  name = "password" value = "b"/>
 </form><br>-->

 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "custDetail"/>
 </form>
</center><div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
</body></html>