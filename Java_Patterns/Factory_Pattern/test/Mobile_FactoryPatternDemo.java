package test;

import factory.pattern.mobile.Mobile;
import factory.pattern.mobile.MobileFactory;

public class Mobile_FactoryPatternDemo {
	public static void main(String[] args) {
		/*
		MobileFactory mobileFactory = new MobileFactory();
		*/
		Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
		System.out.println(mobile.toString());
		
		Mobile mobile2 = MobileFactory.createMobile(Mobile.IPHONE);
		System.out.println(mobile2.toString());
	}
}
