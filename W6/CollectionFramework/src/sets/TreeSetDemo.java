package sets;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();  //constructor1
		//TreeSet ts2 = new TreeSet(Comparator c) //Constructor 2 for customized sorting
		
		//passing sorted set in tree set
		SortedSet<Integer> s = new TreeSet<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//constructor
		TreeSet<Integer> ts3 = new TreeSet<>(s);
		TreeSet<Integer> ts4 = new TreeSet<Integer>(hs);

		
		//Any Object stored in TreeSet must implement Comparable Interface
		//if not implemented you will get cast to java.lang.Comparable exception
		TreeSet<Employee> ts5 = new TreeSet<>();
		ts5.add(new Employee("Ram", 20000));
	}

}
