// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Line_in_Array_1181 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] M = new double[12][12];
        int L = input.nextInt();
        char C = input.next().trim().charAt(0);
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                M[i][j] = input.nextDouble();
        double sum = 0;
        for (int i = 0; i < 12; i++) sum += M[L][i];
        if (C == 'S') System.out.format("%.1f\n", sum);
        else System.out.format("%.1f\n", sum / 12);
    }
}
