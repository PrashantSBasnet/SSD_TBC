package uml;

//Example of Aggregation
//HAS-A relation. Weaker form of relation. 
public class Car {
	
	private String vehicleName;
	
	private Engine engine; //Car Has-A Engine.Engine exits in the absence of the car.   AGGREGATION

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
