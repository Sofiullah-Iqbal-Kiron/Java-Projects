package com.Algorithm.Sieve;

import java.util.Scanner;

public class SieveOfEratosthenes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int toSieve;
        System.out.print("Enter a number to get primes till this. Your number? ");
        toSieve = input.nextInt();
        sieve(toSieve);
    }

    private static void sieve(int n)
    {
        boolean[] prime = new boolean[n + 1];
        int i, p;
        for (i = 2; i <= n; i++)
            prime[i] = true;

        for (p = 2; p * p <= n; p++)
        {
            for (i = 2; p * i <= n; i++)
                prime[p * i] = false;
        }

        for (i = 2; i <= n; i++)
        {
            if (prime[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
