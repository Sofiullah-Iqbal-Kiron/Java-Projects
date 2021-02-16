// Accepted in first attempt.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/8tPRQQYczF/
/* This two tutorial help me much:
   One(Youtube):- https://www.youtube.com/watch?v=qN8LPIcY6K4
   Two(Discuss):- https://leetcode.com/problems/evaluate-reverse-polish-notation/discuss/47430/Java-Accepted-Code%3A
   -Stack-implementation.
 */


package Stack.Medium;

// RPN: Reverse Polish Notation or postfix notation.

import java.util.Stack;

public class EvaluateReversePolishNotation_150
{
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens)
        {
            if (t.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if (t.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if (t.equals("-"))
            {
                int first = stack.pop(), second = stack.pop();
                stack.push(second - first);
            }
            else if (t.equals("/"))
            {
                int first = stack.pop(), second = stack.pop();
                stack.push(second / first);
            }
            else
                stack.push(Integer.parseInt(t));
        }

        return stack.pop();
    }
}
