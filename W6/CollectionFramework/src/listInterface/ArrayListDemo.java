package listInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String [] args) {
		
		List<Object> al = new ArrayList<>(); //default size: 10 (0-9 index) 
		//ArrayList<Object> al = new ArrayList<>(); //as we do not know the specific type that the arrayList holds.
		
		List<Integer> aList = new ArrayList<>(30); //defining size by calling ArrayList(x) constructor
	
		al.add("John");
		al.add(true);
		al.add(10); //Autoboxing
		
		System.out.println(al);
		
		al.remove(0);
		al.remove(new Integer(10)); //providing object. we cannot write 10 as that's the index
	
		System.out.println(al);
		
		System.out.println(al.get(0));
		
		//boolean b = al.get(0); //you get compile time error because compile cannot figure it out.
								 
		//Generic ArrayList
		ArrayList<String> strArrayList = new ArrayList<>();
		
		
		
	}
}
