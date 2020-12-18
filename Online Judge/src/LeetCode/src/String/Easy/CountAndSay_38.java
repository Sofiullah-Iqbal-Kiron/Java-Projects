// Accepted in first term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/gy842XmydF/

package String.Easy;

import java.util.ArrayList;

public class CountAndSay_38
{
    public String countAndSay(int n)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");

        for (int i = 1; i < n; i++)
            list.add(say(list.get(list.size() - 1)));

        return list.get(n - 1);
    }

    private String say(String last)
    {
        int occurrence = 1, start = 1;
        char currentChar = last.charAt(0);
        StringBuilder ans = new StringBuilder();

        while (start < last.length())
        {
            if (last.charAt(start) == currentChar)
                occurrence++;
            else
            {
                ans.append(occurrence);
                ans.append(currentChar);
                currentChar = last.charAt(start);
                occurrence = 1;
            }

            start++;
        }

        ans.append(occurrence);
        ans.append(currentChar);

        return ans.toString();
    }
}
