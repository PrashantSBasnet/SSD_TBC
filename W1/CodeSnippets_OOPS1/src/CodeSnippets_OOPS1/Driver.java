package CodeSnippets_OOPS1;
public class Driver {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Abc");
		person.setAddress("Thapathali");
		person.setId(1); //accessing private variable thru public getters/setters -- Encapsulation
		person.setAge(25);
		System.out.println(person.toString());
		
		
		
		//via constructor
		Employee employee = new Employee(1, "Ram");
		System.out.println(employee.toString());
		
		//parent's methods via child class
		employee.drinkWater();
		employee.haveLunch();
		
		//child class
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "NewEmployee", "Software Engineer");
		System.out.println(fullTimeEmployee.toString());
		
		//overridden method call
		fullTimeEmployee.haveLunch();
		fullTimeEmployee.drinkWater(); //will get parent's method because not @Override
		
		
		/**Interface Examples**/
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.writeMessage();
		consoleLogger.logMessage("This is for test");
		
		
		/**Abstract class Example **/
		Circle circle = new Circle (6.0);
		circle.displayInfo(); //inheritance
		System.out.println("Circle Area:" + circle.calculateArea());

	}

}
