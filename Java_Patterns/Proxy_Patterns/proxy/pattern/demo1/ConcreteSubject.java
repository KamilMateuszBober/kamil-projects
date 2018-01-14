package proxy.pattern.demo1;

public class ConcreteSubject extends Subject{

	@Override
	public void doSomeWork() {
		System.out.println(" im from "+getClass().getSimpleName());
		
	}
}
