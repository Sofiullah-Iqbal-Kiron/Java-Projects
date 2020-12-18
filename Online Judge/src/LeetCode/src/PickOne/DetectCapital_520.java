// Accepted but takes much more time. Sometimes we should avoid regex.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/vxdSQkNKDq/
// Also solved in com.MonthlyChallenge2020.August


package PickOne;

public class DetectCapital_520
{
    public boolean detectCapitalUse(String word) {return word.matches("[A-Z]*|.[a-z]*"); }
}
