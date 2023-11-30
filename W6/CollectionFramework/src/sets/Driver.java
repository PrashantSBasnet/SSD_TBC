package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


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
		
		//List<String> lsexample = new List<String>();
		List<String> lsexample2 = new ArrayList<>();

		//Set<String> stExample = new Set<String>();
		
		Set<String> stEg = new HashSet<>();
		Set<Double> stEg2 = new LinkedHashSet<>();
		Set<Integer> stEg3 = new TreeSet<>();
		
		
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


