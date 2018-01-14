package strategy.pattern.Animal;

public class Dog extends Animal {

	public Dog() {
		super();
		setName("DOG_NAME");
		setSound("DOG_SOUND");
		flyingType = new CantFly();
		
	}
	
}
