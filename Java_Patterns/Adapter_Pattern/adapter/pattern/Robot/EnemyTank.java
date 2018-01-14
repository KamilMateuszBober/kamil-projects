package adapter.pattern.Robot;

import java.util.Random;

public class EnemyTank implements EnemyAttacer {
	Random generator = new Random();
	
	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10)+1;
		System.out.println("Enamy tank does "+attackDamage+" Damage");

	}

	@Override
	public void driveForward() {
		int movment = generator.nextInt(5)+1;
		System.out.println("Enemy tank move "+movment+" space");

	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println(driverName +" is driving the tank");
		
	}

	

}
