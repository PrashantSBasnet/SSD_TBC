/**
 * package name: javaDocSample
 * package is a mechanism for organizing related classes and interfaces into a single unit
 */
package javaDocSample;
/**
 * Driver class with main method
 * @author prashantsingh.basnet
 *
 */
public class Driver {

	/**
	 * When you run a Java program, the Java Virtual Machine (JVM) looks for the main method in the specified class and starts the execution from there. 
	 * (String[] args) parameter list that allows you to pass command-line arguments to your Java program
	 * @param args parameter is an array of strings, where each element represents a command-line argument passed to the program when it is executed
	 * Note for Command-line arguments: for example, java HelloWorld arg1 arg2 command would be an array containing ["arg1", "arg2"]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	 * @param x integer input given to the add method to be added
	 * @param y integer input given to the add method to be added 
	 * @return returns integer sum of two integer inputs
	 */
	public int add(int x, int y) {
		return x+y;
	}

}
