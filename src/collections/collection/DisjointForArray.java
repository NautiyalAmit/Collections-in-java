package collections.collection;

import java.util.Arrays;
import java.util.Collections;

public class DisjointForArray
{

    public static void main(String[] args)
    {

        Integer arr1[] = { 1, 2, 3, 4, 5 };
        Integer arr2[] = { 1, 2, 3, 4, 6 };
        Integer arr3[] = { 7, 8, 9, 10 };
        Integer arr4[] = { 1, 2, 7, 14 };
        System.out.println("is arr1 and arr2 dijoint " + Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr2)));
        System.out.println("is arr2 and arr3 dijoint " + Collections.disjoint(Arrays.asList(arr2), Arrays.asList(arr3)));
        System.out.println("is arr3 and arr4 dijoint " + Collections.disjoint(Arrays.asList(arr3), Arrays.asList(arr4)));
    }

}
