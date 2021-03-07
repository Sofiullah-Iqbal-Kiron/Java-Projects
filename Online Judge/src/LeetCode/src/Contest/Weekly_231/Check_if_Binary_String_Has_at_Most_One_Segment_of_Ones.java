// Accepted
// Posted in twitter
// Rank: 7256 / 12900
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/Jn2DVR3WWk/


package Contest.Weekly_231;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones
{
    public boolean checkOnesSegment(String s)
    {
        boolean zF = false; // zF: zero_Found
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '0')
                zF = true;
            else if (zF && s.charAt(i) == '1')
                return false;
        }
        return true;
    }

    public boolean checkOnesSegment_FirstContestantsCode(String s)
    {
        return s.matches("0*1+0*");
    }
}
