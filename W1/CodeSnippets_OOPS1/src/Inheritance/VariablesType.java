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
	
	
	void exampleMethod() {
		/**
		 * Local Variables
		 * declared within a method, constructor, or block of code
		 * have limited scope and exist only within the block in which they are declared
		 */
		int localVar = 10; 
	}
	
	

}
