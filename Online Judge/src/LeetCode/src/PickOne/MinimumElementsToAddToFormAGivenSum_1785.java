// Medium
// A problem from weekly contest 231, I tried in the contest but can't solve.
// Accepted in 5'th attempt
// Posted in twitter
// Posted in discuss
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/YdFzmBWBfw/


package PickOne;

public class MinimumElementsToAddToFormAGivenSum_1785
{
    public int minElements(int[] nums, int limit, int goal)
    {
        long as = 0;
        for (int a : nums)
            as += a;
        long x = Math.abs(goal - as);
        int ct = (int) (x / limit);
        x %= limit;

        return x > 0 ? ct + 1 : ct;
    }
}
