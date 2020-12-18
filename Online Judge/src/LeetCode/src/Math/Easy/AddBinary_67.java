// Accepted but not my concept.
// Posted in twitter.


package Math.Easy;

public class AddBinary_67
{
    public static void main(String[] args)
    {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b)
    {
        int i = a.length() - 1, j = b.length() - 1, aBit = 0, bBit = 0, carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i > -1 || j > -1)
        {
            if (i > -1)
                aBit = Character.digit(a.charAt(i--), 10);
            if (j > -1)
                bBit = Character.digit(b.charAt(j--), 10);
            ans.append(aBit ^ bBit ^ carry);
            carry = (aBit + bBit + carry) >> 1;
            aBit = bBit = 0;
        }
        if (carry > 0)
            ans.append(carry);

        return ans.reverse().toString();
    }
}
