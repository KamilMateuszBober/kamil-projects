package example;

import decorator.pattern.Magica.*;

public class Magica {
	public static void main(String[] args) {
		
		Spell spell1 = new UpgradeLVL3(new UpgradeLVL2(new UpgradeLVL1(new Armagedon())));
		Spell spell2 = new UpgradeLVL2(new UpgradeLVL1(new IceSpear()));
		
		System.out.println("Spell name:  "+spell1.getPowerSpell());
		System.out.println("Magica damage: "+spell1.getMagicaDamage());
		System.out.println();
		System.out.println("Spell name:  "+spell2.getPowerSpell());
		System.out.println("Magica damage: "+spell2.getMagicaDamage());
	}
}
