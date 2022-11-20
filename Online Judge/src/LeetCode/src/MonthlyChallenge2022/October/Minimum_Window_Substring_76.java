// Accepted.
// Posted in twitter.

package MonthlyChallenge2022.October;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring_76 {
    public String minWindow(String s, String t) {
        if (s.length() < 1 || t.length() < 1 || s.length() < t.length()) return "";

        Map<Character, Integer> track_t = new HashMap<>();
        for (int i = 0; i < t.length(); i++)
            track_t.put(t.charAt(i), track_t.getOrDefault(t.charAt(i), 0) + 1);

//        Number of unique character in t.
        int required = track_t.size();

//        Track how many formed in the substring.
        int formed = 0;

        int l = 0, r = 0;
        Map<Character, Integer> windowCount = new HashMap<>();
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            char c = s.charAt(r);
            int count = windowCount.getOrDefault(c, 0);
            windowCount.put(c, count + 1);

            if (track_t.containsKey(c) && windowCount.get(c).intValue() == track_t.get(c).intValue()) formed++;

            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCount.put(c, windowCount.get(c) - 1);
                if (track_t.containsKey(c) && windowCount.get(c).intValue() < track_t.get(c).intValue()) formed--;

                l++;
            }
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
