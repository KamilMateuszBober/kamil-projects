package decorator.pattern.carEx;

public class StandardCar implements CarAccessory{

	@Override
	public String getAccessory() {
		return " Radio";
	}

	@Override
	public double getCost() {
		return 19_990;
	}

}
