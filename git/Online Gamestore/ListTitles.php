<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white">
<?php
if ( $_POST['act'] == "ListTitles" ) {
	
	  $username = "abhatia";
	  $password = "password";
	  $database = "abhatia";
	  $host     = "mysqldev.aero.und.edu";	
	    
	  $c_id= $_POST['c_id'];
	  echo "<br>customer id $c_id";
	  
	  // Connect to the database.
	  $conn     = mysql_connect( $host, $username, $password );  
	 
	  if (!$conn)
	  {
	  	echo "Please try later.";
	  }
	  // Select a database.
	  mysql_select_db( $database, $conn );
	  
		$title= strtolower($_POST[title]);
		//echo "<br>searching for $title";
		if (empty($title))
			$query= "select * from game2 order by title asc";
		else 
		{
			$query= "select * from game2 where ";
			$titles = explode(" ", $title);			
			$count =0;			
			foreach ($titles as $t)
			{
				$count++;
				echo $count;
			  	if ($count==1)
			  		$query.= "lower (title) like '%$t%' ";
			  	else 
			  		$query.="or lower (title) like '%$t%' "; 
			}
			//$query.=" order by title desc ";
			$query.=" order by ";
			$c = 0;
			foreach ($titles as $t) {
				$c++;
				if ($c == 1)
					$query .= "if(title like '%$t%',1,0)";
				else
					$query .= " +if(title like '%$t%',1,0)";
			}
			$query .= " desc";
	  
		}
	  echo "<br><br> $query";		
	  $result = mysql_query( $query );		
	  $num    = mysql_numrows( $result );
	
	 echo "	<h2>Listing Games...</h2>";

	echo "<form method='post' action='Cart.php'>";
	if ($num != 0) {
	
		echo "<table border='5' cellpadding='10' cellspacing='5'>
			  <tr bgcolor='white'> <th>Select</th> <th> Title </th> <th> Enter Quantity </th> </tr>
			 ";

		for ($i = 0; $i < $num; $i++) {
			$asin = mysql_result($result, $i, "ASIN");
			$game = mysql_result($result, $i, "title");
			$qty= mysql_result($result, $i, "quantity");			
			$q = "q".$asin;
			
			echo "	<tr bgcolor='white'><td><input type='checkbox' name='cb[]' value='$asin'></td>
					<td><a href='gameDetail.php?asin=$asin'><font color='black'>$game</a></td>
					
					<td><input type= 'text' name ='{$q}' ></td>					
					</tr>								
				 ";				
		}		
		echo "</table>";
	} 
	else
	{
		echo "No Results Found!";
	}	
		
	echo "<br><input type='submit' name='act' value='Add to Cart'>	
			  <input type='hidden' name='c_id'   value=$c_id >					
			</form>		";	
	echo "	<br><br>
			<form method='post' action='showCart.php'>
				<input type='hidden' name='c_id'   value= $c_id >
				<input type = 'submit'  name = 'act' value = 'Show Cart'/>
			</form>
			<form method='post' action='custDetail.php?c_id=$c_id'>
				<input type='submit' name='act'   value='My Account'>									  
			</form>
		";
	  // Close the database.
	  mysql_close( );
}

?>
 
 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "listtitle"/>
	</form>
	</center><div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
</body></html>