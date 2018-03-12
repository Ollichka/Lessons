package Lesson2_2.model;

import java.util.Comparator;

public class ShapeComparatorArea implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.calcArea()>o2.calcArea()? -1:o1.calcArea()==o2.calcArea()?0:1;
    }
}
