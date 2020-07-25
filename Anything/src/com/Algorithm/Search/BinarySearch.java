package com.Algorithm.Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter array size: ");
        n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();

        System.out.print("Enter value to search: ");
        int value = input.nextInt();
        Arrays.sort(array);
        if (value < array[0] || value > array[array.length - 1])
            System.out.println("IndexOutBoundException");
        else
        {
            int searchResult = binarySearch(value, array, 0, array.length - 1);
            System.out.println("Index of this value: " + searchResult);
            System.out.println("Or position: " + (searchResult + 1));
        }
    }

    private static int binarySearch(int value, int[] array, int left, int right)
    {
        int mid = (left + right) / 2;

        return array[mid] == value ? mid : (array[mid] < value ? binarySearch(value, array, mid + 1, right) :
                binarySearch(value, array, left, mid - 1));
    }
}