package lesson22.model;

public class Circle  extends Shape {

    public double radius;
    public Circle(double radius,String shapeColor){
        super(shapeColor);
        this.radius = radius;
    }



    @Override
    public double calcArea() {
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "Circle with radius: "+radius+ " , "+super.toString();
    }
}
