// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/3QSHcGJx9c/


package Codeforces.EDU.BinarySearch.Step1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_A_again
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = input.nextInt(10), k = input.nextInt(10);
        long[] Array = new long[n];

        int looper;
        for (looper = 0; looper < n; looper++)
            Array[looper] = input.nextLong();

        for (looper = 0; looper < k; looper++)
        {
            long query = input.nextLong();
            System.out.println(Arrays.binarySearch(Array, query) > -1 ? "YES" : "NO");
        }
    }
}

// To quickly highlight all usages of selected variable in the current file: ctrl + shift + f7