package adapter.pattern.Robot;

import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithhands() {
		int attackDamage = generator.nextInt(10)+1;
		
		System.out.println("Enemy Robat Causes "+attackDamage+ " Damage with hands");
	}
	
	public void walkForward() {
		int movments = generator.nextInt(5)+1;
		
		System.out.println("enemy robot walk "+movments+" spaces");
	}

	public void reactToHuman(String driverName) {
		System.out.println(" Enemy robot tramps on "+driverName);
	}
}
