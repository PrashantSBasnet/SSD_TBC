package Abstraction;

public class Driver {
	
	public static void main (String[] args) {
	
		/**Abstract class Example **/
	
		Circle circle = new Circle (6.0);
		circle.displayInfo(); //inheritance
		System.out.println("Circle Area:" + circle.calculateArea());
	}
	
}
