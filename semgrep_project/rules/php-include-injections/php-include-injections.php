<?php

$filename = $_GET["filename"];
include $filename . ".php";


$filename = $_GET["filename"];
if (in_array($filename, $whitelist)) {
  include $filename . ".php";
}
