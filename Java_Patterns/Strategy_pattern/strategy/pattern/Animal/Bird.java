package strategy.pattern.Animal;

public class Bird extends Animal{
	
	public Bird() {
		super();
		setName("BIRD_NAME");
		setSound("BIRD_SOUND");
		flyingType = new ItFlys();
		
	}
}
