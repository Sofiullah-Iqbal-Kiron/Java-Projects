// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Average_2_1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        System.out.format("MEDIA = %.1f\n", (a * 2 + b * 3 + c * 5) / 10);
    }
}
