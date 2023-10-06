package inheritance;

public class Employee extends Person{
	
	public int id; 
	public String name; 
	
	//Constructor
	//Constructor does not create an object. It initializes the state of the object. 
	//Constructor cannot be: static, synchronized, abstract or final
	//If no constructor created, java compiler calls the default constructor Example: Employee(){}
	
	Employee(int id, String name){
		this.id = id; 
		this.name= name;
	}
	
	//Constructor overloading
	Employee(String x, int y, double z){		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void drinkWater() {
		System.out.println("Employee Class drinkWater()");
	}
	
	public void doWork() {
		System.out.println("Employee Class doWork()");
	}
	
	//@Override is not allowed because static methods are bonded at compile time
	//this is not method inheriting. we are creating a static method with the same name
	//this is method hiding
	public static void staticMethod() {
		System.out.println("Employee Class Static Method");
	}
	
}
