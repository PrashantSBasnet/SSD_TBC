package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

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
