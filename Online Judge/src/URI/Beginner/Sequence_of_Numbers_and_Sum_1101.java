// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Sequence_of_Numbers_and_Sum_1101 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int x = input.nextInt(), y = input.nextInt(), sum = 0;
            if (x <= 0 || y <= 0) break;

            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("Sum=" + sum);
        }
    }
}
