package genericsEg1;

import java.util.ArrayList;



public class Driver {
	
	public static void main(String[]args) {
		
		IntegerPrinter printer = new IntegerPrinter(32);
		printer.print();
		
		//generic 
		TPrinter<Integer> tprinter = new TPrinter<>(32); //you can simply use angle brackets
		tprinter.print();
		
		TPrinter<Double> doublePrinter = new TPrinter<>(33.4);
		doublePrinter.print();
		
		
		//Generics do not work with primitive datatypes
		
		
		//using generics with Collection
		//ArrayList where we can only add Cat type
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		
		
		
		//lets hold everything without using a particular type
		//This will not be type safe
		ArrayList<Object> cats2 = new ArrayList<>();
		cats2.add(new Cat());
		
		cats2.add(new Dog()); //you don't get compilation error
		
		Cat myCat = (Cat) cats2.get(0); //have to Cast if Generic not used
		
		Object myCat2 = cats2.get(1); //Object type. So generic solves this issue by specifying type
		
		
		
		
		
	}
}
