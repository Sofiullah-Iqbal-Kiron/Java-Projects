// Accepted


package URI.String;

import java.util.Scanner;

public class Fit_or_Dont_Fit_II_1241 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String a = input.next(), b = input.next();
            System.out.println(a.length() >= b.length() && a.substring(a.length() - b.length(), a.length()).equals(b) ? "encaixa" : "nao " + "encaixa");
        }
    }
}
