package observer.pattern.demo2;

import java.util.*;

public class Catalog_Cars implements INotification {
	
	private int myValue;
	
	
	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
		notifyObserver(myValue);
	}
	
	List<IObserver> observersList=new ArrayList<IObserver>();
	
	@Override
	public void register(IObserver o) {
		observersList.add(o);
		
	}

	@Override
	public void unregister(IObserver o) {
		observersList.remove(o);
		
	}

	@Override
	public void notifyObserver(int updatedValue) {
		
		for(int i=0;i<observersList.size();i++)
		{
		observersList.get(i).update(this.getClass().getSimpleName(),
		updatedValue);
		}
	}

}
