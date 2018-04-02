package lesson5.Lesson51.model;

public class Note {

    private String surname;
    private String name;
    private String adress;
    private String number;


    public Note(String surname,String name,String adress,String number){
        this.adress = adress;
        this.name = name;
        this.number = number;
        this.surname = surname;
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


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



    public String toString(){
        String res = this.surname+" "+this.name+" "+", number: "+this.number+".";
        return res;
    }
}
