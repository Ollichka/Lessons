package Lesson2_2.View;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc  = new Scanner(System.in);



    public static int inputShapeWithScanner(ViewShape view) {
        view.printMessage(view.INPUT_SHAPE);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.INPUT_SHAPE);
            sc.next();
        }
        return sc.nextInt();
    }


    public static int choice(ViewShape view){
        view.printMessage(view.MENU_Q);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.MENU_Q);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int menu(ViewShape view){
        view.printMessage(view.MENU_S);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.MENU_S);
            sc.next();
        }

        return sc.nextInt();
    }
}
