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
        String greetings = Driver.greetTheUsers(); // no need to create the object of Driver class because the method is static
        System.out.println(greetings);

        //achieving polymorphism => more than one form
        //method overloading
        //same method name but with different parameters
        shape.doCalculation(3.0, 4.6); //with parameters of datatype double gets called
        shape.doCcalucation(3,4); //the one with params of datatype int gets called

        //method overriding
        //run time polymorphism
        //inheritance, use of super()



    }


    public void displayDriverClassProperties(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Level: " + level);
    }


    public static String greetTheUsers(){
        String x=  "Good Morning!! Welcome!!";
        return x;
    }

}