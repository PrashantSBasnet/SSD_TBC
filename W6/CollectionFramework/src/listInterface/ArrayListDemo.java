package listInterface;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String [] args) {
		
		ArrayList al = new ArrayList(); //default size: 10 (0-9 index)
		
		ArrayList aList = new ArrayList(30); //defining size by calling ArrayList(x) constructor
	
		al.add("John");
		al.add(true);
		al.add(10);
		
		System.out.println(al);
		
		al.remove(0);
		al.remove(new Integer(10)); //providing object. we cannot write 10 as that's the index
	
		System.out.println(al);
		
		System.out.println(al.get(0));
		
		//boolean b = al.get(0); //you get compile time error because compile cannot figure it out.
								 
		//Generic ArrayList
		ArrayList<String> strArrayList = new ArrayList<String>();
		
		
		
		
	
	}
}
