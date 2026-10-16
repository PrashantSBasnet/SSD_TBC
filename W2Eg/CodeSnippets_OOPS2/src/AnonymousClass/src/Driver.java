/**
What is an anonymous class?
==> An inner class without a name that is declared and instantiated at the same time.
==> Allows you to create a one-time-use subclass or implement an interface directly inside a statement without creating a separate .java class
  */

public class Driver {

    public static void main(String[] args){

        //Create an anonymous class that implements the Engine interface
        Engine electricEngine = new Engine(){
            @Override
            public void start() {
                System.out.println("Electrical humm... Engine started");
            }
        }; //semicolon is required because this is an assignment statement

        electricEngine.start();

        //Create an anonymous class that extends the Car class
        Car sportsCar = new Car(){
            @Override
            void drive(){
                System.out.println("Wow, this is a sports Car!!!");
            }
        };

        sportsCar.drive();


        Car stuntCar = new Car(){
            @Override
            void drive(){
                System.out.println("Stunt Car!!");
            }
        };

        stuntCar.drive();

    }
}
