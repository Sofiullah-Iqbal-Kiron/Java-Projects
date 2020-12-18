package MonthlyChallenge2020.October;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateLetters
{
    public String removeDuplicateLetters(String s)
    {
        Set<Character> set = new TreeSet<>();
        char[] S = s.toCharArray();
        for (char c : S)
            set.add(c);
        ArrayList<Character> ans = new ArrayList<>();
        ans.addAll(set);
        StringBuffer ansS = new StringBuffer();
        for (int i = 0; i < ans.size(); i++)
            ansS.append(ans.get(i));

        return ansS.toString();
    }
}
