// Time Limit Exceed.

package String.Easy.ImplementstrStr_28;

public class ImplementstrStr_28_Again
{
    public int strStr(String haystack, String needle)
    {
        int start = 0, end = needle.length(), ans = -1;
        while (end < haystack.length() + 1)
        {
            if (haystack.substring(start, end).equals(needle))
            {
                ans = start;
                break;
            }
        }

        return ans;
    }
}
