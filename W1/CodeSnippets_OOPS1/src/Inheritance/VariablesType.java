package Inheritance;

public class VariablesType {
	
	/**
	 * Instance Variables (Non-Static Fields)
	 * they belong to an instance of a class (an object)
	 * each object of the class has its own set of instance variables
	 * declared within a class but outside of any method, constructor, or block
	 */
	int instanceVar;
	
	/**
	 * Values that are not initialized explicitly at the class level are implicitly initialized as: 
	 * 0- int, long, and short
	 * 0.0- float, double
	 * False- Boolean
	 * Null- reference types
	 */
	
	/**
	 * Static Variables (Class Variables)
	 * They are associated with a class rather than with any specific instance of the class
	 * They are declared using 'static' keyword 
	 * They are shared among all the instances of the class
	 */
	static int staticVar;
	
	
	/**
	 * Final Variables (Constants)
	 * declared using 'final' keyword
	 * cannot be changed once they are assigned a value
	 * often used to create constants
	 */
	
	final int MY_CONSTANT =42;
	
	/**
	 * Method with return type - return the object or null
	 * Method with void - not allowed to return anything
	 * Variables declared inside the method must be initialized before using them
	 * Unlike class variables or class instance variables, variables inside methods are not initialized automatically
	 */
	void exampleMethod() {
		/**
		 * Local Variables
		 * declared within a method, constructor, or block of code
		 * have limited scope and exist only within the block in which they are declared
		 */
		int localVar = 10; 
		
	}
	
}
