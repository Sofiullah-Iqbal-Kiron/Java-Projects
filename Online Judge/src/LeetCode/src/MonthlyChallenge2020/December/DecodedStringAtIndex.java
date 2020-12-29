// First term, Memory Limit Exceeded.

package MonthlyChallenge2020.December;

public class DecodedStringAtIndex
{
    public String decodeAtIndex(String S, int K)
    {
        String tape = "";
        for (int i = 0; i < S.length() && K > tape.length(); i++)
        {
            if (Character.isDigit(S.charAt(i)))
                tape = reTape(tape, Integer.parseInt(S.charAt(i) + ""));
            else
                tape += S.charAt(i);
        }

        return tape.charAt(K - 1) + "";
    }

    private static String reTape(String tape, int repeatTimes)
    {
        String reTape = "";
        for (int i = 0; i < repeatTimes; i++)
            reTape += tape;

        return reTape;
    }
}
