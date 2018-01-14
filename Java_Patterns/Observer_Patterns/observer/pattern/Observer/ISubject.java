package observer.pattern.Observer;

public interface ISubject {

	public void register(IObserver o);
	public void Unregister(IObserver o);
	public void notifyObserver(String s);
}
