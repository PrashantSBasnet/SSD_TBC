package objectComparison;

/***
 * Comparison-Based Methods
 * boolean contains(Object o)
 * boolean containsAll(Collection<? extends E> c)
 * boolean remove(E e)
 * boolean removeAll(Collection<?> c)
 * boolean retainAll(Collection<?> c)
 * 
 * Identity (o1==o2) 
 * -We check to see if the two objects have references to the same object in memory
 * -Determines if two objects are the same object, meaning they are the same object in memory
 * -Relies on memory reference
 * -E.g. Two person sharing a single car
 * 
 * Value (o1.equals(o2))
 * -Determines if two objects are logically equivalent, meaning they are equal in value
 * -It relies on the field values instead of their memory addresses
 * -E.g. Two person with their own cars of same make and model
 *
 */
public class Example {
	
	public static void main (String [] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		//to check whether two objects refer to same memory location
		System.out.println(str1==str2);
		System.out.println("Equals"+str1.equals(str2));
		
		String str3= "hello";
		System.out.println(str3=="hello");
		System.out.println("Equals"+str3.equals("hello"));
		
		String str4= new String("hello");
		System.out.println(str3==str4);
		System.out.println("Equals"+str3.equals(str4));
		
		
		
		CustomClass customClass = new CustomClass();
		customClass.areEqual();
}	
}
