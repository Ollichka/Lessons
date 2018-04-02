package lesson5.Lesson51.view;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc  = new Scanner(System.in);

    public static String inputNameWithScanner(ViewNote view) {
        view.printMessage(view.IN);
        while( !sc.hasNextLine()) {
            view.printMessage(view.WRONG_IN +
                    view.IN);
            sc.next();
        }
        return sc.nextLine();
    }

    public static String inputSurnameWithScanner(ViewNote view) {
        view.printMessage(view.IS);
        while( !sc.hasNextLine()) {
            view.printMessage(view.WRONG_IS );
            sc.next();
        }
        return sc.nextLine();
    }

    public static String inputBirthdayWithScanner(ViewNote view) {
        view.printMessage(view.IB);
        while( !sc.hasNextLine()) {
            view.printMessage(view.WRONG_IB );
            sc.next();
        }
        return sc.nextLine();
    }

    public static String inputTelephoneWithScanner(ViewNote view) {
        view.printMessage(view.IT);
        while( !sc.hasNextLine()) {
            view.printMessage(view.WRONG_IT);
            sc.next();
        }
        return sc.nextLine();
    }

    public static String inputAddressWithScanner(ViewNote view) {
        view.printMessage(view.IA);
        while( !sc.hasNextLine()) {
            view.printMessage(view.WRONG_IA);
            sc.next();
        }
        return sc.nextLine();
    }


    public static int choice(ViewNote view){
        view.printMessage(view.MENU_Q);
        while( !sc.hasNextInt()) {
            view.printMessage(
                    view.MENU_Q);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int menu(ViewNote view){
        view.printMessage(view.MENU_S);
        while( !sc.hasNextInt()) {
            view.printMessage(
                    view.MENU_S);
            sc.next();
        }

        return sc.nextInt();
    }
}
