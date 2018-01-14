package test;

import proxy.pattern.demo1.Proxy;

public class ProxyPattern_demo1 {
	
	public static void main(String[] args) {
		
		System.out.println("***Proxy Pattern Demo***\n");
		
		Proxy px = new Proxy();
		px.doSomeWork();
	}
}
