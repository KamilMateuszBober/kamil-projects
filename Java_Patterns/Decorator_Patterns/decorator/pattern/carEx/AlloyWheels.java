package decorator.pattern.carEx;

public class AlloyWheels extends UpgradingCar{

	public AlloyWheels(CarAccessory carAcc) {
		super(carAcc);
		System.out.println(" adding Alloy wheels");
	}

	@Override
	public String getAccessory() {
		// TODO Auto-generated method stub
		return carAccesory.getAccessory()+", Alloy wheels";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return carAccesory.getCost()+350;
	}

	
}
