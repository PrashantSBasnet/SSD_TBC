package iteratingCollectionElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamsExample {
	
	public static void main(String[] args) {
		
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		Room oxford = new Room("Oxford", "Premiere Room", 4, 200.00);

		Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister, oxford));
		oxford.setPetFriendly(true);
		
		
		//Predicate is a Function Interface
		rooms.stream()
			.filter(new Predicate<Room>() {

				@Override
				public boolean test(Room room) {
					return room.isPetFriendly();
				}
				
			}).forEach(new Consumer<Room>() {

				@Override
				public void accept(Room room) {
					System.out.println(room.getName());
				}
				
			});  //terminal operation used to end the pipeline
	}

}
