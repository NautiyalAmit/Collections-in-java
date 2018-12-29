package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UnderstandingArrayList1
{
    static ArrayList<String> al = new ArrayList<String>();

    public static void main(String[] args)
    {
        add();

        System.out.println("traversing via array obj: " + al);

        ListIterator<String> li = al.listIterator();
        while (li.hasNext())
        {
            System.out.println("traversing via ListIteratorj: " + li.next());
        }

        Iterator<String> i = al.iterator();
        while (i.hasNext())
        {
            System.out.println("traversing via Iterator: " + i.next());
        }
    }

    static void add()
    {

        al.add("a");
        al.add("b");
        al.add("c");
    }

}
