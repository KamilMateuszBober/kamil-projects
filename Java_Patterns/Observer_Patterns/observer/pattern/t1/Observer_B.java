package observer.pattern.t1;

public class Observer_B implements IObserver {

	@Override
	public void update(String s1, String s2) {
		System.out.println(
				"Message from: "+s1+" About: "+s2
				);
		

	}

}
