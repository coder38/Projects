<?php
$password= "database";
$username = "kdaley";
$database = "kdaley";
$host     = "mysqldev.aero.und.edu";
//echo system('$DBPASS');
$pwd = trim( $_POST["pwd"]);
$id = trim($_POST["userId"]);

$LOCK='$2y$edWDRI125YHwdyui8jPO0O0OQ';
$conn     = mysql_connect( $host, $username, $password );
if ( !$conn ){
	header("Refresh:0");
	die( 'Could not connect: ' . mysql_error( ) );
}
function sameMenu(){
	echo" 	</ul></li> <li><a href='#'>My Center</a><ul><li><input type='submit' name='act' 
		value='Personal Info' style='width:150;background:none;border:0'    ></li>
		";	//		<li><input type='submit' name='act'  value='Schedule' style='width:150;background:#ADB96E;border:0;color:#2fff00'    ></li>
		echo"<li><input type='submit' name='act'  value='Password' style='width:150;background:none;border:0'    ></li>
		<li><input type='submit' name='act'  value='Salary' style='width:150;background:none;border:0'    ></li>";



}
function log_in($id){
	/*  
	this function is used to decide what menu will be printed to  a user
	*/
	mysql_select_db( $database, $conn );

	$level="p";// use p for patient	
	if ($id[0] =="m"&& $id[1]=="s"){
		$level=$id[2];	
	}

	if ($level =="d"){  //doctor
		$sql = "SELECT  fname, sname  FROM doctor where d_id ='".$id."';";
                $result = mysql_query( $sql, $conn );
                $row = mysql_fetch_array( $result ) ;
                $_name=$row[0];
                echo $_name;
		include("head_sub.html");
		echo"<li><a href='#'>Patient Aid</a>
			<ul><li> <input type='submit' name='act'  value='Prescription' style='width:150;background:none;border:0;color:none' ></li>
			<li><input type='submit' name='act'  value='Schedule' style='width:150;background:none;border:0'    ></li>
			<li><input type='submit' name='act'  value='Pre-Check' style='width:150;background:none;border:0'    ></li>
			<li> <input type='submit' name='act'  value='Lab Test' style='width:150;background:none;border:0' ></li>";
		sameMenu();

		include("menu_emp.html");
	}
	elseif ($level =="n"){//nurse
		include("head_sub.html");
		echo"<li><a href='#'>Patient Aid</a>
			<li><input type='submit' name='act'  value='Pre-Check' style='width:150;background:none;border:0'    ></li>
			<li> <input type='submit' name='act'  value='Lab Test' style='width:150;background:none;border:0' ></li>
			<li><input type='submit' name='act'  value='Schedule' style='width:150;background:none;border:0'    ></li>
			";
		sameMenu();

		include("menu_emp.html");
	}
	elseif ($level =="m"){//admin
		$sql = "SELECT  fname, sname  FROM admin where admin_id ='".$id."';";	
		$result = mysql_query( $sql, $conn );
		//echo $sql;
		$row = mysql_fetch_array( $result ) ;
		$_name=$row[0];
		echo $_name;
		include("head_sub.html");
		echo"<li><a href='#'>Manage</a>
			<ul><li> <input type='submit' name='act'  value='Accounts' style='width:170;background:none;border:0' ></li>
			<li> <input type='submit' name='act'  value='New Employee' style='width:170;background:none;border:0;color:none' ></li>
			";//	<li><input type='submit' name='act'  value='Schedule' style='width:170;background:#ADB96E;border:0;color:#2fff00'    ></li>";
		sameMenu();
		include("menu_emp.html");
	}
	elseif ($level =="l"){//labAssistant // create a function called same
		include("head_sub.html");
		echo"<li><a href='#'>Patient Aid</a>
			<ul><li> <input type='submit' name='act'  value='Report' style='width:150;background:none;border:0' ></li>
			<li> <input type='submit' name='act'  value='Test' style='width:150;background:none;border:0' ></li>
			<li><input type='submit' name='act'  value='Schedule' style='width:150;background:none;border:0'    ></li>";
		sameMenu();
		include("menu_emp.html");
	}

	elseif ($level =="a"){//accountant
		include("head_sub.html");
		echo"<li><a href='#'>Patient Aid</a>
			<ul><li> <input type='submit' name='act'  value='Precheck' style='width:150;background:none;border:0' ></li>
			<li> <input type='submit' name='act'  value='Lab Test' style='width:150;background:none;border:0' ></li>
			<li><input type='submit' name='act'  value='Schedule' style='width:150;background:none;border:0'    ></li>";
		sameMenu();
		include("menu_emp.html");
	}
	elseif ($level =="s"){//scheduler
		include("head_sub.html");
		echo"<li><a href='#'>Patient Aid</a>
			<ul><li> <input type='submit' name='act'  value='Precheck' style='width:150;background:none;border:0' ></li>
			<li> <input type='submit' name='act'  value='New Lab Test' style='width:170;background:none;border:0' ></li>
			<li><input type='submit' name='act'  value='See Appointments' style='width:300;background:none;border:0'    ></li>";
		sameMenu();
		include("menu_emp.html");

	}

	else{// patient 
		$sql = "SELECT  fname, sname  FROM patient where u_id ='".$id."';";
                $result = mysql_query( $sql, $conn );
                $row = mysql_fetch_array( $result ) ;
                $_name =  $row[0];
		echo $_name;
		include("menu.html");
		echo"    <li><a href='#'>My Center</a><ul><li><input type='submit' name='act' 
			value='Edit Personal Info' style='width:150;border:0;background:none '    ></li>
			";      //              <li><input type='submit' name='act'  value='Schedule' style='width:150;background:#ADB96E;border:0;color:#2fff00'    ></li>
			echo"<li><input type='submit' name='act'  value='Password' style='width:170;height:70; background:none;border:0'    ></li>
			<li><input type='submit' name='act'  value='Statement' style='width:150;border:0;background:none'    ></li>";
		echo" 	</ul></li> <li><a href='#'>Resource </a><ul><li><input type='submit' name='act' 
			value='Email' style='width:150;background:none;border:0'    ></li>
			";	//		<li><input type='submit' name='act'  value='Schedule' style='width:150;background:#ADB96E;border:0;color:#2fff00'    ></li>
			echo"<li><input type='submit' name='act'  value='Appointment' style='width:150;background:none;border:0'    ></li>
			<li><input type='submit' name='act'  value='Record' style='width:150;background:none;border:0'    ></li>";

		include("menu_emp.html");



	}




}
if ( $_POST['act'] == "Log in" ) {
	mysql_select_db( $database, $conn );
	//$ip= GetHostByName($REMOTE_ADDR);
	$ip2= gethostbyaddr($_SERVER['REMOTE_ADDR']);
	//echo"IP  ".$ip2;
	$sql = "SELECT  pass  FROM manages_login_ac where uid ='".$id."';";	
	$result = mysql_query( $sql, $conn );
	$row = mysql_fetch_array( $result ) ;
	$pwd= crypt($pwd,$LOCK);
	if ($pwd != $row[0] || $pwd==""){
		echo "<script> alert('wrong user name = ".$id." or password combination')</script>" ;
		header("Refresh:0; url=http://people.aero.und.edu/~abhatia/database/index.html ");
	}else{
		$expire=time()+60*15;// 15 minutes
		setcookie("user","$id", $expire);
		session_start("new");	
		include("head.html");

               
		log_in($id);	
	}
	msql_free_result($result);

}
if ( $_POST['act'] == "Use Credit Card" ) {
	mysql_select_db( $database, $conn );
	$level="p";// use p for patient	
	$sql = "SELECT  uid, pin  FROM manages_login_ac where cc ='".$id."';";	
	$result = mysql_query( $sql, $conn );
	$row = mysql_fetch_array( $result ) ;
	$pwd= crypt($pwd,$LOCK);
	if ($pwd != $row[1] || $pwd=="" ||$pwd=='0'|| $id=='0'){
		echo "<script> alert('wrong credit card number name=".$row[0]."or password combination')</script>" ;
		header("Refresh:0; url=http://people.aero.und.edu/~abhatia/database/index.html ");
	}else{
		$id = $row[0];
		$expire=time()+60*10;// 10 minutes
		setcookie("user","$id", $expire);

		include("head.html");
		log_in($id);	
	}
	msql_free_result($result);

}


if ( $_POST['act'] == "Log Out" ) {	
	$expire=time()-3600;// five minutes
	setcookie("user","$id", $expire);
	$id ="";
	$pwd ="";
	$_SESSION = array(); 
	session_destroy("new");
	header("Refresh:1; url=http://people.aero.und.edu/~abhatia/database/index.html ");
	//	echo "working on balanace";

}
/*	
	else{
	echo "<script> alert('wrong user name=".$id."or password combination')</script>" ;
	header("Refresh:0; url=http://people.aero.und.edu/~kdaley/database/index.html ");

	}
 */


msql_close($conn);

?>
