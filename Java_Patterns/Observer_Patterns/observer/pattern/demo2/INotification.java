package observer.pattern.demo2;

public interface INotification {

	public void register(IObserver o);
	public void unregister(IObserver o);
	public void notifyObserver(int i);
	
}
