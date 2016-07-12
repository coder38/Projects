<?php
$password= "database";
$username = "kdaley";
$database = "kdaley";
$host     = "mysqldev.aero.und.edu";
$LOCK= "$2y$edWDRI125YHwdyui8jPO0O0OQ";
  

$id_reg = trim($_POST["userId"]);
$fName = trim( $_POST["fName"]);
$sName = trim( $_POST["sName"]);
$sex = trim( $_POST["sex"]);
$dob = trim($_POST["dob"]);
$address = trim( $_POST["address"]);
$phone = trim( $_POST["phone"]);
$email = trim($_POST["email"]);
$role = trim($_POST["role"]);
$jDate=trim($_POST["jDate"]);
 $pwd= trim( $_POST["pwd"]);

if ($role=="doctor"){
	$fLetter=$role[0];
	$i="d_id";}
elseif ($role=="nurse"){
	$i="n_id";
	$fLetter=$role[0];
}	
elseif ($role=="scheduler"){
	$i="s_id";
	$fLetter=$role[0];
}
elseif ($role=="admin"){
	$i="admin_id";
	$fLetter="m";
}
elseif ($role=="accountant"){
	$i="a_id";
	$fLetter=$role[0];
}
elseif ($role=="lab_assistant"){
	$i="l_id";
	$fLetter=$role[0];
}


$LOCK='$2y$edWDRI125YHwdyui8jPO0O0OQ';
//$ = trim($_POST["userId"]);
$level =1;

$conn     = mysql_connect( $host, $username, $password );

if ( $_POST['act'] == "Register" ) {
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else{
		mysql_select_db( $database, $conn );
		$sql = "insert into patient values('".$id_reg."','".$fName."','".$sName."', '".$sex."','".$address."','".$phone."','".$email."','".$dob."' );";	
		$question = trim( $_POST["question"]);
		$answer = trim( $_POST["answer"]);
		$result = mysql_query( $sql, $conn );
		$sql = "insert into manages_login_ac values('".$id_reg."','".crypt($pwd,$LOCK)."','0','0','".$question."','".crypt($answer,$LOCK)."');";
                $result = mysql_query( $sql, $conn );
                $row = mysql_fetch_array( $result ) ;

		echo "<script> alert('Congratulation You are registered')</script>" ;
	//	$row = mysql_fetch_array( $result ) ;
        header("Refresh:0; url=http://people.aero.und.edu/~abhatia/database/index.html ");
		msql_free_result($result);
		msql_close($conn);
	}

}
if ( $_POST['acts'] == "Register" ) {// for admin use
	if ( !$conn )
		die( 'Could not connect: ' . mysql_error( ) );
	else{
		$id= $_COOKIE["user"];
		$ssn=trim($_POST["ssn"]);
		$question = trim( $_POST["question"]);
		$answer = trim( $_POST["answer"]);
		 $expire=time()+60*15;// 10 minutes
                setcookie("user","$id", $expire);
		mysql_select_db( $database, $conn );
		$sql="select ".$i." from ".$role." order by ".$i." desc";
		$result = mysql_query( $sql, $conn );
		$row = mysql_fetch_array( $result ) ;
        if ($row[0] != ""){
			$str = explode($fLetter,$row[0]);
			$count = intVal($str[1])+1;
			$new_id = $str[0].$fLetter.$count;
		}
		else{ // no employee in department
			$new_id = "ms".$fLetter."1001";
		}
		if ($role="doctor")
			$sql = "insert into ".$role." values('".$new_id."','".$fName."','".$sName."',
            '".$sex."','".$address."','".$phone."','".$email."','".$dob."','".ucfirst($role)."' );";	
		else
                        $sql = "insert into ".$role." values('".$new_id."','".$fName."','".$sName."',
                        '".$sex."','".$address."','".$phone."','".$email."','".$dob."' );";        
		$result = mysql_query( $sql, $conn )  or die(mysql_error());
		$row = mysql_fetch_array( $result ) ;
		$sql = "insert into manages_login_ac values('".$new_id."','".crypt($new_id,$LOCK)."','0','0','".$question."','".crypt($answer,$LOCK)."');";
		$result = mysql_query( $sql, $conn )  or die(mysql_error());
		$row = mysql_fetch_array( $result ) ;
		$sql = "insert into employee values('".$ssn."','".$new_id."','".ucfirst($role)."','".$jDate."');";
		$result = mysql_query( $sql, $conn ) or die(mysql_error());
		$row = mysql_fetch_array( $result ) ;
		echo "<script> alert('Congratulation user ".$new_id." is registered')</script>" ;
        	//header("Refresh:0; url=http://people.aero.und.edu/~kdaley/database/index.html ");
		msql_free_result($result);
		msql_close($conn);
	}

}


if ( $_POST['act'] == "Reset" ) {// for admin use
	$id  = trim($_POST["userID"]);
	$question = trim( $_POST["question"]);
	$answer = trim( $_POST["answer"]);
	$pwd = trim( $_POST["pwd"]);
	$dob = trim($_POST["dob"]);
	$pwd2 = trim( $_POST["pwd2"]);
	$ans =0; 
	$quest =0;
	mysql_select_db( $database, $conn );
	$sql="select question, answer from manages_login_ac where uid = '".$id."';";
	$result = mysql_query( $sql, $conn );
	$row = mysql_fetch_array( $result ) ;
	if(crypt($answer,$LOCK) == $row[1])
		$ans+=1;
	if($question == $row[0])
		$ans+=1;
	if ($ans ==2){
		$sql="update manages_login_ac set pass='".crypt($pwd, $LOCK)."' where uid='".$id."';";
		$result = mysql_query( $sql, $conn );
		$row = mysql_fetch_array( $result ) ;
		 echo "<script> alert('Password was sucessful in resetting')</script>" ;
	}
	else{
		echo "<script> alert('Incorrect value entered ')</script>" ;
	}
	header("Refresh:0; url=http://people.aero.und.edu/~abhatia/database/index.html ");

                }
?>
