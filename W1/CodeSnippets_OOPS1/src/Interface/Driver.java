package Interface;

public class Driver {
	
	public static void main (String [] args) {
		
		/**Interface Examples**/
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.writeMessage();
		consoleLogger.logMessage("This is for test");
		
		
		//Since both of these classes implement the same interface
		//object type is MessageLogger
		MessageLogger msgLogger = new ConsoleLogger();
		MessageLogger detailLogger = new DetailLogger();
		
	}

}
