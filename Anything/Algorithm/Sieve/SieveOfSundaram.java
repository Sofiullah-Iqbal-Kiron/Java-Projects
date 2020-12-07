package com.Algorithm.Sieve;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfSundaram
{
    public static void main(String[] args)
    {
        Scanner getData = new Scanner(System.in);
        int n;
        n = getData.nextInt();
        sieveOfSundaram(n);
    }

    private static void sieveOfSundaram(int n)
    {
        int nNew = (n - 1) / 2;
        boolean[] marked = new boolean[nNew + 1];
        Arrays.fill(marked, false);

        for (int i = 1; i <= nNew; i++)
        {
            for (int j = i; i + j + 2 * i * j <= nNew; j++)
            {
                marked[i + j + 2 * i * j] = true;
            }
        }

        if (n >= 2)
            System.out.print(2 + " ");

        for (int i = 1; i <= nNew; i++)
        {
            if (!marked[i])
                System.out.print((2 * i + 1) + " ");
        }
        System.out.println();
    }
}
