// Accepted


package URI.Beginner;

import java.util.Scanner;

public class SelectionTest1_1035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt(), B = input.nextInt(), C = input.nextInt(), D = input.nextInt();
        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) System.out.println("Valores aceitos");
        else System.out.println("Valores nao aceitos");
    }
}
