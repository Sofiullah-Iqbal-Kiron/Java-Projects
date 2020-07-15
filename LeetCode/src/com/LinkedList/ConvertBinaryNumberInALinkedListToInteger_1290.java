// Accepted in first term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/vMxnZHqH5H/

package com.LinkedList;

class ConvertBinaryNumberInALinkedListToInteger_1290
{
    public int getDecimalValue(ListNode head)
    {
        final int length = length(head);
        int i, ans = 0;
        for (i = length - 1; i >= 0; i--)
        {
            if (head.val == 1)
                ans += Math.pow(2, i);
            head = head.next;
        }

        return ans;
    }

    private int length(ListNode head)
    {
        int length = 0;
        while (head != null)
        {
            length++;
            head = head.next;
        }

        return length;
    }
}

// Server Code
/*class Solution
{
    public int getDecimalValue(ListNode head)
    {
        int ans = 0;
        while (head != null)
        {
            ans <<= 1;
            ans += head.val;
            head = head.next;
        }

        return ans;
    }
}*/