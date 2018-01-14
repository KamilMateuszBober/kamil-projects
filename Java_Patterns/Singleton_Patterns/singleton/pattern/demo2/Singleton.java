package singleton.pattern.demo2;

public class Singleton {
	
	public static Singleton firstInstance = null;
	
	private Singleton(){};
	
	public static Singleton getInstance() {
		
		if(firstInstance == null ) {
			firstInstance = new Singleton();
		}
		return firstInstance;
	}
}
