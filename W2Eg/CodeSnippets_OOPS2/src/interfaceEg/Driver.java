package interfaceEg;


/**
 * 
 * Interface is not a class, it is a blueprint for a class
 * Interface are somewhat similar to abstract class
 *  
 * 
 * Interfaces are unable to provide the implementations of any methods
 * --They provide pure abstraction. Implementing classes define the methods they have implemented. Polymorphism
 * --Multiple inheritance in java is possible through interfaces. if methods implementations are provided by interfaces, it can lead into ambiguity
 * --Encapsulation by forcing implementing classes to provide their own logic. Thus, separation of concerns and Modular programming
 * Classes do not extend Interfaces, they implement them
 * 
 * It specifies set of methods that the class must implement
 * It has no constructors
 * A class can implement multiple interfaces, unlike a class inheritance
 * 
 * Java Interface is a collection of abstract methods and constants
 * An abstract method is a method header without a method body
 * 
 * Objects of Interface cannot be created
 * Interface must be implemented
 * Interface shows the design...
 * Interfaces provide a mechanism of declaring methods without any implementation code
 * Use of interfaces reduces "coupling" and allows independent development of different parts of a system
 * 
 * Use or interfaces is an alternative to class based inheritance, and allows looser coupling of implementation code
 * Achieved by using implements keyword after the class name that is implementing the Interface
 * 
 * 
 * Interfaces -Rules 
 * 1. Public interface should be defined in a file matching the interface name
 * 2. Members of interface are implicitly abstract and public
 * 3. Access modifiers can be explicitly added
 * 4. If modifiers are not defined, it is public!
 * 5. 
 * 
 * keyword used: Interface, implements
 * @author prashantsingh.basnet
 *
 */
public class Driver {
	
	public static void main (String [] args) {
		
		/**Interface Examples**/
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.logMessage("This is for test");
		
		DetailLogger dl = new DetailLogger ();
		dl.writeMessage();
		
		
		//Since both of these classes implement the same interface
		//object type is MessageLogger
		InterfaceMessageLogger msgLogger = new ConsoleLogger();
		InterfaceMessageLogger detailLogger = new DetailLogger();
		
		
		
		//Examples of Interfaces in Java API
		//Comparable Interface
		
		
		
		
		
	}

}
