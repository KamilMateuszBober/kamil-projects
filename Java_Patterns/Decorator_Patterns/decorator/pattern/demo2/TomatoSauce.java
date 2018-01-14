package decorator.pattern.demo2;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);

		System.out.println(" Adding Sauce");
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription()+", Tomato Sauce";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost()+.35;
	}

}
