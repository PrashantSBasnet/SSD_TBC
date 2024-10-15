public class Hexagon extends Shape {

    public String moreInformationOfTheShape = "Some Information are not available at the moment!";

    public Hexagon(Integer noOfSides, String shapeName) {
        super(noOfSides, shapeName);
    }

    //here we do not need getters and setters because: the variables are in the same class and the method accessing them is not static
    public void changeInformation(){
        System.out.println("Initial information in the shape" + moreInformationOfTheShape);
        moreInformationOfTheShape = "| these are the added lines!!";
        System.out.println("We changed the local variable's value " + moreInformationOfTheShape);
    }


    public static void changeInformationNotAllowed(){
        //System.out.println(moreInformationOfTheShape);  //this is not allowed, you have to write getters and setter to do so because the method is static
        System.out.println("this is a static method,  tied to the class itself! Therefore, object creation is not necessary to call it");
    }
}
