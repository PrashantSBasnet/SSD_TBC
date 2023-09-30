package Inheritance;

public class Employee extends Person {
	
	public int id; 
	public String name; 
	
	//Constructor
	Employee(int id, String name){
		this.id = id; 
		this.name= name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	//super keyword can be used to refer to the parent class, even if no object of the parent exists
	void referToParentUsingsuper() {
		super.drinkWater();
	}

	

}
