package collections.list;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * reverse the linked list 
*/
public class UnderstandingLinkedList2
{

    public static void main(String[] args)
    {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        Iterator<String> li = ll.descendingIterator();
        while (li.hasNext())
        {
            System.out.println(li.next());
        }
    }

}
