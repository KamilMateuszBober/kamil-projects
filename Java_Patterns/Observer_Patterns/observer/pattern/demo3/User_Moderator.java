package observer.pattern.demo3;

public class User_Moderator implements IObserver{

	@Override
	public void update(String s, String s2) {
		System.out.println( 
				this.getClass().getSimpleName()+
				" get  notification from: "+s
				+" actual message of notification is:  " +s2);
		
	}

}
