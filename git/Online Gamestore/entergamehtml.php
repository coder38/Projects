<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white"><br>
<?php
  
	$id= $_POST['id'];
	
			echo '	<form method="post" action = "enterGame.php">
						<h3>Enter game details... <br><br></h3>
						
						<table border="5" cellpadding="10" cellspacing="5">
							<tr bgcolor="white"><td> ASIN:</td> <td><input type="text"  name="t1"></td></tr>
							<tr bgcolor="white"><td> Title:</td> <td><input type="text" name="t2"></td></tr>	
							<tr bgcolor="white"><td> Price:</td> <td><input type="text" name="t3"></td></tr>		
							<tr bgcolor="white"><td> Quantity:</td> <td><input type="text"  name="t4"></td></tr>
						</table>
						
						<br><br>
						<input type="submit" size="20" name ="submit" value="SUBMIT" ><br>	<br>
						<input type="reset"  value="RESET" >
					</form>			
					
			';			
			

	?>
	 <form method="post" action="adminhome.php">
		  	<input type = "submit"  name = "act" value = "Back"/>
			<input type = "hidden"  name = "id" value = "a"/>
			<input type = "hidden"  name = "password" value = "b"/>
	 </form>
	 
	  <form method="post" action="index.html">
	 	 <input type = "submit"  name = "act" value = "Logout"/>
	  </form>
	   	
	  <form method="post" action="display_source.php">
	  Enter password: <input type="password" name= "password" >
		<input type = "submit"  name = "act" value = "Display Source"/>
		<input type = "hidden"  name = "interface" value = "entergamehtml"/>
	</form> 

	</font>		
	</center>
	<div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
	</body></html>
	 
	
	