package map.entry;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) {
		
		Map<String, Double> foood_and_price  = new HashMap<>();
		
		foood_and_price.put("BANANA",12.54);
		foood_and_price.put("ORANGE",8.23);
		foood_and_price.put("MILK", 10.00);
		foood_and_price.put("APPLE", 12.32);
		
		
		for (Map.Entry<String, Double> entry : foood_and_price.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			System.out.println("\n Name: "+key +" \n Value: "+value+"\n");
		}
		
	}
}
