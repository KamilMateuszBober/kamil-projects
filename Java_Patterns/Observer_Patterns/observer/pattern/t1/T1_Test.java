package observer.pattern.t1;

public class T1_Test {

	public static void main(String[] args) {
		
		Subject_I subject_I = new Subject_I();
		
		Observer_A observer_A = new Observer_A();

		
		subject_I.register(observer_A);
		subject_I.setMyNotify("mniam mniam");
	}

}
