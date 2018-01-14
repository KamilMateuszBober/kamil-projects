package observer.pattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

	private int myValue;
	
	
	
	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
		notifyObserver(myValue);
	}
	
	List<IObserver> observerList = new ArrayList<IObserver>();

	@Override
	public void register(IObserver o) {
		observerList.add(o);
		
	}

	@Override
	public void unregister(IObserver o) {
		observerList.remove(o);
		
	}

	@Override
	public void notifyObserver(int updateValue) {
		for(int i=0; i<observerList.size();i++) {
			observerList.get(i).update(updateValue);
		}
		
	}

}
