// Coursera Algorithm tutorial Princeton University. Geeks for Geeks.


package com.Algorithm.Sort;

public class Selection
{
    //    Code from geeks for geeks
    public static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    //    Why my codes not working?
    //    Now the code works.
    public static void ascendingSort(int[] array, int size)
    {
        int start = 0;
        while (start < size - 1)
        {
            exch(array, start, indexOfMin(array, start, size - 1));
            start++;
        }
    }

    public static void descendingSort(int[] array, int size)
    {
        int start = 0, end = size - 1;
        while (start < end)
        {
            exch(array, start, indexOfMax(array, start, end));
            start++;
        }
    }

    private static int indexOfMin(int[] array, int start, int over)
    {
        int min = array[start], index = start;
        while (start <= over)
        {
            if (array[start] < min)
            {
                min = array[start];
                index = start;
            }

            start++;
        }

        return index;
    }

    private static int indexOfMax(int[] array, int start, int over)
    {
        int max = array[start], index = start;
        while (start <= over)
        {
            if (array[start] > max)
            {
                max = array[start];
                index = start;
            }

            start++;
        }

        return index;
    }

    public static void exch(int[] array, int leftIndex, int rightIndex)
    {
        int demo = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = demo;
    }
}

//Selection sort over.
