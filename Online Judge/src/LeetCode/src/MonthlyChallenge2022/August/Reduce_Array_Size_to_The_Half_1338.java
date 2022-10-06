// Accepted in third term.
// Posted in twitter.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/nwVsd5qNPH/

package MonthlyChallenge2022.August;

import java.util.*;

public class Reduce_Array_Size_to_The_Half_1338 {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) list.add(e.getValue());
        Collections.sort(list, Collections.reverseOrder());

        int value = 0, ans = 0, nS = arr.length / 2;
        if (map.size() == 1) return 1;

        for (Integer i : list) {
            value += i;
            ans++;
            if (value >= nS) break;
        }

        return ans;
    }

    //    But sorting the HashMap is not time compatible.
    public static HashMap<Integer, Integer> sortHashMapAccordingToValue(HashMap<Integer, Integer> hashMap) {
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) list.add(entry.getValue());

        Collections.sort(list, Collections.reverseOrder());

        for (int num : list)
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
                if (entry.getValue().equals(num))
                    sortedMap.put(entry.getKey(), num);

        return sortedMap;
    }
}