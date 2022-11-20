// Accepted in first term.
// Posted in twitter.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/Y5nj7c3KRF/

package MonthlyChallenge2022.October;

import java.util.*;

public class Group_Anagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, String> map = new HashMap<>();
        Set<String> set = new TreeSet<>();

        for (String s : strs) {
            char[] newSa = s.toCharArray();
            Arrays.sort(newSa);
            String newS = new String(newSa).strip();

            map.put(s, newS);
            set.add(newS);
        }

        Map<String, Integer> setIndexer = new TreeMap<>();
        int count = 0;
        for (String s : set) setIndexer.put(s, count++);

        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) ans.add(new ArrayList<>());

        for (String s : strs) {
            String nowVal = map.get(s);
            int nowIdx = setIndexer.get(nowVal);
            ans.get(nowIdx).add(s);
        }

        return ans;
    }

    //    Official approach.
    public List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();

        for (String s : strs) {
            char[] sa = s.toCharArray();
            Arrays.sort(sa);
            String key = String.valueOf(sa);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }

        return new ArrayList(ans.values());
    }
}
