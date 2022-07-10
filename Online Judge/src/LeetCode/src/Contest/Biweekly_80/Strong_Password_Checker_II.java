// Accepted in first term.
// It would be solved using regex.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/F4r3Rkx3TB/

package Contest.Biweekly_80;

public class Strong_Password_Checker_II {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;

        boolean conLow = false, conUp = false, conDit = false, conSpe = false, non = true;

        for (int i = 0; i < password.length(); i++) {
            char cc = password.charAt(i);
            if (cc >= 'a' && cc <= 'z') conLow = true;
            else if (cc >= 'A' && cc <= 'Z') conUp = true;
            else if (cc >= '0' && cc <= '9') conDit = true;
            else if (cc == '!' || cc == '@' || cc == '#' || cc == '$' || cc == '%' || cc == '^' || cc == '&' || cc == '*' || cc == '(' || cc == ')' || cc == '-' || cc == '+')
                conSpe = true;
            if (i + 1 < password.length() && cc == password.charAt(i + 1)) non = false;
        }

        return conLow && conUp && conDit && conSpe && non;
    }
}
