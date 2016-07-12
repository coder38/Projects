<html>
<body bgcolor= "black" link="#C0C0C0" vlink="#808080" alink="#FF0000">
<center>
<a href="index.html" STYLE="text-decoration: none"><font color = "white" size= "250px" >Online Video Gamestore</a></font>
<font color="white">
<?php
if ( $_POST["act"] == "Display Source" ) {
	if($_POST['password']=="pass")
	{
		header( "Content-type: text/plain" );
		if($_POST['interface']== "index")
		{
			$file = fopen( "index.html", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "delgame")
		{
			$file = fopen( "deleteGame.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "listsup")
		{
			$file = fopen( "listSuppliers.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "listtitle")
		{
			$file = fopen( "ListTitles.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "gamedetail")
		{
			$file = fopen( "gameDetail.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		
		elseif($_POST['interface']== "custDetail")
		{
			$file = fopen( "custDetail.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		
		elseif($_POST['interface']== "showcust")
		{
			$file = fopen( "showCustomer.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "searchhtml")
		{
			$file = fopen( "suppDetail.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "cart")
		{
			$file = fopen( "Cart.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "custhome")
		{
			$file = fopen( "custhome.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "showgame")
		{
			$file = fopen( "showGame.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "regsuc")
		{
			$file = fopen( "reg.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "showCart")
		{
			$file = fopen( "showCart.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "purchase")
		{
			$file = fopen( "Purchase.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		elseif($_POST['interface']== "adminhome")
		{
			$file = fopen( "adminhome.php", "r" ) or exit( "Unable to open file!" );
			while ( !feof( $file ) )  echo  fgets( $file );
			fclose( $file );
		}
		
	}
	else 
	{
		echo '<script language="javascript">';

		echo 'alert("Wrong Password!!")';
		echo '</script>';
	}
}
?>
<div align="right" >&copy; 	Aastha Bhatia <br> University of North Dakota</div>
</body>
</html>
