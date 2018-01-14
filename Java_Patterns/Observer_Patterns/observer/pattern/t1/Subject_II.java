package observer.pattern.t1;

import java.util.ArrayList;

public class Subject_II implements ISubject {

	private String myNotify;

	public String getMyNotify() {
		return myNotify;
	}

	public void setMyNotify(String myNotify) {
		this.myNotify = myNotify;
		notifycation(myNotify);
	}
	
	ArrayList<IObserver> observerList = new ArrayList<IObserver>();
	
	
	@Override
	public void register(IObserver o) {
		observerList.add(o);

	}

	@Override
	public void unregister(IObserver o) {
		observerList.remove(o);

	}

	@Override
	public void notifycation(String message) {
		for(int i=0;i<observerList.size();i++) {
			observerList.get(i).update(this.getClass().getSimpleName(), message);
		}

	}

}
