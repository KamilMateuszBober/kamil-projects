package example;

import decorator.pattern.demo1.ConcreteComponent;
import decorator.pattern.demo1.ConcreteDecoratorEx_1;
import decorator.pattern.demo1.ConcreteDecoratorEx_2;

public class DecoratorPatternEx {

	public static void main(String[] args) {


		System.out.println("***Decorator pattern Demo***");
		ConcreteComponent cc = new ConcreteComponent();
		ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
		// Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1
		cd_1.SetTheComponent(cc);
		cd_1.doJob();
		ConcreteDecoratorEx_2 cd_2= new ConcreteDecoratorEx_2();
		// Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1 &
		//ConcreteDecoratorEX_2
		cd_2.SetTheComponent(cd_1);//Adding //results from cd_1 now
		cd_2.doJob();

	}

}
