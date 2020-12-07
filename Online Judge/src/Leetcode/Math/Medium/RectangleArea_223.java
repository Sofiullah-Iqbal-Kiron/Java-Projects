// Accepted in first term.
// 99% is not my idea.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/YPtWGZTm78/


package Leetcode.Math.Medium;

public class RectangleArea_223
{
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H)
    {
        int areaA = Math.abs((C - A) * (B - D)), areaB = Math.abs((G - E) * (F - H)), areaOverLap = 0;
        if (!(E >= C || G <= A || H <= B || F >= D))
        {
            int one = Math.min(C, G), two = Math.max(E, A), three = Math.max(B, F), four = Math.min(D, H);
            areaOverLap = Math.abs((one - two) * (three - four));
        }

        return areaA + areaB - areaOverLap;
    }
}
