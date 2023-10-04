package foundationsCollection;

import java.util.ArrayList;
import java.util.Collection;

public class UseofGenerics {
	
	public static void main (String [] args) {
		
		Collection c = new ArrayList(); //Same Collection Type, Different Element Type
		c.add("Cambridge"); //string
		c.add(1L); //long
		System.out.println(c.toString());
		

		Collection<Room> c2 = new ArrayList<>(); //Same Collection Type, Different Element Type
		//c2.add("Cambridge"); //string    compiler throws error because it is of type <Room>
		//c2.add(1L); //long    		   compiler throws error because it is of type <Room>
		c2.add(new Room("Cambridge", "Suite", 6, 250.0));
		System.out.println("GenericType <Room>:"+ c.toString());
		
	
		
		Collection c3= new ArrayList(); //Same Collection Type, Different Element Type
		c3.add(new Room("Cambridge", "Suite", 6, 250.0)); //assigning values in Room object
		
		
	}

}
