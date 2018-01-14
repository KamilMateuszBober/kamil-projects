package example;

import adapter.pattern.Robot.EnemyAttacer;
import adapter.pattern.Robot.EnemyRobot;
import adapter.pattern.Robot.EnemyRobotAdapter;
import adapter.pattern.Robot.EnemyTank;

public class TestEnemyRobot {

	
	public static void main(String[] args) {
		
		EnemyTank rx7tank = new EnemyTank();
		EnemyRobot fredTheRobot = new EnemyRobot();
		EnemyAttacer robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("the robot");
		
		fredTheRobot.reactToHuman("paaul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithhands();
		
		System.out.println("Enemy tank");
		
		rx7tank.assignDriver("Frank");
		rx7tank.driveForward();
		rx7tank.fireWeapon();
		
		System.out.println("The robot with adapter");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}
}
