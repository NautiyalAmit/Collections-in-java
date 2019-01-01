package collections.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSingleton
{

    public static void main(String[] args)
    {

        Integer[] arr1 = { 1, 1, 2, 2, 2, 3, 4, 5, 5, 6 };
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println("array is " + al);

        al.removeAll(Collections.singleton(1));
        System.out.println(" new array after applying singleton " + al);

    }

}
