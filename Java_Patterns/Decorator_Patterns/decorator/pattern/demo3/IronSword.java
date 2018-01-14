package decorator.pattern.demo3;

public class IronSword extends PowerUp{

	
	
	public IronSword(Heroe heroe) {
		super(heroe);
		System.out.println("equiping sword");
	}

	@Override
	public String getAccesory() {
		return heroe.getAccesory()+", sword ";
	}

	@Override
	public double power() {
		return heroe.power()+7.5;
	}
	
}
