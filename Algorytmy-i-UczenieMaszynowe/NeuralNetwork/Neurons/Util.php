<?php

class Util {
	
	
	
	
	
	
	function aktualizujWagi($wagi, $puntky,$bias,$krokUczacy){
		// $wagi ::			 w1=1, w2=0.5;
		// $punkty ::		 x1=2, x2=-2;
		// $bias ::			 wo=O,  x0 = 1;
		// $krokUczacy ::	 n=0.2;
		// $class::			 {-1,1}
		
		
		
		//$punkty = 
		foreach ($wagi as $key => $value){
			// wi = wi +/-nd(n)xi(n); 
			$wagi[$key] = $wagi[$key] +$puntky[count($puntky)-1]*$krokUczacy*$puntky[$key];
		}
		return $wagi;
		
	}
	
	function PrzygotujWagi($wagi,$bias){
		$tab = array();
		$bias = $bias[0];
		$tab[] = $bias;
		
		foreach ($wagi as $item){
			$tab[] =  $item;
		}
		return $tab;
	}
	
	function przygotujPunkty($puntky,$bias,$TabCelldress){
		
		$tab = array();
		
		if(is_numeric($TabCelldress)&& $TabCelldress<=count($bias) ){
			$bias = $bias[$TabCelldress];
		
			foreach ($puntky as $key=>$value){
				$tab[$key][] = $bias;
				
				foreach ($value as $item){
					$tab[$key][] =  $item;
				}
			}
		}else{
				$errorReport = 'Wartosc ID jest nieprawidlowa';
				return $errorReport;
		}
		
		
		return $tab;
	}
	
	//w0+w1*x1+w2*x2
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	function random($numberOf){
		foreach ($numberOf as $keys => $value){
			for($i=0; $i<count($value)-1; $i++){
				$rnd_weights[] = rand(-1,1);
				
			}
			
			return $rnd_weights;
		}
	}
	
	
	// x = x(t) = [Xo(t),(Xn(t)...], t=1,2...
	// 0 = wo + w1x1+w2x2;
	function checkPoint($value,$rnd,$sum,$wo){
		$sum = $wo;
		for ($i=0; $i<count($value)-1;$i++){
			echo '</br>';
			echo 'X'.($i+1).' = '.$value[$i].'  W'.($i+1).' = '.$rnd[$i];
		
			//wi*xi
			$sum += ($value[$i]*$rnd[$i]);
			//echo ' ## '.$sum.' ## ';
		}
		return $sum;
	}
	

}