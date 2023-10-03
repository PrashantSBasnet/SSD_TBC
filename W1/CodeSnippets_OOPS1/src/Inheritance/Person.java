package Inheritance;

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
}
