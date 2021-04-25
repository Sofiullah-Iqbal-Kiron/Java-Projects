// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Positives_and_Average_1064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        double posSum = 0.0;
        for (int i = 0; i < 6; i++) {
            double val = input.nextDouble();
            if (val > 0) {
                counter++;
                posSum += val;
            }
        }
        System.out.println(counter + " valores positivos");
        System.out.format("%.1f\n", posSum / counter);
    }
}
