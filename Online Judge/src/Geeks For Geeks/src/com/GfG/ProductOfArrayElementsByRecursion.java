package com.GfG;

public class ProductOfArrayElementsByRecursion
{
    public static void main(String[] args)
    {
        System.out.println(product(new int[] {1, 2, 3}, 2));
    }

    private static long product(int[] array, int n)
    {
        if (n == 0)
            return array[n];
        else
            return array[n] * product(array, n - 1);
    }
}
