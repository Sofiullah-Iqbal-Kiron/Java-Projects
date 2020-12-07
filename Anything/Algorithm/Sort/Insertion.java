// Mosh Hamedani.


package com.Algorithm.Sort;

import static com.Algorithm.Sort.Selection.exch;

public class Insertion
{
    public static void ascendingSort(int[] array)
    {
        int virtual;
        for (var current = 1; current < array.length; current++)
        {
            virtual = current;
            while (virtual > 0 && array[virtual] < array[virtual - 1])
            {
                exch(array, virtual, virtual - 1); // exch() is swap(), I got it from coursera algorithm tutorial.
                virtual--;
            }
        }
    }

    public static void descendingSort(int[] array)
    {
        int current, virtual;
        for (current = 1; current < array.length; current++)
        {
            virtual = current;
            while (virtual > 0 && array[virtual] > array[virtual - 1])
            {
                exch(array, virtual, virtual - 1); // exch() is swap(), I got it from coursera algorithm tutorial.
                virtual--;
            }
        }
    }
}
