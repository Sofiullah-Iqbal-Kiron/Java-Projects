package PickOne;

/* Valid:
        ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1",
        "53.5e93", "-123.456e789"]
   Invalid:
          ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]
*/

public class ValidNumber_65
{
    public boolean isNumber(String s)
    {
        s = s.trim();

        return true;
    }
}
