package lesson3.lesson32.carriges;


public class Intersity extends Carriage {


    private boolean TV;


    public Intersity(){
        super.setType(TypeCarrige.INTERSITY);
        super.setPeople(100);
        this.TV = true;
        super.setLaguagePerPerson (5);
    }

    public boolean isTV() {
        return TV;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }




}
