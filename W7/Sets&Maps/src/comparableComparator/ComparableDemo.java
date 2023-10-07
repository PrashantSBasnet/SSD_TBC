package comparableComparator;

import java.util.TreeSet;

public class ComparableDemo {
	
	public static void main(String[] args) {
	
		TreeSet<Integer> data = new TreeSet<>(); 
	
		data.add(1);
		data.add(10); //JVM internally calls compareTo() to arrange in left or right
		data.add(20);
		data.add(5);
		data.add(15);
		data.add(10);
		
		//System.out.println(data); //you will not get duplicates
	
	//---------------------------------------

		TreeSet<Integer> data2 = new TreeSet<>(new MySorting());  //passing object of the class for custom sorting
	
		data2.add(1);
		data2.add(10); //JVM internally calls compareTo() to arrange in left or right
		data2.add(20);
		data2.add(5);
		data2.add(15);
		data2.add(10);
		
		System.out.println(data2); //you will not get duplicates
		
	}
}
