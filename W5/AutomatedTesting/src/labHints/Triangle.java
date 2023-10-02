package labHints;

public class Triangle {
	
	private int sideA;
	
	private int sideB;
	
	private int sideC;
	
	
	public boolean isIsoceles() {
		return (sideA == sideB && sideA!=sideC) || (sideB==sideC && sideB!=sideA)|| (sideC ==sideA && sideC!=sideB);
	}
	
	public boolean isEquilateral() {
		return (sideA ==sideB && sideA ==sideC);
	}
	
	public boolean isScalene() {
		return (sideA == sideB && sideA == sideC);
	}
	
	
	public void setSides (int a, int b, int c) {
		sideA = Math.abs(a);
		sideB = Math.abs(b);
		sideC = Math.abs(c);
	}
	
	//for Scalene triangle
	public void setSides(int length, int other) {
		sideA = sideB = Math.abs(length);
		sideC = Math.abs(other);
	}
	
	
	//copy of the triangle
	public Triangle copy() {
		return new Triangle(sideA, sideB, sideC);
	}
	
	/**
	 * Constructor
	 * 
	 * Creates a triangle with each side set to a given value
	 * @param a length of side A
	 * @param b length of side B
	 * @param c length of side C
	 */
	public Triangle (int a, int b, int c) {
		sideA = Math.abs(a);
		sideB = Math.abs(b);
		sideC = Math.abs(c);
	}
	
	/**
	 * constructor
	 * Creates an equilateral triangle with all sides set to 1
	 */
	public Triangle() {
		sideA =sideB= sideC =1;
	}
	
	
	/**
	 * Constructor
	 * 
	 * Creates an equilateral triangle with all sides set to the given length
	 * @param length the length of side A,B and C
	 */
	public Triangle(int length) {
		sideA= sideB= sideC = Math.abs(length);
	}

	
	/**
	 * Calculates the total length of all the sides
	 * @return the total length of all the sides
	 */
	public int getParameter() {
		return sideA+sideB+sideC;
	}
	
	/**
	 * Calculates the average length of the sides
	 * @return the average length of the sides an an integer
	 */
	public int getAverageLength() {
		return sideA+sideB+sideC /3;
	}
}
