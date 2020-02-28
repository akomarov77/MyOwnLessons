package Lesson10.HomeWork;

import java.util.*;

public class Iteration {
    public static void main(String[] args)
    {
        // initializing ArrayList
        List<Integer> numbers = Arrays.asList(1, 2, 3,
                4, 5, 6, 7, 8);
        // For Loop for iterating ArrayList
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
    }
}