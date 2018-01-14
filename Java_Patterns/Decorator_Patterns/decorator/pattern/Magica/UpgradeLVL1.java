package decorator.pattern.Magica;

public class UpgradeLVL1 extends MagicaUpgradeSpell{

	public UpgradeLVL1(Spell spell) {
		super(spell);
	}

	@Override
	public String getPowerSpell() {
		
		return spell.getPowerSpell()+",1 lvl up";
	}

	@Override
	public double getManaUsage() {

		return spell.getManaUsage()*1.15;
	}

	@Override
	public double getMagicaDamage() {
		
		return spell.getMagicaDamage()*1.25;
	}
	
	

}
