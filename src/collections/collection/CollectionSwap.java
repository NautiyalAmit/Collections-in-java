package collections.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSwap
{
    public static void main(String[] args)
    {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("c");

        System.out.println("original list is:" + al);
        Collections.swap(al, 0, 2);
        System.out.println(" list  after swapping a and c  is:" + al);

    }
}
