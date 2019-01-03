package collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class MinAndMaxInAList
{

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 10; i > 0; i--)
            al.add(i);
        Collections.sort(al);

        final int min = al.get(0);
        final int max = al.get(al.size() - 1);
        System.out.println(min);
        System.out.println(max);

    }

}
