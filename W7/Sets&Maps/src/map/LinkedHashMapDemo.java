package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(10, "Maths");
		map.put(10, "English");
		
		
		System.out.println(map); //Insertion order not preserved
		
		
		//--Identity HashMap

		IdentityHashMap<Integer, String> maps2 = new IdentityHashMap<>();
		
		//values same, references different
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		maps2.put(a, "First");
		maps2.put(b, "Second");
	
		System.out.println(maps2); 
	}

}
