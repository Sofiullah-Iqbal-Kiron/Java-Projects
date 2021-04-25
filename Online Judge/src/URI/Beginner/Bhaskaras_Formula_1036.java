// Accepted


package URI.Beginner;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bhaskaras_Formula_1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble(), B = input.nextDouble(), C = input.nextDouble(), D;
        D = B * B - 4 * A * C;
        if (D < 0 || A == 0) System.out.println("Impossivel calcular");
        else {
            System.out.format("R1 = %.5f\n", (-B + sqrt(D)) / (2 * A));
            System.out.format("R2 = %.5f\n", (-B - sqrt(D)) / (2 * A));
        }
    }
}
