// Accepted


package URI.Beginner;

import java.util.Scanner;

public class TheGreatest_1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.format("%d eh o maior\n", maior(maior(input.nextInt(), input.nextInt()), input.nextInt()));
    }

    private static int maior(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }
}
