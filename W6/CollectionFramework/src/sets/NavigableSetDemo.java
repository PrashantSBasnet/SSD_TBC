package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	
	public static void main(String[] args) {
		
		NavigableSet<Integer> data = new TreeSet<>();
		
		data.add(1);
		data.add(10);
		data.add(20);
		data.add(5);
		data.add(15);
		
		System.out.println(data.floor(5)); //greatest element in the set less than or equal to the given element. Or returns null...
		System.out.println(data.lower(5)); //greatest element in the set less than to the given element. Or returns null...
		System.out.println(data.ceiling(15)); //least element in the set less which is greater than or equal to the given element. Or returns null...
		System.out.println(data.higher(20)); //least element in the set less which is greater than to the given element. Or returns null...
		System.out.println(data.pollLast()); //retrieves and removes the first element, or returns null if no such element
		System.out.println(data.descendingSet()); //descending order


	}

}
