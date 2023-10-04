import java.util.Collection;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
	Room kathmandu = new Room("Kathmandu", "Premium", 4, 150.00);
	Room lalitpur = new Room("Lalitpur", "Suite", 5, 250.0);
	Room bhaktapur = new Room ("Bhaktapur", "Guest Room", 3, 125.0);
	
	double total = getPotentialRevenue(kathmandu, lalitpur);
	
	//size should be known upfront while using array
	Room[]  arrayRooms = new Room[2]; 
	arrayRooms[0]=kathmandu;
	arrayRooms[1]=lalitpur;
	arrayRooms[2]=bhaktapur;
	
	
	//using collection, the steps are simplified. getPotentialRevenue2() doesn't require refactoring
	Collection<Room> collectionRooms = List.of(kathmandu, lalitpur);
	
	System.out.println(total);
	
	}

	private static double getPotentialRevenue(Room room1, Room room2) {
		return room1.getRate() + room2.getRate();
	}
	
//	private static double getPotentialRevenue2(Collection<Room> rooms) {
//		return rooms.stream().mapToDouble(r->r.getRate()).sum();
//	}
}

