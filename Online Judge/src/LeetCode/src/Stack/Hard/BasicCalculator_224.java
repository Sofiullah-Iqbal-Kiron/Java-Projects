// Accepted, totally in my concept? no.
// Posted in twitter.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/BhfnNvM32h/


package Stack.Hard;

import java.util.Stack;

public class BasicCalculator_224
{
    public int calculate(String s)
    {
        Stack<Integer> stack = new Stack<>();
        int res = 0, num = 0, sign = 1;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                num = num * 10 + (ch - '0');
            else if (ch == '+')
            {
                res += sign * num;
                num = 0;
                sign = 1;
            }
            else if (ch == '-')
            {
                res += sign * num;
                num = 0;
                sign = -1;
            }
            else if (ch == '(')
            {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            }
            else if (ch == ')')
            {
                res += sign * num;
                num = 0;
                res *= stack.pop();
                res += stack.pop();
            }
        }

        if (num != 0)
            res += sign * num;

        return res;
    }
}