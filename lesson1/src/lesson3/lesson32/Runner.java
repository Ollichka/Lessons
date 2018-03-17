package lesson3.lesson32;

import lesson3.lesson32.carriges.*;

public class Runner {

    public static final String TYPECARRIGE = "Type 0 if carrige is Restoran \nType 1 if carrige is Intersity \n Type 2 if carrige is Plazcart \n "+
            "Type 3 if carrige is Cupe \n Type 4 if carrige is SV \n ";
    public static final String TYPETRAIN = "Type 0 if carrige is express \nType 1 if carrige is sleep with kitchen \n Type 2 if carrige is sleep Lux \n "+
            "Type 3 if carrige is sleep mixed ";
    public static final String CONTINUEINPUT = "Type 1 if you want to continue\n Type 0 if you want to stop";

    public static void run(){
        Train train = new Train(TypeTrain.SLEEPMIX);
        int a =1;
        while(a==1) {
            a = -1;
            System.out.println("Enter type of train");
            System.out.println(TYPETRAIN);
            int tt = InputUtil.inputTypeOfTrain();

            if (tt == 0) train = new Train<Intersity>(TypeTrain.EXPRESS);
            else if(tt == 1) train = new Train<Carriage> (TypeTrain.SLEEPWITHKITCHEN);
            else if(tt == 2) train = new Train<Carriage> (TypeTrain.SLEEPLUX);
            else if(tt == 3) train = new Train<Carriage> (TypeTrain.SLEEPMIX);
            else {
                System.out.println("Wrong input.\n Try again");
                a=1;
            }
        }
        a = -1;
        int t =1;

        while(a==-1&&t == 1) {
            System.out.println("Enter type of carriges");
            System.out.println(TYPECARRIGE);
            int tt = InputUtil.inputTypeOfCarrige();

            if (tt == 0) a = train.add(new Restoran());
            else if (tt == 1) a = train.add(new Intersity());
            else if (tt == 2) a = train.add(new Plaz());
            else if (tt == 3) a = train.add(new Cupe());
            else if (tt == 4) a = train.add(new SV());
            else {
                System.out.println("Wrong input.\n Try again");
                a = -1;
                continue;
            }
            if (a == -1) {
                System.out.println("Wrong type of carrige\n Try again");

            } else {
                System.out.println(CONTINUEINPUT);
                t = InputUtil.inputContinue();
                a = -1;
            }

        }

        System.out.println("all passagers in train : " +train.allPassagers());
        System.out.println("all laguage in train : " +train.allLaguage());
        for(Object c : train.sortByComfort()){
            System.out.println((Carriage)c);
        }

    }
}
