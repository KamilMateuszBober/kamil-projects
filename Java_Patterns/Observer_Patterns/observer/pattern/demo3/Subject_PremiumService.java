package observer.pattern.demo3;

import java.util.*;

public class Subject_PremiumService implements ISubject{

	private String myValue;
	
	public String getMyValue() {
		return myValue;
	}

	public void setMyValue(String string) {
		this.myValue = string;
		notifyObserver(string);
	}
	
	List<IObserver> observersList = new ArrayList<IObserver>();
	
	@Override
	public void register(IObserver o) {
		observersList.add(o);
		
	}

	@Override
	public void unregister(IObserver o) {
		observersList.remove(o);
		
	}

	@Override
	public void notifyObserver(String updatedValue) {
		for(int i=0;i<observersList.size();i++)
		{
		observersList.get(i).update(this.getClass().getSimpleName(),
		updatedValue);
		}
		
	}

}
