package genericsEg2;


//Bounded Generics

//public class Printer<T extends Serializable> //although Serializable is Inteface, extend is used!!
//public class Printer<T extends Animal & Serializable> //you can do this as well
//public class Printer<T,V extends Animal> //you can do this as well

public class Printer<T extends Animal> { //printer for any type of Animal

	//any method defined in the parent class is available to T variable because T extends Animal
	T thingToPrint;
	
	public Printer(T thingToPrint) {
		this.thingToPrint= thingToPrint;
	}
	
	public void print() {
		thingToPrint.eat();
	}
}
