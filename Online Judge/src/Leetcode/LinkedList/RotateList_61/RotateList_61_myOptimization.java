// Accepted.
// Ubuntu-Link for this sorted version: https://pastebin.ubuntu.com/p/WQWqKB4x2B/
// To get the unsorted version: https://pastebin.ubuntu.com/p/ybgVgKSDNp/

package Leetcode.LinkedList.RotateList_61;

import Leetcode.LinkedList.ListNode;

public class RotateList_61_myOptimization
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null || length(head) == 1)
            return head;
        final int len = length(head);
        int sip = 1;
        k %= len;
        if (k == 0)
            return head;
        ListNode fp, sp, spi, fpi;
        sp = head;
        spi = head;
        while (sip != len - k)
        {
            spi = spi.next;
            sip++;
        }
        fp = spi.next;
        fpi = fp;
        spi.next = null;
        while (fpi.next != null)
            fpi = fpi.next;
        fpi.next = sp;

        return fp;
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
