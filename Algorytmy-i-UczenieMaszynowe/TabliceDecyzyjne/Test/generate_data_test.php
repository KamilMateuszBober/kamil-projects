<?php
include_once '../Data/Data_Generator.php';

$data = new Data_Generator();

 $rozmiar_tablicy = 100;

 $dane = array(
		'liczba_drzwi'	=>array(1,2,3,4,5),
		'moc_silnika' 	=>array(60,75,90,130,180),
		'kolor'  		=>array('bialy','srebrny','zolty','pomaranczowy','czerwony','zielony','niebieski','czarny'),
		'paliwo' 		=>array('NO','LPG','BIO','PB'),
		'tapicerka'		=>array('tkanina','skora'),
		'felgi'			=>array('stal','aluminium','chrom'),
		'marka'			=>array('opel','nissan','vw','audi','bmw')
);


?><pre><?php print_r($data->generat($rozmiar_tablicy,$dane)); ?> </pre>