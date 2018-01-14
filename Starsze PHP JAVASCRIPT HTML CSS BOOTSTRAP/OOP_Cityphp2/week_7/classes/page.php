<?php
	class Page {
		
		public $id;
		public $title;
		public $content;
		public $sort_order;
		
		public function __constructor($page_title=''){
			if($page_title != ''){
				$this->title = $page_title;
			}
		}
		
		public function render(){
			$clean_title = htmlentities($this->title, ENT_QUOTES, 'UTF-8');
			$html = '<!DOCTYPE html>
			 <html lang="en">
			 <head>
			 <meta charset="utf-8" />
			 <title>' . $clean_title . '</title>
			 </head>
			 <body>
			 <p>
			 <a href="index.php?id=1">Home</a>
			 <a href="index.php?id=2">Products</a>
			 <a href="index.php?id=3">Contact</a>
			 </p>';
			$html .= '<h1>' . $clean_title . '</h1>';
			$html .= $this->content;
			$html .= '</body>
			 </html>';
			echo $html;
						
		}
	}