// Accepted
// Learned a new this: Taking string after taking int, produces garbage.

package URI.String;

import java.util.Scanner;

public class InsideOut_1235 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = 0;
        t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String line = input.nextLine();
            int lastIndex = line.length() - 1;
            int i = lastIndex / 2;
            while (i >= 0) System.out.print(line.charAt(i--));
            for (i = lastIndex; i > lastIndex / 2; i--) System.out.print(line.charAt(i));
            System.out.println();
        }
    }
}
