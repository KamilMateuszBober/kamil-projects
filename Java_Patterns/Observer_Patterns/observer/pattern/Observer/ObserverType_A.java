package observer.pattern.Observer;

public class ObserverType_A implements IObserver {

	@Override
	public void update(String fromWhere, String notify) {
		System.out.println( 
				this.getClass().getSimpleName()+
				" get  notification from: "+fromWhere
				+" actual message of notification is:  " +notify);
		
	}

}
