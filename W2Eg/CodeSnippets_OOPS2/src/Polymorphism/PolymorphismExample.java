package Polymorphism;

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
		
		dog.makeSound();
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
	
	
	/**Static Binding //static binding/method overriding/compile time binding/println is overridden as it is in Object**/

	
	
	
   /** 
     * Dynamic Binding
     * The method to be called is determined at runtime based on the actual object's type.
     * Dynamic binding is used when method overriding is involved, allowing subclasses to provide their own implementations of methods declared in a superclass.
     * It is also referred to as runtime binding because the binding occurs when the program is executing.
     * It allows more flexibility and polymorphic behavior in the object oriented programming 
     */
		

}








