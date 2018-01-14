package test;

import observer.pattern.Observer.ObserverType_A;
import observer.pattern.Observer.ObserverType_B;
import observer.pattern.Observer.ObserverType_C;
import observer.pattern.Observer.SubjectType_XX;
import observer.pattern.Observer.SubjectType_XY;

public class Observer_Ex {

	public static void main(String[] arg) {
		SubjectType_XX xx = new SubjectType_XX();
		SubjectType_XY xy = new SubjectType_XY();
		
		ObserverType_A observerType_A = new ObserverType_A();
		ObserverType_B observerType_B = new ObserverType_B();
		ObserverType_C observerType_C = new ObserverType_C();
		
		
		xy.register(observerType_B);
		xx.register(observerType_A);
		
		
		
		xy.setMyNotify(" blabla ba ");
		System.out.println(" ");
		xx.setMyNotify("This is my notify");
	}
	
}
