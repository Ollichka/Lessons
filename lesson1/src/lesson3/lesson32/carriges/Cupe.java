package lesson3.lesson32.carriges;

public class Cupe extends Carriage{

    private boolean  linens;
    private int doors;


    public Cupe(){
        super.setType(TypeCarrige.CUPE);
        super.setPeople(40);
        super.setLaguagePerPerson(10);
        this.linens = true;
        this.doors = super.getPeople()/4;
    }

    public boolean isLinens() {
        return linens;
    }

    public void setLinens(boolean linens) {
        this.linens = linens;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
