package lesson3.lesson32.carriges;

public class Restoran extends Carriage {

    private boolean  kitchen;
    private int tables;


    public Restoran(){
        super.setType(TypeCarrige.RESTORAN);
        super.setPeople(50);
        this.kitchen = true;
        this.tables = super.getPeople()/5;
        super.setLaguagePerPerson(0);
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }
}
