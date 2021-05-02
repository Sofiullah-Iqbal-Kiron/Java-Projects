// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Array_fill_I_1173 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int[] N = new int[10];
        N[0] = v;
        for (int i = 1; i < 10; i++) N[i] = 2 * N[i - 1];
        for (int i = 0; i < 10; i++) System.out.format("N[%d] = %d\n", i, N[i]);
    }
}
