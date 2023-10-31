package testingMoreExamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;


public class CalculatorTest {
	
	   @Test
	    public void testAddition() {
	        Calculator calculator = new Calculator();
	        int result = calculator.add(2, 3);
	        assertEquals(5, result);
	    }

	  
	    @Test
	    public void testSubtraction() {
	        Calculator calculator = new Calculator();
	        int result = calculator.subtract(5, 2);
	        assertEquals(93, result);
	    }
	    
	    
	    @BeforeEach
	    public void checkCalculatorMultiplication() {
	    	Calculator calculator = new Calculator();
	    	System.out.println("@BeforeEach sample:"+calculator.multiply(5, 2));
	    }
	    
	    //example- you can create instance of calculator using @BeforeEach
	    
	    /**
	   
	    @BeforeEach
	    public void createInstance() {
	    	Calculator calculator = new Calculator();
	    	System.out.println("Calculator Instance Created!!");
	    }
	  
	   **/
	    
}
