package decorator.pattern.demo2;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		return 4.00;
	}
	
	
}
