// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/m65MgZswtV/

package com.LinkedList;

import java.util.Arrays;

public class SortList_148
{
    public ListNode sortList(ListNode head)
    {
        sort(head);
        return head;
    }

    public void sort(ListNode head)
    {
        int length = length(head), i;
        int[] dataSet = new int[length];
        ListNode temp = head;
        for (i = 0; i < length; i++)
        {
            dataSet[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(dataSet);
        for (i = 0; i < length; i++)
        {
            head.val = dataSet[i];
            head = head.next;
        }
    }

    public int length(ListNode head)
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
