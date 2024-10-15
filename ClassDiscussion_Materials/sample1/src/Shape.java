public class Shape implements  ShapeInterface{

    private Integer noOfSides;
    private String shapeName;

    private Double area;
    public Double length =3.0;

    public Shape(Integer noOfSides, String shapeName) {
        this.noOfSides = noOfSides;
        this.shapeName = shapeName;

    }

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

    Double doCalculation(double x, double y){
        return x+y;
    }

    Integer doCcalucation(int x, int y){
        return x*y;
    }


}
