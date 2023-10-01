package Polymorphism;

public class PolymorphismTypes {
	
	

	/**compile time **/
	    public int sum(int a, int b, int c) {
	        return a + b + c;
	    }

	    public int sum(int x, int y) {
	        return x + y;
	    }
	    
	    
	    public int multiply(int a, int b) {
	        return a + b;
	    }

	    public double multiply(double x, double y) {
	        return x * y;
	    }
	    
	    
	    /**run time is achieved via Inheritance */
	    void exampleRunTimePolymorphism() {
	    	PolymorphismExample polymorphismExample = new PolymorphismExample();
	    	polymorphismExample.viaInheritance(); //check this example
	    }
	    
	}


