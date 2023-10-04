package interfaceWorking;

public class Implementation implements Contract{

	@Override
	public void term1() {
		System.out.println("Impelemtation:term1");
	}

	//because the implementation class needs the method that is inherited via interface inheritance
	@Override
	public void extendedTerm() {
		System.out.println("Implementation:extended");
		
	}

}
