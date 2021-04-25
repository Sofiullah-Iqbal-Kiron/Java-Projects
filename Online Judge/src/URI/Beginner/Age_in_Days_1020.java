// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Age_in_Days_1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        System.out.format("%d ano(s)\n", days / 365);
        System.out.format("%d mes(es)\n", (days % 365) / 30);
        System.out.format("%d dia(s)\n", (days % 365) % 30);
    }
}
