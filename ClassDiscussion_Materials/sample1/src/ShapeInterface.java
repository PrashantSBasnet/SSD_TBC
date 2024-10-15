import java.util.List;

public interface ShapeInterface {

     //can only have static final variables
     static final String purpose = "Interface cannot have instance variables!!";

     Double getArea();
     Double getPerimeter();


     //Interfaces can have default method with a body
     default String displayPurpose(){
          System.out.println("Hello world!");
          return purpose;
     }


     //this is not allowed in an interface because the method defined in the interface cannot have body
     //unless it is default as shown above!
//      String getName(){
//          System.out.println("Hello world!");
//          return purpose;
//     }


     //try implementing the Serializable interface in Java. It doesn't have any method and is known
     //as marker interfaces and are used to provide metadata about the implementing classes (e.g., Serializable in Java).


     String greetStudents();
}
