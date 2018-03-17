package lesson22.model;

public class Rectangle extends Shape {
    public double s1;
    public double s2;
    public Rectangle(double s1,double s2,String shapeColor){
        super(shapeColor);
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public double calcArea() {
        return s1*s2;
    }

    public String toString(){
        return "Rectangle with sides : "+s1+" , "+s2+ " , "+super.toString();
    }
}
