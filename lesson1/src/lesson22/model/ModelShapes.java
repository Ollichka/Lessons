package lesson22.model;


import java.util.Arrays;

public class ModelShapes {

    private Shape[] shapes;

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] sortByAreas(){
        ShapeComparatorArea p = new ShapeComparatorArea();
        Arrays.sort(shapes,p);
        return shapes;
    }

    public Shape[] sortByColors(){
        ShapeComparatorColor p = new ShapeComparatorColor();
        Arrays.sort(shapes,p);
        return shapes;
    }

    public double calculateSummAll(){
        double sum = 0;
        for (Shape s: shapes) {
            sum+=s.calcArea();
        }
        return sum;
    }

    public double calculateSummExact(int a) {
        double sum = 0;

        if (a == 1) {
            for (Shape s : shapes) {
                sum += s instanceof Triangle ? s.calcArea() : 0;
            }
        } else if (a == 2){
            for (Shape s : shapes) {
                sum += s instanceof Circle ? s.calcArea() : 0;
            }
        }else if (a == 3){
            for (Shape s : shapes) {
                sum += s instanceof Rectangle ? s.calcArea() : 0;
            }
        }
        return sum;
    }
}
