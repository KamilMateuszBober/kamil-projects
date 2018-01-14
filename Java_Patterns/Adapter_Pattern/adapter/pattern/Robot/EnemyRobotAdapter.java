package adapter.pattern.Robot;

public class EnemyRobotAdapter implements EnemyAttacer {

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		theRobot=newRobot;
	}
	
	@Override
	public void fireWeapon() {
		theRobot.smashWithhands();
		
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();
		
	}

	@Override
	public void assignDriver(String driverName) {
		theRobot.reactToHuman(driverName);
		
	}

}
