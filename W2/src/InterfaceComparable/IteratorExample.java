package InterfaceComparable;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	  public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> fruits = new ArrayList<>();

	        // Add some fruits to the list
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");

	        // Create an Iterator to iterate over the elements
	        Iterator<String> iterator = fruits.iterator();

	        // Use the Iterator to traverse the list
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            System.out.println(fruit);
	        }
	    }
	}







