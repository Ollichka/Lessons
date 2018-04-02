package model;

import java.util.ArrayList;
import java.util.Arrays;

public class ModelBank {
    private Bank[] banks;


    public Bank[] getBanks() {
        return banks;
    }

    public void setBanks(Bank[] banks) {
        this.banks = banks;
    }

    public ArrayList<Bank.Deposite> findDepositsWithGetMoneyEarly(){
        ArrayList<Bank.Deposite> dep = new ArrayList<>();
        for(Bank b :banks){
           for(Bank.Deposite d : b.getDepositeWithGetMoneyEarly()){
               dep.add(d);
           }
        }
        return dep;
    }

    public ArrayList<Bank.Deposite> findDepositsWithAddMoney(){
        ArrayList<Bank.Deposite> dep = new ArrayList<>();
        for(Bank b :banks){
            for(Bank.Deposite d : b.getDepositeWithAddMoney()){
                dep.add(d);
            }
        }
        return dep;
    }

    public ArrayList<Bank.Deposite> findDepositsGetMoneyEarlyAndAddMoney(){
        ArrayList<Bank.Deposite> dep = new ArrayList<>();
        for(Bank b :banks){
            for(Bank.Deposite d : b.getDepositeWithGetMoneyEarlyAndAddMoney()){
                dep.add(d);
            }
        }
        return dep;
    }

    public ArrayList<Bank.Deposite> sortDeposites(){
        ArrayList<Bank.Deposite> dep = new ArrayList<>();
        for(Bank b :banks){
            for(Bank.Deposite d : b.sortByYearAndPercent()){
                dep.add(d);
            }
        }
        return dep;
    }

    public ArrayList<Bank.Deposite> allDeposites(){
        ArrayList<Bank.Deposite> dep = new ArrayList<>();
        for(Bank b :banks){
            for(Bank.Deposite d : b.getDeposite()){
                dep.add(d);
            }
        }
        return dep;
    }


}
