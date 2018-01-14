package decorator.pattern.carEx;

public abstract class UpgradingCar implements CarAccessory{

	protected CarAccessory carAccesory; 
	
	public UpgradingCar(CarAccessory carAcc) {
		carAccesory = carAcc;
	}
	
	@Override
	public String getAccessory() {
		
		return carAccesory.getAccessory();
	}

	@Override
	public double getCost() {
		
		return carAccesory.getCost();
	}

	

}
