// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Lowest_Number_and_Position_1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), val = sc.nextInt(), pos = 0;
        for (int i = 1; i < N; i++) {
            int curVal = sc.nextInt();
            if (curVal < val) {
                val = curVal;
                pos = i;
            }
        }
        System.out.println("Menor valor: " + val);
        System.out.println("Posicao: " + pos);
    }
}
