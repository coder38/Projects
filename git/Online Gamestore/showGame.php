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
	  
	  $query= "select * from game2 order by title";
	
	  echo "<br><br> $query";	
	  // Execute the query.
	  $result = mysql_query( $query );	
	  // Find the row number of the results.
	  $num    = mysql_numrows( $result );
	
	 echo "	<h2>Listing Games...</h2>";

	 if ($num != 0) {
	
		echo "<table border='5' cellpadding='10' cellspacing='5'>
			  <tr bgcolor='white'>  <th> ASIN </th> <th> Title </th> </tr>
			 ";

		for ($i = 0; $i < $num; $i++) {
			$asin = mysql_result($result, $i, "ASIN");
			$game = mysql_result($result, $i, "title");
			
			echo "	<tr bgcolor='white'><td>$asin</td>
					<td><a href='gameDetail.php?asin=$asin'><font color='black'>$game</a></td>
				 ";				
		}		
		echo "</table>";
	} 
	else
	{
		echo "No Results Found!";
	}	
		
	  // Close the database.
	  mysql_close( );


?>
<br><br><br>
 <form method="post" action="adminhome.php">
	  	<input type = "submit"  name = "act" value = "Back"/>
		<input type = "hidden"  name = "id" value = "a"/>
		<input type = "hidden"  name = "password" value = "b"/>
 </form><br>
 
 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "showgame"/>
 </form>
 </center>
<div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
</body></html>