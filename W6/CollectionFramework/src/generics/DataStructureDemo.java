package generics;

import java.util.ArrayList;

public class DataStructureDemo {
	
	public static void main(String[] args) {
		
		String[] strArray = new String[20];
		Employee[] empArray = new Employee[20];
		strArray[0]="Apple";
		//strArray[1]= new Employee();  //compile time error because of type safety of array
		
		//we have dynamic array 
		ArrayList arList = new ArrayList();
		//int --> Integer because int is primite and ArrayList holds Objects
		arList.add("Apple"); //string type
		arList.add(new Employee()); //object type
		
		//String name = arList.get(0); //gives compile time error because not casted
			
	}
}
