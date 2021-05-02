// Accepted


package URI.Beginner;

import java.util.Scanner;

public class AboveTheMainDiagonal_1183 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().trim().charAt(0);
        double[][] m = new double[12][12];
        int i, j;
        for (i = 0; i < 12; i++) for (j = 0; j < 12; j++) m[i][j] = input.nextDouble();
        double sum = 0.0;
        for (i = 0; i < 12; i++) for (j = i + 1; j < 12; j++) sum += m[i][j];
        if (c == 'S') System.out.format("%.1f\n", sum);
        else System.out.format("%.1f\n", sum / 66);
    }
}
