// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/nNXYg2KpWs/


package Codeforces.EDU.BinarySearch.Step1;

import java.util.Scanner;

public class ClosestToTheLeft_B
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = input.nextInt(), k = input.nextInt();
        long[] Array = new long[n];
        int i, left, right, mid;
        long query;

        for (i = 0; i < n; i++)
            Array[i] = input.nextLong();

        for (i = 0; i < k; i++)
        {
            query = input.nextLong();

            left = -1;
            right = n;
            while (right - 1 > left)
            {
                mid = (left + right) / 2;
                if (Array[mid] <= query)
                    left = mid;
                else
                    right = mid;
            }

            System.out.println(left + 1);
        }
    }
}
