// Accepted.
// I did this before in C++.


package MonthlyChallenge2021.January;

import java.util.Stack;

public class ValidParentheses
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else
            {
                if (s.charAt(i) == ')')
                {
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                }
                else if (s.charAt(i) == '}')
                {
                    if (!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                }
                else
                {
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
