package collectionInterfaces;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String [] args) {
		
		Vector vector = new Vector(); //initial size of 10. 
		
		Vector vector2 = new Vector(60); //using parameterized constructor
		//now if vector2 gets filled up, new vector double of this size will be created 
		
		Vector vector3 = new Vector(100,5); //capacity, incremental capacity
		
		//Vector vector4 = new Vector(Collection c); //we can add any collection and we get equivalent vector
		
		//both of these methods do the same operation
		vector.add("Apple"); //from Collection interface
		vector.addElement("Ball"); //from Vector Class
		
		System.out.print(vector);
		
		vector.remove(0); //from Collection interface
	
		System.out.print(vector);
		
		//get
		//size(); //memory location occupied in the vector
		//capacity(); //remaining memory in the vector
		
	}
	

}
