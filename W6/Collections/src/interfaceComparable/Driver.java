package interfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Driver {
	 
	public static void main(String[] args) {
	       
		
		List<Person> people = new ArrayList<>();
	        people.add(new Person("Alice", 25));
	        people.add(new Person("Bob", 30));
	        people.add(new Person("Charlie", 22));

	        // Sort the list of people based on their age using Comparable
	        Collections.sort(people);

	        // Print the sorted list
	        for (Person person : people) {
	            System.out.println(person);
	        }
	    }
	
}
