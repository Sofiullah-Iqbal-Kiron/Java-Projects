package com.MonthlyChallenge2020.November;

import com.LinkedList.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger
{
    public int getDecimalValue(ListNode head)
    {
        StringBuilder ans = new StringBuilder();
        while (head != null)
        {
            ans.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(ans.toString(), 2);
    }
}
