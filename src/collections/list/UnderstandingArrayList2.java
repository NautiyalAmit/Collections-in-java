package collections.list;

import java.util.ArrayList;

/*
 * different ways to add element
*/
public class UnderstandingArrayList2
{

    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        //add element at end 
        al.add("a");
        al.add("b");
        al.add("c");
        for (String s : al)
            System.out.println(s);
        //add element at specific position
        al.add(1, "d");

        System.out.println("new list ");
        for (String s : al)
            System.out.println(s);

        // adding old list in to a new list 

        ArrayList<String> al_new = new ArrayList<String>();
        al_new.add("x");
        al_new.add("y");
        al_new.addAll(al);
        System.out.println("new list  on adding to older list is  ");
        for (String s : al_new)
            System.out.println(s);

        //add another list element to this list 
        al_new.addAll(0, al_new);
        System.out.println("new list  on adding 0 of old list to new list" + " to older list is  ");
        for (String s : al_new)
            System.out.println(s);

    }

}
