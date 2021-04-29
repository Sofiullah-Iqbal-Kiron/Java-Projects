// Accepted


package URI.Beginner;

import java.util.Scanner;

public class GrowingSequences_1146 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int x = input.nextInt();
            if (x == 0) break;
            StringBuffer ans = new StringBuffer();
            for (int i = 1; i <= x; i++) ans.append(i + " ");
            System.out.println(ans.toString().trim());
        }
    }
}
