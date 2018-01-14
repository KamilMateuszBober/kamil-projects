package sets.hashSets;

import java.util.HashSet;
import java.util.Set;

public final class Planets {

	private final String name;
	private final double orbitalPeriod;
	private final Set<Planets> satelites;
	
	
	public Planets(String name,double orbitalPeriod) {
		
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satelites = new HashSet<>();
	}


	public String getName() {
		return name;
	}


	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}


	public Set<Planets> getSatelites() {
		return new HashSet<>(this.satelites);
	}
	
	
	public boolean addMoon(Planets moon) {
		return this.satelites.add(moon);
	}
	
	
	
}
