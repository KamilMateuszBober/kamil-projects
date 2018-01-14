<?php



$graph = array(
		'A' => array('B', 'F'),
		'B' => array('A', 'D', 'E'),
		'C' => array('F'),
		'D' => array('B', 'E'),
		'E' => array('B', 'D', 'F'),
		'F' => array('A', 'E', 'C'),
);


$nonDirectedGraph = new Structures_Graph(false);

$nodeA = new Structures_Graph_Node();
$nodeB = new Structures_Graph_Node();

$nonDirectedGraph ->addNode($nodeA);
$nonDirectedGraph ->addNode($nodeB);

$nodeA->connectTo($nodeB);
$nodeB->connectTo($nodeC);