<p>Hello from week 6</p>
<a href="index.php?id=1">Home</a>
<a href="index.php?id=2">Products</a>
<a href="index.php?id=3">Contact</a>

<?php 
$clean_id = $db->real_escape_string($page_id);
$sql = "SELECT title, content FROM pages WHERE id = '{$clean_id}'";
