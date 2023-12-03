package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
	
	 public static void main(String[] args) {
	       
		 List<String> myList = new ArrayList<>();

	        // Adding elements to the list
	        myList.add("Apple");
	        myList.add("Banana");
	        myList.add("Orange");
	        myList.add("Grapes");
	        myList.add("Mango");

	     
	        ListIterator<String> listIterator = myList.listIterator();

	        // Forward iteration
	        System.out.println("Iteration:");
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }

	        // Backward iteration using ListIterator as it supports bidirectional 
	        System.out.println("\nBackward iteration:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	        
	        // Modification during iteration
	        listIterator = myList.listIterator();
	        while (listIterator.hasNext()) {
	            
	        	int index = listIterator.nextIndex();
	            
	        	String element = listIterator.next();
	            
	            if (element.equals("Banana")) {
	                // Modifying the element "Banana" to "Strawberry"
	                listIterator.set("Strawberry");
	                System.out.println("\nModified element at index " + index + " to Strawberry");
	            }
	        }

	        // Display the modified list
	        //using for each loop
	        System.out.println("\nList after modification:");
	        
	        for (String fruit : myList) {
	            System.out.println(fruit);
	        }
	        
	        
	        //removing an element from the list
	        //using iterator
	        System.out.println("\nList after removing Strawberry:");
	        
	       while (listIterator.hasNext()) {
	    	   String val = listIterator.next();
	    	   if (val.equals("Strawberry")) {
	    		   listIterator.remove();
	    	   }
	       }
	       
	       //using iterator to loop
	       Iterator<String> iterator = myList.iterator();
	       while(iterator.hasNext()) {
	    	   System.out.println(iterator.next());
	       }
	    
	 
	
	 	//lambda expression
	 	System.out.println("\n using lambda");
	 	myList.forEach( (n) -> { System.out.println(n); });
		 
	 }

}
