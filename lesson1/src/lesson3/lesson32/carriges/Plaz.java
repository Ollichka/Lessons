package lesson3.lesson32.carriges;

public class Plaz extends Carriage{

    private boolean  linens;
    private int fridge;


    public Plaz(){
        super.setType(TypeCarrige.PLAZCART);
        super.setPeople(60);
        this.linens = true;
        this.fridge = 4;
        super.setLaguagePerPerson(7);
    }

    public boolean isLinens() {
        return linens;
    }

    public void setLinens(boolean linens) {
        this.linens = linens;
    }

    public int getFridge() {
        return fridge;
    }

    public void setFridge(int fridge) {
        this.fridge = fridge;
    }
}
