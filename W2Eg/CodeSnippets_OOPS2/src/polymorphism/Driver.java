package polymorphism;

public class Driver {
	
	public static void main (String[] args) {
		
		PolymorphismExample polymorphismEg = new PolymorphismExample();
		
		polymorphismEg.viaInheritance();
		
		polymorphismEg.viaMethodOverriding();
		polymorphismEg.viaInterfaces();
		
		polymorphismEg.viaMethodParametersandReturnTypes();
		polymorphismEg.viaArraysandCollection();
		
		//method overloading -- compile time Polymorphism
		PolymorphismTypes types = new PolymorphismTypes();
		types.sum(2, 3);
		types.sum(4, 5, 4);
		
		types.multiply(2.3, 4.5);
		types.multiply(3, 5);
	
	}
}
