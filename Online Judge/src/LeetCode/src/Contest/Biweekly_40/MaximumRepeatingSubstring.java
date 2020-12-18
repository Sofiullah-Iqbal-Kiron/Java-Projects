// Accepted after five submissions when 8 minutes left from 1 and half hour.
// Posted in twitter.
// Akat korci tatei khusi.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/v8Pg4VcxMk/


package Contest.Biweekly_40;

public class MaximumRepeatingSubstring
{
    public int maxRepeating(String sequence, String word)
    {
        int s = 0, e = word.length(), c = 0, ans = 0;
        while (e <= sequence.length())
        {
            if (sequence.substring(s, e).equals(word))
            {
                c++;
                s = e;
                e += word.length();
            }
            else
            {
                c = 0;
                s++;
                e++;
            }

            ans = c > ans ? c : ans;
        }

        return ans;
    }
}
