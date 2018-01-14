package decorator.pattern.demo3;

public class RustySword extends PowerUp{

	public RustySword(Heroe heroe) {
		super(heroe);
		System.out.println(" equiping rusty swird");
	}

	@Override
	public String getAccesory() {
		// TODO Auto-generated method stub
		return heroe.getAccesory()+", Rusty sword";
	}

	@Override
	public double power() {
		// TODO Auto-generated method stub
		return heroe.power()+5.4;
	}
	
	

	
}
