// Accepted when did with intellij idea. What's the problem with vs-code?
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/kgTQtWS4T8/


package URI.String;

import java.math.BigInteger;
import java.util.Scanner;

public class ContractRevision_1120 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            char D = input.next().trim().charAt(0);
            String N = input.next().trim();
            if (D == '0' && N.equals("0")) break;

//            Remove all D from N
            String newN = "";
            for (int i = 0; i < N.length(); i++)
                if (N.charAt(i) != D) newN += N.charAt(i);

            System.out.println(getNumber(newN));
        }
    }

    private static BigInteger getNumber(String s) {
        BigInteger number = BigInteger.ZERO;
        for (int i = 0; i < s.length(); i++)
            number = number.multiply(BigInteger.TEN).add(new BigInteger("" + s.charAt(i)));

        return number;
    }
}
