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


if ( $_POST['act'] == "Edit" && $_COOKIE["user"] !="") 
{
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
    setcookie("user","$id", $expire);

 
	$a_time = $_POST["a_time"];
	$a_id = $_POST["a_id"];
	
    echo " a_id " .$a_id;
	
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else
	{
		mysql_select_db( $database, $conn );
 		
	
		mysql_select_db( $database, $conn );
 		
		echo "<center>"; 
		$sql= "update appointment set apt_date_time='".$a_time."' where apt_no= ".$a_id;

		mysql_query( $sql, $conn );
		echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/employee.php'>";		
			
		echo "<br><br> <input type='submit' name='act' value='See Appointments' >";
		echo "</form></center>";
		echo "<script> alert('Appointment ".$a_id." edited and scheduled at ".$a_time."')</script>" ;
	
		msql_free_result($result);
	}
}
if ( $_POST['act'] == "Delete" && $_COOKIE["user"] !="") 
{
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
    setcookie("user","$id", $expire);

 
	
	$a_id = $_POST["a_id"];
	
    echo " a_id " .$a_id;
	
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else
	{
		mysql_select_db( $database, $conn );
 		
	
		mysql_select_db( $database, $conn );
 		
		echo "<center>"; 
		$sql= "delete from appointment where apt_no= ".$a_id;

		mysql_query( $sql, $conn );
		echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/employee.php'>";		
			
		echo "<br><br> <input type='submit' name='act' value='See Appointments' >";
		echo "</form></center>";
		echo "<script> alert('Appointment ".$a_id." is deleted')</script>" ;
	
		msql_free_result($result);
	}
}

		msql_close($conn);
?>


