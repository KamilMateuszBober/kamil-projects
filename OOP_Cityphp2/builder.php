<?php


class Builder{
	

	//ude to create directory list default 1-9
public function create_directory_list($start,$end){

	while ($start <= $end) {
		$i=0;
		$name = 'week_' . $start;
		$subdirs = array('includes','css', 'images');
	
		while($i<count($subdirs)){
	
			if (!is_dir($name.DIRECTORY_SEPARATOR.$subdirs[$i])){
		
				$result = mkdir($name.DIRECTORY_SEPARATOR.$subdirs[$i], 0755, true);
				$files = array('week_' . $start.'/index.php','week_' . $start.'/description.txt');
			
				$a='<p>Hello from week '.$start.'</p>';
				$b='To be announced...';
				$data = array($a,$b);
		
				for($j=0; $j<count($files);$j++){
					file_put_contents($files[$j], $data[$j]);
				}
			}
			$i++;
		}	
		$start++;
	}
		
}
	// use to  create  dir list return array 
public function dir_list($dir){
	
	
	$d = dir($dir);
	$temp = array();
	
	while (false !== ($entry = $d->read())) {
		if(is_dir($entry)){
			if($entry !='.' && $entry != '..' && $entry != '.settings' ){	
				
  		 		array_push($temp, $entry);
  		 		
			}
		}
	}
	$d->close();

	return $temp;
	
	
	}
	// use to create file list only .php  return array
public function file_list($dir,$filetype = '.php'){
	$d = dir($dir);
	$temp=array();
	
	while (false !== ($entry = $d->read())) {
		if(is_file($entry)){
			if(strstr($entry, $filetype)==true){
				
				array_push($temp, $entry);
				
			}
		}
	}
	$d->close();
	
	return $temp;
	
}
	// create  hiper links to file/ dir  
public function html_list($data,$path,$edit= false,$css_class='menu'){
	
	$extra =  '';
	
	foreach ($data as $key => $item){
		$directory[$key] = $path.'/'.$item;
	}
	
	if($edit==true){
		$extra =  '<span> edit/delete <span>';
	}
	
	echo '<ul>'.PHP_EOL;
	foreach ($directory as $key=>$item){
	echo '<li class='.$css_class.'><a href='.$item.'>'.str_replace('_', ' ', $data[$key]).'</a>'.$extra.'</li>'.PHP_EOL;
	}
	echo '</ul>';

$directory = array();

}

function detet_folder($dir){
	if(file_exists($dir)===true){
	rmdir($dir);
	}else{
		return false;
	}
}

public function prowerb(){
			$lines = file('data/proverbs.txt',FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
			$rand_keys = array_rand($lines, 1);
			$prowerb = $lines[$rand_keys];
			return $prowerb;
}

public function task_3(){
	$list = array();
	$lines = file('data/page3text.txt',FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
	foreach ($lines as $num => $line){
		$pos = strpos($line, '#');
		if ($pos !== false){
			$list[$num] = str_replace('#', '<h2>', $line).'</h2>'.PHP_EOL;
			
		}else{
			$list[$num] = '<p>'.$line.'</p>'.PHP_EOL;
			
		}
	}
	return $list;
}

public function con_and_disp_data($data){

	
	
		$search = array('@','#');
		$movie = array();
		$info = array();
	
		foreach ($data as $num => $line){
	
			$pos = strpos($line, '**');
				
			if ($pos !== false){
	
				$temp = str_replace('**','',$line);
				$movie[] = $temp;
			} else{
	
				$temp = (str_replace($search,'|',$line));
				$temp = explode('|', $temp);
				$info[] = $temp;
			}
		}
		
		
		//$descr = read_info_from_text();//= array('??','date','price','actor 1','actor 2','actor 3');
		$lines = file('data/array2.txt',FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
		$descr = array();
		foreach ($lines as $num => $line){
			$descr[$num] = $line;
		}
		 
	
		$list=array();
		for($i=0; $i<3;$i++){
			for($j=0; $j<=count($descr)-1;$j++){
				//echo '<br>'.$i.' _ '.$j.'<br>';
				$list[$movie[$i]][$descr[$j]] = $info[$i][$j];
			}
		}
		return $list;
		
	}
}


	
