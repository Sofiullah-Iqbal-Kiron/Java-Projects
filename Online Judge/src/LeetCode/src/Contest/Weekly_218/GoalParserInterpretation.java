// Accepted in first term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/cbdwrZsVDb/


package Contest.Weekly_218;

public class GoalParserInterpretation
{
    public String interpret(String command)
    {
        String ans = "";
        int i = 0;
        while (i < command.length())
        {
            if (i + 4 <= command.length() && command.substring(i, i + 4).equals("(al)"))
            {
                ans += "al";
                i = i + 4;
            }
            else if (i + 2 <= command.length() && command.substring(i, i + 2).equals("()"))
            {
                ans += "o";
                i = i + 2;
            }
            else
                ans += (command.charAt(i++) + "");
        }

        return ans;
    }
}
