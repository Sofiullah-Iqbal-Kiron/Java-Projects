// Accepted but 30% is not my idea.
// The idea is: format a new number system.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/4QYH9vJjyR/


package Leetcode.Math.Easy;

public class ExcelSheetColumnTitle_168
{
    private static String[] Excel = {"MaximumRepeatingSubstring", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static String convertToTitle(int n)
    {
        StringBuilder ans = new StringBuilder();
        while (n > 0)
        {
            n--;
            ans.insert(0, Excel[n % 26]);
            n /= 26;
        }

        return ans.toString();
    }
}
