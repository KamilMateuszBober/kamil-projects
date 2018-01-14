package decorator.pattern.carEx;

public class GoldPainting extends UpgradingCar{

	public GoldPainting(CarAccessory carAcc) {
		super(carAcc);
		System.out.println(" painting car...");
	}

	@Override
	public String getAccessory() {
		// TODO Auto-generated method stub
		return carAccesory.getAccessory()+", painting to Gold";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return carAccesory.getCost()+2_000;
	}
	
	

}
