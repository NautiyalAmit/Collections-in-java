package collections.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class UnderstandingArrayList3
{

    public static void main(String[] args)
    {
        UnderstandingArrayList1.add();

        ListIterator<String> li = UnderstandingArrayList1.al.listIterator();
        while (li.hasNext())
        {
            System.out.println("values  :" + li.next());
        }

        //removing elements
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("a");
        al1.add("b");
        al1.add("c");
        al1.remove(0);
        while (li.hasNext())
        {
            System.out.println("values  :" + li.next());
        }
    }

}
