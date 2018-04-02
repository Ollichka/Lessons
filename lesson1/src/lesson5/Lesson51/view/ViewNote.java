package lesson5.Lesson51.view;

import lesson5.Lesson51.model.Note;

import java.util.ArrayList;

public class ViewNote {

    public static final String MENU_Q = "Type 1 to see menu , 0 for exit: ";
    public static final String MENU_S = "Type 1 to add note \n  Type 2 to see all notes \n";
    public static final String SUCC_I = "Add your note. ";
    public static final String OUT_R="Result of your request is: ";

    public static final String IN="Enter your name.";
    public static final String IS="Enter your surname.";
    public static final String IB="Enter your birthday in format 11 11 1111.";
    public static final String IT="Enter your telephone  in format 011 111 11 11.";
    public static final String IA="Enter your address in format street 12 23. Try again: ";

    public static final String WRONG_IN="Wrong name. Name must contain only letters.Try again: ";
    public static final String WRONG_IS="Wrong surname.Surname must contain only letters. Try again: ";
    public static final String WRONG_IB="Wrong birthday. Birthday must be in format 11 11 1111. Try again: ";
    public static final String WRONG_IT="Wrong telephone. Telephone must be in format 011 111 11 11. Try again: ";
    public static final String WRONG_IA="Wrong address. Address must be in format street 12 23. Try again: ";

    public void printMessage(String m){
        System.out.println(m);
    }

    public void printMessageAndResult(String m, ArrayList<Note> p){
        System.out.println(m);
        for (Note n: p ) {
            System.out.println(n);
        }
    }

}
