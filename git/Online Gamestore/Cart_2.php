<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white">
<?php

$c_id= $_POST['c_id'];
echo "<br><br>customer id $c_id";

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
if(isset($_POST))
{
	$asin_list = $_POST['cb'];	
	//$qty_list = $_POST['qty'];	
	
	if(empty($asin_list))
		echo" <br> no game selected";
	
	
	else 
	{
		for ($i=0; $i<count($asin_list);$i++)
		{
			echo"<br>print asin $asin_list[$i]";				
			
			$query2="select * from cart2 where asin= '$asin_list[$i]' and c_id= $c_id";
			$result2 = mysql_query( $query2 );
			$num2    = mysql_numrows( $result2 );
			$q		 = mysql_result($result2, 0,'qty');
			$new_q= $qty_list[i]+$q;
			echo "new quantity $new_q";
			
			//if asin exists, update qty
			if ($num2 != 0)
			{
				$query3="update cart2 set quantity = $new_q where c_id= $c_id and asin ='$asin_list[i]'";
				echo $query3;
				mysql_query($query3);
			}
			// else add game in cart2
			else 
			{
				$qty_list = $_POST['q'.$asin_list[$i]];
						
				//$query = "insert into cart (c_id, asin, quantity) values ($c_id, '$asin_list[$i]', '$qty_list')";
									
				 $query="insert into cart2 values ($c_id,'$asin_list[$i]',
						 (select title from game2 where asin = '$asin_list[$i]'), '$qty_list',
						 (select price from game2 where asin = '$asin_list[$i]'))";
						 
		 		echo $query . "<br>";
		 		
				mysql_query($query, $conn);
			}			
		}
	}			
	mysql_close($conn);
	echo '<script language="javascript">';
		
	echo 'alert("Games added to cart!!")';
	echo '</script>';	
}

echo "	<br><br>
		<form method='post' action='showCart.php'>
			<input type='hidden' name='c_id'   value= $c_id >
		  <input type = 'submit'  name = 'act' value = 'Show Cart'/>
		</form>"; 			 
?>
<form method="post" action="index.html">
  <input type = "submit"  name = "act" value = "Logout"/>
</form> 			 <br><br><br>
 <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "cart"/>
	</form>
</body></html>
