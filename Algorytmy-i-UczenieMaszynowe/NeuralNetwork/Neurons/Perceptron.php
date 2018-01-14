<?php
include_once 'Util.php';

class Perceptron{
	
	private $bias;
	private $imputs = array();
	private $layers_number;
	private $lerningStep;
	private $weights;
	
	public function __construct($lerningStep, $bias, $imputs){
		$this->bias = $bias;
		$this->args = $imputs;
		$this->lerningStep = $lerningStep;
		
		
		
		
		$util = new Util(true);
		$rnd = $util->random($imputs);
		$rnd = array(0=>1,1=>0.5); // test 
		// 1 LOSOW DOBOR WAG PERCEPTRONU 
		foreach($rnd as $key => $element){
			echo 'POINT :: '.$element.' :: ';
		}
		echo '</br>';
		// 2 WPROWDZ n
		$wo = 0;
		$lerningStep;
		
		$t = 1;
		
		foreach ($imputs as $key => $value){
			echo '</br>';
			echo 'Punkt'.$key.' :: ';
			// $value  is a  array of poits X1 X2 and CLASS 
			
			$sum = 0;
			$sum = $util->checkPoint($value, $rnd, $sum,$wo);
			echo '</br>'.$sum;
			// obliczenia
			//WtX > 0; or WtX<0
			$class = $value[count($value)-1];
			echo '</br>  CLASA :: '.$class;
			
			if($sum > 0){
				echo ' Punkt zaklasyfikowany ';
			}else{
				//w1=w1+nd(n)x1(n)
				
				$wo = $wo -0.2*1;
				foreach ($rnd as $key){
					$key = $key -$lerningStep;
				}
				
			}
			
			echo '</br></br>';
			
			
			
			
			
		}
		
		// 5 WYZNACZ SYGNAL S(T) NA WYJSCIU CZESCI LINIOWEJ NEURONU 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
	
	function init($numberOf){
		foreach ($numberOf as $keys => $value){
			for($i=0; $i<count($value)-1; $i++){
				 $rnd_weights[] = rand(-2,2);
			}
			
			return $rnd_weights;
		}
	}
	
	function desiredOutput($class,$sum){
		if($class>0 || $sum>0 ){
			return 1;
		}else{
			return 0;
		}
	}
	
	function checkClasses($element){
		$size = count($element);
		for ($i=$size-1; $i<$size;$i++){
			return $element[$i];
		}
	}
	
	function sum($element,$weights,$bias){
		$sum = 0;
		
		for($i=0; $i<count($element)-1; $i++){
			$sum += $element[$i]*$weights[$i];
		}
		
		$sum += $bias;
		echo 'SUM = '.$sum.'</br>';
		return $sum;
	}
	
	function updateWeigth(){
		foreach ($this->weights as $value){
			$value += $this->lerningStep;
		}
	}
	
	function loading(){
		
	}
	
	
	function test(){
		echo 'test';
	}
}