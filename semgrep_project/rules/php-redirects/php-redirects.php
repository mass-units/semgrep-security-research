<?php
/* Redirect browser */
header("Location: http://www.mysite.com"); //compliant
/* Exit to prevent the rest of the code from executing */ 
exit;

$redirect_url = $_GET['url']; //noncompliant
header("Location: " . $redirect_url);

?>

