package labHints;

public class Circle extends Shape{
	
	private int radius;

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int)(Math.PI *radius *radius);
	}

	@Override
	public String toString() {
		return "Circle Area:" + getArea() + "]";
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void hello() {
		
	}
	
	Circle() {
		super(1);
	}
	
	

	
	

}
