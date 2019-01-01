package collections.collection;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class AbstractCollection1
{

    public static <E> void main(String[] args)
    {
        AbstractCollection<Object> ac = new ArrayList<Object>();
        ac.add("a");
        ac.add(1);
        ac.add("b");

        System.out.println(ac);

    }

}
