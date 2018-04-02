package lesson3.lesson33;

import java.util.ArrayList;
import java.util.List;

public abstract class MyEnum<E extends MyEnum<E>> implements Comparable<E>  {
    private static int ordinal=0;
    private final String name;

    private static List<MyEnum> values = new ArrayList<>();

    public MyEnum(String name){
        this.name =  name;
        ordinal++;
        values.add(this);

    }

   // public final int ordinal(){

//


}
