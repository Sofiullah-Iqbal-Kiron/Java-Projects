// Accepted


package URI.String;

import java.util.Scanner;

import static java.lang.Character.*;

public class Combiner_1238 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String one = input.next(), two = input.next();
            for (int i = 0, j = 0; i < Math.max(one.length(), two.length()); i++, j++) {
                if (i < one.length() && isLetter(one.charAt(i))) System.out.print(one.charAt(i));
                if (j < two.length() && isLetter(two.charAt(j))) System.out.print(two.charAt(j));
            }
            System.out.println();
        }
    }
}
