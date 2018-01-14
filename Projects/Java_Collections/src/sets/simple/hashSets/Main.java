package sets.simple.hashSets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {


		Set<String> city = new HashSet<>();
		
			city.add("London");
			city.add("Moscov");
			city.add("Bagdad");
			city.add("Tokio");
			city.add("Tokio");
			
			for(String s: city) {
				System.out.println(s);
			}
			System.out.println();
		
		Set<Integer> number = new TreeSet<>();
		
			number.add(45);
			number.add(23524);
			number.add(345);
			number.add(455);
			number.add(876);
			
			for(Integer n: number) {
				System.out.println(n);
			}
			System.out.println();

	}

}
