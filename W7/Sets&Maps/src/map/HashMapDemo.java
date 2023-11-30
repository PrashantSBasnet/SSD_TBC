package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
	//HashMap map = new HashMap();
	//Interface  Implementation Class	
	//Map map2 = new HashMap();
		
	// define capacity 
	// HashMap map = new HashMap(initial capacity);
    // HashMap map = new HashMap(initial capacity, float loadfactor);
	
		//create new map
	//	HashMap newMap = new HashMap(map2);
		
		
		//Example
		
		Set<String> ab = new HashSet<>();
		ab.add("apple");
		
		Map<String, Integer> sampleMap = new LinkedHashMap<>();
		sampleMap.put("Thapathali", 4200);
		sampleMap.put("Balkhu", 5322);
		
		
		Map<Integer, String> sampleMap2 = new HashMap<>();
		sampleMap2.put(1, "Shasank");
		sampleMap2.put(2, "Erika");
		sampleMap2.put(3, "Manoj");
		

		
		HashMap<String, Integer> marks = new HashMap<>();
		marks.put("Maths", 90);
		marks.put("Science", 89);
		marks.put("English", 90);
		
		marks.put("Maths", 90); //just replaces the value in the key
		
		System.out.println(marks); //Insertion order not preserved
		
		
		System.out.println(marks.get("Maths"));
		System.out.println(marks.entrySet());
		System.out.println(marks.values());
		System.out.println(marks.clone());
		System.out.println(marks.containsKey("Sciene"));
		System.out.println(marks.remove("Science",29)); //providing wrong value will not remove
		System.out.println(marks.replace("Maths", 90, 91));
		
		
		HashMap<Integer, String> test = new HashMap<>();
		test.put(1, "Apple");
		System.out.println(test.computeIfAbsent(1, k-> "Apple is not a key"));
		
		
		
	}

}
