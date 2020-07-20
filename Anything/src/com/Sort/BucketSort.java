// Not okay.

package com.Sort;

public class BucketSort
{
    public static void main(String[] args)
    {
        int[] arr = {5, 2, 7, 3, 888, 2};
        BucketSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
    public static void BucketSort(int[] array)
    {
        int max = array[0], i;
        for (i = 1; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        int[] arr = new int[max];
        boolean[] check = new boolean[max];
        for (i = 0; i < array.length; i++)
        {
            arr[array[i] - 1] = array[i];
            check[array[i] - 1] = true;
        }
        int set = 0;
        for (i = 0; i < array.length; i++)
        {
            if (check[i] == true)
                array[set++] = arr[i];
        }
    }
}
