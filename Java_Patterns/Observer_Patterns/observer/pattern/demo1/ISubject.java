package observer.pattern.demo1;

public interface ISubject {

	void register(IObserver o);
	void unregister(IObserver o);
	void notifyObserver(int i);
}
