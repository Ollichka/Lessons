package lesson3.lesson32;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc  = new Scanner(System.in);

    public static int inputTypeOfTrain() {
        while( !sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static int inputTypeOfCarrige() {
        while( !sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static int inputContinue() {
        while( !sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static int inputLimits() {
        while( !sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }




}
