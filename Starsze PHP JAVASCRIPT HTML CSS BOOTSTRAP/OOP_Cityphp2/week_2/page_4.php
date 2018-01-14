<?php
include '../builder.php';
$dir = __DIR__;  // mone config file with this data
$path = 'http://localhost/OOP_Cityphp2/week_2/';

$builder = new Builder();
$data = $builder->file_list($dir,'.php');
$builder->html_list($data, $path);
?>

<h1>Page 4</h1>
<?php 

$lines = file('data/array.txt',FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
$data = $builder->con_and_disp_data($lines);

echo '<pre>';
print_r($data);
echo '</pre>';