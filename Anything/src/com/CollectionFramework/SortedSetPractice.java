package com.CollectionFramework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/* SortedSet is an interface that extends Set. Inherit some method form Set */

public class SortedSetPractice
{
    public static void main(String[] args)
    {
        SortedSet<String> set = new TreeSet<>();
        set.add("Australia");
        set.add("India");
        set.add("Bangladesh");
        set.add("Bill Gates");
        set.add("Jeff Bezos");
        set.add("WanderLand");
        set.add("wanderLand");
        set.add("India");

        /*System.out.println(set);
        System.out.println();
        printAll(set);*/

        /*Iterator i = set.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");
        System.out.println();*/

        /*for (String country : set)
            System.out.print(country + " ");*/

        printAll(set);
    }

    private static void printAll(SortedSet set)
    {
        System.out.print(set.first());
        set.remove(set.first());

        while (!set.isEmpty())
        {
            System.out.print(", " + set.first());
            set.remove(set.first());
        }
        System.out.println();
    }
}
