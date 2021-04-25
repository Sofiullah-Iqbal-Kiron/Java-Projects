// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Area_1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble(), pi = 3.14159;
        System.out.format("TRIANGULO: %.3f\n", 0.5 * a * c);
        System.out.format("CIRCULO: %.3f\n", pi * c * c);
        System.out.format("TRAPEZIO: %.3f\n", 0.5 * (a + b) * c);
        System.out.format("QUADRADO: %.3f\n", b * b);
        System.out.format("RETANGULO: %.3f\n", a * b);
    }
}
