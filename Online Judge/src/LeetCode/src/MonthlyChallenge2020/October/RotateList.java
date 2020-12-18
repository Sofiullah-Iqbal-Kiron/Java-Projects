// Accepted.
// I already did this at LinkedList category.


package MonthlyChallenge2020.October;

import LeetCode.LinkedList.ListNode;

public class RotateList
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null || k == 0)
            return head;
        final int len = length(head);
        k %= len;
        if (len <= 1 || k == 0)
            return head;
        ListNode current;
        for (int i = 1; i <= k; i++)
        {
            current = head;
            while (current.next.next != null)
                current = current.next;
            current.next.next = head;
            head = current.next;
            current.next = null;
        }

        return head;
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
