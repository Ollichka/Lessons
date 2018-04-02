package view;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc  = new Scanner(System.in);


    public static int choice(ViewBank view){
        view.printMessage(view.MENU_Q);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.MENU_Q);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int menu(ViewBank view){
        view.printMessage(view.MENU_S);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.MENU_S);
            sc.next();
        }

        return sc.nextInt();
    }

    public static int early(ViewBank view){
        view.printMessage(view.OUT_MONEY_EARLY);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.OUT_MONEY_EARLY);
            sc.next();
        }

        return sc.nextInt();
    }

    public static int addMoney(ViewBank view){
        view.printMessage(view.OUT_ADD_MONEY);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_I +
                    view.OUT_ADD_MONEY);
            sc.next();
        }

        return sc.nextInt();
    }
}
