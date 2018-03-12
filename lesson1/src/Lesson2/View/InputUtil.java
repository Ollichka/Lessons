package Lesson2.View;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc  = new Scanner(System.in);

    public static String inputDiagnoseWithScanner(ViewClinic view) {
        view.printMessage(view.INPUT_3);
        while( !sc.hasNextLine()) {
            view.printMessage(view.WRONG_I +
                    view.INPUT_3);
            sc.next();
        }
        return sc.next();
    }

    public static int inputMinimumWithScanner(ViewClinic view) {
        view.printMessage(view.INPUT_21);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.INPUT_21);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int inputMaxWithScanner(ViewClinic view) {
        view.printMessage(view.INPUT_22);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.INPUT_22);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int choice(ViewClinic view){
        view.printMessage(view.MENU_Q);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.MENU_Q);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int menu(ViewClinic view){
        view.printMessage(view.MENU_S);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.MENU_S);
            sc.next();
        }

        return sc.nextInt();
    }
}
