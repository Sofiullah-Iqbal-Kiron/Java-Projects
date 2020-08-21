// DArray stands for Dynamic Array that are implemented by কিরইন্না।


package com.DynamicArray;

import java.util.Arrays;

import static com.RA.Main.newLine;

public class DArray
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        int[] array = {1, 2, 3};
        array = add(array, 4);
        array = add(array, 2, 5);
        System.out.println(Arrays.toString(array));
        array = removeElement(array, 3);
        System.out.println("After removing element 7: " + Arrays.toString(array));
        newLine();

        long endTime = System.currentTimeMillis();
        System.out.println("Time that has passed for this execution: " + (endTime - startTime) + "ms");
    }

    private static int[] add(int[] array, int element)
    {
        int[] newArray = new int[array.length + 1];
        int i;
        for (i = 0; i < newArray.length - 1; i++)
            newArray[i] = array[i];
        newArray[i] = element;

        return newArray;
    }

    private static int[] add(int[] array, int index, int element)
    {
        if (index > array.length)
        {
            System.out.println("IndexOutOfBoundException");
            return array;
        }

        int[] newArray = new int[array.length + 1];
        int i;
        for (i = 0; i < index; i++)
            newArray[i] = array[i];
        newArray[i++] = element;
        for (; i < newArray.length; i++)
            newArray[i] = array[i - 1];

        return newArray;
    }

    private static int[] removeElement(int[] array, int element)
    {
//        This function will remove only first occurrence.
        int i, j = 0;
        boolean existElement = false;
        for (int k : array)
            if (k == element)
            {
                existElement = true;
                break;
            }

        if (!existElement)
        {
            System.out.println("Element not exist.");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        for (i = 0; i < newArray.length; i++)
        {
            if (array[i] == element)
            {
                i++;
                break;
            }

            newArray[j++] = array[i];
        }

        for (; i < newArray.length; i++)
            newArray[j++] = array[i];

        return newArray;
    }
}
