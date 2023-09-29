package CodeSnippets_OOPS1;

public interface MessageLogger {

	void logMessage(String message); //public by default in an Interface
	
	default void writeMessage() {
		System.out.println("writing");
	}
}
