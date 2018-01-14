<html>
<head> 
<head>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
</head>
<body>
<ul>
<?php 
include 'builder.php';
include 'config.php';

$dir = __DIR__;  // mone config file with this data
$path = 'http://localhost/OOP_Cityphp2/';

$builder = new Builder();
$data = $builder->dir_list($dir,$path);
$builder->html_list($data, $path, true);
?>

<form action="<?php echo $path.'create_dir.php'; ?>">
    <input type="submit" value="create directorys">
</form>



<?php //$builder->detet_folder('week_9/css');?>
</body>
</html>