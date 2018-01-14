package test;

import singleton.pattern.demo4.GetTheTiles;

public class Scrubble_Thread_Test {

	public static void main(String[] args) {
	
		Runnable getTiles = new GetTheTiles();
		Runnable getTilesAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}

}
