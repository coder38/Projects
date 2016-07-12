e CGI;
$query = new CGI;
$radio = $query->param( "radio" );
$act   = $query->param( "act" );
$name  = $query->param( "name" ); 
$age   = $query->param( "age" ); 

if ( $act eq "Log in" ) {
	print ( "Content-type: text/plain\n\n" );
# Remove leading and trailing spaces.
	$name =~ s/^\s*(\S*)\s*$/$1/;
	$age  =~ s/^\s*(\S*)\s*$/$1/;
# For security, remove some Unix metacharacters.
	$name =~ s/;|>|>>|<|\*|\?|\&|\|//g;
	$age  =~ s/;|>|>>|<|\*|\?|\&|\|//g;

	if ( $radio eq "drop" ) {
		$cmd = "/usr/bin/java StudentRef 'drop'";
		print ( $cmd . "\n\n" );
		system( $cmd );
	}
	elsif ( $radio eq "insert" ) {
		$cmd  = "/usr/bin/java StudentRef 'insert' '";
		$cmd .= $name . "' '" . $age . "'";
		print ( $cmd . "\n\n" );
		system( $cmd );
	}
	elsif ( $radio eq "select" ) {
		$cmd  = "/usr/bin/java StudentRef 'select' '";
		$cmd .= $name . "'";
		print ( $cmd . "\n\n" );
		system( $cmd );
	}
}
else {
	print( "Content-type: text/html\n\n" ); 
	print( "<br /><br /><br /><center><h2>Error! No such action: <em>$act</em></h2></center>" );
}


