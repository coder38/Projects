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


if ( $_POST['act'] == "Make an Appointment" && $_COOKIE["user"] !="") 
{
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
    setcookie("user","$id", $expire);
	
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else
	{
		mysql_select_db( $database, $conn );
 		
		echo "<center><h2> Select the specialist you need to consult</h2>"; 
		$sql= "select distinct specialization from doctor order by specialization";
		$result = mysql_query( $sql, $conn );
		
		
		echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/appointment1.php'>";
		echo "<table > ";
		
		while( $row = mysql_fetch_row( $result ) )
		{			
				echo "<tr><td> <input type='radio' name='r' value='".$row[0]."' checked='checked'> ".$row[0]."</td></tr><br>";
		}
		echo "</table>";
		#echo $_POST["r"] 
		echo "<br> <input type='submit' name='act' value='Go' >";
		echo "</form>";
		echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/patient.php'>";
		echo "<input type='submit' name='act' value='Cancel' > ";
		echo "</form></center>";
		
		msql_free_result($result);
	}
}
		msql_close($conn);
?>


