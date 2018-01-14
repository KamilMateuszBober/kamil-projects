package decorator.pattern.demo2;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Dough");
		System.out.println("Adding Mozzarella");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription()+", Mozzarella";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost()+.50;
	}

}
