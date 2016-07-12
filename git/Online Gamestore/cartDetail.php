<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white"><br><br>
<?php

$c_id= $_POST['c_id'];

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
$query2= "select * from cart2 where c_id= $c_id";
		echo $query2;
		$result2 = mysql_query( $query2 );
		$num2    = mysql_numrows( $result2 );	
		if ($num2 != 0) 
		{
			echo "<h3>Listing Cart Contents...</h3>";
			
			echo "<form method='post' action='CartAction.php'>";		
			echo "<table border='5' cellpadding='10' cellspacing='5'>
			  	<tr bgcolor='white'> <th> Select </th> <th> Title </th> <th> Quantity </th>
				<th> Price </th>  </tr>
			 ";
		
			for ($i = 0; $i < $num2; $i++) 
			{
				$c_id = mysql_result($result2, $i, "c_id");
				$asin = mysql_result($result2, $i, "asin");
				$title = mysql_result($result2, $i, "title");
				$qty= mysql_result($result2, $i, "quantity");
				$price = mysql_result($result2, $i, "price");
				//$q_price= $qty * $price;
				//echo "q_price = $q_price";
				$q = "q".$asin;
				//echo "asin is $asin ";
					
				echo "	<tr bgcolor='white'><td><input type='radio' name='r' value='$asin'></td>
						<td><a href='cartDetail.php?asin=$asin&c_id=$c_id'><font color='black'>$title</a></td>							
						<td><input type= 'text' name ='{$q}' value = '$qty'></td>
						<td> $$price</td>
						</tr>
				";
			}
			echo "</table></form>";
		}		
		$query3= "select sum(price)  from cart2 where c_id= $c_id";
		//echo $query3;
		$result3 = mysql_query( $query3 );
		$row = mysql_fetch_row($result3);
		
		
		echo "<br>Total price of games in the cart = $$row[0]";
	mysql_close($conn);

?>
<br><br>
			 

<form method="post" action="index.html">
  <input type = "submit"  name = "act" value = "Logout"/>
</form> 			 <br><br><br>

 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "cartDetail"/>
	</form>
</body></html>
