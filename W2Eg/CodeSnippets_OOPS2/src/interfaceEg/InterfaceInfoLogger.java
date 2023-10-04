package interfaceEg;


public interface InterfaceInfoLogger {

	void maintainInformation();
	
	
	/**Variables in Interface are final and static
	 * Interfaces can contain constant
	 * Interfaces do not have own memory in heap therefore "final"
	 */
	int age =26;
	String area = "Kathmandu";
	
	final double PI = 3.14; //constant value
	
}
