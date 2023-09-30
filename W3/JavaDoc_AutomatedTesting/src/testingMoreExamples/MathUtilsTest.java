package testingMoreExamples;

import org.junit.Test;

public class MathUtilsTest {
	
	MathUtils mathUtils = new MathUtils();
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		mathUtils.divide(5, 0);
	}

}
