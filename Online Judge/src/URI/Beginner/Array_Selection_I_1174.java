// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Array_Selection_I_1174 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double num = input.nextDouble();
            if (num <= 10.0) System.out.format("A[%d] = %.1f\n", i, num);
        }
    }
}
