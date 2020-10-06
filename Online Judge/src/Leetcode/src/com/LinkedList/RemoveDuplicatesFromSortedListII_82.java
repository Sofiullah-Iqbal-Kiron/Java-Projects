package com.LinkedList;

public class RemoveDuplicatesFromSortedListII_82
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if (length(head) == 0 || length(head) == 1)
            return head;
        ListNode ans = new ListNode(0, null), ansPointer = ans, one = head, two = head.next;
        while (two != null)
        {
            if (one.val != two.val)
                ansPointer.next = one;
            while (one.val == two.val)
                two = two.next;
            one = two;
            two = two.next;
        }

        ansPointer.next = one;

        return ans.next;
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
