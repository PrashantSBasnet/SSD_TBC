package CodeSnippets_OOPS1;

public class FullTimeEmployee extends Employee {
	
	String jobTitle;

	//super because you cannot have FullTimeEmployee without having an Employee
	FullTimeEmployee(int id, String name, String jobTitle) {
		super(id, name); //creating Employee
		this.jobTitle=jobTitle; //for FullTimeEmployee class
	}

	//Overridden parents toString Method
	@Override
	public String toString() {
		return "FullTime Employee [id=" + id + ", name=" + name + ", jobTitle=" +jobTitle+"]";
	}

	
	
	
	

}
