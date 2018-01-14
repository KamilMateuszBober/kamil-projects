package test;
import java.util.Scanner;

import factory.pattern.ESF.EnemyShip;
import factory.pattern.ESF.EnemyShipfactory;

public class EnemyShipTesting {

	

	/*###################################################################################
	 * 							FACTORY DESIGN PATTERN
	 *###################################################################################
	 */
	
	public static void main(String[] args) {
		System.out.println("test");
		EnemyShipfactory shipFactory = new EnemyShipfactory();
		EnemyShip theEnemy = null;
		Scanner userInput =new Scanner(System.in);
		System.out.println("What type of ship? U/R/B" );
		if(userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		if(theEnemy != null) {
			doStuffEnemy(theEnemy);
		}else System.out.println("Enter a u, r, or b next Time");
		
		
	}

	private static void doStuffEnemy(EnemyShip theEnemy) {
		theEnemy.displayEnemyShip();
		theEnemy.followHeroShip();
		theEnemy.enemyShipShoot();
		
		
	}

}


















