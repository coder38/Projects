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


if ( isset($_POST['act']) == "Submit" && $_COOKIE["user"] !="") 
{   	
    $id= $_COOKIE["user"];
	echo "user id " .$id;

 	$expire=time()+60*10;// 10 minutes
    setcookie("user","$id", $expire);
  
	$apt_dt_time = $_POST["apt_dt_time"];
	
	$doc_id= $_POST["doc_id"];
	echo "<br>date " .$apt_dt_time. "<br>doctor " .$doc_id;
    
	
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else
	{		
		if($apt_dt_time!='')
		{
			mysql_select_db( $database, $conn );
			echo "aaa";	
			echo "<center>"; 
			$sql= "insert into appointment (u_id, d_id, apt_date_time) values('".$id."','".$doc_id."','".$apt_dt_time."')";
			mysql_query( $sql, $conn );
			
			
			echo "<script> alert('Appointment scheduled at ".$apt_dt_time."')</script>" ;
			
			echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/patient.php'>";		
				
			echo "<br><br> <input type='submit' name='act' value='Return' >";
			echo "</form></center>";
			msql_free_result($result);
		}
		else
		{
			echo "bbb";	
			echo "<script> alert('Enter date and time of appointment')</script>" ;
			echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/appointment2.php'>";		
			echo "<input type='hidden' name='doc_id' value='".$doc_id."'";		
			echo "<br><br> <center><input type='submit' name='act' value='Return' >";
			echo "</form></center>";
		}
	}
}
		msql_close($conn);
?>


