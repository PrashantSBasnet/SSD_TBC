package sets;

import java.util.HashSet;
import java.util.Set;


/**
 * A set is a collection that does not allow duplicates elements to be stored
 * It has only two additional methods than Collection Interface: 
 * @author prashantsingh.basnet
 */
public class Driver {
	
	public static void main(String args[]) {
		
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		Room oxford = new Room("Oxford", "Premiere Room", 4, 200.00);
		
		Set<Room> rooms = new HashSet<>();
		rooms.add(westminister);
		rooms.add(piccadilly);
		rooms.add(oxford);
		rooms.add(oxford);
		
		for(Room x: rooms) {
			System.out.println(x);
		}
		
		
	}

}


