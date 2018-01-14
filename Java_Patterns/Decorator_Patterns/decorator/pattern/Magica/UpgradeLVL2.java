package decorator.pattern.Magica;

public class UpgradeLVL2 extends MagicaUpgradeSpell {

	public UpgradeLVL2(Spell spell) {
		super(spell);
	}

	@Override
	public String getPowerSpell() {
		
		return spell.getPowerSpell()+", 2 lvl up";
	}

	@Override
	public double getManaUsage() {

		return spell.getManaUsage()*1.30;
	}

	@Override
	public double getMagicaDamage() {
		
		return spell.getMagicaDamage()*1.50;
	}
	
}
