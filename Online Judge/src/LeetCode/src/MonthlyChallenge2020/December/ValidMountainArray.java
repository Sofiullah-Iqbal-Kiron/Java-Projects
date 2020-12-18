// Accepted in second term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/svVXj5kS2D/


package MonthlyChallenge2020.December;

public class ValidMountainArray
{
    public boolean validMountainArray(int[] arr)
    {
        boolean firstUp = false, thenDown = false;
        int length = arr.length, i = 1;
        if (length >= 3)
        {
            while (i < length && arr[i - 1] < arr[i])
            {
                firstUp = true;
                i++;
            }
            while (i < length && arr[i - 1] > arr[i])
            {
                thenDown = true;
                i++;
            }
        }

        return i == length && firstUp && thenDown;
    }
}
