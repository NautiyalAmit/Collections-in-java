package collections.collection;

import java.util.ArrayList;

public class SplitAListIntoTwoHalves
{

    public static void main(String[] args)
    {

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 10; i > 0; i--)
            al.add(i);
        System.out.println("one half is :" + al.subList(0, al.size() / 2));
        System.out.println("other half is :" + al.subList((al.size() / 2), al.size()));

    }

}
