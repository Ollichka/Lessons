package lesson2.model;

import java.util.Comparator;

public class PatiantComparator implements Comparator<Patiant> {

    @Override
    public int compare(Patiant o1, Patiant o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
