
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor and other methods...
    Person (String name, int age){
    	this.name=name; 
    	this.age=age;
    }

    /**
     * equals() method is overridden to compare the name and age fields of two Person objects.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    /**
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
