package collections.set;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class AbstractSet1
{
    public static void main(String[] args)
    {
        try
        {

            AbstractSet<Integer> abs_set = new TreeSet<Integer>();

            for (int i = 0; i < 10; i++)
                abs_set.add(i);

            System.out.println("AbstractSet before  removeAll() operation : " + abs_set);

            Collection<Integer> arrlist2 = new ArrayList<Integer>();
            arrlist2.add(1);
            arrlist2.add(2);
            arrlist2.add(3);

            System.out.println("Collection Elements to be removed : " + arrlist2);

            abs_set.removeAll(arrlist2);

            // print arrlist1 
            System.out.println("AbstractSet after " + "removeAll() operation : " + abs_set);
        }

        catch (NullPointerException e)
        {
            System.out.println("Exception thrown : " + e);
        }
    }
}
