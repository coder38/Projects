<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white"><br><br><br>
<?php
  
	$id= $_POST['id'];
	$password= $_POST['password'];
	if($id=="a" && $password== "b")
	{
		echo '  <h2>
					<a href="entergamehtml.php" STYLE="text-decoration: none" ><font color = "white">Enter Game</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				    <a href="showGame.php" STYLE="text-decoration: none" ><font color = "white">Show Games</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				    
				    <a href="showCustomer.php" STYLE="text-decoration: none" ><font color = "white">Show Customers</a>         
		     	</h2>
				      
				<br><br><br><br>
				<form method="post" action = "clear.php">
					<input type = "submit"  name = "act" value = "Clear System"/>
				</form>
				 <br><br><br>
				<form method="post" action="display_source.php">
					Enter password: <input type="password" name= "password" >
					<input type = "submit"  name = "act" value = "Display Source"/>
					<input type = "hidden"  name = "interface" value = "adminhome"/>
				</form>
			';
	}
	else 
	{
		echo '<script language="javascript">';
		
		echo 'alert("Wrong Password!!")';
		echo '</script>';
	}

	?>
	  <form method="post" action="index.html">
	 	 <input type = "submit"  name = "act" value = "Logout"/>
	  </form>
	    <br><br><br>

	</font>		
	</center>
	<div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
	</body></html>
	 
	
	