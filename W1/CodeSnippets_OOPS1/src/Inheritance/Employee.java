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
	

	

}
