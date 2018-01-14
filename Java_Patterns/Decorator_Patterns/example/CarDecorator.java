package example;

import decorator.pattern.carEx.AlloyWheels;
import decorator.pattern.carEx.CarAccessory;
import decorator.pattern.carEx.GoldPainting;
import decorator.pattern.carEx.Spoiler;
import decorator.pattern.carEx.StandardCar;

public class CarDecorator {

	public static void main(String[] args) {
		
		CarAccessory carSport = new AlloyWheels(new StandardCar());
		CarAccessory carPremium = new GoldPainting(new AlloyWheels(new Spoiler(new StandardCar())));
		CarAccessory carStandard = new StandardCar();
		
		System.out.println("\n carSport ");
		System.out.println("Accesoria: "+carSport.getAccessory());
		System.out.println("Cost: "+ carSport.getCost());
		
		System.out.println("\n carPremium ");
		System.out.println("Accesoria: "+carPremium.getAccessory());
		System.out.println("Cost: "+ carPremium.getCost());
		
		System.out.println("\n carStandard ");
		System.out.println("Accesoria: "+carStandard.getAccessory());
		System.out.println("Cost: "+ carStandard.getCost());
	}

}
