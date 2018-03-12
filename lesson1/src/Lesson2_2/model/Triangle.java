package Lesson2_2.model;

public class Triangle extends Shape {

    public double s1;
    public double s2;
    public double s3;
    public Triangle(double s1,double s2,double s3,String shapeColor){
        super(shapeColor);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }



    @Override
    public double calcArea() {
        return Math.sqrt((s1+s2+s3)*(s1+s2)*(s1+s3)*(s2+s3));
    }

    public String toString(){
        return "Triangele with sides : "+s1+" , "+s2+" , "+s3+ " , "+super.toString();
    }
}
