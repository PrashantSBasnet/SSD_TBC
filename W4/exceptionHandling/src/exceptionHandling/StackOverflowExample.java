package exceptionHandling;

public class StackOverflowExample {
	/**
	 * StackOverflowError
	 * Type of VirtualMachineError indicating that, in the JVM, the stack for the application 
	 * has overflowed
	 * 
	 * More commonly, Recursion in programming leads to it
	 */
	  
		public static void recursiveMethod(int count) {
	            recursiveMethod(count - 1); // Recursive call with a base case
	    }

	    public static void main(String[] args) {
	        recursiveMethod(10); // Specify the number of recursive calls
	    }

}
