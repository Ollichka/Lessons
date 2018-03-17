package lesson3.lesson32.carriges;

public class SV extends Carriage {

    private boolean TV ;
    private int washers;
    private int tables;



    public SV(){
        super.setType(TypeCarrige.SV);
        super.setPeople(20);
        super.setLaguagePerPerson(15);
        this.TV = true;
        this.washers = super.getPeople()/2;
        this.tables = super.getPeople()/2;
    }

    public boolean isTV() {
        return TV;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }

    public int getWashers() {
        return washers;
    }

    public void setWashers(int washers) {
        this.washers = washers;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }
}
