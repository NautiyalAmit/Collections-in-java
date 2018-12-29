package collections.list;

import java.util.Stack;

public class UnderstandingStack1
{

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<Integer>();
        stack_push(s);
        stack_peek(s);
        stack_pop(s);
        stack_search(s, 2);

    }

    private static void stack_search(Stack<Integer> s, int i)
    {
        Integer pos = (Integer) s.search(i);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

    private static void stack_peek(Stack<Integer> s)
    {
        Integer element = (Integer) s.peek();
        System.out.println("Element on stack top : " + element);
    }

    private static void stack_pop(Stack<Integer> s)
    {
        for (int i = 0; i < 5; i++)
        {
            Integer y = (Integer) s.pop();
            System.out.println(y);
        }
    }

    private static void stack_push(Stack<Integer> s)
    {
        for (int i = 0; i < 5; i++)
        {
            s.push(i);
        }
    }

}
