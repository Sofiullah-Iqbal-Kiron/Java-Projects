package Stack.Medium;

import java.util.Stack;

public class BasicCalculatorII_227
{
    public int calculate(String s)
    {
        Stack<Integer> stack = new Stack<>();
        int cN = 0;
        char cO = '+';
        for (int i = 0; i < s.length(); i++)
        {
            char cC = s.charAt(i);
            if (Character.isDigit(cC))
                cN = cN * 10 + (cC - '0');
            if (!Character.isDigit(cC) && !Character.isWhitespace(cC) || i == s.length() - 1)
            {

            }
        }
    }
}

class Solution
{
    public int calculate(String s)
    {

        if (s == null || s.isEmpty())
            return 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < len; i++)
        {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar))
            {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1)
            {
                if (operation == '-')
                {
                    stack.push(-currentNumber);
                }
                else if (operation == '+')
                {
                    stack.push(currentNumber);
                }
                else if (operation == '*')
                {
                    stack.push(stack.pop() * currentNumber);
                }
                else if (operation == '/')
                {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty())
        {
            result += stack.pop();
        }
        return result;
    }
}
