package Interface;

/**
 * 
 * Interface is not a class, it is a blueprint for a class
 * It specifies set of methods that the class must implement
 * It has no constructors
 * A class can implement multiple interfaces, unlike a class inheritance
 * All the methods are by default public 
 * Objects of Interface cannot be created
 * Interface must be implemented
 * Interface shows the design...
 * 
 * @author prashantsingh.basnet
 *
 */
public interface InfoLogger {

	void maintainInformation();
	
	
	/**Variables in Interface are final and static
	 * Interfaces do not have own memory in heap therefore "final"
	 */
	int age =26;
	String area = "Kathmandu";
	
}
