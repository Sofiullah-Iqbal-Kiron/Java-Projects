// Accepted in first term (2 ms).

package MonthlyChallenge2022.October;

public class Check_If_Two_String_Arrays_are_Equivalent_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String newWord1 = "", newWord2 = "";
        for (String w : word1) newWord1 += w;
        for (String w : word2) newWord2 += w;

        return newWord1.strip().equals(newWord2.strip());
    }
}
