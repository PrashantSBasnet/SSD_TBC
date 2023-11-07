package genericsEg2;

public class Dog extends Animal{

	int walkingDistance;
	
	@Override
	public void eat() {
		System.out.println("dog is eating...");
	}
	
	public Dog(){
		System.out.println("Dog from constructor!!");
	}
}
