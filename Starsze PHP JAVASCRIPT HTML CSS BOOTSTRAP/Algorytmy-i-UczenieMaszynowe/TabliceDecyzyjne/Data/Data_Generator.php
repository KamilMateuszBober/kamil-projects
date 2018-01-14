<?php

// GENERATING RANDOM DATA FOR LERNING AND TESTING PURPUSE

class Data_Generator {
	

	function generate($rozmiar_tablicy,$dane){
		
		$regola = array();
		
		while(0<$rozmiar_tablicy){
			foreach($dane as $wpisy => $wpis){
		
				$rnd = rand(0,count($dane[$wpisy])-1);
				$name = $dane[$wpisy][$rnd];
		
				$regola[$rozmiar_tablicy][$wpisy] = $dane[$wpisy][$rnd];
			}
		
			$rozmiar_tablicy--;
		}
		
		return $regola;
	}
	
	
	// END 
}



