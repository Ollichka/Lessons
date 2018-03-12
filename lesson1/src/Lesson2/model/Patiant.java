package Lesson2.model;

import java.util.Comparator;

public class Patiant {

    private String surname;
    private String name;
    private String parents;
    private String adress;
    private int number;
    private String diagnose;

    public Patiant(String surname,String name,String parents,String adress,int number,String diagnose){
        this.adress = adress;
        this.name = name;
        this.number = number;
        this.parents = parents;
        this.surname = surname;
        this.diagnose = diagnose;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String toString(){
        String res = this.surname+" "+this.name+" "+this.parents+", number: "+this.number+", diagnose : "+this.diagnose;
        return res;
    }
}
