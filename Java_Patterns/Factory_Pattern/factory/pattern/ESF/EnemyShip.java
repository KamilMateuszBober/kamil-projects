package factory.pattern.ESF;

public class EnemyShip {
	
	private String name;
	private double amtdamage;
	
	
	public String getName() {
		return name;
	}
	public double getDamage() {
		return amtdamage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDamage(double amtdamage) {
		this.amtdamage = amtdamage;
	}
	
	
	public void followHeroShip(){
		System.out.println(getName()+" is following the hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName()+" is onthe screen");
	}
	
	public void enemyShipShoot() {
		System.out.println(getName()+" attack and does "+getDamage());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
