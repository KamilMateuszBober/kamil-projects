package test;

import singleton.pattern.demo2.Singleton;

public class SingletonPattern_demo2 {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 == singleton2){
			System.out.println("singleton1 and singleton2 are same instance");
			}
	}
}
