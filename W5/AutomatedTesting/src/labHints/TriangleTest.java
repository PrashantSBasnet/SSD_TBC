package labHints;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {
	
	@Test
	void defaultConstructor() {
		Triangle tri = new Triangle();
		
		assertTrue(tri.isEquilateral());
		//assertFalse(tri.isScalene());  //fails because all equilateral are scalene
		assertFalse(tri.isIsoceles());
	}
	
	@DisplayName("Test that verifies Equilateral triangle.")
	@Test
	void equalConstructor() {

		Triangle tri = new Triangle(10);
		
		assertTrue(tri.isEquilateral());
		//assertFalse(tri.isScalene());  //fails because all equilateral are scalene
		assertFalse(tri.isIsoceles());
	}
	
	
	@ParameterizedTest
	@CsvSource({"1,1,1", "1,2,3", "10,20,30"})
	void testParimeter(int sideA, int sideB, int sideC) {
		Triangle tri = new Triangle();
		
		//Fails 
		assertEquals(sideA+sideB+sideC, tri.getParameter());
		
	}
	
	
	@RepeatedTest(5)
	void TestAveLength(RepetitionInfo repetitionInfo) {
		
		int repCount= repetitionInfo.getCurrentRepetition();
		//System.out.println(repCount);
		Triangle tri = new Triangle(repCount, repCount *2, repCount *3);
		
		//Fails: identifies bug within getAverageLength()
		assertEquals((repCount+repCount *2 +repCount*3)/3, tri.getAverageLength());
	}
	
	
	
	
	

}
