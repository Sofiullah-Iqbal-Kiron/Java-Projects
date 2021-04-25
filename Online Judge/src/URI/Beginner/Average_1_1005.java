// Accepted

package URI.Beginner;

import java.util.Scanner;

public class Average_1_1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sOne = input.nextDouble(), sTwo = input.nextDouble();
        System.out.format("MEDIA = %.5f\n", (sOne * 3.5 + sTwo * 7.5) / (3.5 + 7.5));
    }
}
