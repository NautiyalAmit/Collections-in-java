package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LIstInterface1
{

    public static void main(String[] args)
    {

        List<String> al = new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");

        for (String s : al)
            System.out.println("the list is :" + s);
        al.add(0, "d");
        for (String s : al)
            System.out.println(" now the new list is :" + s);

        ListIterator<String> li = al.listIterator();
        while (li.hasNext())
        {
            System.out.println("the list  via list iterator contains index at " + li.nextIndex() + " value:" + li.next());
        }
        System.out.println("Now printing in  backward direction");

        while (li.hasPrevious())
        {
            System.out.println("the list  via list iterator contains index at:" + li.nextIndex() + " value " + li.previous());
        }

    }

}
