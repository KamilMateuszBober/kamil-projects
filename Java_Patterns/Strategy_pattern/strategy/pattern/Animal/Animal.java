package strategy.pattern.Animal;

public class Animal {

	
	private String name;
	private String sound;
	
	public Flys flyingType;

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
