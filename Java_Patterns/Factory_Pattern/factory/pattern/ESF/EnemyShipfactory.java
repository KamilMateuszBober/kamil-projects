package factory.pattern.ESF;

public class EnemyShipfactory {

	public EnemyShip makeEnemyShip(String newShipType) {
		if(newShipType.equals("u")) {
			return new UFOEnemyShip();
		}else 
		if(newShipType.equals("r")) {
			return new RooockteEnemyShip();
		}else
		if(newShipType.equals("b")) {
			return new BigUFOEnemyShip();
		}else {
			return null;
		}
		
	}
}
