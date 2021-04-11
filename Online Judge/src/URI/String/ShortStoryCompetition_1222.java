// Accepted in second term.
// Ubuntu Link: https://pastebin.ubuntu.com/p/6JtyjcKfjY/

package URI.String;

import java.util.Scanner;

public class ShortStoryCompetition_1222 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (input.hasNext()) {
            int N = input.nextInt(), L = input.nextInt(), C = input.nextInt(), i, actualLines = 0;
            String[] story = new String[N];
            for (i = 0; i < N; i++) story[i] = input.next();

            i = 0;
            while (i < N) {
                String oneLine = story[i++];
                while (i < N && (oneLine + " " + story[i]).length() <= C) oneLine = oneLine + " " + story[i++];
                actualLines++;
            }

            System.out.println((int) Math.ceil((double) actualLines / L));
        }
    }
}
