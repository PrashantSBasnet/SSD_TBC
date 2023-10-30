package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add(7);
		s.add(1);
		s.add(5);
		s.add(3);
		s.add(2);
		s.add(10);
		s.add(9);
		
		System.out.println(s); //sorts in ascending order
		
		System.out.println(s.first()); //first element of the sorted set
		System.out.println(s.last()); //last element of the sorted set
		System.out.println(s.headSet(3)); //returns value before this object
		System.out.println(s.tailSet(3)); //returns this object and values after this object
		System.out.println(s.subSet(1,4)); //values between these objects. includes first index but doesn't include last index
		
		//Comparator comparator
		System.out.println(s.comparator()); 
		
	} 

}
