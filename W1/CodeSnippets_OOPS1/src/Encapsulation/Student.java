package Encapsulation;


/**
 * A Java class which is a fully encapsulated class.  
 * It has a private data member and getter and setter methods.
 * @author prashantsingh.basnet
 *
 */
public class Student {
    private String name; // Private data field
    private int age;     // Private data field
    
    

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 0");
        }
    }
}
