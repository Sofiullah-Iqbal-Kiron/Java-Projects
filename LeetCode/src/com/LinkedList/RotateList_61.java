//
// Posted in
// Ubuntu-Link:

package com.LinkedList;

public class RotateList_61
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null || length(head) == 1)
            return head;
        int i;
        k %= length(head);
        for (i = 0; i < k; i++)
        {
            int element = getLast(head);
            removeLast(element, head);
            head = addFirst(element, head);
        }

        return head;
    }

    private ListNode addFirst(int element, ListNode head)
    {
        ListNode newNode = new ListNode(element);
        newNode.next = head;

        return newNode;
    }

    private void removeLast(int element, ListNode head)
    {
        while (head.next.val != element)
        {
            head = head.next;
        }

        head.next = null;
    }

    private int getLast(ListNode head)
    {
        while (head.next != null)
        {
            head = head.next;
        }
        return head.val;
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