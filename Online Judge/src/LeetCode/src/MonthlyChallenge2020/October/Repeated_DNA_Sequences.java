// Accepted in first term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/t6tpfffDtb/
// Base Topic: HashTable, BitManipulation.
// But I used HashMap, Set, Substring and none other than List.


package MonthlyChallenge2020.October;

import java.util.*;

public class Repeated_DNA_Sequences
{
    public List<String> findRepeatedDnaSequences(String s)
    {
        List<String> ans = new ArrayList<>();
        if (s.length() <= 10)
            return ans;

        Map<String, Integer> tracker = new HashMap<>();
        Set<String> ansSet = new HashSet<>();
        int start = 0, end = 10;
        while (end <= s.length())
        {
            String SubDNA = s.substring(start, end);
            if (tracker.get(SubDNA) != null)
                ansSet.add(SubDNA);
            else
                tracker.put(SubDNA, 1);

            start++;
            end++;
        }

        ans.addAll(ansSet);
        return ans;
    }
}
