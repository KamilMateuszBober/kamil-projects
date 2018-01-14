package maps.edu_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Map_example_1", 1);
		map.put("Map_example_2", 2);
		map.put("Map_example_3", 3);
		map.put("Map_example_4", 4);
		map.put("Map_example_5", 5);
		map.put("Map_example_6", 6);
		map.put("Map_example_7", 7);

		// iterating trough map
		
			// foreach 
				for (Map.Entry<String, Integer> entry : map.entrySet())
				{
				    System.out.println(entry.getKey() + ": " + entry.getValue());
				}
		// space
		System.out.println("==========================================================================");
			// iterator
				long i = 0;
				Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
				while (it.hasNext()) {
				    Map.Entry<String, Integer> entry = it.next();
				    System.out.println(entry.getKey() + ": " + entry.getValue());
				}
		// space
		System.out.println("==========================================================================");
		
		
		
		// Creating and populating the maps

		HashMap<String, HashMap<String, String>> outerMap = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> innerMap = new HashMap<String, String>();  
		
		
		innerMap.put("innerKey1", "Example1" );
		innerMap.put("innerKey2", "Example2" );
		innerMap.put("innerKey3", "Example3" );
		
		outerMap.put("outerMap1", innerMap);
		outerMap.put("outerMap2", innerMap);
		outerMap.put("outerMap3", innerMap);
		
		System.out.println(outerMap.get("outerMap1"));
		System.out.println(outerMap.get("outerMap1").get("innerKey3"));
		System.out.println(outerMap.keySet());
		System.out.println(outerMap.values());
		System.out.println(outerMap.containsKey("outerMap3"));
		System.out.println(outerMap.get("outerMap1").containsKey("innerKey3"));
		
		

	}

}
