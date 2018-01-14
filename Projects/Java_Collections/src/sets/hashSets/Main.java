package sets.hashSets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	private static Map<String, Planets> solarSystem = new HashMap<>();
	private static Set<Planets> planets = new HashSet<>();
	
	public static void main(String[] args) {
		
		Planets temp =  new Planets("Merkury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp =  new Planets("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp =  new Planets("Erth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		Planets tempMoon = new Planets("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		temp =  new Planets("Mars", 687);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		tempMoon = new Planets("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); 

        tempMoon = new Planets("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); 
        
		temp =  new Planets("Jupiter", 4_332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		tempMoon = new Planets("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);  

        tempMoon = new Planets("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);  

        tempMoon = new Planets("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);  

        tempMoon = new Planets("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
        
		
		temp =  new Planets("Saturn", 10_759);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp =  new Planets("Uranus", 30_708);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp =  new Planets("Neptune", 60_223);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		System.out.println("Planets");
		for (Planets planet: planets ) {
			System.out.println(" \t Planet name: "+planet.getName());
			System.out.println("planet orbit: "+planet.getOrbitalPeriod());
		}
		
		System.out.println();
		System.out.println("Moons");
		Planets body = solarSystem.get("Erth");
		System.out.println("Moons of "+body.getName());
		for(Planets moons : body.getSatelites()) {
			System.out.println("\t"+moons.getName());
			System.out.println("\t"+moons.getOrbitalPeriod());
			System.out.println();
		}
		
		
		Set<Planets> moons = new HashSet<>();
		for(Planets planet: planets) {
			System.out.println(" to co ten kawalek kodu robi "+planet.getSatelites());
			moons.addAll(planet.getSatelites());
		}
		
		System.out.println(" All Moons");
		for(Planets moon: moons) {
			System.out.println("\t"+moon.getName());
		}
		
	}

}
