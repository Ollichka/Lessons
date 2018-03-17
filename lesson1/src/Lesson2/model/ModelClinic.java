package lesson2.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ModelClinic {
    private Patiant[] pations;


    public Patiant[] getPations() {
        return pations;
    }

    public void setPations(Patiant[] pations) {
        this.pations = pations;
    }

    public Object[] showPationsWithDiagnose(String diagnose){

        ArrayList<Patiant> l  = new ArrayList<>() ;
        for(Patiant pt:pations){
            if(pt.getDiagnose().equals(diagnose)) l.add(pt);
        }
        return l.toArray();
    }

    public Object[] showPationsWithNumber(int a,int b){

        ArrayList<Patiant> l  = new ArrayList<>() ;
        for(Patiant pt:pations){
            if(pt.getNumber()>a&&pt.getNumber()<b) l.add(pt);
        }
        return l.toArray();
    }

    public Patiant[] sort(){
        PatiantComparator p = new PatiantComparator();
         Arrays.sort(pations,p);
         return pations;
    }
}
