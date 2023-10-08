package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		//Same value, different references
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		map.put(a, "First");
		map.put(b, "Second");
		
		System.out.println(map); //will get only one as the former value with same key gets replaced by the latter, because .equals checks content
			
		
		
		//--Identity HashMap ... values same, different references

		IdentityHashMap<Integer, String> maps2 = new IdentityHashMap<>();
		
		//values same, different references
		Integer a1 = new Integer(10);
		Integer b1 = new Integer(10);
		
		maps2.put(a1, "First");
		maps2.put(b1, "Second");
	
		System.out.println(maps2); //will get both because IdentityHashMap uses '==' and it checks reference equality
	}
}
