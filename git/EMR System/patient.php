<?php
/*
Patient.php is use to controll all action
of a patient 
*/

$password= "database";
$username = "kdaley";
$database = "kdaley";
$host     = "mysqldev.aero.und.edu";
$LOCK='$2y$edWDRI125YHwdyui8jPO0O0OQ';
$pwd = trim( $_POST["pwd"]);
$id = trim($_POST["userId"]);
$conn     = mysql_connect( $host, $username, $password );
if ( !$conn ){
	header("Refresh:0");
	die( 'Could not connect: ' . mysql_error( ) );
}
if ($_COOKIE["user"] ==""){
	echo "<script> <form  method='post' action='http://people.aero.und.edu/~abhatia/database/remote.php'> 
		alert('Time Out')</form></script>" ;
	//	echo "<form  method='post' action='http://people.cs.und.edu/~kdaley/database/remote.php'  >";
	//	header("Refresh:0; url=http://people.aero.und.edu/~kdaley/database/index.html ");
	//	echo"</form>";
}
if ( $_POST['act'] == "Edit Personal Info" && $_COOKIE["user"] !="") {
	$id= $_COOKIE["user"];
	$expire=time()+60*10;// 10 minutes
	setcookie("user","$id", $expire);
	mysql_select_db( $database, $conn );
	$sql2 = "SELECT *  FROM patient where u_id =".$id.";";
	$result2 = mysql_query( $sql2, $conn );
	echo"<div align='right'> <button onClick='window.print()'>Print this page</button></div> ";
	echo "<h2 align='center' > Personal Information</h2> ";
	echo "<br>";
	$row2 = mysql_fetch_array( $result2 ) ;
	echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/remote.php'  >";
	echo "<table> <tr><td>First Name</td><td> <input name='fname2' type='text' value='".$row2[1]."'></td></tr>";
	echo " <tr><td>Sur Name</td><td> <input name='lname' type='text' value='".$row2[2]."'></td></tr>";
	echo " <tr><td>Sex </td><td> ".$row2[3]."</td></tr>";
	echo " <tr><td>Address </td><td> <input name='address' type='text' value='".$row2[4]."'></td></tr>";
	echo " <tr><td>Phone  </td><td> <input name='phone' type='tel' value='".$row2[5]."'></td></tr>";
	echo " <tr><td>Email </td><td> <input name='email' type='email' value='".$row2[6]."'></td></tr>";
	echo " <tr><td>D.O.B.</td><td> ".$row2[7]."</td></tr>";
	echo "<tr></tr>";
	echo "<tr><td>  <input type='submit' name='act' value='Update' style='width:100;background:#cc300;border:0;color:#2fff00' > </td> </tr>";
	echo "</table> </form>";
	msql_free_result($result2);

}
if ( $_POST['act'] == "Update" && $_COOKIE["user"] !="") {
	$id= $_COOKIE["user"];
	$expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
	$fName = trim($_POST["fname2"]);
	$lName = trim($_POST["lname"]);
	$address = trim( $_POST["address"]);
	$phone = trim( $_POST["phone"]);
	$email = trim($_POST["email"]);
	$pwd = trim( $_POST["pwd2"]);
	mysql_select_db( $database, $conn );
	$sql2 = "Update patient set fname='".$fName."' ,  lname='".$lName."' , address='".$address."' , phone='".$phone."' , email='".$email."'  where u_id=".$id.";";
	$result2 = mysql_query( $sql2, $conn );
	$row2 = mysql_fetch_array( $result2 ) ;
	echo "<script> alert('Update Completed =".$fname."')</script>" ;
	msql_free_result($result2);

}

if ( $_POST['act'] == "Email" && $_COOKIE["user"] !="") {
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
       	mysql_select_db( $database, $conn );
	$sql2= "select   d_id, fname, sname  from doctor;";
	$result2 = mysql_query( $sql2, $conn ) or die(mysql_error());
	echo"<div align='right'> <button onClick='window.print()'>Print this page</button></div> ";
	echo "<h2 align='center' > EMAIL </h2> ";
	echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/patient.php'  >";
	echo "<table> <tr bgcolor='#EADCAE'><td> Dr. </td><td align='center'> Message </td> </tr><tr><td><select name='apt'>";	
	while( $row = mysql_fetch_array( $result2 ) ){
		echo " <option value='".$row[0]."'>".$row[1]." ".$row[2]."</option>";	
	}
	echo "</select></td><td> <textarea name='pres' rows='4' cols='70'>    </textarea></td></tr>";
	echo "<tr></tr>";		
	echo "<tr><td></td><td align='right'>  <input type='submit' name='acts' value='Send Message'
		 style='width:100;background:#66FF99;border:1;color:#cff00' > </td> </tr>";		
	echo "</table></form> ";
	msql_free_result($result2);
}
if ( $_POST['acts'] == "Send Message" ) {
	$id= $_COOKIE["user"];
	$expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
	$apt = trim($_POST["apt"]);
	$pres = trim($_POST["pres"]);
	mysql_select_db( $database, $conn );
	$sql2 = "insert into prescription values ('".$apt."' , '".$pres."' );";	
	$result2 = mysql_query( $sql2, $conn );
	echo "<script> alert('Message Sent')</script>" ;
	msql_free_result($result2);
}
if ( $_POST['act'] == "Record" && $_COOKIE["user"] !="") {
	$id= $_COOKIE["user"];
	$expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
	mysql_select_db( $database, $conn );
	$sql2= " select   * from  report where p_id= '".$id."';";
	$result2 = mysql_query( $sql2, $conn ) or die(mysql_error());
	echo"<div align='right'> <button onClick='window.print()'>Print this page</button></div> ";
	echo "<h2 align='center' > Patient Record </h2> ";
	echo "<table> <tr bgcolor='#EADCAE' ><td width='25'> Record Num </td><td width='105'> Time
	 </td><td width='55' > Physician Number </td><td width='405' align='center'> Report  </td> </tr>";
	while( $row = mysql_fetch_array( $result2 ) ){
		if ($row[3] ==1)
			echo " <tr> <td> ".$row[0]."  </td> <td>".$row[4]."</td> <td>".$row[2]."</td><td>".$row[5]." </td></tr>";
	}

	echo"</table><table>";
	echo "</table> ";
	msql_free_result($result2);
}

if (( $_POST['act'] == "Appointment" ||  $_POST['act'] == "Cancel" || $_POST['act'] == "Return") && $_COOKIE["user"] !="") 
{
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
       	mysql_select_db( $database, $conn );
	$sql2= " select   p.apt_date_time,   e.fname, e.sname from  appointment p, patient d, doctor e where d.u_id= '".$id."' and p.d_id=e.d_id ;";
	$result2 = mysql_query( $sql2, $conn ) or die(mysql_error());
	echo"<div align='right'> <button onClick='window.print()'>Print this page</button></div> ";
	echo "<h2 align='center' > Appointment Information</h2> ";
	echo "<table> <tr bgcolor='#EADCAE' ><td></td> <td width='205'> Time </td><td width='205' > Dr. First Name </td><td width='205' align='center'> Sur Name </td> </tr>";	
	while( $row = mysql_fetch_array( $result2 ) )
	{
		echo " <tr> <td></td> <td>".$row[0]."</td> <td>".$row[1]."</td><td>".$row[2]." </td></tr>";	
	}
	echo"</table><table>";
	echo "</table> ";
	
	echo "<center><br><br><form method='post' action='http://people.aero.und.edu/~abhatia/database/appointment.php'>";	
	echo "<input type = 'submit' name='act' value='Make an Appointment'> ";
	echo "</form></center>";
	
	msql_free_result($result2);
	
}



if ( $_POST['act'] == "Password" && $_COOKIE["user"] !="") {
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
	echo "<h2 align='center' > Password Reset </h2> ";
	echo "<form  method='post' action='http://people.aero.und.edu/~abhatia/database/patient.php' taget='view' >";
	echo "<table> <tr><td>  </td><td>  </td><td align='center'> </td> </tr>";	
	echo " <tr><td> Current Password </td> <td><input type='text' name='cpw'autocomplete ='off'  ></td><td></td></tr>";	
	echo " <tr><td> New Password </td> <td><input type='password' name='npw' ></td><td></td></tr>";	
	echo " <tr><td> confirm Password </td> <td><input type='password' name='npw2' ></td><td></td></tr>";	
	echo "<tr><td>  <input type='submit' name='acts' value='Update' style='width:100;background:#DD3f0;border:0;color:#Afff00' > </td> </tr>";		
	echo "</table> </form>";

}

if ( $_POST['acts'] == "Update" && $_COOKIE["user"] !="") {
	$id= $_COOKIE["user"];
	 $expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
	$cpw =  trim($_POST["cpw"]);
	$npw =  trim($_POST["npw"]);
	$npw2 =  trim($_POST["npw2"]);
	if ($npw2 != $npw){
		echo "<script> alert('New Password Should be the same')</script>" ;
	}
	mysql_select_db( $database, $conn );
	$sql2= "select   pass from manages_login_ac  where uid= '".$id."';";
	$result2 = mysql_query( $sql2, $conn ) or die(mysql_error());
	$row = mysql_fetch_array( $result2 ); 
	if ($row[0] != crypt($cpw, $LOCK)){
		echo "<script> alert('Current Password Should be the same')</script>" ;
	}
	else{
		$sql2= "Update  manages_login_ac set pass='".crypt($npw,$LOCK)."'  where uid= '".$id."';";
		$result2 = mysql_query( $sql2, $conn ) or die(mysql_error());
		echo "<script> alert('Password Successfully Change')</script>" ;
	}
	msql_free_result($result2);


}

if ( $_POST['act'] == "Statement" && $_COOKIE["user"] !="") {
	$id= $_COOKIE["user"];
 	$expire=time()+60*10;// 10 minutes
        setcookie("user","$id", $expire);
       	mysql_select_db( $database, $conn );
	$sql2= "select   *  from billing where u_id= '".$id."';";
	//	$sql2 = "select apt_no, u_id, apt_date_time from appointment where d_id='".$id."';";	
	//echo $sql2;
	$result2 = mysql_query( $sql2, $conn ) or die(mysql_error());
	echo"<div align='right'> <button onClick='window.print()'>Print this page</button></div> ";
	echo "<h2 align='center' > Billing Information</h2> ";
	echo "<table> <tr bgcolor='#EADCAE'><td width='100'> Bill # </td><td width='180'> Appointment Num. </td><td width='200' align='center'>Amount  </td> </tr>";	
	while( $row = mysql_fetch_array( $result2 ) ){
		echo " <tr><td> ".$row[0]." </td> <td>".$row[1]."</td><td> ".$row[3]."</td></tr>";	

	}
	echo "</table> ";

	msql_free_result($result2);


}

/*	
	else{
	echo "<script> alert('wrong user name=".$id."or password combination')</script>" ;
	header("Refresh:0; url=http://people.aero.und.edu/~kdaley/database/index.html ");

	}
 */


msql_close($conn);

?>
