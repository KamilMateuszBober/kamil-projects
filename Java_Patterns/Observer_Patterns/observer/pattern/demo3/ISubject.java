package observer.pattern.demo3;

public interface ISubject {

	public void register(IObserver o);
	public void unregister(IObserver o);
	public void notifyObserver(String s);
}
