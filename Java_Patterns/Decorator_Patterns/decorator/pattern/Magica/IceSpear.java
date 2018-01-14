package decorator.pattern.Magica;

public class IceSpear implements Spell {

	@Override
	public String getPowerSpell() {
		
		return " ICE Spear";
	}

	@Override
	public double getManaUsage() {
		
		return 3;
	}

	@Override
	public double getMagicaDamage() {
		// TODO Auto-generated method stub
		return 38;
	}

}
