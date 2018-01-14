package decorator.pattern.demo3;

public class Unarmed_Heroe implements Heroe{

	

	@Override
	public String getAccesory() {
		// TODO Auto-generated method stub
		return " No equipment, only fist";
	}

	@Override
	public double power() {
		// TODO Auto-generated method stub
		return 4.2;
	}
	
	

}
