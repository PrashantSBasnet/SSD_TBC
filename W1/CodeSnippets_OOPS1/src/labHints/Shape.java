package labHints;

abstract class Shape {
	
	private int sides;
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	
	abstract public int getArea();

	@Override
	public String toString() {
		return "Area" + getArea() + "]";
	}
	
	//Constructor
	Shape(int sides){
		this.sides= sides;
	}
	
	

}
