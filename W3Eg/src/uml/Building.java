package uml;

import java.util.ArrayList;
import java.util.List;

//Example of Composition
public class Building {
	
	private String streetAddress;
	
	private List<Room> rooms;  //Building 'IS' Composed of rooms. Room cannot exist independently. COMPOSITION

	public String getstreetAddress() {
		return streetAddress;
	}

	public void setBuildingNo(String streetAddress) {
		this.streetAddress = streetAddress;
		this.rooms = new ArrayList<>();
	}
	
	public void addRoom(String roomNumber) {
        Room room = new Room(roomNumber);
        rooms.add(room);
    }

}
