package Abstraction;


public class Circle extends AbstractShape{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius *radius;
	}
}