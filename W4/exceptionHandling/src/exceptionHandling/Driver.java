package exceptionHandling;

/**
 * Exception is an object that can be thrown and indicate conditions that an app
 * might want to catch 
 * 
 * Types of Exception
 * 1. User Defined Exception
 * 2. Built-in Exception
 * 
 * Built-in Exception are of these types:
 * 
 *  Checked Exception 												Unchecked Exceptions
 *   -Checked at compile time 										-Runtime exceptions 
 *   -Need to be defined in method header or handled				-A short amount of text header or handled 
 *   -Recoverable													-NullPointerException (NPE) 
 * eg --IOExceptions -> FileNotFoundException
 * 	  --InterruptedExceptions
 *    --InstantiationException
 *    --SQLException
 *    --ClassNotFoundException	
 * 
 * Error 
 * -Subset of throwables 
 * -Indicates serious problems in application 
 * -Should not be caught or handled 
 * -Unchecked throwables -Common errors: IOError
 *
 * eg.-- Virtual Machine Error, Assertion Error
 *  
 *  VirtualMachineError
 * -Unrecoverable input/output error 
 * -Indicates running out of resource for JVM 
 * -Serious issue with underlying file system 
 * -Internal
 *  Error, Unknown Error, Out of Memory Error, Stack Overflow Error(commonly recursion will lead into it)
 * 
 * 
 * try-catch Block: blocks are used to catch and handle exceptions 
 * that occur within a specific block of code. 
 * 
 * throws Exception: public void example() throws Exception{....} 
 * - when you want to signal that a method may encounter exceptions but leave the responsibility for handling those exceptions to the caller.
 * - This is often done when you want to maintain a clean separation of concerns and error-handling responsibilities. 
 * - If an exception occurs within the method, it will not be caught within the method itself. Instead, the caller of the method will be responsible for handling the exception or
 *   declaring it to be thrown further up the call chain. 
 * - Declaring a method to throw a generic Exception provides little information about the specific types of exceptions that might occur, which can make it harder for callers to handle them appropriately.
 * 
 * @author prashantsingh.basnet
 *
 */
public class Driver {
	public static void main(String[] args) {

		/** Checked Exception **/
		// StackOverflowExample.recursiveMethod(10);
		// StackOverflowFixed.recursiveMethod(10);

		// IOExceptionExample.ioExceptionExample();

		// FileNotFoundExceptionExample.fileNotFoundException();

		/** ------------------------------------------------------ **/

		/**
		 * Unchecked Exception 
		 * RunTime 
		 * NullPointerException (NPE): 
		 * calling an action on a null object NumberFormatException: attempting to convert a character like "b" to a number ArithmeticException: invalid math operation like dividing by 0
		 */

		// NullPointerExceptionExample.nullPointer();

		/** handling exception in the calling method*/
		try {
			ArithmeticExceptionExample.divide(4,0);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
	

		/** ----- */
		// HandleMultipleExceptions.handleMultipleException();
		// MethodSignature methodSignature = new MethodSignature();
		// methodSignature.anotherMethod();
	}

}
