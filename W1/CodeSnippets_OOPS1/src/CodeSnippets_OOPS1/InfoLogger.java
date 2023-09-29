package CodeSnippets_OOPS1;

/**
 * 
 * @author prashantsingh.basnet
 * Interface is not a class
 * All the methods are by default public 
 * Objects of Interface cannot be created
 * Interface must be implemented
 * Interface shows the design...
 *
 */
public interface InfoLogger {

	void maintainInformation();
	
	
	/**Variables in Interface are final and static
	 * Interfaces do not have own memory in heap therfore "final"
	 */
	int age =26;
	String area = "Kathmandu";
	
}
