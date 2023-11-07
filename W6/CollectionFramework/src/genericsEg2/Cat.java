package genericsEg2;

public class Cat extends Animal {
	
	private int age;

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
	
	
	public Cat(){
		System.out.println("Cat from constructor!!");
	}
	
	

}
