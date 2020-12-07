// Category: Easy.
// Accepted in first term.
// Posted in twitter.
// Ubuntu-Link(Primitive for-loop): https://pastebin.ubuntu.com/p/Mz4pysMz8v/
// Enhanced for-loop is not applicable to java.lang.String
// String.substring(startIndex): it will return String started from startIndex till the main String end.
// String.substring(startIndex, endIndex): if endIndex == String.length(), don't put it out.

package com.MonthlyChallenge2020.August;

public class DetectCapital
{
    public boolean detectCapitalUse(String word)
    {
        return AllUpper(word) || AllLower(word) || (Character.isUpperCase(word.charAt(0)) && AllLower(word.substring(1)));
    }

    private boolean AllUpper(String word)
    {
        for (int i = 0; i < word.length(); i++)
            if (!Character.isUpperCase(word.charAt(i)))
                return false;

        return true;
    }

    private boolean AllLower(String word)
    {
        for (int i = 0; i < word.length(); i++)
            if (!Character.isLowerCase(word.charAt(i)))
                return false;

        return true;
    }
}