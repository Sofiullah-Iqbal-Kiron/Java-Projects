// Accepted in first term.
// One kind of Medium that seems like Easy.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/28c9yNSQJV/

package Contest.Weekly_293;

import java.util.Arrays;

public class Maximum_Consecutive_Floors_Without_Special_Floors {
    public int maxConsecutive(int bottom, int top, int[] special) {
        // sort the special[] to make consecutive calculation handy
        Arrays.sort(special);

        int ans = special[0] - bottom;
        for (int i = 1; i < special.length; i++)
            ans = Math.max(ans, special[i] - special[i - 1] - 1); // decreasing inclusive

        return Math.max(ans, top - special[special.length - 1]);
    }
}
