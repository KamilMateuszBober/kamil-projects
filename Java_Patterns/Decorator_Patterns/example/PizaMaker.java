package example;

import decorator.pattern.demo2.*;

public class PizaMaker {

	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("ingredients: "+basicPizza.getDescription());
		System.out.println("Cost:: "+basicPizza.getCost());
	}

}
