package com.LinkedList;

public class RemoveDuplicatesFromSortedListII_82
{
    public void deleteDuplicates(ListNode head)
    {
        final int lengthOfHead = length(head);
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