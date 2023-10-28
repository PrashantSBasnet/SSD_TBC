package uml;

public class CompositionExample {
	
	public static void main(String[] args) {
		
		Building house = new Building();
        
		house.addRoom("Living Room");
        house.addRoom("Kitchen");
        house.addRoom("Bedroom");
	}

}
