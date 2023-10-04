package foundationsCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Mutable objects are those objects whose contents can be changes without creating a new object
 * String is immutable because its content cannot be modified once created
 * StringBuilder and StringBuffer are mutable versions of String because their contents can be changed without creating a new object
 * 
 * Collections are mutable
 * This means each of the underlying methods (.add(), .remove()) changes the underlying collections when invoked
 * @author prashantsingh.basnet
 *
 */
public class SomeMoreExamples {
	
	public static void main (String[] args) {
		
		//using Collection interface as the variable type
		Collection c = new HashSet();
		
		//we can also write Set interface as the variable type because HashSet implements Set interface
		Set s = new HashSet();
		
		
		List ls = new ArrayList();
		Collection cl = new ArrayList(); 
		
		//Collection c1 = new Collection(); //cannot do this because collection type doesn't have any direct implementation
		
		
		//generic type of String
		Collection<String> cls = new ArrayList<>();
		cls.add("samsung");
		cls.add("apple");
		cls.add("nokia");
		cls.add("samsung");
		
		System.out.println(cls.toString());
		
		//some methods
		c.remove("A");
		//c.removeAll(c); //accepts collection Object and removes in bulk
		
		c.contains("G"); //returns true/false if found/not found inside the collection
		c.containsAll(List.of("samsung","apple")); //to check in bulk
		c.isEmpty(); //returns true or false
		c.size(); //prints the size of Collection
		
		
		//Another way we can create a collection is through constructor
		//Each collection implementation has a conversion constructor that accepts another constructor as an argument
		
		Collection<String> favoriteThings = new HashSet<>(cls);  ////no duplicates
		System.out.println(favoriteThings); 
		
		
		
		
		//try avoiding using the concrete implementation as the variable type
		ArrayList<String> ar = new ArrayList<>();
		
		//try using abstract type as much as possible as it allows you to switch the implementation without any consequences
		List<String> listS = new ArrayList<>();
		Collection<String> collS = new ArrayList<>();  //try using ArrayDeque. the rest of the codes do not need to be changed
		collS.add("apple");
		collS.add("ball");
		
		
	
		
		
		
		
    //  <Implementation Style><Interface> 
	//   Array                 List	 
	//   Hash                  Map
	//   Linked                List	
		ArrayList arrayList = new ArrayList<String>();
		HashMap hashMap = new HashMap<Integer, String>();  
		LinkedList linkedList = new LinkedList<String>();
		
		
		
		
	}

}
