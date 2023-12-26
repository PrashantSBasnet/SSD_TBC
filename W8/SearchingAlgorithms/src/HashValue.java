/*
 * The hashCode() method in Java returns a 32-bit signed integer (int).
 * The range of possible hash code values is from Integer.MIN_VALUE to Integer.MAX_VALUE, inclusive. 
 * These constants are defined in the Integer class as -2147483648 and 2147483647, respectively.
 *
 * == (Equality Operator):
 * Used to compare the references (memory addresses) of two objects.
 * Returns true if the references point to the same object in memory.
 * Returns false if the references point to different objects, even if the objects have the same content.
 *
 * .equals() Method:
 * Defined in the Object class and can be overridden by classes to provide a custom implementation for object comparison.
 * Default implementation in the Object class compares object references (similar to ==).
 * Often overridden in classes like String, Integer, and others to compare the contents of the objects rather than their references.
 *
 * Two equal objects have equal hash codes ("hash code contract") but the vice versa is not necessarily true
 * If two objects are equal according to the equals(Object) method, then calling the hashCode() method on each of the two objects must produce the same integer result.
 *
 * While equal objects must have equal hash codes, the reverse is not necessarily true. 
 * That is, two objects with equal hash codes are not required to be equal. 
 * This situation is known as a hash code collision, and it is a normal occurrence due to the finite range of hash codes (32-bit integers) compared to the potentially infinite number of distinct objects. Good hash functions aim to minimize collisions, but they cannot eliminate them entirely.
 */
public class HashValue {
	
	public static void main(String[] args) {
		String x = "apple";
		String y = "apple ";
		String z = "apple";
		String k = new String("apple");
		
		
		//based on memory addresses
		System.out.println(x==y);
		System.out.println(x==z);
		System.out.println(x==k);
		
		
		//based on content
		
		int hashCodeval = x.hashCode();
		
		System.out.println(hashCodeval);
		System.out.println(y.hashCode());
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(k));
		
		System.out.println(x==k); //different memory location --gives false
		System.out.println(x.equals(k)); //same content --gives true
	}

}
