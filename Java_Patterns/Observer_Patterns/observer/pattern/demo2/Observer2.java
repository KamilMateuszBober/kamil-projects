package observer.pattern.demo2;

public class Observer2 implements IObserver{

	@Override
	public void update(String s, int i) {

		System.out.println("Observer 2: Observ change in myValue "+ s + " is now "+i);
		
	}

	
}
