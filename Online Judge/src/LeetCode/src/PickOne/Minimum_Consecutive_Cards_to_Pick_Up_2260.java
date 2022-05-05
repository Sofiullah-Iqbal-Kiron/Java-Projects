// Accepted in first term.
// Posted in twitter.
// Helper code: https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/discuss/2009974/Java-solution-HashMap
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/crj7bRXz5w/

package PickOne;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Consecutive_Cards_to_Pick_Up_2260 {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> track = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {
            if (track.containsKey(cards[i]))
                ans = Math.min(ans, i - track.get(cards[i]) + 1);
            track.put(cards[i], i); // track last index
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
