// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Array_change_I_1175 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] N = new int[20];
        for (int i = 0; i < 20; i++) N[i] = input.nextInt();
        for (int i = 19; i >= 0; i--) System.out.format("N[%d] = %d\n", 20 - i - 1, N[i]);
    }
}
