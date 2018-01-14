<?php
include_once 'GenerateDecisionTable.php';
include_once 'Data/Data_Generator.php';
include_once 'Utility.php';


  	$rozmiar_tablicy = 20;
	$dane = array(
		'Dors number' =>array(1,2,3),
		'power' =>array(60,75,90),
		'color' =>array('white','silver','gold')/*,
		'petrol' =>array('NO','LPG','BIO'),
		'finishing' =>array('tkanina','skora'),
		'wels' =>array('stal','aluminium','chrom'),
		'marka' =>array('opel','nissan','audi')*/
	);
   	
	$util = new Utility();
	$decision_table = new GenerateDecisionTable();
  
	$result = $util->TABLE_Remove_Duplication($util->GENERATE_Data($rozmiar_tablicy, $dane));

	$util->GENERATE_Reguls($result);
	$result2 = $util->GENERATE_Decision_Table($result);
	
	echo '<br/><br/><br/> RULES <br/><br/>';
	
	$result3 = $util->UNSET_Multi_Records($result, $result2);
	$util->GENERATE_Reguls($result3);
	
	echo '<br/><br/> odrzucone  <br/> ';
	?><pre><?php print_r($result2); ?> </pre><?php
	
	
	
	/*
	$b= $util->REMOWE_Unused_Data($result3);
	?><pre><?php print_r($b); ?> </pre><?php
	
	*/
	
	
	