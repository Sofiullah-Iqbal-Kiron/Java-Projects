// Times out. Not get any points.
// Accepted.
// Posted in twitter.
// Code from mobile (Symphony P6).
// Ubuntu-Link: https://pastebin.ubuntu.com/p/5XhSvWgncP/


package MonthlyChallenge2020.September;

public class FindTheDifference
{
    public static char findTheDifference(String s, String t)
    {
        int i = 0;
        for (i = 0; i < s.length(); i++)
            t = t.replaceFirst("" + s.charAt(i), "");

        return t.trim().charAt(0);
    }
}
