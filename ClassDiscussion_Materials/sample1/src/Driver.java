import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Driver {

    //Driver(){} //default, automatically invoked when the object of the Driver class is made
    private String studentName ="CuriousStudent";
    private int level =5;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //starting point of the program
    public static void main(String[] args) {
        //to access the properties, create an object
        Driver driver = new Driver();
        System.out.println(driver.getStudentName());
        System.out.println(driver.getLevel());

        //changing the value using getter and setter
        driver.setStudentName("FuriousStudent");
        driver.setLevel(6);

        System.out.println(driver.getStudentName());
        System.out.println(driver.getLevel());

        //to access a method, first we need to create an object\


        driver.displayDriverClassProperties(); //you will get the updated value as setters have been invoked already

        Rectangle rectangle = new Rectangle(4, "Rectangle", 4.0, 5.0 );
        System.out.println("***Area "+rectangle.getArea());

        Shape shape = new Shape(4, "Rectangle");
        System.out.println(shape.displayPurpose());

        //when getters and setters are not necessary- the normal scenarios that you dealt in junior years.
        Hexagon hexagon = new Hexagon(6, "Hexagon"); // we need to pass the values in the constructor
        hexagon.changeInformation(); //let's see what it prints
        Hexagon.changeInformationNotAllowed(); //we are accessing the static method without the object
        //another example of static method
       // String greetings = driver.greetTheUsers(); // no need to create the object of Driver class because the method is static
      //  System.out.println(greetings);

        //achieving polymorphism => more than one form
        //method overloading
        //same method name but with different parameters
        shape.doCalculation(3.0, 4.6); //with parameters of datatype double gets called
        shape.doCalculation(3); //the one with params of datatype int gets called
        shape.doCalculation();
        //method overriding
        //run time polymorphism
        //inheritance, use of super()



        //type casting
        //creating an object of Triangle class
        Triangle triangle = new Triangle(3, "Triangle");
        //creating another object of type Shape
        Shape triangleShape= new Triangle(3, "Triangle");

        ShapeInterface tr = new Triangle(3, "triangle");

        //next class - achieving polymorphic behaviour


        //abstract class cannot be instantiated
        //FutureWorks futureWorks = new FutureWorks() is not allowed

        FutureShape futureShape = new FutureShape();
        futureShape.getWorks();



        try {
            Integer result = driver.computeDivResult(3, 2); //as the method is not static, we have to create the object to access it
            //provided the method was static, the object was not required to access it
            System.out.println(result);
            //file read logic -- source path if not found, the code throws exception
            String path = "";
            File file = new File(path);

            //summary
            //ArithmeticException  -- dividing by 0
            //NumberFormatException -- parseInt("Apple");
            //StackOverflowException -- memory/JVM
            //FileNotFoundException -- source file missing (File handling) must
            //IOExceptionException --


            //ArrayIndexOutOfBoundsException  --
//          0 1 2 3 4 --> index
            int [] x = {1,2,3,4,5};
            System.out.println("Accessing array via index: "+ x[1]);
            for (int i = 0; i < x.length; i++) {
                System.out.println(x[i]);
            }



        }
        catch (ArithmeticException e) {
            System.out.println("The denominator provided by the user is 0!!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Reverify the index");
        }

        finally{ //this block is executed everytime
            System.out.println("done!!");
            //resource release eg.closing file/closing connection
            //any code block that must be executed!!!
        }


        System.out.println("Hello world!!");

    }


    public void displayDriverClassProperties(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Level: " + level);


    }


    public static String greeIntegertTheUsers(){

        String x=  "Good Morning!! Welcome!!";
        return x;
    }


    /**
     * Method to divide two integer values
     * @param x  the first integer value expected by the method
     * @param y  the second integer value expected by the method
     * @return  returns the Integer value after dividing x by y
     */
    public Integer computeDivResult(int x, int y){
        return x / y;
    }

}