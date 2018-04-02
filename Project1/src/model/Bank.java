package model;

import java.util.ArrayList;
import java.util.Comparator;

public class Bank {


    public  enum DepositeType {TWOYEAR12PERDOLAR{
        @Override
        public String toString() {
            return "deposite for two year in dolars for 12% to year";
        }
    },ONEYEAR15PERHRIVNA{
        @Override
        public String toString() {
            return "deposite for one year in hrivnas for 15% to year";
        }
    },ONEYEAR10PERDOLAR {
        @Override
        public String toString() {
            return "deposite for one year in dolars for 10% to year";
        }
    },HALFYEAR5PEREURO{
        @Override
        public String toString() {
            return "deposite for 6 month in dolars for 5% to year";
        }
    }};


    private String name;
    private ArrayList<Deposite> deposits = new ArrayList<Deposite>();

    public Bank(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addDeposite(String name, DepositeType type,boolean getMoneyEarly,boolean addAmount){
        deposits.add(new Deposite(name,type,getMoneyEarly,addAmount));
    }

    private int findDepositeIndexByType(DepositeType type){
        for (Deposite s:deposits ) {
            if (s.getType()==type)  return deposits.indexOf(s);
        }
        return -1;
    }

    public Deposite showByType(DepositeType type){
        int s = findDepositeIndexByType(type);
        if(s>-1) return deposits.get(s);
        return null;
    }


    public Deposite[] sortByYearAndPercent(){

        deposits.sort(new Comparator<Deposite>() {
            @Override
            public int compare(Deposite o1, Deposite o2) {
                return o1.getType().ordinal()>o2.getType().ordinal()?1:o1.getType().ordinal()==o2.getType().ordinal()?0:-1;
            }
        });
        Deposite[] s = new Deposite[deposits.size()];
        return deposits.toArray(s);
    }

    public Deposite[] getDeposite() {
        Deposite[] s = new Deposite[deposits.size()];
        return deposits.toArray(s);
    }

    public Deposite[] getDepositeWithGetMoneyEarly(){
        ArrayList<Deposite> dep = new ArrayList<>();
        for (Deposite d:deposits      ) {
            if(d.getMoneyEarly)dep.add(d);
        }
        return dep.toArray(new Deposite[2] );
    }

    public Deposite[] getDepositeWithAddMoney(){
        ArrayList<Deposite> dep = new ArrayList<>();
        for (Deposite d:deposits      ) {
            if(d.addAmount)dep.add(d);
        }
        return dep.toArray(new Deposite[2] );
    }

    public Deposite[] getDepositeWithGetMoneyEarlyAndAddMoney(){
        ArrayList<Deposite> dep = new ArrayList<>();
        for (Deposite d:deposits      ) {
            if(d.getMoneyEarly&&d.addAmount)dep.add(d);
        }
        return dep.toArray(new Deposite[2] );
    }




    class Deposite{

        private String name;
        private DepositeType type;
        private boolean getMoneyEarly;
        private boolean addAmount;



        public Deposite(String name, DepositeType type, boolean getMoneyEarly, boolean addAmount){

            this.name = name;
            this.type = type;
            this.getMoneyEarly = getMoneyEarly;
            this.addAmount = addAmount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public DepositeType getType() {
            return type;
        }

        public void setType(DepositeType type) {
            this.type = type;
        }

        public boolean isGetMoneyEarly() {
            return getMoneyEarly;
        }

        public void setGetMoneyEarly(boolean getMoneyEarly) {
            this.getMoneyEarly = getMoneyEarly;
        }

        public boolean isAddAmount() {
            return addAmount;
        }

        public void setAddAmount(boolean addAmount) {
            this.addAmount = addAmount;
        }


        public String toString(){
            return "Bank "+Bank.this.name +", Deposite: "+this.name+ " ,conditions : "+this.type;
        }
    }
}
