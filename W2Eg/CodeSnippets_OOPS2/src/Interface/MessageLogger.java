package Interface;

/**
 * Unlike Abstract class, Interface can have method body provided "default" modifier is used
 * @author prashantsingh.basnet
 *
 */
public interface MessageLogger {

	void logMessage(String message); //public by default in an Interface
	
	default void writeMessage() {
		System.out.println("writing");
	}
}
