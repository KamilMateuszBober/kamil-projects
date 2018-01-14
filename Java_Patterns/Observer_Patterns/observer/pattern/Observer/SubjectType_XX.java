package observer.pattern.Observer;

import java.util.ArrayList;

public class SubjectType_XX implements ISubject {
	
	private String myNotify;
	
	
	
	public String getMyNotify() {
		return myNotify;
	}

	public void setMyNotify(String myNotify) {
		this.myNotify = myNotify;
		notifyObserver(myNotify);
	}
	
	ArrayList<IObserver> observerList = new ArrayList<IObserver>();
	
	@Override
	public void register(IObserver o) {
		observerList.add(o);
		
	}

	@Override
	public void Unregister(IObserver o) {
		observerList.remove(o);
		
	}

	@Override
	public void notifyObserver(String updateValue) {
		for(int i=0;i<observerList.size();i++) {
			observerList.get(i).update(this.getClass().getSimpleName(),updateValue);
		}
		
	}

}
