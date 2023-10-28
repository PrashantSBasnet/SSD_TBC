package uml;

public class Room {
	
	private String roomName;

	public String getRoomNumber() {
		return roomName;
	}

	public void setRoomNumber(String roomName) {
		this.roomName = roomName;
	}
	
	Room(String roomName){
		this.roomName=roomName;
	}
}
