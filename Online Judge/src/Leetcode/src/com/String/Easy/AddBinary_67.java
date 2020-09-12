package com.String.Easy;

public class AddBinary_67
{
    public String addBinary(String a, String b)
    {
        int i, result = 0;
        char carry = '0';
        StringBuilder ans = new StringBuilder("");
        if (a.length() < b.length())
        {
            a += b;
            b = a.substring(0, a.length() - b.length());
            a = a.substring(b.length());
        }

        StringBuilder demo = new StringBuilder(a);
        for (i = b.length(); i < a.length(); i++)
            demo.insert(0, '0');
        a = demo.toString();

        for (i = b.length() - 1; i >= 0; i--)
        {
            if (a.charAt(i) == '0')
            {
                if (b.charAt(i) == '0')
                {
                    if (carry == '0')
                    {
                        ans.insert(0, '0');
                        carry = '0';
                    }
                    else
                    {
                        ans.insert(0, '1');
                        carry = '0';
                    }
                }
                else
                {
                    if (carry == '0')
                    {
                        ans.insert(0, '1');
                        carry = '0';
                    }
                    else
                    {
                        ans.insert(0, '0');
                        carry = '1';
                    }
                }
            }
            else
            {
                if (b.charAt(i) == '0')
                {
                    if (carry == '0')
                    {
                        ans.insert(0, '1');
                        carry = '0';
                    }
                    else
                    {
                        ans.insert(0, '0');
                        carry = '1';
                    }
                }
                else
                {
                    if (carry == '0')
                    {
                        ans.insert(0, '0');
                        carry = '1';
                    }
                    else
                    {
                        ans.insert(0, '1');
                        carry = '1';
                    }
                }
            }
        }

        return ans.toString();
    }
}
