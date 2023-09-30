package testingMoreExamples;

public class Calculator {

	
	public static void main (String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(3, 4));
		System.out.println(calculator.subtract(5, 2));
	}
	
	int add(int x, int y) {
		return x+y;
	}
	
	int subtract(int x, int y) {
		return x-y;
	}
}
