package iteratingCollectionElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ForLoop {

	public static void main(String[] args) {

		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

		Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister));

		// for(GenericType variable where fetched value is assigned : collection of room iterated through)
		for (Room room : rooms) {
			
			System.out.println(room.getName());
	
		}
		
	
		

	}
}
