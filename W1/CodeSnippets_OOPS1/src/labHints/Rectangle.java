package labHints;

public class Rectangle extends Shape {
	
	private int length; 
	private int breadth;

	Rectangle() {
		super(4); //because sides of this shape is 4
	}

	@Override
	public int getArea() {
		return length*breadth;
	}

}
