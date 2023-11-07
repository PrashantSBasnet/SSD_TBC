package exceptionHandling;


public class Driver {
	public static void main(String[] args) {

		/** Checked Exception **/
		// StackOverflowExample.recursiveMethod(10);
		// StackOverflowFixed.recursiveMethod(10);

		// IOExceptionExample.ioExceptionExample();

		 FileNotFoundExceptionExample.fileNotFoundException();

		

	

		/** handling exception in the calling method*/
		try {
			//ArithmeticExceptionExample.divide(4,0);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
	

		/** ----- */
		// HandleMultipleExceptions.handleMultipleException();
		// MethodSignature methodSignature = new MethodSignature();
		// methodSignature.anotherMethod();
		
		
		/** ------------------------------------------------------
		 * ------------------------------------------------------
		 */
		
		/**
		 * Unchecked Exception 
		 * RunTime 
		 * NullPointerException (NPE): 
		 * calling an action on a null object NumberFormatException: attempting to convert a character like "b" to a number ArithmeticException: invalid math operation like dividing by 0
		 */

		// NullPointerExceptionExample.nullPointer();
	}

}
