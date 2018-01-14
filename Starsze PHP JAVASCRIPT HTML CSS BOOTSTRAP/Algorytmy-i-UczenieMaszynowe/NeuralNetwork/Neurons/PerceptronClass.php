<?php

include_once 'Util.php';

class PerceptronClass{
	
	private $punkty,$bias,$wagi,$krokUczacy;
	

	
	function fxfunkcja($punkty,$bias,$wagi,$krokUczacy){
	
		$util = new Util();
		
		//Array ( [0] => W0 [1] => W1 [2] => W2 )
		$noweWagi 		= $util->PrzygotujWagi($wagi, $bias);
		
		//Array ( 	[0] => Array ( [0] => X0 [1] => X1 [2] => X2 [3] => CLASS )
		//			[1] => Array ( [0] => X0 [1] => X1 [2] => X2 [3] => CLASS )
		//     		... 
		$nowePunkty		= $util->przygotujPunkty($punkty, $bias, $bias[count($bias)-1]);

		
		foreach ($nowePunkty as $key => $value){
			echo '</br>'.' PUNKT '.$key.' :: </br>';
		//			[$key] => Array ( [0] => X0 [1] => X1 [2] => X2 [3] => CLASS )
			echo 'punkty ::'; print_r($value); echo ' wagai::'; print_r($noweWagi); echo '</br>';
			//		w0 + w1*x1 + w2*x2 
			$warunek = $this->sprawdzWarunek($value,$noweWagi);
			
			// (w0+w1*x1+w2*x2) >0 * cLASS < 0 */
			if($warunek * $value[count($value)-1]<0){
				
				$noweWagi  = $this->aktualizujWagi($noweWagi, $nowePunkty[$key], $bias, $krokUczacy);
			}
		}//return $result;
	}
	
	function aktualizujWagi($wagi, $puntky,$bias,$krokUczacy){
		// $wagi ::			 w1=1, w2=0.5;
		// $punkty ::		 x1=2, x2=-2;
		// $bias ::			 wo=O,  x0 = 1;
		// $krokUczacy ::	 n=0.2;
		// $class::			 {-1,1}
		foreach ($wagi as $key => $value){
			
			// wi = wi +/-nd(n)xi(n);
			$wagi[$key] = $wagi[$key] +$puntky[count($puntky)-1]*$krokUczacy*$puntky[$key];
			
		}
		echo 'AKTUALIZACJA WAG ::  '; print_r($wagi).'</br>'; echo '</br>';
		return $wagi;
	}
	
	function sprawdzWarunek($punkty,$wagi){
		//print_r($punkty);echo '</br>';
		//print_r($wagi);echo '</br>';
		$result = 0;
		foreach ($wagi as $key => $value){
			if($key== 0){
				$result += $wagi[$key];
				//echo $wagi[$key].' = '.$result.'</br>';
			}else{
				$result += $wagi[$key] * $punkty[$key];
				//echo $wagi[$key].' * '.$punkty[$key].' = '.$result.'</br>';
			}
		}
		return $result;
	}
}