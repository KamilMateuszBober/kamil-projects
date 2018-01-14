package test;

import strategy.pattern.Animal.*;

public class AnimalPlay {

	/*
	 * The Strategy pattern is known as a behavioural pattern 
	 * - it's used to manage algorithms, relationships and responsibilities between objects. 
	 */
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("DOG: "+dog.tryToFly());
		System.out.println("BIRD: "+bird.tryToFly());
		
		
		System.out.println(" dog mutated :D Now is duper flaing baring dog ");
		dog.setFlyingAbility(new ItFlys());
		System.out.println("DOG: "+dog.tryToFly());
		System.out.println("BIRD: "+bird.tryToFly());
		
	}

}
