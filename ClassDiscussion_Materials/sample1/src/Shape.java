/**
 *
 */
public class Shape implements  ShapeInterface{

    private Integer noOfSides;
    private String shapeName;

    static final String purpose = "Interface cannot have instance variables!!";

    private Double area;
    public Double length =3.0;

    /**
     *
     * @param noOfSides this is expected by the constructor, it should be of type Integer
     * @param shapeName
     */
    public Shape(Integer noOfSides, String shapeName) {
        this.noOfSides = noOfSides;
        this.shapeName = shapeName;

    }

    /**
     *  this is a method to return the number of sides of a given shape
     * @return it returns an integer value of the no of sides.
     */
    public Integer getNoOfSides() {
        return noOfSides;
    }

    public void setNoOfSides(Integer noOfSides) {
        this.noOfSides = noOfSides;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public Double getPerimeter() {
        return 0.0;
    }

    @Override
    public String greetStudents() {
        return "";
    }

    Integer  doCalculation(){
        return 3;
    }

    Double doCalculation(double x){
        return (double) (x+3);
    }


    Double doCalculation(double x, double y){
        return x+y;
    }

    Integer doCcalucation(int x, int y){
        return x*y;
    }


}
