package foundationsCollection;

public class Room {
	
	private String name;
	
	private String type;
	
	private int capacity;
	
	private double rate;
	
	public Room(String name, String type, int capacity, double rate) {
		this.name=name;
		this.type=type;
		this.capacity=capacity;
		this.rate=rate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(int rate) {
		this.rate=rate;
	}

}
