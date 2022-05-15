// Accepted in first term.
// Easy.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/D9x4cHxTHw/

package Contest.Weekly_293;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Resultant_Array_After_Removing_Anagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>(List.of(words));
        for (int i = ans.size() - 1; i > 0; i--) if (isAnagram(ans.get(i), ans.get(i - 1))) ans.remove(i);

        return ans;
    }

    public static boolean isAnagram(String a, String b) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        for (int i = 0; i < b.length(); i++) map1.put(b.charAt(i), map1.getOrDefault(b.charAt(i), 0) + 1);

        return map.equals(map1);
    }
}
