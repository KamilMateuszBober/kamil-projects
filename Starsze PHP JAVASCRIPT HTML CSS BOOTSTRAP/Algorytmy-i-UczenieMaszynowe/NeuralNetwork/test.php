<?php
include_once 'Neurons/Util.php';
include_once 'Neurons/PerceptronClass.php';

$bias = array('0','1');
$punkty = array(
		array('1','1',1),
		array('2','-2',-1),
		array('-1','-1.5',-1),
		array('-2','-1',-1),
		array('-2',' 1', 1),
	    array('1.5','-0.5',1)
	
);

$wagi = array(0=>1,1=>0.5);
$krokUczacy = 0.2;


$perceptron = new PerceptronClass();
$result = $perceptron->fxfunkcja($punkty, $bias, $wagi, $krokUczacy)
  ?><pre><?php print_r($result);  ?></pre> <?php 


 ?>