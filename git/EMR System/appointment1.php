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


if ( isset($_POST['act']) == "Go" && $_COOKIE["user"] !="") 
{   
	$id= $_COOKIE["user"];
	echo "user id " .$id;

 	$expire=time()+60*10;// 10 minutes
    setcookie("user","$id", $expire);
  
	$radio_value = $_POST["r"];
    echo "You selected " .$radio_value;
	
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else
	{
		mysql_select_db( $database, $conn );
 		
		echo "<center><h2> Select a ".$radio_value."</h2>"; 
		
		$sql= "select d_id, fname, sname from doctor where specialization = '".$radio_value."' order by fname";
		$result = mysql_query( $sql, $conn );		
		
		echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/appointment2.php'>";
		
		echo "<table > <br>";
		
		while( $row = mysql_fetch_row( $result ) )
		{			
				echo "<tr><td> <input type='radio' name='doc_id' checked='checked' value='".$row[0]."' > ".$row[1]."  ".$row[2]." </td></tr>";
		}
		echo "</table>";
		echo "<br><br> <input type='submit' name='act' value='Go' >";
		echo "</form>";
		echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/patient.php'>";
		echo "<td><input type='submit' name='act' value='Cancel' > </td><tr>";
		echo "</form></center>";
		msql_free_result($result);
	}
}

		msql_close($conn);
?>


