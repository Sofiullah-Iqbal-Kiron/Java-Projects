// Accepted
// Calculation from: https://mamun-amin.blogspot.com/2016/04/solution-of-uri-1160-population-increase.html


package URI.Beginner;

import java.util.Scanner;

public class PopulationIncrease_1160 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0) {
            int pa = input.nextInt(), pb = input.nextInt(), anos = 0;
            double g1 = input.nextDouble(), g2 = input.nextDouble();
            while (pa <= pb) {
                pa *= (g1 / 100.0) + 1.0;
                pb *= (g2 / 100.0) + 1.0;
                anos++;
                if (anos > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (anos <= 100) System.out.println(anos + " anos.");
        }
    }
}
