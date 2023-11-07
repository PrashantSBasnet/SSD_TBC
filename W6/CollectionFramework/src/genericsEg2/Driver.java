package genericsEg2;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		
		Printer<Cat> printer  = new Printer<>(new Cat());
		printer.print();
		
		Printer<Dog> dogprinter  = new Printer<>(new Dog());
		dogprinter.print();
		
		shout("Name");
		shout(3);
		
		//wildcard 
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		printList(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printList(catList);
		
		
	}
	
	//Generic Methods
	private static <T> void shout(T thingToShout) {
		System.out.println(thingToShout +"!!!!!");
	}
	
	
	//WildCard example
	//List<?> List of unknown
	private static void printList(List<?> myList) {
		System.out.println();
	}

}
