<?php
$password= "database";
$username = "kdaley";
$database = "kdaley";
$host     = "mysqldev.aero.und.edu";




$conn     = mysql_connect( $host, $username, $password );

if ($_COOKIE["user"] =="")
{
	echo "<script> <form  method='post' action='http://people.aero.und.edu/~abhatia/database/remote.php'> 
		alert('Time Out')</form></script>" ;
	
}


if ( $_POST['act'] == "Manage Appointments" && $_COOKIE["user"] !="") 
{
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
    setcookie("user","$id", $expire);
	
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else
	{
		mysql_select_db( $database, $conn );
 		
		
		$sql2= "select  * from appointment order by apt_no";
		$result2 = mysql_query( $sql2, $conn ) or die(mysql_error());
		echo "<h2 align='center' > Schedule </h2> ";

		
		echo "<center><table> <tr bgcolor='#EADCAE' ><td></td> <td width='190'> Appointment No. </td><td width='105' > Patient No. </td><td width='205' align='center'> Doctor No. </td>
				<td width='205' align='center'>Date & Time </td> </tr>";	
		while( $row = mysql_fetch_array( $result2 ) )
		{
			echo "<form method='post' action='http://people.aero.und.edu/~abhatia/database/edit_appointment1.php'>";
			echo " <tr> <td></td> <td>".$row[0]."</td> <td>".$row[1]."</td> <td>".$row[2]."</td> <td><input type='text' name='a_time' value= '".$row[3]."'> </td>";
//					<td><input type='checkbox' name='a_id' value= '".$row[0]."'> </td>";
			echo "<input type='hidden' name='a_id' value='".$row[0]."'>";
			echo "<td><input type = 'submit' name='act' value='Edit'></td> ";
			echo "<td><input type = 'submit' name='act' value='Delete'></td> ";
			echo"</tr>";
			echo "</form>";
		}
		echo "</table> ";
		
		//echo "<input type = 'submit' name='act' value='Edit'> ";
		
		
		msql_free_result($result);
	}
}

		msql_close($conn);
?>


