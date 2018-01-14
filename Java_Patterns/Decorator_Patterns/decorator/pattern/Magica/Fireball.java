package decorator.pattern.Magica;

public class Fireball implements Spell {

	@Override
	public String getPowerSpell() {
		
		return " Fire ball";
	}

	@Override
	public double getManaUsage() {
		
		return 6;
	}

	@Override
	public double getMagicaDamage() {
		
		return 75;
	}

}
