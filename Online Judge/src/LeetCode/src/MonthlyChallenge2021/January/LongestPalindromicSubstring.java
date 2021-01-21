// Accepted in second term.
// Learn Manacher's algorithm to find all palindromic substrings in linear time.


package MonthlyChallenge2021.January;

public class LongestPalindromicSubstring
{
    int resultStart = 0, resultLength = 0;
    public String longestPalindrome(String s)
    {
        int stringLength = s.length();
        if (stringLength < 2)
            return s;

        for (int start = 0; start < stringLength - 1; start++)
        {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }

        return s.substring(resultStart, resultStart + resultLength);
    }

    public void expandRange(String s, int start, int end)
    {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end))
        {
            start--;
            end++;
        }

        if (resultLength < end - start - 1)
        {
            resultLength = end - start - 1;
            resultStart = start + 1;
        }
    }
}
