// Accepted in first term.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/wd439xWw56/


package URI.String;

import java.util.Scanner;

public class DancingSentence_1234 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            StringBuilder s = new StringBuilder(input.nextLine());
            boolean preCapital = false;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i)) && preCapital) {
                    s.setCharAt(i, Character.toLowerCase(s.charAt(i)));
                    preCapital = false;
                }
                else if (Character.isLetter(s.charAt(i))) {
                    s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
                    preCapital = true;
                }
            }

            System.out.println(s);
        }
    }
}
