<p>Hello from week 3</p>
<?php 
$tpl_p = file_get_contents('templates/paragraph.html');
$merged_template = str_replace('[+text+]', $proverb, $tpl_p);
echo $merged_template;
