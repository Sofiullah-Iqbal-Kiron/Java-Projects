// Accepted


package URI.Beginner;

import java.util.Scanner;

public class TimeConversion_1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.format("%d:%d:%d\n", N / 3600, (N % 3600) / 60, (N % 3600) % 60);
    }
}
