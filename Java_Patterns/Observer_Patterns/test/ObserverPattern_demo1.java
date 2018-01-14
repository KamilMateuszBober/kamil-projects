package test;

import observer.pattern.demo1.Observer1;
import observer.pattern.demo1.Observer2;
import observer.pattern.demo1.Observer3;
import observer.pattern.demo1.Subject;

public class ObserverPattern_demo1 {

	public static void main(String[] args) {
		Subject sub = new Subject();
		Observer1 ob1 = new Observer1();
		Observer2 ob2 = new Observer2();
		Observer3 ob3 = new Observer3();
		
		// register Observer 1 and Observer2
		sub.register(ob1);
		sub.register(ob2);
		
		// Set new walue 5
		sub.setMyValue(5);
		
		//Register Observer3
		sub.register(ob3);
		
		System.out.println();
		sub.setMyValue(24);
		
		// unregiste Observer2
		sub.unregister(ob2);
		System.out.println();
		sub.setMyValue(124);
		
		
	}
	
}
