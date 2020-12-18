// Accepted using graph concept but the concept is not mine.
// Posted in twitter.


package Math.Medium;

public class MultiplyStrings_43
{
    public static void main(String[] args)
    {
        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2)
    {
        int product[] = new int[num1.length() + num2.length()], i, j;
        for (i = num2.length() - 1; i >= 0; i--)
        {
            for (j = num1.length() - 1; j >= 0; j--)
            {
                int mul = (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
                mul += product[i + j + 1];
                product[i + j] += mul / 10;
                product[i + j + 1] = mul % 10;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int num : product)
            if (!(ans.length() == 0 && num == 0))
                ans.append(num);

        return ans.length() == 0 ? "0" : ans.toString();
    }
}
