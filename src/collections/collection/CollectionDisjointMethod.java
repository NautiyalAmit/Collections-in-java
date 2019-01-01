package collections.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class CollectionDisjointMethod
{

    public static void main(String[] args)
    {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("a");
        al.add("b");
        al.add("c");

        Vector<Object> v = new Vector<Object>();
        v.add("a");
        v.add("b");
        v.add("d");

        Set<Object> set = new HashSet<Object>();
        set.add("e");
        set.add("f");
        set.add("g");

        System.out.println("Is  ArrayList disjoint with Vector:" + Collections.disjoint(al, v));
        System.out.println("Is  Vector disjoint with Set:" + Collections.disjoint(v, set));
        System.out.println("Is  Set disjoint with ArrayList:" + Collections.disjoint(set, al));

    }
}
