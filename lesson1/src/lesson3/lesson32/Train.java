package lesson3.lesson32;

import lesson3.lesson32.carriges.*;
import lesson3.lesson32.carriges.TypeTrain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Train<T extends Carriage> {

    private TypeTrain trainType;
    private LinkedList<T> carriges = new LinkedList<T>();

    public Train(TypeTrain t){
        this.trainType = t;
    }

    public int add(T carrige){
        if(this.trainType == TypeTrain.EXPRESS){
            if(carrige instanceof Intersity)  this.carriges.add(carrige);
            else return -1;
        }else if (this.trainType == TypeTrain.SLEEPLUX){
            if(carrige instanceof SV)  this.carriges.add(carrige);
            else return -1;
        }else if (this.trainType == TypeTrain.SLEEPWITHKITCHEN){
            if(!(carrige instanceof Intersity))  this.carriges.add(carrige);
            else return -1;
        }else if (this.trainType == TypeTrain.SLEEPMIX){
            if(!(carrige instanceof Intersity)&& !(carrige instanceof Restoran))  this.carriges.add(carrige);
            else return -1;
        }
        return 1;
    }

    public LinkedList<T> sortByComfort(){

        carriges.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.getType().ordinal()>o2.getType().ordinal()?1:o1.getType().ordinal()==o2.getType().ordinal()?0:-1;
            }
        });

        return carriges;
    }

    public int allPassagers(){
        int pas = 0;
        for (T t:carriges) {
            pas+=t.getPeople();
        }
        return pas;
    }

    public int allLaguage(){
        int l = 0;
        for (T t:carriges) {
           l+=t.getLaguagePerPerson()*t.getPeople();
        }
        return l;
    }

    public LinkedList<T> getCarrigesInDiapasone(int a,int b){

        LinkedList<T> nc = new LinkedList<T>();
        for (T car:carriges  ) {
            if(car.getPeople()<a&&car.getPeople()>b) nc.add(car);
        }
        return nc;
    }

    public TypeTrain getTrainType() {
        return trainType;
    }

    public void setTrainType(TypeTrain trainType) {
        this.trainType = trainType;
    }



    public LinkedList<T> getCarriges() {
        return carriges;
    }


}
