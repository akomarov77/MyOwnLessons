package Lesson10.HomeWork;

import java.util.*;
import java.lang.System;

public class ReplaceElement {
    public static void main(String[] args)
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "Vadim", "Nikolai", "Ira") );

        System.out.println(namesList);

        //Replace item while iterating
        for(int i=0; i < namesList.size(); i++)
        {
            if(namesList.get(i).equalsIgnoreCase("Nikolai")) {
                namesList.set(i, "Andrei");
            }
        }
        System.out.println(namesList);
    }
}