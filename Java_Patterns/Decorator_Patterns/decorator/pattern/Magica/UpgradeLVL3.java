package decorator.pattern.Magica;

public class UpgradeLVL3 extends MagicaUpgradeSpell {

	public UpgradeLVL3(Spell spell) {
		super(spell);
	}

	@Override
	public String getPowerSpell() {
		
		return spell.getPowerSpell()+", 3 lvl up";
	}

	@Override
	public double getManaUsage() {

		return spell.getManaUsage()*1.45;
	}

	@Override
	public double getMagicaDamage() {
		
		return spell.getMagicaDamage()*1.75;
	}
	
}
