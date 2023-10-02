package exceptionHandling;

public class MethodSignature {
	 
	//inner class
	// Define a custom exception class
    static class CustomException extends Exception {
        CustomException(String message) {
            super(message);
        }
    }

    // A method that declares it can throw CustomException
    public void myMethod() throws CustomException {
        // Code that might throw CustomException
        if (someConditionIsMet()) {
            throw new CustomException("An error occurred in myMethod.");
        }
        // Rest of the method
    }


 // A method that calls myMethod and handles the exception
    public void anotherMethod() {
        try {
            myMethod();
        } catch (CustomException e) {
            System.err.println("Caught a CustomException: " + e.getMessage());
            // Handle the exception here
        }
    }

    // Helper method to simulate a condition
    private boolean someConditionIsMet() {
        // Simulate some condition
        return true;
    }

}
