package Inheritance;

public class FullTimeEmployee extends Employee {
	
	String jobTitle;
	
	/*
	 * Constructors are not inherited, even though they have public visibility
	 * Problem: How can we set up parent's part of the object? 
	 * Solution: By using "super" reference.
	 * "Super" reference can be used to refer to the parent class, and often is used to invoke the parent's constructor
	 */
	
//	//super because you cannot have FullTimeEmployee without having an Employee
//	FullTimeEmployee(int id, String name) {
//		super(id, name); //creating Employee
//	}
	
	//also adding jobTitle
	FullTimeEmployee(int id, String name, String jobTitle) {
		super(id, name); //creating Employee
		this.jobTitle=jobTitle; //for FullTimeEmployee class
	}

	//Overridden parents toString Method
	@Override
	public String toString() {
		return "FullTime Employee [id=" + id + ", name=" + name + ", jobTitle=" +jobTitle+"]";
	}
	
	
	@Override
	public void haveLunch() {
		System.out.println("FullTimeEmployee is having lunch");
	}
	
	//in this case you will get that of Parent as it is in the 
	void referParentUsingsuper() {
		 super.drinkWater();
	}
	

}
