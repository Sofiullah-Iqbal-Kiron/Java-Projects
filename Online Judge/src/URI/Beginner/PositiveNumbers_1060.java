// Accepted


package URI.Beginner;

import java.util.Scanner;

public class PositiveNumbers_1060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 6; i++) if (input.nextDouble() > 0) counter++;

        System.out.println(counter + " valores positivos");
    }
}
