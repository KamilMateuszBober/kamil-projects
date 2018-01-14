


class Point{
	constructor(x,y){
		this.x = x;
		this.y = y;
	}
	
	getX(){ return this.x; }
	getY(){ return this.y; }
	updateDX(dx){ this.x += dx; }
	updateDY(dy){ this.y += dy; }
}


class Animation extends Point{
	
	constructor(object){
		super(object.x,object.y);
	}
	
	move(dx,dy){
		this.updateDX(dx);
		this.updateDY(dy);
	}
}


class World{
	
	constructor(world){
		this.world = world;
	}
	
	worldStringToMap(){
		
	}
	
	printWorld(){
		for(var i = 0; i < this.world.length; i++){
			if((i%20)===0){document.write("</br>")}
			
			document.write(this.world[i]);
		}
	}
}

var world = "####################" +
			"#******************#" +
			"#******************#" +
			"#******************#" +
			"#******************#" +
			"#******************#" +
			"#******************#" +
			"#******************#" +
			"####################";

var w = new World(world);
w.printWorld();

var anim = new Animation({x:5,y:5});

console.log(anim.getX());
console.log(anim.getY());
