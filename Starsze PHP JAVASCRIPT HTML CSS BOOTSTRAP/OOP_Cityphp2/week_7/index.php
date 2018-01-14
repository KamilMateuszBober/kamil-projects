<?php
require_once 'classes/page.php';

$clean_id = $db->real_escape_string($page_id);
$sql = "SELECT title, content FROM pages WHERE id = '{$clean_id}'";
$result = $db->query($sql);


$row = $result->fetch_assoc();
$page = new Page($row['title']);
$page->content = $row['content'];
$page->render();