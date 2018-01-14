package observer.pattern.demo2;

public class Observer1 implements IObserver {

	@Override
	public void update(String s, int i) {

		System.out.println("Observer 1: Observ change in myValue "+ s + " is now "+i);
		
	}

	
}
