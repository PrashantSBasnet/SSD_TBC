package Interface;

public class ConsoleLogger implements MessageLogger{

	@Override
	public void logMessage(String message) {
		System.out.println("Console logger message");
		
	}
}
