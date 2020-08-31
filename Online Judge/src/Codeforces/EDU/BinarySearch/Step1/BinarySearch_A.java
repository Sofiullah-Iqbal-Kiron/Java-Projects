// Author: Sofiullah Iqbal Kiron, BSMRSTU, CSE.

// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/c5knJnCyCR/


package Codeforces.EDU.BinarySearch.Step1;

import java.util.Scanner;

public class BinarySearch_A
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = input.nextInt(10), k = input.nextInt(10), looper;
        long[] Array = new long[n];
        long query;

        for (looper = 0; looper < n; looper++)
            Array[looper] = input.nextLong();

        boolean gotIt;
        for (looper = 0; looper < k; looper++)
        {
            query = input.nextLong();
            gotIt = false;
            int left = 0, right = n - 1;

            while (right >= left)
            {
                int mid = (left + right) / 2;
                if (Array[mid] == query)
                {
                    gotIt = true;
                    break;
                }
                else if (Array[mid] > query)
                    right = mid - 1;
                else if (Array[mid] < query)
                    left = mid + 1;
            }

            System.out.println(gotIt ? "YES" : "NO");
        }
    }
}
