package iteratingCollectionElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ConcurrentModificationException {
	
	public static void main(String[] args) {
	
	Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
	Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
	Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
	Room oxford = new Room("Oxford", "Premiere Room", 4, 200.00);

	Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister, oxford));
	oxford.setPetFriendly(true);
	
	//Concurrent modification exception is thrown while the underlying collection is modified while iterating throught it
	//Triggered when we try to add, remove or change the collection inside of a loop
	//Thrown for single threaded code
	for (Room room : rooms) {	
	//	rooms.remove(room); //modifying collection will lead into Concurrent modification exception
	}
	
	
	//Solution 1:
	//Collect the element that you want to remove in new collection
	Collection<Room> removeRooms = new ArrayList<>();
	for (Room room: rooms) {	
		if(room.isPetFriendly()) {
			removeRooms.add(room);
		}
	}
	
	rooms.removeAll(removeRooms);
	
	rooms.stream()
		.forEach(r->System.out.println(r.getName()));
	

	
	//Solution 2: 
	Iterator<Room> iterator = rooms.iterator();
	
	while (iterator.hasNext()) {
		
		Room room = iterator.next();
		
		if (room.isPetFriendly()) {
			iterator.remove();
		}
	}
	
	}

}
