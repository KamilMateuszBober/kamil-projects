<?php

class Utility {
	
	
	
	/**
	 * 
	 * @param array $table
	 * @return array
	 */
	function TABLE_Remove_Duplication($table){
		$table = array_map("unserialize", array_unique(array_map("serialize", $table)));
		return  self::REMOVE_Empty_Cells($table);
		
	}

	/**
	 * 
	 * @param array $table_a
	 * @param array $table_b
	 * @return array
	 */
	function TABLE_DIFF_Two_Dimension($table_a,$table_b){
		$result = array();
		
		foreach ($table_a as $key => $val){
			 foreach ( $table_b as $key2 => $val2){
			 	if(self::TABLE_DIFF($val, $val2)){
			 		$result = $val2;
			 	}
			 }
		}
		return $result;
	}
	
	/**
	 * 
	 * @param array $table_a
	 * @param array $table_b
	 * @return boolean
	 */
	function TABLE_DIFF($table_a,$table_b){
		if(count($table_a)==count($table_b)){
			foreach ($table_a as $key => $val){
				if($table_a[$key] == $table_b[$key]){
				}else{
					return false;
				}
			}
		}else{
			return false;
		}
		
		return true;
	}
	
	/**
	 * 
	 * @param array $array
	 * @return array
	 */
	function REMOVE_Empty_Cells($array){
		$result = array();
		foreach ($array as $key => $val){
			$result[]= $val; 
			
		}
		return $result;
	}
	/**
	 * 
	 * @param integer $rozmiar_tablicy
	 * @param array $dane
	 * @return array 
	 */
	function GENERATE_Data($rozmiar_tablicy,$dane){
	
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
 
	/**
	 * 
	 * @param array $args
	 */
	function GENERATE_Reguls($args){
	
		foreach ($args as $arg=>$keys){
			echo '</br> Regula: '.$arg.'&nbsp &nbsp | &nbsp &nbsp;';
			foreach ($keys as $key => $subk ){
				echo $key.' >> '.$subk.'&nbsp &nbsp | &nbsp &nbsp;';
			}
			echo '</br>';
		}
	}
	
	/**
	 * 
	 * @param array $args
	 * @return array
	 */
	function GET_Item_List($args){
		foreach ($args as $keys => $key){
			foreach ($key as $els => $el ){
				$item_list[] = $els;
			}
			return $item_list;
		}
	}
	
	/**
	 * Return size of array 
	 * @param array $args
	 * @return array
	 */
	function sizeOfTable($args){
		return count($args);
	
	}
	
	/**
	 * 
	 * @param array $args
	 * @param array $args2
	 */
	function CLEAR_Table($args,$args2){
	
	}
	/**
	 * walk tru all records, czeck did they are walid if not 
	 * add their id to array. return array of walid rules.
	 * @param array $args
	 * @return array[]
	 */
	function GENERATE_Decision_Table($args){
		$reg = array();
	
		for($i = 0; $i<=self::sizeOfTable($args); $i++ ){
			$item_list = self::GET_Item_List($args);
				
			for($j = $i+1; $j<=self::sizeOfTable($args)-1; $j++ ){
				$last_record = self::sizeOfTable($args[$j]);
				$name = $item_list[$last_record-1];
				$name_of_record = $args[$j][$name];
				$diference = 0;
				
				for ($x=0; $x<$last_record-1;$x++){ 
					
					if(($args[$i][$item_list[$x]] != $args[$j][$item_list[$x]])){
						$diference ++;
					}
				}
	
				if($diference == 0 ){
					$reg[] = $i;
					$reg[] =$j;
				}
			}
		}
		return $reg;
	}
	
	/**
	 * 
	 * @param array $args
	 * @param array $args2
	 * @return array
	 */
	function UNSET_Multi_Records($args,$args2){
		foreach ($args2 as $key => $value){
			unset($args[$value]);
		}
		return $args;
	}
	
function COUNT_Size_Of_SECOND2d_Array($array){
foreach ($array as $value){
return count($value);
}
}
function REMOWE_Unused_Data($array){
$item_list = self::GET_Item_List($array);
$size = self::sizeOfTable($array);
$number_of_columns = self::COUNT_Size_Of_SECOND2d_Array($array);
for($i = 0; $i<$number_of_columns; $i++){
$last_record = self::sizeOfTable($array[$i]);
for($j =0 ; $j<$size;$j++){

echo ' PARAMETER " '.$array[$j][$item_list[$i]].' " BELONE TO => " '.$array[$j][$item_list[$last_record-1]].' "';
echo '</br>';
}
echo '</br>';
}

/*
print_r($size);

echo ("<br></br>");
//$b=serialize($array);
$b = array_unique(array_map("serialize", $array));
return $b;
*/
}
	
}