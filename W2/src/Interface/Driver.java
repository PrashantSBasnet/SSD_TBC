package Interface;


/**
 * 
 * Interface is not a class, it is a blueprint for a class
 * 
 * 
 * It specifies set of methods that the class must implement
 * It has no constructors
 * A class can implement multiple interfaces, unlike a class inheritance
 * 
 * Java Interface is a collection of abstract methods and constants
 * An abstract method is a method header without a method body
 * Since all the methods in an interface 
 * 
 * Objects of Interface cannot be created
 * Interface must be implemented
 * Interface shows the design...
 * Interfaces provide a mechanism of declaring methods without any implementation code
 * Use of interfaces reduces "coupling" and allows independent development of different parts of a system
 * 
 * 
 * Use or interfaces is an alternative to class based inheritance, and allows looser coupling of implementation code
 * Achieved by using implements keyword after the class name that is implementing the Interface
 * 
 * keyword used: Interface, implements
 * @author prashantsingh.basnet
 *
 */
public class Driver {
	
	public static void main (String [] args) {
		
		/**Interface Examples**/
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.writeMessage();
		consoleLogger.logMessage("This is for test");
		
		
		//Since both of these classes implement the same interface
		//object type is MessageLogger
		MessageLogger msgLogger = new ConsoleLogger();
		MessageLogger detailLogger = new DetailLogger();
		
		
		//Examples of Interaces in Java API
		//Comparable Interface
		
		
		
		
		
	}

}
