import java.util.Objects;

public class Person {
    
	private String name;
    private int age;

    Person (String name, int age){
    	this.name=name; 
    	this.age=age;
    }

    /*
     *  This implementation adheres to best practices for implementing the equals() method.
     *  It considers both reference equality and content equality, handles null values, and ensures proper type checking. 
     *  Additionally, using Objects.equals() for comparing objects allows for proper handling of null values, which is a good practice to avoid potential NullPointerExceptions.
     */
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) return true;  //reference check
        
        if (obj == null || getClass() != obj.getClass()) return false; //Check if the object to compare (obj) is null or of a different class. If so, the objects are not equal.
        
        Person person = (Person) obj; //Type Casting
        
        return age == person.age && Objects.equals(name, person.name); //Filed Comparison: Compare the individual fields for equality. 
        // In this case, it compares the age field using == and the name field using Objects.equals() to handle null values.
    }

    
    /*
     * hashCode() method is overridden to generate a hash code based on the name and age fields using Objects.hash().
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    
    public static void main(String[] args) {
        // Creating instances of Person
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Alice", 30);

        // Testing equals method
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // false

        // Testing hashCode method
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
    }
}
