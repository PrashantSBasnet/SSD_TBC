package Inheritance;

/**
 * OOPS -  Reusability, modularity, and maintainability
 * All classes are derived from the Object class
 * A Class called Object is defined in the java.lang package of the Java standard class library
 * If a class is not explicitly defined to be the child of an existing class, it is assumed to be the child of the object class
 * Object class is the ultimate root of all class hierarchies
 * Some methods of Object class: String toString() boolean equals(Object obj), Object clone ()
 * .toString() is the defined in the Object class and we override it whenever we define the toString method
 * 
 * 
 * Inheritance allows a software developer to develop a new class from an existing one
 * Existing class is called the parent class, or superclass, or base class
 * Derived class is called the child class or subclass
 * Child inherits characteristics(methods and data) of parent class
 * is-a relation 
 * 
 * Java supports single inheritance => Derived class can have only one parent. The mechanism prevents collisions
 * Child class can override the definition of an inherited method or use it as it is
 * 
 * Advantages: 
 * - Software Reuse
 * - A programmer can tailor a derived class, as needed by adding new variables or methods, or by modifying the inherited ones
 * - By using existing software components to create new ones, we capitalize on all the effort that went into the design, implementation, 
 * and testing of the exiting software
 * 
 * 
 * final modifier can be used to curtail inheritance
 * final modifier applied to a method prevents it from being overridden in any descendant classes
 * 
 *  
 *  keyword used: extends
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
		
		System.out.println(person.toString());  
		
		
		//via constructor
		//Employee employee = new Employee(1, "Ram");
		//System.out.println(employee.toString());
		
		//super class methods via sub class
		//employee.drinkWater(); 
		//employee.haveLunch(); 
	
		
		
		//Employee emp2 = new FullTimeEmployee(2, "AnotherEmployee", "DBA"); //Upcasting
	
	    //emp2.haveLunch(); //calls the haveLunch() method of FullTimeEmployee at the run time /dynamic binding /run time
	   
	    /**---------------------------*/
	  
	    //child class
		//FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "NewEmployee", "Software Engineer");
		//System.out.println(fullTimeEmployee.toString());
		
		 
		//fullTimeEmployee.referParentUsingsuper();
		
		
		
		//overridden method call
		//fullTimeEmployee.haveLunch(); 
		//fullTimeEmployee.drinkWater(); //will get parent's method because not @Override
		
		
		/** 
	       * Dynamic Binding
	       * --Method Overriding 
	       * --RunTime
	       * The method to be called is determined at runtime based on the actual object's type.
	       * Dynamic binding is used when method overriding is involved, allowing subclasses to provide their own implementations of methods declared in a superclass.
	       * It is also referred to as runtime binding because the binding occurs when the program is executing.
	       * It allows more flexibility and polymorphic behavior in the object oriented programming 
	       */
			
		
		/**
		 * Static Binding
		 * --Method Overloading
		 * --Compile Time
		 */
		
	}
}
