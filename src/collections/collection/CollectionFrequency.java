package collections.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionFrequency
{

    public static void main(String[] args)
    {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("c");
        System.out.println("frequncy of a:" + Collections.frequency(al, "a"));
        System.out.println("frequncy of b:" + Collections.frequency(al, "b"));
        System.out.println("frequncy of c:" + Collections.frequency(al, "c"));

    }

}
