// 30 April, 2022.
// Accepted.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/h254VMDRHb/

package Contest.Biweekly_77;

public class Count_Prefixes_of_a_Given_String {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        for (int i = 0; i < words.length; i++)
            if (words[i].length() <= s.length() && words[i].equals(s.substring(0, words[i].length()))) ans++;

        return ans;
    }
}
