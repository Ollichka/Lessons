package Lesson2_2.View;

import Lesson2_2.model.Shape;
import com.sun.org.apache.xpath.internal.SourceTree;

public class ViewShape {

    public static final String MENU_Q = "Type 1 to see menu , 0 for exit: ";
    public static final String MENU_S = "Type 1 to see all the shapes \n  Type 2 to see summ of the all areas \n Type 3 to see summ of all arias of exactly shape\n Type 4 to see all shapes sorted by areas \n Type 5 to see all shapes sorted by color ";
    public static final String OUT_R="Result of your request is: ";
    public static final String WRONG_I="Wrong input. Try again: ";
    public static final String INPUT_SHAPE = "Input what shape to calculate areas \n 1 triangle \n 2 circle \n 3 rectangle : ";

    public void printMessage(String m){
        System.out.println(m);
    }

    public void printMessageAndResult(String m, Shape[] p){
        System.out.println(m);
        for (Shape pa: p ) {
            System.out.println(pa);
        }
    }

    public void printMessageAndResultIn(String m, double p){
        System.out.print(m+" ");
        System.out.println(p);
    }

}
