// Accepted after a long try.
// Posted in discussion.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/QTTT47TCt4/


package String.Easy;

public class ValidPalindrome_125
{
    public boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder(""), rev = new StringBuilder("");
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetterOrDigit(s.charAt(i)))
            {
                sb.append(s.charAt(i));
                rev.insert(0, s.charAt(i));
            }
        }

        return sb.toString().equalsIgnoreCase(rev.toString());
    }
}
