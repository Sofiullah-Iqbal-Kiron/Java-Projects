// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Salary_1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int en = input.nextInt(), wh = input.nextInt();
        double ph = input.nextDouble();
        System.out.println("NUMBER = " + en);
        System.out.format("SALARY = U$ %.2f\n", wh * ph);
    }
}
