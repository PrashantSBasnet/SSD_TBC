package polymorphism;

/**
 * more than one form
 * method overriding -- Run Time Polymorphism
 * method overloading --Compile Time Polymorphism
 * Polymorphism via interfaces 
 * 
 * @author prashantsingh.basnet
 *
 */
public class PolymorphismExample {
	
	
	void viaReferences() {
		Animal animal = new Dog(); //because animal is the parent class //widening conversion
	}

	
	void viaInheritance() {
	
		//Animal superclass in more than one form
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.makeSound(); //dynamic binding
		cat.makeSound();	
	}
	
	
	void viaMethodOverriding() {
		Animal myAnimal = new Dog(); //Upcasting
		myAnimal.makeSound();

	}
	
	void viaInterfaces() {
		//refer Shapes examples
	}
	
	void viaArraysandCollection() {
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();

		for (Animal animal : animals) {
		    animal.makeSound(); // Calls the appropriate makeSound method based on the actual object type.
		}
	}	
	
	
	void viaMethodParametersandReturnTypes() {
	    Calculator calc = new Calculator();
        System.out.println(calc.add(5, 7));      // Calls the int version
        System.out.println(calc.add(5.5, 7.5));  // Calls the double version
	}
	
	

	

   /**Static Binding
      Early Binding/ Compile-time binding
      System.out.println(), the compiler knows at compile time that it's invoking the println method of the PrintStream class.
      It is also known as early binding, occurs when the method to be invoked is determined by the compiler at compile time based on the declared types of variables and references
      Method overloading
      
      Why binding of private, static and final methods are always static binding?
      -because java compiler knows that those methods cannot be ovveriden and will always be referenced by obj reference variables

      In static binding actual objects are not used.
   **/

   /** 
     * Dynamic Binding
     * Late Binding
     * The method to be called is determined at runtime based on the actual object's type.
     * Dynamic binding is used when method overriding is involved, allowing subclasses to provide their own implementations of methods declared in a superclass.
     * It is also referred to as runtime binding because the binding occurs when the program is executing.
     * It is commonly associated with method overriding and polymorphism, where the specific implementation of a method is determined based on the actual type of the object at runtime, not the reference type
     * It allows more flexibility and polymorphic behavior in the object oriented programming 
     * Dynamic binding is not applicable to static methods or methods called on class-level references like System.out

     * Examples: 
       method overriding
       using with Interfaces and polymorphism: Interfaces define a contract and multiple classes can implement that interface with their own implmentations
       'instanceof' operator to check the actual type of an object at runtime before invoking method

       Actual object is used in the dynamic binding.
     */
		

}








