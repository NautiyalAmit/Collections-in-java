package collections.list;

import java.util.ArrayList;
import java.util.List;

public class GetFirstAndLastElementsFromArrayList
{

    public static void main(String[] args)
    {
        List<Object> al = new ArrayList<Object>();
        for (int i = 0; i < 10; i++)
            al.add(i);
        System.out.println(al.get(0));
        System.out.println(al.get(al.size() - 1));

    }

}
