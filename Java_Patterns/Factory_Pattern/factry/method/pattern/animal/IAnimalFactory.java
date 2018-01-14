package factry.method.pattern.animal;

public abstract class IAnimalFactory {
	public abstract IAnimal GetAnimalType(String type) throws Exception;
	
}
