<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<div id="left-side">
	<form  value="test">

		Size of World	 	<select name="world" id="world">
								<?php for($i=0;$i<76;$i*$i++){
									echo '<option  value="'.$i.'">'.$i.'x'.$i.'</option>';
									
								}?>
							</select><br>
							
		<input type="button" value="submit" onclick="drawStuff()" />
		<input type="button" onclick="startLoop(); return false;" 
       value="Start" />
	</form>
	</div>
	<div><canvas id="canvas" width="900" height="300"></canvas></div>
</div>
<script type="text/javascript" src="script/script.js"></script>
</body>
</html>