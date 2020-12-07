package Leetcode.Math.Easy;

public class Sqrt_of_x_69
{
    public static void main(String[] args)
    {
        System.out.println(mySqrt(36));
    }

    public static int mySqrt(int x) // isqrt(x)
    {
        if (x < 6)
            return x >> 1;

        return 4;
    }
}
