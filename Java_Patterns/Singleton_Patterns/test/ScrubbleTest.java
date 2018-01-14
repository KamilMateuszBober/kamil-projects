package test;

import java.util.LinkedList;

import singleton.pattern.demo3.Singleton_Scrabble;

public class ScrubbleTest {

	public static void main(String[] args) {
		Singleton_Scrabble newInstance = Singleton_Scrabble.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: "+playerOneTiles);
		System.out.println(newInstance.getLetterList());
		
		Singleton_Scrabble newInstance_2 = Singleton_Scrabble.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(newInstance_2));
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		System.out.println("Player 2: "+playerTwoTiles);
	}

}
