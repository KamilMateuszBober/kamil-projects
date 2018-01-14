package decorator.pattern.demo3;

public abstract class PowerUp implements Heroe {

	protected Heroe heroe;
	
	public PowerUp(Heroe heroe) {
		this.heroe = heroe;
	}

	@Override
	public String getAccesory() {
		return heroe.getAccesory();
		
	}

	@Override
	public double power() {
		return heroe.power();
		
	}

	
}
