package view;


import model.Bank;

import java.util.ArrayList;

public class ViewBank {

    public static final String MENU_Q = "Type 1 to see menu , 0 for exit: ";
    public static final String MENU_S = "Type 1 to see all deposits \n  Type 2 to sort deposits \n Type 3 to find suitable deposite ";
    public static final String OUT_R="Result of your request is: ";
    public static final String WRONG_I="Wrong input. Try again: ";
    public static final String OUT_MONEY_EARLY = "Type 1 if you need to get money early, type 2 if not";
    public static final String OUT_ADD_MONEY = "Type 1 if you need to add money to deposite, type 2 if not";

    public void printMessage(String m){
        System.out.println(m);
    }

    public void printMessageAndResult(String m, ArrayList p){
        System.out.println(m);
        for (Object pa: p ) {
            System.out.println(pa);
        }
    }

}
