package com.Algorithm.Sort;

public class SortClient
{
    public static void main(String[] args)
    {
        int[] array = {5, -1, 2, 0, 3};
        Selection.ascendingSort(array, array.length);
        printArray(array);

        int[] array2 = {8, 2, 4, 1, 3};
        Insertion.ascendingSort(array2);
        printArray(array2);

        Insertion.descendingSort(array2);
        printArray(array2);
    }

    public static void printArray(int[] array)
    {
        if (array.equals(null))
            return;
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(" " + array[i]);
        newLine();
    }

    public static void newLine()
    {
        System.out.println();
    }
}
