// Accepted


package URI.Beginner;

import java.util.Scanner;

public class SimpleCalculate_1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();
        int number_of_unit_1 = input.nextInt();
        double price_one_unit_1 = input.nextDouble();
        input.nextInt();
        int number_of_unit_2 = input.nextInt();
        double price_one_unit_2 = input.nextDouble();
        System.out.format("VALOR A PAGAR: R$ %.2f\n",
                number_of_unit_1 * price_one_unit_1 + number_of_unit_2 * price_one_unit_2);
    }
}
