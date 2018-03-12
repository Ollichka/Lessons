package Lesson2_2.model;

public abstract class Shape implements Drawable {

    private String shapeColor;

    public Shape (String shapeColor){
        this.setShapeColor(shapeColor);
    }


    public abstract double calcArea();
    @Override
    public void draw() {
        //smth
    }

    public String toString(){
        return "color "+ this.getShapeColor();
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
}
