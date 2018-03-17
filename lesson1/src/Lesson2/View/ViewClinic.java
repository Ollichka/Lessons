package lesson2.view;

import lesson2.model.Patiant;

public class ViewClinic {

    public static final String MENU_Q = "Type 1 to see menu , 0 for exit: ";
    public static final String MENU_S = "Type 1 to see sorted pations \n  Type 2 to see pations with carts in some diapason \n Type 3 to see pations with diagnose ";
    public static final String OUT_R="Result of your request is: ";
    public static final String WRONG_I="Wrong input. Try again: ";
    public static final String INPUT_21 = "Input first value of diapason : ";
    public static final String INPUT_22 = "Input second value of diapason : ";
    public static final String INPUT_3 = "Input diagnose : ";

    public void printMessage(String m){
        System.out.println(m);
    }

    public void printMessageAndResult(String m, Object[] p){
        System.out.println(m);
        for (Object pa: p ) {
            System.out.println((Patiant)pa);
        }
    }

}
