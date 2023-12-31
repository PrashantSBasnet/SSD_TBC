package inheritance;

public class Person {

	private int id;  //only accessible in Person class (-)
	protected int age; //accessible in package or outside of the package through child class (inherited class)

	public String address; //accessible everywhere (+)
	String name; //default -> accessible in this package 
	
	
	/**
	 * --getter and setters -- auto generated
	 */
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", address=" + address + ", name=" + name + "]";
	}
	
	
	/**from Object**/
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//methods 
	
	public void haveLunch() {
		System.out.println("Person Class haveLunch()");
	}
	
	public void drinkWater() {
		System.out.println("Person Class drinkWater()");
	}
	
	
	
	//static method in base class that will be hidden in derived class
	public static void staticMethod() {
		System.out.println("Person class static method");
	}
	
	/**
	 * constructors do not create objects
	 * they initialize objects
	 * constructor is called when an object of a class is created 
	 * they set initial values for object attributes
	 * 
	 * Person(){
	 * }
	 */
}
