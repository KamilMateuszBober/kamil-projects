package decorator.pattern.carEx;

public class Spoiler extends UpgradingCar{

	public Spoiler(CarAccessory carAcc) {
		super(carAcc);
		System.out.println(" add Spoiler");
	}

	@Override
	public String getAccessory() {
		return carAccesory.getAccessory()+", Spoiler";
	}

	@Override
	public double getCost() {
		return carAccesory.getCost()+250;
	}
	
	

}
