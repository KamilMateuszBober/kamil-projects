<?php
include '../builder.php';
$dir = __DIR__;  // mone config file with this data
$path = 'http://localhost/OOP_Cityphp2/week_2/';

$builder = new Builder();
$data = $builder->file_list($dir,'.php');
?>

<h1>Page 3</h1>

<?php 
$builder->html_list($data, $path);

$list = $builder->task_3();

foreach ($list as $key => $item){
	echo $item;
	
}