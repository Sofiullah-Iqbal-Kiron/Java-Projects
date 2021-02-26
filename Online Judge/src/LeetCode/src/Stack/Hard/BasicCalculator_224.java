package Stack.Hard;

import java.util.Stack;

public class BasicCalculator_224
{
    public int calculate(String s)
    {
        if (s.equals("0"))
            return 0;
        Stack<Object> stack = new Stack<>();
        int operand = 0, log = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                operand = (int) Math.pow(10, log++) * (ch - '0') + operand;
            else if (!Character.isWhitespace(ch))
            {
                if (ch == '-')
                {
                    if (operand != 0)
                        stack.push(operand);
                    stack.push('-');
                }
                else if (ch == ')')
                {
                    if (operand != 0)
                        stack.push(operand);
                    stack.push(')');
                }
                else if (ch == '(')
                {
                    int res = operand;
                    while (!stack.peek().equals(')'))
                    {
                        if (stack.pop().equals('+'))
                            res += (int) stack.pop();
                        else
                            res -= (int) stack.pop();
                    }
                    stack.pop();
                    stack.push(res);
                }
                else
                {
                    if (operand != 0)
                        stack.push(operand);
                    stack.push('+');
                }
                operand = 0;
                log = 0;
            }
        }
        if (operand != 0)
            stack.push(operand);
        Integer res = (Integer) stack.pop();
        while (!stack.isEmpty())
        {
            if (stack.pop().equals('+'))
                res += (int) stack.pop();
            else
                res -= (int) stack.pop();
        }

        return res;
    }
}

class Solution
{
    public int calculate(String s)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int operand = 0;
        int result = 0; // For the on-going result
        int sign = 1;  // 1 means positive, -1 means negative

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
            {
                // Forming operand, since it could be more than one digit
                operand = 10 * operand + (int) (ch - '0');

            }
            else if (ch == '+')
            {
                // Evaluate the expression to the left,
                // with result, sign, operand
                result += sign * operand;

                // Save the recently encountered '+' sign
                sign = 1;

                // Reset operand
                operand = 0;

            }
            else if (ch == '-')
            {
                result += sign * operand;
                sign = -1;
                operand = 0;

            }
            else if (ch == '(')
            {
                // Push the result and sign on to the stack, for later
                // We push the result first, then sign
                stack.push(result);
                stack.push(sign);

                // Reset operand and result, as if new evaluation begins for the new sub-expression
                sign = 1;
                result = 0;

            }
            else if (ch == ')')
            {
                // Evaluate the expression to the left
                // with result, sign and operand
                result += sign * operand;

                // ')' marks end of expression within a set of parenthesis
                // Its result is multiplied with sign on top of stack
                // as stack.pop() is the sign before the parenthesis
                result *= stack.pop();

                // Then add to the next operand on the top.
                // as stack.pop() is the result calculated before this parenthesis
                // (operand on stack) + (sign on stack * (result from parenthesis))
                result += stack.pop();

                // Reset the operand
                operand = 0;
            }
        }

        return result + (sign * operand);
    }
}