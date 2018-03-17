package lesson3.lesson32.carriges;

public abstract class Carriage {

    private  TypeCarrige type;
    private int people;
    private int laguagePerPerson;


    public void setType(TypeCarrige type) {
        this.type = type;
    }

    public TypeCarrige getType() {
        return type;
    }

    public int getPeople() {

        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getLaguagePerPerson() {
        return laguagePerPerson;
    }

    public void setLaguagePerPerson(int laguagePerPerson) {
        this.laguagePerPerson = laguagePerPerson;
    }

    public String toString(){
        return "This carrige is : "+this.getType();
    }
}
