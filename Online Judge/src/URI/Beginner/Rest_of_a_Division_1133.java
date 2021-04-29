// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Rest_of_a_Division_1133 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x = input.nextInt(), y = input.nextInt();
        if (x > y) {
            int t = x;
            x = y;
            y = t;
        }
        for (int i = x + 1; i < y; i++) if (i % 5 == 2 || i % 5 == 3) System.out.println(i);
    }
}
