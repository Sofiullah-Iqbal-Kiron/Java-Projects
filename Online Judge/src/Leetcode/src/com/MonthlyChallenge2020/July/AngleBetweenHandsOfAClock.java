// Accepted in first.
// Math Category.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/pgMKpfgvXV/

package com.MonthlyChallenge2020.July;

public class AngleBetweenHandsOfAClock
{
    public double angleClock(int hour, int minutes)
    {
        double hourDegree = ((double) hour * 30.0) + ((double) minutes / 2.0), minuteDegree =
                (double) (minutes * 6.0), ans = hourDegree > minuteDegree ? hourDegree - minuteDegree :
                minuteDegree - hourDegree;

        return Math.min(ans, 360 - ans);
    }
}
