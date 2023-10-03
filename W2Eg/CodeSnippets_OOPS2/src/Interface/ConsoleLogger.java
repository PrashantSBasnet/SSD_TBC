package Interface;

public class ConsoleLogger implements InterfaceMessageLogger{

	@Override
	public void logMessage(String message) {
		System.out.println("Console logger message");
		
	}
}
