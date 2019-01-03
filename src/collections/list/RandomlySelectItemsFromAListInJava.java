package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomlySelectItemsFromAListInJava
{

    public static void main(String[] args)
    {

        List<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            al.add(i);
        System.out.println("select  a single random element form arraylist");

        RandomlySelectItemsFromAListInJava obj = new RandomlySelectItemsFromAListInJava();
        System.out.println(obj.getRandomElement(al));
    }

    public int getRandomElement(List<Integer> al)
    {
        Random r = new Random();

        return al.get(r.nextInt(al.size()));
    }

}
