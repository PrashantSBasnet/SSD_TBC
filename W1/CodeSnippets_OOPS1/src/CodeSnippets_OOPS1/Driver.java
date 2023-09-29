package CodeSnippets_OOPS1;
/**
 * OOPS -  Reusability, modularity, and maintainability
 * @author prashantsingh.basnet
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Abc");
		person.setAddress("Thapathali");
		person.setId(1); //accessing private variable thru public getters/setters -- Encapsulation
		person.setAge(25);
		
		/**Static Binding //static binding/method overriding/compile time binding/println is overridden as it is in Object**/
		System.out.println(person.toString());  
		
		
		//via constructor
		Employee employee = new Employee(1, "Ram");
		System.out.println(employee.toString());
		
		//super class methods via sub class
		employee.drinkWater(); 
		employee.haveLunch(); 

       
	   /** 
       * Dynamic Binding
       * The method to be called is determined at runtime based on the actual object's type.
       * Dynamic binding is used when method overriding is involved, allowing subclasses to provide their own implementations of methods declared in a superclass.
       * It is also referred to as runtime binding because the binding occurs when the program is executing.
       */
		
		
		Employee emp2 = new FullTimeEmployee(2, "AnotherEmployee", "DBA"); //Upcasting
		System.out.println("\n");
		System.out.println("----Via Upcasting---");
	    emp2.haveLunch(); //calls the haveLunch() method of FullTimeEmployee at the run time /dynamic binding /run time
	    System.out.println("------------------");
		
	    /**---------------------------*/
	  
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
