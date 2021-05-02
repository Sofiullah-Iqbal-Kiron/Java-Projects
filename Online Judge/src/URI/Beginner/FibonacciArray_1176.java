// Accepted


package URI.Beginner;

import java.util.Scanner;

public class FibonacciArray_1176 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i < 61; i++) fib[i] = fib[i - 1] + fib[i - 2];
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.format("Fib(%d) = %d\n", n, fib[n]);
        }
    }
}
