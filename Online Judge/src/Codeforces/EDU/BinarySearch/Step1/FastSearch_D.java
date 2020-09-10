package Codeforces.EDU.BinarySearch.Step1;


import java.util.Arrays;
import java.util.Scanner;

public class FastSearch_D
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = input.nextInt(), i;
        int[] array = new int[n];
        for (i = 0; i < n; i++)
            array[i] = input.nextInt();

        Arrays.sort(array);

        int k = input.nextInt();
        for (i = 0; i < k; i++)
        {
            int l = input.nextInt(), r = input.nextInt();
            System.out.print(((posRight(r, array) - posLeft(l, array)) + 1) + " ");
        }
    }

    private static int posRight(int r, int[] array)
    {
        if (binarySearch(array, r) > -1)
            return binarySearch(array, r);

        int left = -1, right = array.length, mid;
        while (right - 1 > left)
        {
            mid = (left + right) / 2;
            if (array[mid] <= r)
                left = mid;
            else
                right = mid;
        }

        return left + 1;
    }

    private static int posLeft(int l, int[] array)
    {
        if (binarySearch(array, l) > -1)
            return binarySearch(array, l);

        int left = -1, right = array.length, mid;
        while (right - 1 > left)
        {
            mid = (left + right) / 2;
            if (array[mid] < l)
                left = mid;
            else
                right = mid;
        }

        return right + 1;
    }

    private static int binarySearch(int[] Array, int query)
    {
        int right = Array.length - 1, ans = -1;
        while (right > -1)
        {
            if (Array[right] == query)
            {
                ans = right;
                break;
            }
            right--;
        }

        return ans;
    }
}
