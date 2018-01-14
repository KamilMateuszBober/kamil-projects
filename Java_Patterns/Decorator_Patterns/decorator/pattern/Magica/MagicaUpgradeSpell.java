package decorator.pattern.Magica;

public abstract class MagicaUpgradeSpell implements Spell{

	protected Spell spell;
	
	
	public MagicaUpgradeSpell(Spell spell) {
		super();
		this.spell = spell;
	}

	@Override
	public String getPowerSpell() {
		return spell.getPowerSpell();
	}

	@Override
	public double getManaUsage() {
		return spell.getManaUsage();
	}

	@Override
	public double getMagicaDamage() {
		return spell.getMagicaDamage();
	}

	
}
