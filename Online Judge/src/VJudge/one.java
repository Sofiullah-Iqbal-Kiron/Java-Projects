package VJudge;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            long N = in.nextInt(), M = in.nextInt();
            long rem = N - M;
            long ans = rem / 6;

            System.out.println(rem % 6 > 0 ? ans + 1 : ans);
        }
    }
}
