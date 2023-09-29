package CodeSnippets_OOPS1;

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

}


/**example1*/
class Animal {

	 void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
}

class Dog extends Animal {
   @Override
   void makeSound() {
       System.out.println("Dog barks");
   }
}


class Cat extends Animal{
	 @Override
	    void makeSound() {
	        System.out.println("Cat meows");
	    }
}


/**example2*/
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
    	return a+b;
    }
    
}