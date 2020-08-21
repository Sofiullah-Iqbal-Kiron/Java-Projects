// Accepted in second term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/kx2kB7CPcZ/

package com.LinkedList;

public class MiddleOfTheLinkedList_876
{
    public ListNode middleNode(ListNode head)
    {
        int index = length(head) / 2;
        for (int i = 0; i < index; i++)
            head = head.next;

        return head;
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
