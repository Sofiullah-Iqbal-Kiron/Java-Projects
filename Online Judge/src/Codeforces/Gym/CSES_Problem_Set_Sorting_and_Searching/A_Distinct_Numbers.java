// Accepted.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/dJpyM2CZJh/


package Codeforces.Gym.CSES_Problem_Set_Sorting_and_Searching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Distinct_Numbers
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = input.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(input.nextInt());

        System.out.println(set.size());
    }
}
