package collections.list;

import java.util.LinkedList;

class Details
{
    String name;
    int no;

    Details(String name, int no)
    {
        this.name = name;
        this.no = no;
    }

}

public class UnderstandingLinkedList3
{
    public static void main(String[] args)
    {
        LinkedList<Details> ll = new LinkedList<Details>();
        Details d1 = new Details("a", 1);
        Details d2 = new Details("b", 1);
        Details d3 = new Details("c", 1);

        ll.add(d1);
        ll.add(d2);
        ll.add(d3);
        for (Details s : ll)
            System.out.println("name :" + s.name + " and no: " + s.no);

    }

}