package Abstraction;


public abstract class AbstractShape {

	// Concrete method
	public void displayInfo() {
		System.out.println("This is a shape.");
	}
	
	 // Abstract method that subclasses must implement
    public abstract double calculateArea();
}


	






