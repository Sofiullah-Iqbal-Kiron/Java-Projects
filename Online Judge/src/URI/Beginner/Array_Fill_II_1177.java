// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Array_Fill_II_1177 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[1000];
        int t = input.nextInt(), d = 0;
        for (int i = 0; i < 1000; i++) {
            n[i] = d++;
            if (d == t) d = 0;
        }
        for (int i = 0; i < 1000; i++) System.out.format("N[%d] = %d\n", i, n[i]);
    }
}
