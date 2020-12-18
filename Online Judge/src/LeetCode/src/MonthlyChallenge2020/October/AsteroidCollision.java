// Accepted after long perseverance.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/DBPGMVTkX3/
// Mainly a stack problem but I solved this with many condition. That why it takes much effort.


package MonthlyChallenge2020.October;

import java.util.ArrayList;
import java.util.Arrays;

public class AsteroidCollision
{
    public int[] asteroidCollision(int[] asteroids)
    {
        if (asteroids.length == 2 && asteroids[0] > 0 && asteroids[1] < 0 && asteroids[0] == -1 * asteroids[1])
            return new int[] { };

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(asteroids).forEach(list :: add);
        int i = 0;
        boolean destroyed;
        while (i + 1 < list.size())
        {
            destroyed = false;
            if (list.get(i) > 0 && list.get(i + 1) < 0)
            {
                if (-1 * list.get(i + 1) < list.get(i))
                    list.remove(i + 1);
                else if (-1 * list.get(i + 1) > list.get(i))
                    list.remove(i);
                else
                {
                    list.remove(i);
                    list.remove(i);
                }
                destroyed = true;
            }
            i = destroyed ? 0 : i + 1;
        }

        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++)
            ans[k] = list.get(k);

        return ans;
    }
}
