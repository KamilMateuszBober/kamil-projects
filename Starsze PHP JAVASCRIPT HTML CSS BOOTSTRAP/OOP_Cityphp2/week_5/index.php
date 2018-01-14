
		<?php 
		$output = '';
		print_r($_GET);
		echo 'test';
		
		if(isset($_GET['page'])){
			
			$trimmed = trim($_GET['page']);
			$normalised = strtolower($trimmed);
			$action = $normalised;
				
		}else{
			$action = 'home';
				
		}
		
		switch($action) {
			case 'home':
				include 'pages/views/home.php';
				break;
			case 'product':
				include 'pages/views/product.php';
				break;
			case 'contact':
				include 'pages/views/contact.php';
				break;
				
			default:
				include 'pages/views/404.php';
		}
		echo $output;
		
		?>
