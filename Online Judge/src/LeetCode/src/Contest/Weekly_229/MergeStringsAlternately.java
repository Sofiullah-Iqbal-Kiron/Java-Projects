// Accepted in second attempt.
// First of all, I assumed that it is a so easy problem but when I go to implement this, I failed much many times.
// Posted in twitter.
// Ubuntu-LinK: https://pastebin.ubuntu.com/p/gQSPZ72hr5/


package Contest.Weekly_229;

public class MergeStringsAlternately
{
    public String mergeAlternately(String word1, String word2)
    {
        if (word1.length() == word2.length())
        {
            int one = 0, two = 0;
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < word1.length() + word2.length(); i++)
            {
                if (i % 2 == 0 && one < word1.length())
                    ans.append(word1.charAt(one++));
                else if (i % 2 != 0 && two < word2.length())
                    ans.append(word2.charAt(two++));
            }

            return ans.toString();
        }

        StringBuilder ans = new StringBuilder(word1.length() > word2.length() ? word1 : word2);
        int one = 0, two = 0;
        if (word1.length() > word2.length())
        {
            for (int i = 1; two < word2.length(); two++)
            {
                ans.insert(i, word2.charAt(two));
                i += 2;
            }
        }
        else
        {
            for (int i = 0; one < word1.length(); one++)
            {
                ans.insert(i, word1.charAt(one));
                i += 2;
            }
        }

        return ans.toString();
    }
}
