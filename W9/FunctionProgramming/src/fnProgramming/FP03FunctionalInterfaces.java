package fnProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Functional Interface: Interface with exactly one abstract method
 * @author prashantsingh.basnet
 *
 */
public class FP03FunctionalInterfaces {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		/**
		numbers.stream()
		.filter(x->x%2==0)   //lambda expression
		.map(x->x*x)		 //lambda expression	
		//.forEach(x->System.out.println(x));  //lambda expression
		.forEach(System.out::println);  //static method reference
		*/
		
		//Predicate -- takes input and results boolean (.filter)
		Predicate<Integer> isEvenPredicate = x->x%2==0;
		
		//the above line of code is represented as
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>(){
			@Override
			public boolean test(Integer x) {
				// TODO Auto-generated method stub
				return x%2==0;			
			}	
		};
		
		
		//Function takes one input and gives one output (.map)
		Function<Integer, Integer> squareFunction = x->x*x;
		
		Function<Integer, Integer> squareFunction2 = new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		
		//accepts an argument and results no return back (.forEach)
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
				System.out.println(x);
				
			}
			
		};
		
		
	    numbers.stream()
		.filter(isEvenPredicate)     //lambda expression
		.map(squareFunction)		 //lambda expression	
		//.forEach(x->System.out.println(x));  //lambda expression
		.forEach(System.out::println);  //static method reference
		
	    
	   
	}
}
