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


if (( isset($_POST['act']) == "Go" && $_COOKIE["user"] !="") || (isset($_POST['act']) == "Return" && $_COOKIE["user"] !="") )
{ 
	$id= $_COOKIE["user"];
	echo " user id " .$id;

 	$expire=time()+60*10;// 10 minutes
    setcookie("user","$id", $expire);

	$doc_id = $_POST["doc_id"];
    echo "<br>doctor id ".$doc_id;
	
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else
	{
		mysql_select_db( $database, $conn );
 		
		echo "<center><h3>  Enter the appointment date and time <br><br> </h3>"; 
		
		echo "<form method='post' action ='http://people.aero.und.edu/~abhatia/database/appointment3.php'>";
		echo "<input type='text' name='apt_dt_time' > (YYYY-MM-DD HH:MM) 24 hour format";
		echo "<input type='hidden' name='doc_id' value='".$doc_id."'>";
		echo "<br><br><br> <input type='submit' name='act' value='Submit' >";
		echo "</form>";
		echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/patient.php'>";
		echo "<td><input type='submit' name='act' value='Cancel' > </td><tr>";
		echo "</form></center>";		
		
	}
}
		msql_close($conn);
?>


