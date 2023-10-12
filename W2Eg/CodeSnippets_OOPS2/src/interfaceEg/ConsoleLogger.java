package interfaceEg;

public class ConsoleLogger implements InterfaceMessageLogger{

	@Override
	public void logMessage(String message) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void  writeMessage() {
		System.out.println("Default method of InterfaceMessageLogger overriden");
	}
}
