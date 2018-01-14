package example;

import decorator.pattern.demo3.Heroe;
import decorator.pattern.demo3.IronSword;
import decorator.pattern.demo3.RustySword;
import decorator.pattern.demo3.Unarmed_Heroe;

public class Demo3 {
	public static void main(String[] args) {
		
		 Heroe heroe = new IronSword(new RustySword(new Unarmed_Heroe()));
		 
		 System.out.println(heroe.getAccesory());
		 System.out.println(heroe.power());
	}
}
