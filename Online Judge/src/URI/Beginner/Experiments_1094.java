// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Experiments_1094 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int T = input.nextInt(), t = 0, c = 0, r = 0, s = 0;
        while (T-- > 0) {
            int num = input.nextInt();
            char sign = input.next().trim().charAt(0);
            if (sign == 'C') c += num;
            else if (sign == 'R') r += num;
            else s += num;
            t += num;
        }
        System.out.println("Total: " + t + " cobaias\n" + "Total de coelhos: " + c + "\n" + "Total de ratos: " + r +
                "\n" + "Total de " + "sapos: " + s);
        System.out.format("Percentual de coelhos: %.2f ", (double) (100 * c) / t);
        System.out.println("%");
        System.out.format("Percentual de ratos: %.2f ", (double) (100 * r) / t);
        System.out.println("%");
        System.out.format("Percentual de sapos: %.2f ", (double) (100 * s) / t);
        System.out.println("%");
    }
}