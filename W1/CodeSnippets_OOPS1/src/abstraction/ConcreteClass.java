package abstraction;

public class ConcreteClass extends AbstractClassB{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		System.out.println("ConcreteClass");
		
	}

	//since AbstractClassB inherits the abstract class AbstractClassA, the concrete class must provide implementations
	//...for the abstract methods from both the abstract classes
	

}
