package testingSample;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ProductTest {
	
	@Test
	void inStockTest() {
		Product product = new Product(100,5.26f);
		assertTrue(product.inStock());
	}
	
	@Test
	void outOfStockTest() {
		Product product = new Product (0, 5.26f);
		assertFalse(product.inStock());
	}
	
	@Test
	void stockValueTest() {
		Product product = new Product(0, 5.26f);
		assertEquals(526,product.getStockValue());		
	}
	
	
	
	
	/**assertMethods 
	assertEquals(expected, actual);
	assertNotEquals(unexpected, actual);
	assertSame(expected, actual);
	assertNotSame(unexpected, actual);
	assertTrue(condition);
	assertFalse(condition);
	assertNull(actual);
	assertNotNull(actual);
	assertThrows(expectedType, executable);
	assertTimeout(duration, executable);
	*/
}
