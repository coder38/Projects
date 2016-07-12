//// allows admin to enter books 

import  java.sql.*;
import  java.io.*;
import  oracle.jdbc.*;
import  oracle.jdbc.pool.OracleDataSource;

class  EnterBook 
{
    public static void  main( String args[ ] ) throws SQLException 
	{
	    String user     = "abhatia";
	    String password = "password";
	    String host = "mysqldev.aero.und.edu";
	    String database = "abhatia";
	    Connection con = DriverManager.getConnection(host, user, password);		
	    try
			
		{  				
			Statement stmt = conn.createStatement( );			
			System.out.println( "<html><body bgcolor= '#A4A4A4'> <br>");
			String query = "insert into game2 values ('" +args[0].trim()+ "','"+args[1].trim()+"','"+args[2].trim()+"',"+args[3]+")";			
			
			int updated = stmt.executeUpdate( query );
			
			if(updated>0)
			{
				System.out.print( "<h2><center> Book has been added successfully in the bookstore database<br><br><a href = 'http://people.aero.und.edu/~abhatia/513/1/front.html'>BACK</a> <br>");
			}
			/*
			System.out.print( "<form method='post' action='http://people.aero.und.edu/~abhatia/513/1/index.html'>");
			System.out.print( "<input type = 'submit'  name = 'act' value = 'Logout'/></form>");

			System.out.print( "<form method='post' action='http://people.aero.und.edu/~abhatia/cgi-bin/display_source.cgi'>");
			System.out.print( "<input type = 'submit'  name = 'act' value = 'Display Source'/>");
			System.out.print( "<input type = 'hidden'  name = 'interface' value = '14'/>");
			System.out.print( "</form>");	

			System.out.println("</body></html>");
*/

System.out.println("<form method="post" action = "enterGame.php">
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
					</form>	");
					
		 	stmt.close( );
		}
		catch ( SQLException ex ) 
		{
				System.out.println( ex );
		}
			
		conn.commit();
		conn.close( );  
        
    }
}               
