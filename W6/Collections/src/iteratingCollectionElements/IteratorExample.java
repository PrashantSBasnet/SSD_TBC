package iteratingCollectionElements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	  public static void main(String[] args) {
	        
	        List<String> fruits = new ArrayList<>();

	        // Add some fruits to the list
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");

	        // Create an Iterator to iterate over the elements
	        Iterator<String> iterator = fruits.iterator();//factor method that returns new instance of Iterator
	        System.out.println(iterator.next()); //we can access collection element through .next() method
	        //System.out.println(iterator.next()); 
	        System.out.println(iterator.next());
	        
	        while (iterator.hasNext()) {
	        	System.out.println(iterator.next());
	        }
	  
	        
	        //creating another instance of Iterator
	        //iterator2 instance only tracks its own progress traversing through the collection elements. It is sepeate from the first iterator
	        Iterator<String> iterator2 = fruits.iterator();
	        System.out.println(iterator2.next());   
	        
	        for (String fruit: fruits) {
	        	System.out.println(fruit);
	        }
	       
	    }
	}







