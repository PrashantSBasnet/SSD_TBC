package Abstraction;

/**
 * Abstraction 
 * Hiding the unnecessary details of the implementation. 
 * In other words, abstraction allows you to focus on what an object does rather than how it does it.
 * 
 * 
 * Abstract class is a placeholder in a class hierarchy that represents a generic concept
 * Abstract classes do not have method body
 * They cannot be instantiated directly
 * They may have constructors
 * They can extend other abstract or regular class
 * Sub classes that extend an abstract class must provide concrete implementations for all the abstract methods declared in the abstract class. Failure to do so will result in compilation error
 * 
 * Advantages: 
 * Simplification of Complexity
 * Modularity
 * Code Reusability
 * Flexibility and Extensibility
 * Improved Collaboration among developers
 * 
 * Note:
 * Abstract class cannot be declared as final because final keyword curtails inheritance
 * 
 * keywords used: abstract, extends
 * @author prashantsingh.basnet
 *
 *
 */
 
public class Driver {
	
	public static void main (String[] args) {
	
		/**Abstract class Example **/
	
		Circle circle = new Circle (6.0);
		circle.displayInfo(); //inheritance
		System.out.println("Circle Area:" + circle.calculateArea());
		
		/**Abstract classes cannot be instantiated, but reference type variables can reference a class that extended an abstract class either directly or indirectly	
	    */
		//'demo' can only be used to access the members of the AbstractClassA
		AbstractClassA demo = new ConcreteClass();
		demo.method1(); //only the definiton provided in the AbstractClassA are accessible thru 'demo' 
		
		AbstractClassB demo2 = new ConcreteClass();
		demo2.method1(); //because AbstractClassB inherits AbstractClassA
		demo2.method2();
		
		
		
	}
	
}
