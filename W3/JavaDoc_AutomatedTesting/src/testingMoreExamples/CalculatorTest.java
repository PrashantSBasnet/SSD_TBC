package testingMoreExamples;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

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
	        assertEquals(3, result);
	    }

	    
}
