package observer.pattern.t1;

public interface ISubject {

	public void register(IObserver o);
	public void unregister(IObserver o);
	public void notifycation(String s);
}
