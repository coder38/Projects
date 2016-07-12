<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white"><br><br><br>
<?php
  
	$c_id= $_POST['id'];
	$pass= $_POST['password'];
	
	echo "customer id $c_id";
	 
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
	 
	$query= "select * from customer where c_id= $c_id and password = '$pass'";
	
	echo "<br><br> $query";
	// Execute the query.
	$result = mysql_query( $query );
	// Find the row number of the results.
	$num    = mysql_numrows( $result );	
	
	if ($num != 0) {
		
		echo "  
			<br><br><br>
			<form method='post' action='ListTitles.php'>
			   Book title word: 
				<input type='text'   name='title'  size='32'>					
				<input type='submit' name='act'   value='ListTitles'>	
				<input type='hidden' name='c_id'   value=$c_id>				  
			    <input type='reset'               value='Reset'>
			</form>";
			
		echo " <form method='post' action='showCart.php'>
					<input type='submit' name='act'   value='My Cart'>
					<input type='hidden' name = 'c_id' value = $c_id >				  
				</form>
				
				<form method='post' action='custDetail.php?c_id=$c_id'>
					<input type='submit' name='act'   value='My Account'>
									  
				</form>
				<br><br><br>			
			
				<form method='post' action='display_source.php'>
					Enter password: <input type='password' name= 'password' >
					<input type = 'submit'  name = 'act' value = 'Display Source'/>
					<input type = 'hidden'  name = 'interface' value = 'custhome'/>
				</form>
			
				<form method='post' action='index.html'>
				 	 <input type = 'submit'  name = 'act' value = 'Logout'/>
				</form>
			    <br><br><br>
				";
	    }
	    else
	    {
	    	echo '<script language="javascript">';
	    		
	    	echo 'alert("Wrong Password!!")';
	    	echo '</script>';
	    }
	    ?>
	</font>		
	</center>
	<div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
	</body></html>
	 
	
	