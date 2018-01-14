
	var glob = "";
	
	var ANIMAL = 'o';
	var PREDATOR  =  'p';
	var PLANT = '*';
	var WALL = '#';
	var SPACE = " ";

	
	
function randomIntFromInterval(min,max){
    return Math.floor(Math.random()*(max-min+1)+min);
}


function returnChar(param){
	
	if(param == 1  || param == 2){ return WALL;
	}else if(param == 3 || param == 4 || param == 5 || param == 6 || param == 7 || param == 8 || param == 10){ return PLANT;
	}else if(param == 9 ){ return ANIMAL;
	}else if(param == 11 ){ return PREDATOR;
	}else return SPACE;
	
}

function drawStuff() {
	
	var swiat = "";

	//var canvas = document.getElementById('canvas'),
   // context = canvas.getContext('2d');
	
	var world = document.getElementById('world').value;

	//window.alert(animals+predator+plant+world);
	
	//context.canvas.width  = world*20;
	//context.canvas.height = world*20;
	
	for(var x = 0;  x<world;  x++){
		 // context.moveTo(x*20, 0);
		 // context.lineTo(x*20, world*20);
		for(var y = 0;  y<world;  y++){
			//  context.moveTo(0, y*20);
			//  context.lineTo( world*20, y*20);
		if(x == 0 || x == world-1 || (x>0 && y == 0) || (x>0 && y == world-1)){
				  var rnd = randomIntFromInterval(1,1);
				  swiat+=returnChar(rnd);	
				//  context.fillText(returnChar(rnd), ((x+1)*20)-10, ((y+1)*20)-5);
			  }else{
				  
				  var rnd = randomIntFromInterval(1,40);
				  
				  swiat+=returnChar(rnd);	
				//  context.fillText(returnChar(rnd), ((y+1)*20)-10, ((x+1)*20)-5);
			  }
				  
				  
		}
		swiat +="\n";	
		
	}
	
	console.log(swiat);
	return swiat;
	
	//context.strokeStyle = "#ddd";
	//context.stroke();

}

	
	
	
	


var iFrequency = 1000;

var directionNames = "n ne e se s sw w nw".split(" ");

var directions = {
	
	"n" : new Vector(0, -1),
	"ne" : new Vector(1, -1),
	"e" : new Vector(1, 0),
	"se" : new Vector(1, 1),
	"s" : new Vector(0, 1),
	"sw" : new Vector(-1, 1),
	"w" : new Vector(-1, 0),
	"nw" : new Vector(-1, -1),
	"nn" : new Vector(0, -2),
	//"nne" : new Vector(1, -2),
	//"nnee" : new Vector(2, -2),
	//"nee" : new Vector(2, -1),
	//"ee" : new Vector(2, 0),
	//"see" : new Vector(2, 1),
	//"ssee" : new Vector(2, 2),
	//"sse" : new Vector(1, 2),
	//"ssw" : new Vector(-1, 2),
	//"ssww" : new Vector(-2, 2),
	//"sww" : new Vector(-2, 1),
	//"nww" : new Vector(-2, -1),
	//"nnww" : new Vector(-2, -2),
	//"nnw" : new Vector(-1, -2)

};



var predator

var plan = [ 	"############################",
	            "#      #    #      o      ##",
				"#                          #",
				"#          #####           #",
				"##         #   #    ##     #",
				"###           ##     #     #",
				"#           ###      #     #",
				"#   ####                   #",
				"#   ##       o             #",
				"# o  #         o       ### #",
				"#    #                     #",
				"############################" ];

function Vector(x, y) {
	this.x = x;
	this.y = y;
}

Vector.prototype.plus = function(other) {
	return new Vector(this.x + other.x, this.y + other.y);
};

function Grid(width, height) {
	this.space = new Array(width * height);
	this.width = width;
	this.height = height;
}

Grid.prototype.isInside = function(vector) {
	return vector.x >= 0 && vector.x < this.width && vector.y >= 0
			&& vector.y < this.height;
};
Grid.prototype.get = function(vector) {
	return this.space[vector.x + this.width * vector.y];
};
Grid.prototype.set = function(vector, value) {
	this.space[vector.x + this.width * vector.y] = value;
};

function randomElement(array) {
	return array[Math.floor(Math.random() * array.length)];
}

function BouncingCritter() {
	this.direction = randomElement(directionNames);
};
BouncingCritter.prototype.act = function(view) {
	if (view.look(this.direction) != " ")
		this.direction = view.find(" ") || "s";
	return {
		type : "move",
		direction : this.direction
	};
};
function elementFromChar(legend, ch) {
	if (ch == " ")
		return null;
	var element = new legend[ch]();
	element.originChar = ch;
	return element;
}
function World(map, legend) {
	var grid = new Grid(map[0].length, map.length);
	this.grid = grid;
	this.legend = legend;

	map.forEach(function(line, y) {
		for (var x = 0; x < line.length; x++)
			grid.set(new Vector(x, y), elementFromChar(legend, line[x]));
	});
}
function charFromElement(element) {
	if (element == null)
		return " ";
	else
		return element.originChar;
}
World.prototype.toString = function() {
	
	
	
	var canvas = document.getElementById("canvas");
	var ctx = canvas.getContext("2d");
	ctx.font = "10px Arial"
	ctx.clearRect(0, 0, canvas.width, canvas.height);
		
	var output = "";
	for (var y = 0; y < this.grid.height; y++) {
		for (var x = 0; x < this.grid.width; x++) {
			var element = this.grid.get(new Vector(x, y));
			output += charFromElement(element);
			// line for  canvas drow
			ctx.fillText(charFromElement(element), ((x+1)*20)-10, ((y+1)*20)-5);
		}
		output += "\n";
	}
	return output;
	
	ctx.strokeStyle = "black";
	ctx.stroke();	
	
	
};
//---------------------------------------------------------
function Wall() {
	
}
//---------------------------------------------------------
Grid.prototype.forEach = function(f, context) {
	for (var y = 0; y < this.height; y++) {
		for (var x = 0; x < this.width; x++) {
			var value = this.space[x + y * this.width];
			if (value != null)
				f.call(context, value, new Vector(x, y));
		}
	}
};
World.prototype.turn = function() {
	var acted = [];
	this.grid.forEach(function(critter, vector) {
		if (critter.act && acted.indexOf(critter) == -1) {
			acted.push(critter);
			this.letAct(critter, vector);
		}
	}, this);
};
World.prototype.letAct = function(critter, vector) {
	var action = critter.act(new View(this, vector));
	if (action && action.type == "move") {
		var dest = this.checkDestination(action, vector);
		if (dest && this.grid.get(dest) == null) {
			this.grid.set(vector, null);
			this.grid.set(dest, critter);
		}
	}
};
World.prototype.checkDestination = function(action, vector) {
	if (directions.hasOwnProperty(action.direction)) {
		var dest = vector.plus(directions[action.direction]);
		if (this.grid.isInside(dest))
			return dest;
	}
};
function View(world, vector) {
	this.world = world;
	this.vector = vector;
}
View.prototype.look = function(dir) {
	var target = this.vector.plus(directions[dir]);
	if (this.world.grid.isInside(target))
		return charFromElement(this.world.grid.get(target));
	else
		return "#";
};
View.prototype.findAll = function(ch) {
	var found = [];
	for ( var dir in directions){		
		if (this.look(dir) == ch)
			found.push(dir);
	}
	return found;
};
View.prototype.find = function(ch) {
	var found = this.findAll(ch);
	if (found.length == 0)
		return null;
	if(ch == "*" || ch == "0"){ // zmienic tutaj aby pozeracz trawy mial rozum
		 found = this.findAll(ch);
		 return found[0];
	}
	
	return randomElement(found);
};



function dirPlus(dir,n){
	var index = directionNames.indexOf(dir);
	return directionNames[(index + n + 8)%8];
}

function WallFollower(){
	this.dir = "s";
}


WallFollower.prototype.act = function(view){
	var start = this.dir;
	if(view.look(dirPlus(this.dir,-3)) != " ")
		start = this.dir =dirPlus(this.dir, -2);
	while (view.look(this.dir) !=" "){
		this.dir = dirPlus(this.dir,1);
	if(this.dir == start) break;
	}
	return {type:"move", direction: this.dir};
};


function LifelikeWorld(map,legend){
	World.call(this, map,legend);
}
LifelikeWorld.prototype = Object.create(World.prototype);

var actionTypes = Object.create(null);

LifelikeWorld.prototype.letAct = function(critter,vector){
	var action = critter.act(new View(this, vector));
	var handled = action && action.type in actionTypes && actionTypes[action.type].call(this,critter,vector,action);
	
	if(!handled){
		critter.energy -= 0.2;
		if(critter.energy <= 0)
			this.grid.set(vector,null);
	}
};

actionTypes.grow = function(critter){
	critter.energy += 0.5;
	return true;
};


actionTypes.move = function(critter,vector,action){
	var dest = this.checkDestination(action,vector);
	if(dest == null || critter.energy <= 1 || this.grid.get(dest) != null)
		return false;
	critter.energy -= 1;
	this.grid.set(vector,null);
	this.grid.set(dest,critter);
	return true;
};

actionTypes.eat = function(critter, vector, action) {
	  var dest = this.checkDestination(action, vector);
	  var atDest = dest != null && this.grid.get(dest);
	  if (!atDest || atDest.energy == null)
	    return false;
	  critter.energy += atDest.energy;
	  this.grid.set(dest, null);
	  return true;
	};
	

actionTypes.reproduce = function(critter, vector, action) {
	var baby = elementFromChar(this.legend, critter.originChar);
	var dest = this.checkDestination(action, vector);
	if (dest == null || critter.energy <= 2 * baby.energy
			|| this.grid.get(dest) != null)
		return false;
	critter.energy -= 2 * baby.energy;
	this.grid.set(dest, baby);
	return true;
};

//---------------------------------------------------------
//                  PLANT 
//---------------------------------------------------------
function Plant() {
	this.energy = 3 + Math.random() * 4;
}
Plant.prototype.act = function(context) {
	if (this.energy > 15) {
		var space = context.find(" ");
		if (space)
			return {
				type : "reproduce",
				direction : space
			};
	}
	if (this.energy < 20)
		return {
			type : "grow"
		};
};
//---------------------------------------------------------

//---------------------------------------------------------
//                    Predator
//---------------------------------------------------------
function Predator(){
	this.energy = 32;
}
Predator.prototype.act = function(context){
	var space = context.find(" ");
	if (this.energy > 70 && space)
		return {
			type : "reproduce",
			direction : space
		};
	
		var plantEater = context.find("O");
	if (plantEater)
		return {
			type : "eat",
			direction : plantEater
		};
		
	
	if (space)
		return {
			type : "move",
			direction : space
		};
}
//---------------------------------------------------------

//---------------------------------------------------------
//                  PLANT EATER
//---------------------------------------------------------
function PlantEater() {
	  this.energy = 26;
	}
PlantEater.prototype.act = function(context) {
	var space = context.find(" ");
	if (this.energy > 60 && space)
		return {
			type : "reproduce",
			direction : space
		};
		
		var plant = context.find("*");
	if (plant)
		return {
			type : "eat",
			direction : plant
		};
	if (space)
		return {
			type : "move",
			direction : space
		};
};
//---------------------------------------------------------	
var rnd_world = ["###########################################",
      		   "#####           **          ***      ######",
    		   "##   **                            O    *##",
    		   "#   *##*     O    **                    *##",
    		   "#    **           ##**         #         *#",
    		   "#                        O     # *        #",
    		   "#        P        ##**         ##  * P    #",
    		   "#   O       #*                  ##  *     #",
    		   "#*          #**                           #",
    		   "#***        ##**             O          **#",
    		   "##****      O        ***               *###",
    		   "###########################################"];




var valley = new LifelikeWorld(
		  rnd_world,
		  {"#": Wall,
		   "O": PlantEater,
		   "P": Predator,
		   "*": Plant}
		);
	
	
	
/*
	var valley = new LifelikeWorld(
			  ["###########################################",
			   "#####           **          ***      ######",
			   "##   **                            O    *##",
			   "#   *##*     O    **                    *##",
			   "#    **           ##**         #         *#",
			   "#                        P     # *        #",
			   "#                 ##**         ##  *      #",
			   "#   O       #*                  ##  *     #",
			   "#*          #**                           #",
			   "#***        ##**             0          **#",
			   "##****      P        ***               *###",
			   "###########################################"],
			  {"#": Wall,
			   "O": PlantEater,
			   "P": Predator,
			   "*": Plant}
			);
	
	

var world = new World(plan, {
	"#" : Wall,
	"o" : BouncingCritter
});

var world = new World(
		  ["############",
		   "#     #    #",
		   "#   ~    ~ #",
		   "#  ##      #",
		   "#  ##  o####",
		   "#          #",
		   "############"],
		  {"#": Wall,
		   "~": WallFollower,
		   "o": BouncingCritter}
		);

*/

function startLoop() {
	setInterval("play()", iFrequency); // run
}

function play() {
	valley.turn();
	console.log(valley.toString());
}
