package CodeSnippets_OOPS1;

/**
 * Abstract classes do not have method body
 * They cannot be instantiated
 * They may have constructors
 * They can extend other abstract or regular class
 * Sub classes that extend an abstract class must provide concrete implementations for all the abstract methods
 * .. declared in the abstract class. Failure to do so will result in compilation error
 * @author prashantsingh.basnet
 *
 */
public abstract class AbstractShape {

	// Concrete method
	public void displayInfo() {
		System.out.println("This is a shape.");
	}
	
	 // Abstract method that subclasses must implement
    public abstract double calculateArea();
}


class Circle extends AbstractShape{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius *radius;
	}
	
}





