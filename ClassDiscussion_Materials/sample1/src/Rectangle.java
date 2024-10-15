public class Rectangle extends  Shape {

    Double length;
    Double breadth;


    public Rectangle(Integer noOfSides, String shapeName, Double length, Double breadth) {
        super(noOfSides, shapeName); //as Rectangle is a base class, it has to call the constructor of the parent. 'super'
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Double getArea() {
        return length*breadth;
    }


}
