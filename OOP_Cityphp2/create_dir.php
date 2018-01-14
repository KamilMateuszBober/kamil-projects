<?php
include 'builder.php';
include 'config.php';


$builder = new Builder();
($builder-> create_directory_list(1,9));

echo '<p><a href="http://localhost/OOP_Cityphp2/">return<a><p>';