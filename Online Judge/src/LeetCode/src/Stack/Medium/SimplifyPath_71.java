// Accepted in 3'rd term. Mainly not my concept.
// First accepted from stack section.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/Q5GxGwmpHM/


package Stack.Medium;

import java.util.Stack;

public class SimplifyPath_71
{
    public String simplifyPath(String path)
    {
        Stack<String> ansStack = new Stack<>();
        for (String simple : path.split("/"))
        {
            if (simple.equals("..") && !ansStack.isEmpty())
                ansStack.pop();
            else if (!(simple.equals("..") || simple.equals(".") || simple.equals("")))
                ansStack.push(simple);
        }

        String ansString = "";
        for (String toAdd : ansStack)
            ansString = ansString + "/" + toAdd;

        return ansString.isEmpty() ? "/" : ansString;
    }
}
