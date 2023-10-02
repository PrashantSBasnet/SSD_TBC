package exceptionHandling;

public class StackOverflowFixed {
	public static void recursiveMethod(int count) {
	       if (count > 0) { // to fix add this condition
	            recursiveMethod(count - 1); // Recursive call with a base case
	        }
	    }

	    public static void main(String[] args) {
	        recursiveMethod(10); // Specify the number of recursive calls
	    }

}
