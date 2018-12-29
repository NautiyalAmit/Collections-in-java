package collections.list;

import java.util.LinkedList;

public class UnderstandingLinkedList1
{

    public static void main(String[] args)
    {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add(3, "d");
        //   ll.add(6, "e"); //this will throw java.lang.IndexOutOfBoundsException: Index: 6, Size: 4
        // ListIterator<String> li = ll.listIterator();

        System.out.println("the linked list is :" + ll);
        ll.remove(3);

        System.out.println("the linked list after removal is" + ll);
    }

}
