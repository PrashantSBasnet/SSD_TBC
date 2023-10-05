package iteratingCollectionElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


//Lambda is a function that only has parameters, an arrow and a body. 
//Method name or return types are unnecessary
public class LamdaExpression {
	
	public static void main(String[] args) {
		
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		Room oxford = new Room("Oxford", "Premiere Room", 4, 200.00);

		Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister, oxford));
		oxford.setPetFriendly(true);
		westminister.setLuxury(true);
		
		
	
		//Lambda example
		
		rooms.stream()
			.filter(room-> room.isPetFriendly())
			.forEach(room-> System.out.println(room.getName()));;
		
//		//Method Reference
//		rooms.stream()
//			.filter(Room::isLuxury)
//			.forEach(room-> System.out.println(room.getName()));;
		
	}
}
