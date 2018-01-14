package decorator.pattern.Magica;

public class Armagedon implements Spell {

	@Override
	public String getPowerSpell() {
		
		return " KKKK BOOMMMMM :D";
	}

	@Override
	public double getManaUsage() {
		
		return 100;
	}

	@Override
	public double getMagicaDamage() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
