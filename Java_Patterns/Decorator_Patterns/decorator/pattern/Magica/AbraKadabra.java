package decorator.pattern.Magica;

public class AbraKadabra implements Spell {

	@Override
	public String getPowerSpell() {
		
		return " Abra Kadabra :D";
	}

	@Override
	public double getManaUsage() {
		
		return 4;
	}

	@Override
	public double getMagicaDamage() {
		
		return 40.2;
	}

}
