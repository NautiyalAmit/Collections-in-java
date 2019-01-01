package collections.collection;

import java.util.Arrays;
import java.util.Collections;

public class ArrayFrequency
{

    public static void main(String[] args)
    {
        Integer[] arr1 = { 1, 2, 2, 3, 4, 5, 5, 6 };
        System.out.println("frequency of 1:" + Collections.frequency(Arrays.asList(arr1), 1));
        System.out.println("frequency of 2:" + Collections.frequency(Arrays.asList(arr1), 2));
        System.out.println("frequency of 3:" + Collections.frequency(Arrays.asList(arr1), 3));
        System.out.println("frequency of 4:" + Collections.frequency(Arrays.asList(arr1), 4));
        System.out.println("frequency of 5:" + Collections.frequency(Arrays.asList(arr1), 5));
        System.out.println("frequency of 6:" + Collections.frequency(Arrays.asList(arr1), 6));

    }

}
