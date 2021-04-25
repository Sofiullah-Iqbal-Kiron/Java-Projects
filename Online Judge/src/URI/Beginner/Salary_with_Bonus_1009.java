// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Salary_with_Bonus_1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.format("TOTAL = R$ %.2f\n", input.nextDouble() + input.nextDouble() * 0.15);
    }
}
