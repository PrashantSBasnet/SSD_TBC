package Encapsulation;


/**
 * 
 * Encapsulation in Java is a process of wrapping code and data together into a single unit
 * 
 * We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.
 * 
 * Advantages of Encapsulation:
 * -The fields of a class can be made read-only or write-only.
 * -A class can have total control over what is stored in its fields.
 * -It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
 * -It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
 * -The encapsulate class is easy to test. So, it is better for unit testing.
 * @author prashantsingh.basnet
 *
 */
public class Driver {
	public static void main (String[] args) {
		
		//creating instance of the encapsulated class  
		Student student = new Student("NameOfStudent", 26);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		student.setAge(26);
		System.out.println(student.getAge());
		
		
		//Accessing Read Only Class
		Teachers teachers = new Teachers();
		System.out.println(teachers.getCollege());
		
	}

}
