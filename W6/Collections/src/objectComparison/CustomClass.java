package objectComparison;

public class CustomClass {
	
	String name; 
	int age;
	
	public CustomClass() {
	}
	
	public CustomClass(String string, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	
	void areEqual() {
		CustomClass person1 = new CustomClass("Ram", 32); //initializes the class
		CustomClass person2 = new CustomClass("Ram", 32); //initializes the class
		boolean areEqual = person1.equals(person2);
		System.out.println("Before overriding .equal(): "+ areEqual);

	}
	
}

