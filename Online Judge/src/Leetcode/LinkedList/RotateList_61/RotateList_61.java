// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/C7DwT2b7G6/


package Leetcode.LinkedList.RotateList_61;

import Leetcode.LinkedList.ListNode;

public class RotateList_61
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null || length(head) == 1)
            return head;
        int i;
        k %= length(head);
        ListNode current, previous;
        for (i = 0; i < k; i++)
        {
            previous = head;
            current = head.next;
            while (true)
            {
                if (current.next == null)
                {
                    ListNode newNode = new ListNode(current.val, head);
                    head = newNode;
                    previous.next = null;
                    break;
                }

                previous = previous.next;
                current = current.next;
            }
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

