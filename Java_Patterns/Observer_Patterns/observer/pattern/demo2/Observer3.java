package observer.pattern.demo2;

public class Observer3 implements IObserver{

	@Override
	public void update(String s, int i) {

		System.out.println("Observer 3: Observ change in myValue "+ s + " is now "+i);
		
	}
}
