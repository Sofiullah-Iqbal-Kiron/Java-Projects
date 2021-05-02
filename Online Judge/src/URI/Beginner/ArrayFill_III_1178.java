// Accepted


package URI.Beginner;

import java.util.Scanner;

public class ArrayFill_III_1178 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        for (int i = 0; i < 100; i++) {
            System.out.format("N[%d] = %.4f\n", i, x);
            x /= 2;
        }
    }
}
